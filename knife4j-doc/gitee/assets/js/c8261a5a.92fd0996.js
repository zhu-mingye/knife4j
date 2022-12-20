"use strict";(self.webpackChunk=self.webpackChunk||[]).push([[5931],{3905:(e,t,n)=>{n.d(t,{Zo:()=>p,kt:()=>h});var o=n(67294);function r(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function a(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);t&&(o=o.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,o)}return n}function i(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?a(Object(n),!0).forEach((function(t){r(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):a(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function c(e,t){if(null==e)return{};var n,o,r=function(e,t){if(null==e)return{};var n,o,r={},a=Object.keys(e);for(o=0;o<a.length;o++)n=a[o],t.indexOf(n)>=0||(r[n]=e[n]);return r}(e,t);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);for(o=0;o<a.length;o++)n=a[o],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(r[n]=e[n])}return r}var s=o.createContext({}),u=function(e){var t=o.useContext(s),n=t;return e&&(n="function"==typeof e?e(t):i(i({},t),e)),n},p=function(e){var t=u(e.components);return o.createElement(s.Provider,{value:t},e.children)},l={inlineCode:"code",wrapper:function(e){var t=e.children;return o.createElement(o.Fragment,{},t)}},d=o.forwardRef((function(e,t){var n=e.components,r=e.mdxType,a=e.originalType,s=e.parentName,p=c(e,["components","mdxType","originalType","parentName"]),d=u(n),h=r,m=d["".concat(s,".").concat(h)]||d[h]||l[h]||a;return n?o.createElement(m,i(i({ref:t},p),{},{components:n})):o.createElement(m,i({ref:t},p))}));function h(e,t){var n=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var a=n.length,i=new Array(a);i[0]=d;var c={};for(var s in t)hasOwnProperty.call(t,s)&&(c[s]=t[s]);c.originalType=e,c.mdxType="string"==typeof e?e:r,i[1]=c;for(var u=2;u<a;u++)i[u]=n[u];return o.createElement.apply(null,i)}return o.createElement.apply(null,n)}d.displayName="MDXCreateElement"},13517:(e,t,n)=>{n.r(t),n.d(t,{assets:()=>p,contentTitle:()=>s,default:()=>h,frontMatter:()=>c,metadata:()=>u,toc:()=>l});var o=n(87462),r=n(63366),a=(n(67294),n(3905)),i=["components"],c={},s="3.2 \u6388\u6743\u7801\u6a21\u5f0f(authorization_code)",u={unversionedId:"action/oauth2-authorization_code",id:"action/oauth2-authorization_code",title:"3.2 \u6388\u6743\u7801\u6a21\u5f0f(authorization_code)",description:"\u4ee5Spring Security\u4e3a\u4f8b\uff0c\u4e3a\u4e86\u8fbe\u5230\u5feb\u901f\u6f14\u793a\u6548\u679c\uff0c\u6388\u6743\u670d\u52a1\u5668\u548c\u8d44\u6e90\u670d\u52a1\u5668\u90fd\u5728\u540c\u4e00\u4e2a\u5de5\u7a0b\u4e2d",source:"@site/docs/action/oauth2-authorization_code.md",sourceDirName:"action",slug:"/action/oauth2-authorization_code",permalink:"/docs/action/oauth2-authorization_code",draft:!1,tags:[],version:"current",lastUpdatedBy:"xiaoyumin",lastUpdatedAt:1660471539,formattedLastUpdatedAt:"2022\u5e748\u670814\u65e5",frontMatter:{},sidebar:"action",previous:{title:"3.1 \u7b80\u5316\u6a21\u5f0f(implicit)",permalink:"/docs/action/oauth2-implicit"},next:{title:"3.3 \u5ba2\u6237\u7aef\u6a21\u5f0f(client_credentials)",permalink:"/docs/action/oauth2-client_credentials"}},p={},l=[],d={toc:l};function h(e){var t=e.components,c=(0,r.Z)(e,i);return(0,a.kt)("wrapper",(0,o.Z)({},d,c,{components:t,mdxType:"MDXLayout"}),(0,a.kt)("h1",{id:"32-\u6388\u6743\u7801\u6a21\u5f0fauthorization_code"},"3.2 \u6388\u6743\u7801\u6a21\u5f0f(authorization_code)"),(0,a.kt)("p",null,"\u4ee5Spring Security\u4e3a\u4f8b\uff0c\u4e3a\u4e86\u8fbe\u5230\u5feb\u901f\u6f14\u793a\u6548\u679c\uff0c\u6388\u6743\u670d\u52a1\u5668\u548c\u8d44\u6e90\u670d\u52a1\u5668\u90fd\u5728\u540c\u4e00\u4e2a\u5de5\u7a0b\u4e2d"),(0,a.kt)("p",null,"\u5b8c\u6574\u4ee3\u7801\u793a\u4f8b\u8bf7\u53c2\u8003",(0,a.kt)("a",{parentName:"p",href:"https://gitee.com/xiaoym/swagger-bootstrap-ui-demo/tree/master/knife4j-spring-oauth2-authorization_code",target:"_blank",rel:"noopener"},"knife4j-spring-oauth2-authorization_code")),(0,a.kt)("p",null,"\u6388\u6743\u7801\u6a21\u5f0f\u9700\u8981\u670d\u52a1\u7aef\u914d\u7f6eKnife4j\u7684\u56de\u8c03\u5730\u5740",(0,a.kt)("inlineCode",{parentName:"p"},"webjars/oauth/oauth2.html")),(0,a.kt)("p",null,"\u90e8\u5206\u793a\u4f8b\u4ee3\u7801\uff1a"),(0,a.kt)("pre",null,(0,a.kt)("code",{parentName:"pre",className:"language-java"},'@Override\npublic void configure(ClientDetailsServiceConfigurer clients) throws Exception {\n    //\u6388\u6743\u7801\u6a21\u5f0f\uff08authorization code\uff09\n    clients.inMemory()\n        .withClient("app1").secret(noOpPasswordEncoder.encode("123"))\n            .authorizedGrantTypes("authorization_code")\n            .redirectUris(\n                    "http://localhost:18010/webjars/oauth/oauth2.html")\n            .scopes("read","write","reads","writes");\n}\n')),(0,a.kt)("p",null,"\u521b\u5efaDocket\u5bf9\u8c61\u65f6\uff0c\u8bbe\u7f6eOAuth2\u7684\u6388\u6743\u7c7b\u578b\uff0c\u793a\u4f8b\u4ee3\u7801\u5982\u4e0b\uff1a"),(0,a.kt)("admonition",{title:"\u67e5\u770b\u8be6\u7ec6\u4ee3\u7801",type:"tip"},(0,a.kt)("pre",{parentName:"admonition"},(0,a.kt)("code",{parentName:"pre",className:"language-java"},'@Configuration\n@EnableSwagger2WebMvc\npublic class SwaggerConfig {\n\n    @Bean\n    public Docket productApi() {\n        //schema\n        List<GrantType> grantTypes=new ArrayList<>();\n        //\u6388\u6743\u7801\u6a21\u5f0fAuthorizationCodeGrant\n        TokenRequestEndpoint tokenRequestEndpoint=new TokenRequestEndpoint("http://localhost:18010/oauth/authorize","app1","123");\n        TokenEndpoint tokenEndpoint=new TokenEndpoint("http://localhost:18010/oauth/token","access_token");\n        AuthorizationCodeGrant authorizationCodeGrant=new AuthorizationCodeGrant(tokenRequestEndpoint,tokenEndpoint);\n        grantTypes.add(authorizationCodeGrant);\n        OAuth oAuth=new OAuthBuilder().name("oauth2")\n                .grantTypes(grantTypes).build();\n        //context\n        //scope\u65b9\u4f4d\n        List<AuthorizationScope> scopes=new ArrayList<>();\n        scopes.add(new AuthorizationScope("read","read  resources"));\n        scopes.add(new AuthorizationScope("write","write resources"));\n        scopes.add(new AuthorizationScope("reads","read all resources"));\n        scopes.add(new AuthorizationScope("writes","write all resources"));\n\n        SecurityReference securityReference=new SecurityReference("oauth2",scopes.toArray(new AuthorizationScope[]{}));\n        SecurityContext securityContext=new SecurityContext(Lists.newArrayList(securityReference),PathSelectors.ant("/api/**"));\n        //schemas\n        List<SecurityScheme> securitySchemes=Lists.newArrayList(oAuth);\n        //securyContext\n        List<SecurityContext> securityContexts=Lists.newArrayList(securityContext);\n        return new Docket(DocumentationType.SWAGGER_2)\n                .select()\n                .apis(RequestHandlerSelectors.basePackage("com.xiaominfo.knife4j.oauth2.web"))\n                .paths(PathSelectors.any())\n                .build()\n                .securityContexts(securityContexts)\n                .securitySchemes(securitySchemes)\n                .apiInfo(apiInfo());\n\n\n    }\n\n\n\n    private ApiInfo apiInfo() {\n        return new ApiInfoBuilder().title("knife4j-oauth2-demo").description("")\n                .termsOfServiceUrl("https://doc.xiaominfo.com")\n                .contact(new Contact("Developers", "https://gitee.com/xiaoym/knife4j", ""))\n                .license("Open Source")\n                .licenseUrl("\\"https://www.apache.org/licenses/LICENSE-2.0")\n                .version("1.0.0")\n                .build();\n\n    }\n\n\n}\n'))),(0,a.kt)("p",null,"\u6700\u7ec8\u5448\u73b0\u754c\u9762\u5982\u4e0b\uff1a"),(0,a.kt)("p",null,(0,a.kt)("img",{src:n(59129).Z,width:"1342",height:"576"})),(0,a.kt)("p",null,"\u8f93\u5165\u6211\u4eec\u5728\u914d\u7f6e\u6587\u4ef6\u4e2d\u5b9a\u4e49\u7684clientId\u53caclientSecret,\u7136\u540e\u70b9\u51fbAuthorize\u6309\u94ae\uff0c\u6700\u7ec8\u8df3\u8f6c\u6388\u6743\u754c\u9762\uff0c\u5982\u4e0b\u56fe\uff1a"),(0,a.kt)("p",null,(0,a.kt)("img",{src:n(3023).Z,width:"945",height:"354"})),(0,a.kt)("p",null,"\u6b64\u65f6\uff0c\u9009\u62e9\u8fdb\u884c\u6388\u6743\u5373\u53ef"),(0,a.kt)("p",null,"\u6388\u6743\u5b8c\u6210\u540e\uff0c\u6d4b\u8bd5\u6211\u4eec\u518d\u6211\u4eec\u7684\u63a5\u53e3\u4e2d\uff0c\u5c31\u4f1a\u770b\u5230\u6211\u4eec\u7684\u53c2\u6570",(0,a.kt)("inlineCode",{parentName:"p"},"Authorization"),"\u503c\u5df2\u7ecf\u66f4\u65b0\u4e86\uff0c\u5982\u4e0b\u56fe\uff1a"),(0,a.kt)("p",null,(0,a.kt)("img",{src:n(57252).Z,width:"1036",height:"369"})))}h.isMDXComponent=!0},59129:(e,t,n)=>{n.d(t,{Z:()=>o});const o=n.p+"assets/images/grantcode-22d0be0b394cc6a3165b64dd71f155a8.png"},3023:(e,t,n)=>{n.d(t,{Z:()=>o});const o=n.p+"assets/images/grantcode1-d71668e76366cde1519282216254a654.png"},57252:(e,t,n)=>{n.d(t,{Z:()=>o});const o=n.p+"assets/images/grantcode2-0df055d83ad8e8b8ac4615331aae0dea.png"}}]);