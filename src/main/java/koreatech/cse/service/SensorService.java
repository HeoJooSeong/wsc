package koreatech.cse.service;

import koreatech.cse.domain.Sensor;
import koreatech.cse.repository.SensorMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by zoostar on 2015. 11. 19..
 */
@Service
public class SensorService {

    @Inject
    private SensorMapper sensorMapper;

    public List<Sensor> select(int id){

        return sensorMapper.select(id);
    }
}
