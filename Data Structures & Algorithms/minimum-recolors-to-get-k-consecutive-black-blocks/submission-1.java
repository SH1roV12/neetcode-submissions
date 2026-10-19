class Solution {
    public int minimumRecolors(String blocks, int k) {
        int curW = 0;
        for( int i = 0; i < k; i++){
            if (blocks.charAt(i) == 'W'){
                curW++;
            }
        }

        int counter = curW;

        for (int r = k; r < blocks.length(); r++){
            if (blocks.charAt(r) == 'W'){
                curW++;
            }
            if (blocks.charAt(r-k) == 'W'){
                curW--;
            }

            counter = Math.min(curW,counter);
        }
        return counter;
    }

    }
