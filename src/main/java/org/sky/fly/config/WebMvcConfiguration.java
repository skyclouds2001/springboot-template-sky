package org.sky.fly.config;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.support.config.FastJsonConfig;
import com.alibaba.fastjson2.support.spring6.http.converter.FastJsonHttpMessageConverter;
import com.alibaba.fastjson2.support.spring6.webservlet.view.FastJsonJsonView;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableWebMvc
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setDateFormat("yyyy-MM-dd HH:mm:ss");
        config.setReaderFeatures(JSONReader.Feature.FieldBased, JSONReader.Feature.SupportArrayToBean);
        config.setWriterFeatures(JSONWriter.Feature.WriteMapNullValue, JSONWriter.Feature.PrettyFormat);
        converter.setFastJsonConfig(config);
        converter.setDefaultCharset(StandardCharsets.UTF_8);
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        converters.add(converter);
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        FastJsonJsonView view = new FastJsonJsonView();
        FastJsonConfig config = new FastJsonConfig();
        config.setDateFormat("yyyy-MM-dd HH:mm:ss");
        config.setReaderFeatures(JSONReader.Feature.FieldBased, JSONReader.Feature.SupportArrayToBean);
        config.setWriterFeatures(JSONWriter.Feature.WriteMapNullValue, JSONWriter.Feature.PrettyFormat);
        view.setFastJsonConfig(config);
        registry.enableContentNegotiation(view);
    }

}
