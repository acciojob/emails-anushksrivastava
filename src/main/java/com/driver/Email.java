package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(){
        this.emailId = "";
        this.password = "Accio@123";
    }
    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Email(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
   boolean upper=false;
   boolean lower=false;
   boolean digit=false;
    boolean special=false;
    if(oldPassword.equals(password))
   {
       if(newPassword.length()>7)
       {
           for(int i=0;i<newPassword.length();i++)
           {
               if(newPassword.charAt(i)>=65 && newPassword.charAt(i)<=90)
               {
                   upper=true;
                   break;
               }
           }
           for(int i=0;i<newPassword.length();i++)
           {
               if(newPassword.charAt(i)>=97 && newPassword.charAt(i)<=122)
               {
                   lower=true;
                   break;
               }
           }
           for(int i=0;i<newPassword.length();i++)
           {
               if(newPassword.charAt(i)>=48 && newPassword.charAt(i)<=57)
               {
                   digit=true;
                   break;
               }
           }
           for(int i=0;i<newPassword.length();i++)
           {
               if(newPassword.charAt(i)<=65 && newPassword.charAt(i)>=90 && newPassword.charAt(i)<=48 && newPassword.charAt(i)>=57 && newPassword.charAt(i)<=97 && newPassword.charAt(i)>=122)
               {
                   special=true;
                   break;
               }
           }

           if((digit == true) && (special == true) && (upper == true) && (lower == true))
               password=newPassword;

       } }
       else
           return;
   }
    }

