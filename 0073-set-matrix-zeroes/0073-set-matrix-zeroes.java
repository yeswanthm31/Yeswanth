class Solution {
    public void setZeroes(int[][] matrix) {
       HashSet<Integer>row=new HashSet<>();
        HashSet<Integer>col=new HashSet<>();
        int rlen=matrix.length;
        int clen=matrix[0].length;
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<rlen;i++){
               if(row.contains(i)){
            for(int j=0;j<clen;j++){
                matrix[i][j]=0;
                }
            }
        } for(int j=0;j<clen;j++){
               if(col.contains(j)){
            for(int i=0;i<rlen;i++){
                matrix[i][j]=0;
                }
            }
        }

        
    }
}