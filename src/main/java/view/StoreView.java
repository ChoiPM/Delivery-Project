package view;

import persistence.dao.StoreManagementDAO;
import persistence.dto.StoreDTO;

import java.util.List;

public class StoreView
{
    StoreDTO storedto = new StoreDTO();

    public void printAll()
    {
        List<StoreDTO> storeDTOs = StoreManagementDAO.showAll();
        storeDTOs.stream().forEach(p->System.out.println(p.toString()));
    }

}
