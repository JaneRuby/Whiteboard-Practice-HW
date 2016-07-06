package com.company;

public class Main {

    public static String main(String[] args) {

        public String doubleChar (String str){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                String thisThing = Character.toString(str.charAt(i));
                result += thisThing + thisThing;
            }
            return result;
        }
    }

                    public boolean cigarParty(int cigars, boolean isWeekend) {
                    return (cigars >= 40 && (cigars <= 60 || isWeekend));
                }

                    public int[] rotateLeft3(int[] nums) {
                    int[] anotherThing = new int[3];
                    for (int i = 0; i < nums.length; i++)
                            anotherThing[i] = nums[(i + 1) % 3];
                    return anotherThing;
                }

                    public int[] fix23(int[] nums) {
                    for (int i = 0; i < nums.length - 1; i++){
                            if(nums[i] == 2 && nums[i + 1] == 3)
                                    nums[i + 1] = 0;
                        }
                    return nums;
                }


    }

