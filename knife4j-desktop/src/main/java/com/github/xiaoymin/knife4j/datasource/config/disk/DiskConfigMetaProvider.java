/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.github.xiaoymin.knife4j.datasource.config.disk;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import com.github.xiaoymin.knife4j.common.lang.ServiceMode;
import com.github.xiaoymin.knife4j.common.utils.PropertyUtils;
import com.github.xiaoymin.knife4j.datasource.config.ConfigMetaProvider;
import com.github.xiaoymin.knife4j.datasource.model.ConfigMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.disk.DiskConfigMetaProps;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.common.ConfigDefaultCloudMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.disk.service.DiskConfigDiskMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.common.ConfigDefaultEurekaMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.common.ConfigDefaultNacosMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.route.DiskRoute;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author <a href="xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2022/12/17 12:32
 * @since:knife4j-desktop
 */
@Slf4j
public class DiskConfigMetaProvider implements ConfigMetaProvider<File, DiskConfigMetaProps> {
    
    @Override
    public List<? extends ConfigMeta> resolver(File file, Class<DiskConfigMetaProps> metaClazz) {
        if (file == null || !file.exists()) {
            return Collections.EMPTY_LIST;
        }
        log.info("resolver. file:{}", file.getAbsolutePath());
        if (ArrayUtil.isNotEmpty(file.list(((dir, name) -> StrUtil.equalsIgnoreCase(ServiceMode.CLOUD.getPropertiesName(), name))))) {
            // cloud模式，解析配置文件
            String cloudProperties = file.getAbsolutePath() + File.separator + ServiceMode.CLOUD.getPropertiesName();
            File cloudPropertiesFile = new File(cloudProperties);
            Optional<DiskConfigMetaProps> knife4jSettingPropertiesOptional = PropertyUtils.resolveSingle(cloudPropertiesFile, metaClazz);
            if (knife4jSettingPropertiesOptional.isPresent()) {
                List<ConfigDefaultCloudMeta> configRoutes = knife4jSettingPropertiesOptional.get().getKnife4j().getCloud();
                if (CollectionUtil.isNotEmpty(configRoutes)) {
                    configRoutes.forEach(configMeta -> {
                        if (StrUtil.isBlank(configMeta.getContextPath())) {
                            configMeta.setContextPath(file.getName());
                        }
                        if (CollectionUtil.isNotEmpty(configMeta.getRoutes())) {
                            configMeta.getRoutes().forEach(s -> {
                                s.setServiceMode(ServiceMode.CLOUD);
                            });
                        }
                    });
                    return configRoutes;
                }
            }
        } else if (ArrayUtil.isNotEmpty(file.list(((dir, name) -> StrUtil.equalsIgnoreCase(ServiceMode.NACOS.getPropertiesName(), name))))) {
            // nacos模式，解析配置文件
            String cloudProperties = file.getAbsolutePath() + File.separator + ServiceMode.NACOS.getPropertiesName();
            File cloudPropertiesFile = new File(cloudProperties);
            Optional<DiskConfigMetaProps> knife4jSettingPropertiesOptional = PropertyUtils.resolveSingle(cloudPropertiesFile, metaClazz);
            if (knife4jSettingPropertiesOptional.isPresent()) {
                List<ConfigDefaultNacosMeta> configRoutes = knife4jSettingPropertiesOptional.get().getKnife4j().getNacos();
                if (CollectionUtil.isNotEmpty(configRoutes)) {
                    configRoutes.forEach(configMeta -> {
                        if (StrUtil.isBlank(configMeta.getContextPath())) {
                            configMeta.setContextPath(file.getName());
                        }
                        if (CollectionUtil.isNotEmpty(configMeta.getRoutes())) {
                            configMeta.getRoutes().forEach(s -> {
                                s.setServiceMode(ServiceMode.NACOS);
                            });
                        }
                    });
                    return configRoutes;
                }
            }
        } else if (ArrayUtil.isNotEmpty(file.list(((dir, name) -> StrUtil.equalsIgnoreCase(ServiceMode.EUREKA.getPropertiesName(), name))))) {
            // EUREKA模式，解析配置文件
            String cloudProperties = file.getAbsolutePath() + File.separator + ServiceMode.EUREKA.getPropertiesName();
            File cloudPropertiesFile = new File(cloudProperties);
            Optional<DiskConfigMetaProps> knife4jSettingPropertiesOptional = PropertyUtils.resolveSingle(cloudPropertiesFile, metaClazz);
            if (knife4jSettingPropertiesOptional.isPresent()) {
                List<ConfigDefaultEurekaMeta> configRoutes = knife4jSettingPropertiesOptional.get().getKnife4j().getEureka();
                if (CollectionUtil.isNotEmpty(configRoutes)) {
                    configRoutes.forEach(configMeta -> {
                        if (StrUtil.isBlank(configMeta.getContextPath())) {
                            configMeta.setContextPath(file.getName());
                        }
                        if (CollectionUtil.isNotEmpty(configMeta.getRoutes())) {
                            configMeta.getRoutes().forEach(s -> {
                                s.setServiceMode(ServiceMode.EUREKA);
                            });
                        }
                    });
                    return configRoutes;
                }
            }
        }
        return resolveDisk(file, metaClazz);
    }
    
