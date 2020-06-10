package com.sbnz.covid19cdss.service;

import org.apache.maven.shared.invoker.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Service
public class RulesService {

    private static final String drlPath = System.getProperty("user.dir") + "\\..\\drools-spring-kjar\\src\\main\\resources\\sbnz\\rules\\rules.drl";
    private Environment env;

    @Autowired
    public RulesService(Environment env) {
        this.env = env;
    }

    public String getDrl() throws IOException {
        File file = new File(drlPath);
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        String str = new String(data, StandardCharsets.UTF_8);
        return str;
    }

    public void setDrl(String text) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(drlPath);
        out.print(text);
        out.close();
        invokeCleanInstallKjar();
    }

    public void invokeCleanInstallKjar(){
        String path = System.getProperty("user.dir") + "/../drools-spring-kjar/pom.xml";
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile((new File(path)));
        request.setGoals(Arrays.asList("clean", "install"));

        Invoker invoker = new DefaultInvoker();
        String var = env.getProperty("config.mvn.path");
        invoker.setMavenHome(new File(var));

        try{
            invoker.execute(request);
        } catch(MavenInvocationException e) {
            e.printStackTrace();
        }
    }
}
