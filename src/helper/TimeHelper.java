/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class TimeHelper {
    
    public static Timestamp getCurrentTimeStamp() {
        Date date = new Date();
        Timestamp ret = new Timestamp(date.getTime());
        
        return ret;
    }
    
    public static String TimestampToString(Timestamp ts) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return sdf.format(ts);
    }
}
