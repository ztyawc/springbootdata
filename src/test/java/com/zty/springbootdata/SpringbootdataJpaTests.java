package com.zty.springbootdata;

import com.zty.Repository.DisscussRepository;
import com.zty.domain.Disscuss;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdataJpaTests {

    @Autowired
    private DisscussRepository disscussRepository;

    @Test
    public void test(){
        Optional<Disscuss> byId = disscussRepository.findById(1);
        System.out.println(byId.get());
    }

    @Test
    public void test2(){
        List<Disscuss> byAuthorNotNull = disscussRepository.findByAuthorNotNull();
        for (Disscuss disscuss : byAuthorNotNull) {
            System.out.println(disscuss);
        }
    }

    @Test
    public void test3(){
        int i = disscussRepository.deleteDiscuss(4);

        System.out.println(i);
    }


}
