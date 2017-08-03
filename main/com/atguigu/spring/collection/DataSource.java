package main.com.atguigu.spring.collection;

import java.util.Properties;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
public class DataSource {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DataSource{");
        sb.append("properties=").append(properties);
        sb.append('}');
        return sb.toString();
    }
}
