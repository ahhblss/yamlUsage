package com.lss.yaml;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * Created by Sean.liu on 2017/2/24.
 */
public class YamlTest {

    @Test
    public void usageTest()
    {
        try {
            YamlReader reader = new YamlReader(new InputStreamReader(
                    this.getClass().getResourceAsStream("/contact.yml"), StandardCharsets.UTF_8.name()));
            Object object = reader.read();
            System.out.println(object);
            Map map = (Map)object;
            System.out.println(map.get("address"));
            reader.close();
        } catch (YamlException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void versionTest(){
        try {
            YamlReader reader = new YamlReader(new InputStreamReader(
                    this.getClass().getResourceAsStream("/version.yaml"), StandardCharsets.UTF_8.name()));
            VersionHistory object = reader.read(VersionHistory.class);
            System.out.println(object);
            reader.close();
        } catch (YamlException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
