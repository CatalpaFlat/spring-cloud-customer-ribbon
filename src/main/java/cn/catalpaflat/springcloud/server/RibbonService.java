package cn.catalpaflat.springcloud.server;

import cn.catalpaflat.springcloud.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author CatalpaFlat
 * @date Created in 2018/4/7 下午5:10
 */
@Service
public class RibbonService {
    @Resource
    private RestTemplate restTemplate;

    public User obtainUser(String uuid) {
        return this.restTemplate.getForObject("http://spring-cloud-provider-demo/"+uuid, User.class);
    }
}
