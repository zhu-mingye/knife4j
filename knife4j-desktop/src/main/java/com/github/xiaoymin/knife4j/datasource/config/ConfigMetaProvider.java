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


package com.github.xiaoymin.knife4j.datasource.config;

import com.github.xiaoymin.knife4j.datasource.model.ConfigMeta;
import com.github.xiaoymin.knife4j.datasource.model.config.meta.ConfigMetaProps;

import java.util.List;

/**
 * 主要针对各配置中心支持的Service模式(参考{@link com.github.xiaoymin.knife4j.common.lang.ServiceMode})进行配置属性的解析，
 * @author <a href="xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2022/12/17 12:19
 * @since:knife4j-desktop
 */
public interface ConfigMetaProvider<T, M extends ConfigMetaProps> {
    
    /**
     * 解析不同的配置中心的配置meta信息得到ConfigRoute
     * @param config 配置原始对象
     * @param metaClazz 元数据clazz
     * @return
     */
    List<? extends ConfigMeta> resolver(T config, Class<M> metaClazz);
}
