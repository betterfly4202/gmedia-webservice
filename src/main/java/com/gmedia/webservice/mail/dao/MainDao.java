package com.gmedia.webservice.mail.dao;

import com.gmedia.webservice.mail.entity.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@Repository
public interface MainDao extends JpaRepository<MainEntity, Long>{

}
