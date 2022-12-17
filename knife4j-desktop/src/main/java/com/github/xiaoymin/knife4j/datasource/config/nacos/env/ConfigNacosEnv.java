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


package com.github.xiaoymin.knife4j.datasource.config.nacos.env;

import com.github.xiaoymin.knife4j.datasource.model.config.common.ConfigEnvValidator;
import lombok.Data;

/**
 * Nacos配置中心支持Knife4j所需基础配置属性
 * @author <a href="xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2022/12/16 21:15
 * @since:knife4j-desktop
 */
@Data
public class ConfigNacosEnv implements ConfigEnvValidator {
    
    /**
     * Nacos地址，例如：192.168.0.223:8848
     */
    private String server;
    
    /**
     * Nacos鉴权用户
     */
    private String username;
    
    /**
     * Nacos鉴权密码
     */
    private String password;
    
    /**
     * nacos-namespace
     */
    private String namespace;
    
    /**
     * Knifej在Nacos上的配置属性-dataId
     */
    private String dataId;
    
    /**
     * Knife4j在Nacos上配置的group名称
     */
    private String group;
    
    @Override
    public void validate() {
        
    }
}
