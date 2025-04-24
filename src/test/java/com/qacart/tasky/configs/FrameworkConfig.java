package com.qacart.tasky.configs;


import com.qacart.tasky.converter.ConvertStringToEnumType;
import com.qacart.tasky.enums.BrowserType;
import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:env", "system:properties", "file:${user.dir}/src/test/resources/config.properties"})
public interface FrameworkConfig extends Config {

    @ConverterClass(ConvertStringToEnumType.class)
    @DefaultValue("CHROME")
    BrowserType browser();

    @DefaultValue("https://tasky.qacart.com")
    @Key("pageBase.url")
    String pageBaseURL();

    @DefaultValue("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImY4NmVkNTc1LTMzNWQtNGY4ZS05MjRiLTFmMzNjN2VjNDEzNiIsImVtYWlsIjoidGVzdF85MDkwX2F1dG9tYXRpb25AZXhhbXBsZS5jb20iLCJ1c2VyVHlwZSI6InJlZ3VsYXIiLCJpYXQiOjE3NDU1MTI2MTQsImV4cCI6MTc0NTU5OTAxNH0.OkReChoKbGv0NgkJvVTeOz2ThQvb8xCEcKOsDpRXRPc")
    String regularUserCookies();

    String subscribedUserCookies();


}
