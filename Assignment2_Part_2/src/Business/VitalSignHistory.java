/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 *
 * @author HP
 */
public class VitalSignHistory {
  
    
    public static void main (String [] args) { 
    ArrayList <Vsign> VitalHistory =new ArrayList<Vsign>();
    
    ArrayList <String> Person=new ArrayList<String>();
    while(true){
        Vsign v =new Vsign();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the patient FullName");
    String patientFullName = s.next();
    Person.add(patientFullName);
    v.setPatientFullName(patientFullName);
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Birth Year of Patient: ");
    int years = s.nextInt();
    v.setYears(years);
    System.out.println("Enter Birth Month of Patient: ");
    int months = s.nextInt();
    v.setMonths(months);
    System.out.println("Enter Birth date of Patient: ");
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
    VitalHistory.add(v);
    System.out.println("Patient : " +v);
    boolean isNormal = isThisVitalSignNormal(v);
        if(isNormal == true){
            System.out.println("The Patient is normal");
        }
        else{
            System.out.println("Patient is abnormal");
        }
      //  VitalHistory.add(v);
       System.out.println("DO You Want To Continue: Yes / No"); 
       Scanner scan = new Scanner(System.in);
       String D = scan.next();
       if (D.equals("yes")){
       continue;
               }
       else {
      break;
    }
    
    //Vsign v1 =new Vsign();
    
    }
    for(String v: Person){
        System.out.println("Patient Name:" + v);
    for(Vsign v1: VitalHistory){
    
    System.out.println("Respiratory  Rate is " + v1.getRespiratoryRate());
    System.out.println(" SystolicBloodPressure is " + v1.getSystolicBloodPressure());
    System.out.println("Heart Rate is " + v1.getHeartRate());
    System.out.println("Weight in kilos " + v1.getWeightInKilos());
    System.out.println("Weignt in pounds " + v1.getWeightInPounds());
    
    }
    }
    }
    public static boolean isThisVitalSignNormal(Vsign v){
    System.out.println("Date" + v.getYears());
    LocalDate birthday = LocalDate.of(v.getYears(),v.getMonths(),v.getDays());
    LocalDate now = LocalDate.now();
    Period diff = Period.between(birthday, now);
    System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");  
      
// newborn

if (diff.getYears()==0){
    if(diff.getMonths()==0){
        if(v.getRespiratoryRate()>=30 && v.getRespiratoryRate()<=50){  
           if (v.getHeartRate()>=120 && v.getHeartRate()<=160){
               if (v.getSystolicBloodPressure()>=50 && v.getSystolicBloodPressure()<=70){
                   if (v.getWeightInKilos()>=2 && v.getWeightInKilos()<=3){
                       if (v.getWeightInPounds()>=4.5 && v.getWeightInPounds()<=7){
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
                if (v.getHeartRate()>=80 && v.getHeartRate()<=140){
                   if (v.getSystolicBloodPressure()>=70 && v.getSystolicBloodPressure()<=100){
                        if (v.getWeightInKilos()>=4 && v.getWeightInKilos()<=10){
                            if (v.getWeightInPounds()>=9 && v.getWeightInPounds()<=22){
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
            if (v.getHeartRate()>=80 && v.getHeartRate()<=130){
                if (v.getSystolicBloodPressure()>=80 && v.getSystolicBloodPressure()<=110){
                    if (v.getWeightInKilos()>=10 && v.getWeightInKilos()<=14){
                        if (v.getWeightInPounds()>=22 && v.getWeightInPounds()<=31){
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
            if (v.getHeartRate()>=80 && v.getHeartRate()<=120){
                if (v.getSystolicBloodPressure()>=80 && v.getSystolicBloodPressure()<=110){
                    if (v.getWeightInKilos()>=14 && v.getWeightInKilos()<=18){
                        if (v.getWeightInPounds()>=31 && v.getWeightInPounds()<=40){
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
            if (v.getHeartRate()>=70 && v.getHeartRate()<=110){
                if (v.getSystolicBloodPressure()>=80 && v.getSystolicBloodPressure()<=120){
                    if (v.getWeightInKilos()>=20 && v.getWeightInKilos()<=42){
                        if (v.getWeightInPounds()>=41 && v.getWeightInPounds()<=92){
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
            if (v.getHeartRate()>=55 && v.getHeartRate()<=105){
                if (v.getSystolicBloodPressure()>=110 && v.getSystolicBloodPressure()<=120){
                    if (v.getWeightInKilos()>50){
                        if (v.getWeightInPounds()>110){    
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
  
