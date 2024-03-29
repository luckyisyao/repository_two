package com.lmash.mysqltest.util;

/**
 * Created by Administrator on 2019/10/17.
 */
public class IDNumberUtil {

        public static boolean isIDNumber(String IDNumber){
                if (IDNumber == null || "".equals(IDNumber)){
                        return false;
                }
                // 定义判别用户身份证号的正则表达式（15位或者18位，最后一位可以为字母）
                String regularExpression = "(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|" +
                        "(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";
                //String类有matches方法可以判断与给定的正则表达式是否匹配
                boolean matches = IDNumber.matches(regularExpression);

                //判断第18位校验值
                if (matches) {

                        if (IDNumber.length() == 18) {
                                try {
                                        char[] charArray = IDNumber.toCharArray();
                                        //前十七位加权因子
                                        int[] idCardWi = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
                                        //这是除以11后，可能产生的11位余数对应的验证码
                                        String[] idCardY = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
                                        int sum = 0;
                                        for (int i = 0; i < idCardWi.length; i++) {
                                                int current = Integer.parseInt(String.valueOf(charArray[i]));
                                                int count = current * idCardWi[i];
                                                sum += count;
                                        }
                                        char idCardLast = charArray[17];
                                        int idCardMod = sum % 11;
                                        if (idCardY[idCardMod].toUpperCase().equals(String.valueOf(idCardLast).toUpperCase())) {
                                                return true;
                                        } else {
                                                return false;
                                        }

                                } catch (Exception e) {
                                        e.printStackTrace();
                                        return false;
                                }
                        }

                }
                return matches;
        }

}

