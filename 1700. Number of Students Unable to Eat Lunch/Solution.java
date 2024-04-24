class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleStu = 0;
        int squareStu = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i] == 0){
                circleStu++;
            }
            else{
                squareStu++;
            }
        }
        for(int i = 0; i < sandwiches.length;i++){
            if(sandwiches[i] == 0){
                if(circleStu > 0){
                    circleStu--;
                }
                else{
                    return squareStu ;
                }
            }
            else{
                if(squareStu > 0){
                    squareStu--;
                }
                else{
                    return circleStu;
                }
            }
        }
        return squareStu+circleStu;
    }
}
