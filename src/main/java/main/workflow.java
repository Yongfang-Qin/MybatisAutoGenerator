package main;

import org.mybatis.generator.api.ShellRunner;

public class workflow {

    public static void main(String[] args) {

        String config = workflow.class.getClassLoader()
                .getResource("generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" };
        ShellRunner.main(arg);
    }
}
