package view;

import persistence.MyBatisConnectionFactory;
import persistence.dao.MenuManagementDAO;
import persistence.dao.StoreManagementDAO;
import persistence.dto.StoreDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class StoreView
{
    Scanner sc = new Scanner(System.in);
    StoreManagementDAO mmd = new StoreManagementDAO(MyBatisConnectionFactory.getSqlSessionFactory());

    public void insertMenu()
    {


        LocalDateTime today = LocalDateTime.now();
        LocalDateTime notToday = LocalDateTime.now();

        System.out.println("store name");
        String Name = sc.nextLine();
        System.out.println("store type");
        int Type = sc.nextInt();
        System.out.println("food category");
        String FoodCategory = sc.nextLine();
        System.out.println("address");
        String Address = sc.nextLine();
        System.out.println("PhoneNum");
        String PhoneNum = sc.nextLine();
        System.out.println("Content");
        String Content = sc.nextLine();
        System.out.println("MinDeliveryPrice");
        int MinDeliveryPrice = sc.nextInt();
        System.out.println("DeliveryTip");
        int DeliveryTip = sc.nextInt();
        System.out.println("DeliveryTime");
        int DeliveryTime = sc.nextInt();
        System.out.println("Rating");
        int Rating = sc.nextInt();
        System.out.println("LikeCount");
        int LikeCnt = sc.nextInt();
        System.out.println("ReviewCnt");
        int ReviewCnt = sc.nextInt();
        System.out.println("OperationHour");
        String OperationHour = sc.nextLine();
        System.out.println("ClosedDay");
        String ClosedDay = sc.nextLine();
        System.out.println("DeliveryRange");
        String DeliveryRange = sc.nextLine();
        System.out.println("Status");
        String Status = sc.nextLine();

        Map params = new HashMap<String, Objects>();

        params.put("name",Name);
        params.put("type",Type);
        params.put("foodCategory",FoodCategory);
        params.put("address",Address);
        params.put("phoneNum",PhoneNum);
        params.put("content",Content);
        params.put("minDeliveryPrice",MinDeliveryPrice);
        params.put("deliveryTip",DeliveryTip);
        params.put("deliveryTime",DeliveryTime);
        params.put("rating",Rating);
        params.put("likeCnt",LikeCnt);
        params.put("reviewCnt",ReviewCnt);
        params.put("operationHour",OperationHour);
        params.put("closedDay",ClosedDay);
        params.put("deliveryRange",DeliveryRange);
        params.put("createdDate",today);
        params.put("modifyDate",notToday);
        params.put("status",Status);

        List<StoreDTO> posts = StoreManagementDAO.registerStore(params);
        posts.stream().forEach(p-> System.out.println(p.toString()));

    }
    public void findStore() {
        System.out.println("insert findstore");
        String str = sc.nextLine();
        List<StoreDTO> posts2 = mmd.showStore(str);
        posts2.stream().forEach(p-> System.out.println(p.toString()));
    }
}