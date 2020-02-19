package dao;

import entity.RainQuality;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RainManageDao extends BaseDao {
    Connection conn=null;
    ResultSet rs=null;
    /**
     * 查询所有的雨量监测信息，并且按照时间倒叙排序
     * @return
     */
    public List<RainQuality> getAllInfo(){

        List<RainQuality> rainQualityList=new ArrayList<RainQuality>();
        RainQuality rainQuality=null;
        try{
        //编写sql语句
        String sql="SELECT id,districtName,monitorTime,rain,monitoringStation,monitoringAddress FROM `rainquality`";
        //获取数据库连接
        conn=BaseDao.getConn();
        //创建执行SQL的对象
        PreparedStatement pstmt=conn.prepareStatement(sql);
        //执行sql语句
            rs=pstmt.executeQuery(sql);
            //处理结果集对象
            while (rs.next()) {
                //实例化对象
                rainQuality =new RainQuality();
             rainQuality.setId (rs.getInt("id"));
             rainQuality.setDistrictName(rs.getString("districtName"));
             rainQuality.setMonitorTime(rs.getDate("monitorTime"));
             rainQuality.setRain(rs.getInt("rain"));
             rainQuality.setMonitoringStation(rs.getString("monitoringStation"));
             rainQuality.setMonitoringAddress(rs.getString("monitoringAddress"));
             //将rainQuality对象添加到集合中
                rainQualityList.add(rainQuality);
            }
} catch (SQLException e) {
    e.printStackTrace();
}
        return rainQualityList;
    }
}
