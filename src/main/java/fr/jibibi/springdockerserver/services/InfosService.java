package fr.jibibi.springdockerserver.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.classic.Logger;
import fr.jibibi.springdockerserver.beans.Info;

/**
 * InfosService
 */
@Controller
public class InfosService {

    private static Logger LOG = (Logger) LoggerFactory.getLogger(InfosService.class);

    @RequestMapping("/infos")
    @ResponseBody
    public List<Info> getInfos() {
        List<Info> list = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Info>> typeReference = new TypeReference<List<Info>>() {
        };
        try {
            InputStream inputStream = new FileInputStream(new File("/data/springdockerserver/infos.json"));
            list = mapper.readValue(inputStream, typeReference);
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }

        return list;
    }
}