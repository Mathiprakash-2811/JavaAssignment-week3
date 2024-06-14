package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
	     
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

       
        List<String> companyList = new ArrayList<String>();
        Collections.addAll(companyList, companies);

       
        Collections.sort(companyList);

  
        for (int i = companyList.size() - 1; i >= 0; i--)
        {
            System.out.println(companyList.get(i));
        }

	}

}
