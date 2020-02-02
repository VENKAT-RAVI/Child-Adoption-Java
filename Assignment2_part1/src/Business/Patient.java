/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author HP
 */
public class Patient {
    private static int age;
    
    
    
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    VitalSigns v = new VitalSigns();
    
    
    VitalSigns vitalsv1 = new VitalSigns();
    
    vitalsv1.setYears(2020);
    vitalsv1.setMonths(1);
    vitalsv1.setDays(26);
    vitalsv1.setRespiratoryRate(40);
    vitalsv1.setHeartRate(130);
    vitalsv1.setSystolicBloodPressure(60);
    vitalsv1.setWeightInKilos(2);
    vitalsv1.setWeightInPounds(5);
        System.out.println("Patient 1: " +vitalsv1);
        boolean isNormal = isPatientNormal(vitalsv1);
        if(isNormal == true){
            System.out.println("Patient is normal");
        }
        else{
            System.out.println("Patient is abnormal");
        }
        
        
    
    
    VitalSigns vitalsv2 = new VitalSigns();
    vitalsv2.setYears(2020);
    vitalsv2.setMonths(1);
    vitalsv2.setDays(25);
    vitalsv2.setRespiratoryRate(25);
    vitalsv2.setHeartRate(110);
    vitalsv2.setSystolicBloodPressure(80);
    vitalsv2.setWeightInKilos(5);
    vitalsv2.setWeightInPounds(20);
    System.out.println("Patient 2: " +vitalsv2);
        isNormal = isPatientNormal(vitalsv2);
        if(isNormal == true){
            System.out.println("Patient is normal");
        }
        else{
            System.out.println("Patient is abnormal");
        }
    
    VitalSigns vitalsv3 = new VitalSigns();
    vitalsv3.setYears(2018);
    vitalsv3.setMonths(2);
    vitalsv3.setDays(12);
    vitalsv3.setRespiratoryRate(25);
    vitalsv3.setHeartRate(100);
    vitalsv3.setSystolicBloodPressure(90);
    vitalsv3.setWeightInKilos(12);
    vitalsv3.setWeightInPounds(25);
        System.out.println("Patient 3: " + vitalsv3);
        isNormal = isPatientNormal(vitalsv3);
        if (isNormal == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is abnormal");
        }
    
    VitalSigns vitalsv4 = new VitalSigns();
    vitalsv4.setYears(2015);
    vitalsv4.setMonths(2);
    vitalsv4.setDays(12);
    vitalsv4.setRespiratoryRate(26);
    vitalsv4.setHeartRate(110);
    vitalsv4.setSystolicBloodPressure(100);
    vitalsv4.setWeightInKilos(15);
    vitalsv4.setWeightInPounds(50);
    System.out.println("Patient 4: " +vitalsv4);
        isNormal = isPatientNormal(vitalsv4);
        if(isNormal == true){
            System.out.println("Patient is normal");
        }
        else{
            System.out.println("Patient is abnormal");
        }
    
    VitalSigns vitalsv5 = new VitalSigns();
    vitalsv5.setYears(2010);
    vitalsv5.setMonths(2);
    vitalsv5.setDays(20);
    vitalsv5.setRespiratoryRate(25);
    vitalsv5.setHeartRate(80);
    vitalsv5.setSystolicBloodPressure(90);
    vitalsv5.setWeightInKilos(25);
    vitalsv5.setWeightInPounds(100);
    System.out.println("Patient 5: " +vitalsv5);
        isNormal = isPatientNormal(vitalsv5);
        if(isNormal == true){
            System.out.println("Patient is normal");
        }
        else{
            System.out.println("Patient is abnormal");
        }
    
    VitalSigns vitalsv6 = new VitalSigns();
    vitalsv6.setYears(1982);
    vitalsv6.setMonths(2);
    vitalsv6.setDays(14);
    vitalsv6.setRespiratoryRate(15);
    vitalsv6.setHeartRate(70);
    vitalsv6.setSystolicBloodPressure(115);
    vitalsv6.setWeightInKilos(80);
    vitalsv6.setWeightInPounds(100);
    System.out.println("Patient 6: " +vitalsv6);
        isNormal = isPatientNormal(vitalsv6);
        if(isNormal == true){
            System.out.println("Patient is normal");
        }
        else{
            System.out.println("Patient is abnormal");
        }
    
    
    
