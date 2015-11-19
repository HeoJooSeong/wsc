package koreatech.cse.repository;

import koreatech.cse.domain.Sensor;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zoostar on 2015. 11. 19..
 */
@Repository
public interface SensorMapper {

    @Select("SELECT * FROM SENSOR WHERE userid = #{userid}")
    List<Sensor> select(@Param("userid") int id);

}
