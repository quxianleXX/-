package test;

import dao.BaseDao;
import dao.RainManageDao;
import service.RainManagerService;

import java.sql.ResultSet;

public class TestConnection {
    public static void main(String[] args) {
//        BaseDao.getConn();
//        BaseDao.closeAll(null,null,null);
//        RainManageDao dao=new RainManageDao();
//        System.out.println(dao.getAllInfo().size());
        RainManagerService service=new RainManagerService();
        System.out.println(service.getAllInfo());
    }
}
