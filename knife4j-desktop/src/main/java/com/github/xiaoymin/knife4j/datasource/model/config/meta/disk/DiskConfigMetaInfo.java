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


package com.github.xiaoymin.knife4j.datasource.model.config.meta.disk;

import com.github.xiaoymin.knife4j.datasource.model.config.meta.common.ConfigDefaultCloudMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.disk.service.DiskConfigDiskMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.common.ConfigDefaultEurekaMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.common.ConfigDefaultNacosMeta;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2022/12/17 11:49
 * @since:knife4j-desktop
 */
@Data
public class DiskConfigMetaInfo {
    
    /**
     * disk模式
     */
    private List<DiskConfigDiskMeta> disk;
    /**
     * Cloud模式
     */
    private List<ConfigDefaultCloudMeta> cloud;
    /**
     * nacos模式
     */
    private List<ConfigDefaultNacosMeta> nacos;
    /**
     * eureka模式
     */
    private List<ConfigDefaultEurekaMeta> eureka;
}