    System.out.println("Enter Birth Year of Patient: ");
    int years = s.nextInt();
    v.setYears(years);
    System.out.println("Enter Birth Month of Patient: ");
    int months = s.nextInt();
    v.setMonths(months);
    System.out.println("Enter Birthday of Patient: ");
    int days = s.nextInt();
    v.setDays(days);
    System.out.println("Enter the RespiratoryRate of Patient: ");
    int respiratoryRate = s.nextInt();
    v.setRespiratoryRate(respiratoryRate);
    System.out.println("Enter the HeartRate of Patient: ");
    int heartRate = s.nextInt();
    v.setHeartRate(heartRate);
    System.out.println("Enter the SystolicBloodPressure of Patient: ");
    int systolicBloodPressure = s.nextInt();
    v.setSystolicBloodPressure(systolicBloodPressure);
    System.out.println("Enter the WeightInKilos of Patient: ");
    int weightInKilos = s.nextInt();
    v.setWeightInKilos(weightInKilos);
    System.out.println("Enter the WeightInPounds of Patient: ");
    double weightInPouds = s.nextDouble();
    v.setWeightInPounds(weightInPouds);
        System.out.println("Patient 7: " +v);
        isNormal = isPatientNormal(v);
        if(isNormal == true){
            System.out.println("Patient is normal");
        }
        else{
            System.out.println("Patient is abnormal");
        }
    }
    
    public static boolean isPatientNormal(VitalSigns v)
    {
    System.out.println("Date" + v.getYears());
    LocalDate birthday = LocalDate.of(v.getYears(),v.getMonths(),v.getDays());
    LocalDate now = LocalDate.now();
    Period diff = Period.between(birthday, now);
    System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");
    
// newborn

if (diff.getYears()==0){
    if(diff.getMonths()==0){
        if(v.getRespiratoryRate()>=30 && v.getRespiratoryRate()<=50){  
            System.out.println("Patient RespiratoryRate Normal");
           if (v.getHeartRate()>=120 && v.getHeartRate()<=160){
                System.out.println("Patient HeartRate Normal");
               if (v.getSystolicBloodPressure()>=50 && v.getSystolicBloodPressure()<=70){
                    System.out.println("Patient SystolicBloodPressure Normal");
                   if (v.getWeightInKilos()>=2 && v.getWeightInKilos()<=3){
                        System.out.println("Patient WeightInKilos Normal");
                       if (v.getWeightInPounds()>=4.5 && v.getWeightInPounds()<=7){
                            System.out.println("Patient WeightInPounds Normal");
                            return true;
                       }
                        else{
                           if(v.getWeightInPounds()< 4.5 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 4.5");
                           }
                           else if(v.getWeightInPounds()>7){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 7");
                           }
                           return false;
                       }
                   }
                    else {
                       if (v.getWeightInKilos()<2 ){
                        System.out.println("Patient weightInKilos is Ab-Normal i.e less than 2");
                       }
                       else if(v.getWeightInKilos()<3){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 3");
                        }
                        return false;
                    }
               }else {
                    if (v.getSystolicBloodPressure()<50 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 50");
                       }
                       else if(v.getSystolicBloodPressure()>70){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 70");
                        }
                       return false;
                    }
            }else{
                if (v.getHeartRate()<120 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 120");
                    }
                    else if(v.getHeartRate()>160){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 160");
                        }
                    return false;
                }
        }else{
            if (v.getRespiratoryRate()<30 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 30");
                }
                    else if(v.getRespiratoryRate()>50){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 50");
                        }
                    return false;
                    }
    }
}       

// infant    
if(diff.getYears()==0){
    if (diff.getMonths()<1){
        if(v.getRespiratoryRate()>=20 && v.getRespiratoryRate()<=30){  
                System.out.println("Patient RespiratoryRate Normal");
                if (v.getHeartRate()>=80 && v.getHeartRate()<=140){
                    System.out.println("Patient HeartRate Normal");
                   if (v.getSystolicBloodPressure()>=70 && v.getSystolicBloodPressure()<=100){
                        System.out.println("Patient SystolicBloodPressure Normal");
                        if (v.getWeightInKilos()>=4 && v.getWeightInKilos()<=10){
                            System.out.println("Patient WeightInKilos Normal");
                            if (v.getWeightInPounds()>=9 && v.getWeightInPounds()<=22){
                                System.out.println("Patient WeightInPounds Normal");
                                return true;
                            }
                            else{
                           if(v.getWeightInPounds()< 9){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 9");
                           }
                           else if(v.getWeightInPounds()>22){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 22");
                           }
                           return false;
                       }
                   }
                    else {
                       if (v.getWeightInKilos()<4 ){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 4");
                       }
                       else if(v.getWeightInKilos()<10){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 10");
                        }
                        return false;
                    }
               }else {
                    if (v.getSystolicBloodPressure()<70 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 70");
                       }
                       else if(v.getSystolicBloodPressure()>100){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 100");
                        }
                       return false;
                    }
            }else{
                if (v.getHeartRate()<80 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 80");
                    }
                    else if(v.getHeartRate()>140){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 140");
                        }
                    return false;
                }
        }else{
            if (v.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(v.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }
}

// toodler                                
    if (diff.getYears()>=1 && diff.getYears()<=3){
        if(v.getRespiratoryRate()>=20 && v.getRespiratoryRate()<=30){  
            System.out.println("Patient RespiratoryRate Normal");
            if (v.getHeartRate()>=80 && v.getHeartRate()<=130){
                System.out.println("Patient HeartRate Normal");
                if (v.getSystolicBloodPressure()>=80 && v.getSystolicBloodPressure()<=110){
                    System.out.println("Patient SystolicBloodPressure Normal");
                    if (v.getWeightInKilos()>=10 && v.getWeightInKilos()<=14){
                        System.out.println("Patient WeightInKilos Normal");
                        if (v.getWeightInPounds()>=22 && v.getWeightInPounds()<=31){
                            System.out.println("Patient WeightInPounds Normal");
                            return true;
                        }
                        else{
                           if(v.getWeightInPounds()< 22 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 22");
                           }
                           else if(v.getWeightInPounds()>31){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 31");
                           }
                           return false;
                       }
                   }
                    else {
                       if (v.getWeightInKilos()<10){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 10");
                       }
                       else if(v.getWeightInKilos()>14){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 14");
                        }
                        return false;
                    }
               }else {
                    if (v.getSystolicBloodPressure()<80 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 80");
                       }
                       else if(v.getSystolicBloodPressure()>110){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 110");
                        }
                       return false;
                    }
            }else{
                if (v.getHeartRate()<80 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 80");
                    }
                    else if(v.getHeartRate()>130){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 130");
                        }
                    return false;
                }
        }else{
            if (v.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(v.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }
//preschooler
    if (diff.getYears()<=3 && diff.getYears()<=5){
        if(v.getRespiratoryRate()>=20 && v.getRespiratoryRate()<=30){  
            System.out.println("Patient RespiratoryRate Normal");
            if (v.getHeartRate()>=80 && v.getHeartRate()<=120){
                System.out.println("Patient HeartRate Normal");
                if (v.getSystolicBloodPressure()>=80 && v.getSystolicBloodPressure()<=110){
                    System.out.println("Patient SystolicBloodPressureNormal");
                    if (v.getWeightInKilos()>=14 && v.getWeightInKilos()<=18){
                        System.out.println("Patient WeightInKilosNormal");
                        if (v.getWeightInPounds()>=31 && v.getWeightInPounds()<=40){
                            System.out.println("Patient WeightInPounds Normal");
                            return true;
                        }
                        else{
                           if(v.getWeightInPounds()< 31 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 31");
                           }
                           else if(v.getWeightInPounds()>40){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 40");
                           }
                           return false;
                       }
                   }
                    else {
                       if (v.getWeightInKilos()<14 ){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 14");
                       }
                       else if(v.getWeightInKilos()>18){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 18");
                        }
                        return false;
                    }
               }else {
                    if (v.getSystolicBloodPressure()<80 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 80");
                       }
                       else if(v.getSystolicBloodPressure()>110){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 110");
                        }
                       return false;
                    }
            }else{
                if (v.getHeartRate()<80 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 80");
                    }
                    else if(v.getHeartRate()>120){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 120");
                        }
                    return false;
                }
        }else{
            if (v.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(v.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }
                    
//school age
    if (diff.getYears()>=6 && diff.getYears()<=12){
        if(v.getRespiratoryRate()>=20 && v.getRespiratoryRate()<=30){  
            System.out.println("Patient RespiratoryRate Normal");
            if (v.getHeartRate()>=70 && v.getHeartRate()<=110){
                System.out.println("Patient HeartRate Normal");
                if (v.getSystolicBloodPressure()>=80 && v.getSystolicBloodPressure()<=120){
                    System.out.println("Patient systolicBloodPressure Normal");
                    if (v.getWeightInKilos()>=20 && v.getWeightInKilos()<=42){
                        System.out.println("Patient weightInKilosNormal");
                        if (v.getWeightInPounds()>=41 && v.getWeightInPounds()<=92){
                            System.out.println("Patient weightInPounds Normal");
                            return true;
                        }
                        else{
                           if(v.getWeightInPounds()< 41 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 41");
                           }
                           else if(v.getWeightInPounds()>92){
                              System.out.println("Patient Weight in Pounds is Ab-Normal i.e greater than 92");
                           }
                           return false;
                       }
                   }
                    else {
                       if (v.getWeightInKilos()<20 ){
                        System.out.println("Patient weightInKilos is Ab-Normal i.e less than 20");
                       }
                       else if(v.getWeightInKilos()>42){
                        System.out.println("Patient Weight in Kilos is Ab-Normal i.e greater than 42");
                        }
                        return false;
                    }
               }else {
                    if (v.getSystolicBloodPressure()<80 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 80");
                       }
                       else if(v.getSystolicBloodPressure()>120){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 120");
                        }
                       return false;
                    }
            }else{
                if (v.getHeartRate()<70 ){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 70");
                    }
                    else if(v.getHeartRate()>110){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 110");
                        }
                    return false;
                }
        }else{
            if (v.getRespiratoryRate()<20 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 20");
                }
                    else if(v.getRespiratoryRate()>30){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 30");
                        }
                    return false;
                    }
    }   
            
// adolescent                                                           
    if (diff.getYears()>=13){
        if(v.getRespiratoryRate()>=12 && v.getRespiratoryRate()<=20){  
            System.out.println("Patient RespiratoryRate Normal");
            if (v.getHeartRate()>=55 && v.getHeartRate()<=105){
                System.out.println("Patient HeartRate AbNormal");
                if (v.getSystolicBloodPressure()>=110 && v.getSystolicBloodPressure()<=120){
                    System.out.println("Patient SystolicBloodPressure Normal");
                    if (v.getWeightInKilos()>50){
                        System.out.println("Patient WeightInKilos Normal");
                        if (v.getWeightInPounds()>110){
                            System.out.println("Patient weightInPounds Normal");    
                            return true;
                        }
                    else{
                           if(v.getWeightInPounds()<110 ){
                               System.out.println("Patient Weight in Pounds is Ab-Normal i.e less than 110");
                           }
                           return false;
                       }
                   }
                    else {
                       if (v.getWeightInKilos()<50 ){
                        System.out.println("Patient WeightInKilos is Ab-Normal i.e less than 50");
                       }
                        return false;
                    }
               }else {
                    if (v.getSystolicBloodPressure()<110 ){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e less than 110");
                       }
                       else if(v.getSystolicBloodPressure()>120){
                        System.out.println("Patient SystolicBloodPressure is Ab-Normal i.e greater than 120");
                        }
                       return false;
                    }
            }else{
                if (v.getHeartRate()<55){
                    System.out.println("Patient HeartRate is Ab-Normal i.e less than 55");
                    }
                    else if(v.getHeartRate()>105){
                        System.out.println("Patient HeartRate is Ab-Normal i.e greater than 105");
                        }
                    return false;
                }
        }else{
            if (v.getRespiratoryRate()<12 ){
                System.out.println("Patient RespiratoryRate is Ab-Normal i.e less than 12");
                }
                    else if(v.getRespiratoryRate()>20){
                        System.out.println("Patient RespiratoryRate is Ab-Normal i.e greater than 20");
                        }
                    return false;
                    }
    }    
return true;
}
}