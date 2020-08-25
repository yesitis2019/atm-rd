package atm;

import java.util.ArrayList;

// ต่่างกับ class ที่ ไม่มี {} ตอนท้าย
public interface DataSource {
    public ArrayList<Customer> getCustomerData();
}
