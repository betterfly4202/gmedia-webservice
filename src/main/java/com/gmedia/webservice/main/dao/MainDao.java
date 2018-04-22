package com.gmedia.webservice.main.dao;

import com.gmedia.webservice.main.entity.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@Repository
public interface MainDao extends JpaRepository<MainEntity, Long>{

}