    private List<? extends ConfigMeta> resolveDisk(File file, Class<DiskConfigMetaProps> metaClazz) {
        String basePath = file.getAbsolutePath() + File.separator;
        // cloud模式，解析配置文件
        String cloudProperties = file.getAbsolutePath() + File.separator + ServiceMode.DISK.getPropertiesName();
        File cloudPropertiesFile = new File(cloudProperties);
        if (cloudPropertiesFile.exists()) {
            Optional<DiskConfigMetaProps> knife4jSettingPropertiesOptional = PropertyUtils.resolveSingle(cloudPropertiesFile, metaClazz);
            if (knife4jSettingPropertiesOptional.isPresent()) {
                List<DiskConfigDiskMeta> diskRoutes = knife4jSettingPropertiesOptional.get().getKnife4j().getDisk();
                if (CollectionUtil.isNotEmpty(diskRoutes)) {
                    diskRoutes.forEach(diskConfigDiskMeta -> {
                        if (StrUtil.isBlank(diskConfigDiskMeta.getContextPath())) {
                            diskConfigDiskMeta.setContextPath(file.getName());
                        }
                        if (CollectionUtil.isNotEmpty(diskConfigDiskMeta.getRoutes())) {
                            // 设置配置中的基础路径
                            diskConfigDiskMeta.getRoutes().forEach(diskRoute -> {
                                diskRoute.setLocation(basePath + diskRoute.getLocation());
                                diskRoute.setServiceMode(ServiceMode.DISK);
                            });
                        }
                    });
                    return diskRoutes;
                }
            }
        } else {
            // 判断是否包含json文件或者yml文件
            File[] jsons = file.listFiles(((dir, name) -> name.endsWith(".json") || name.endsWith(".yml")));
            if (ArrayUtil.isNotEmpty(jsons)) {
                DiskConfigDiskMeta diskConfigDiskMeta = new DiskConfigDiskMeta();
                List<DiskRoute> routes = new ArrayList<>();
                for (File diskFile : jsons) {
                    DiskRoute diskRoute = new DiskRoute();
                    // 名称去除扩展名
                    diskRoute.setName(StrUtil.subBefore(diskFile.getName(), '.', true));
                    diskRoute.setLocation(diskFile.getAbsolutePath());
                    diskRoute.setServiceMode(ServiceMode.DISK);
                    routes.add(diskRoute);
                }
                diskConfigDiskMeta.setRoutes(routes);
                diskConfigDiskMeta.setContextPath(file.getName());
                return CollectionUtil.newArrayList(diskConfigDiskMeta);
            }
        }
        return Collections.EMPTY_LIST;
    }
}
