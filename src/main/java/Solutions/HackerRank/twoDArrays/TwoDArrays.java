package Solutions.HackerRank.twoDArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoDArrays {
    public static void main(String[] args) {
//  https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

        int[][] twoDArray =
                {{5,6,0,3,0,1},
                {1,1,1,0,2,1},
                {1,0,1,3,2,1},
                {5,6,7,0,2,1},
                {5,0,7,3,0,1},
                {5,0,5,3,2,1}
                };
        int max = getMax(twoDArray);
        System.out.println(max);
    }

    public static int  getMax(int twoDArray[][]) {

        int GRID_SIZE = 6;

        List<Integer> list = new ArrayList<>();

        for (int row = 0 ; row <= GRID_SIZE-3 ; row ++) {

            for (int column = 0 ; column <= GRID_SIZE-3; column++) {

                // sub grid sum

                int count = 0;
                int iteration = 1;

                for (int startR = row; startR < row + 3 && row + 3 <= GRID_SIZE ; startR ++ ) {

                    if (iteration == 2) {

                        int coulumnIteration = 0;
                        for (int startCol = column ; startCol < column + 3 && column + 3 <= GRID_SIZE; startCol++) {
                            coulumnIteration++;

                            if (coulumnIteration == 2) {
                                count = count +  twoDArray[startR][startCol];
                            }
                        }

                    } else {

                        for (int startCol = column ; startCol < column + 3 && column + 3 <= GRID_SIZE; startCol++) {

                            count = count +  twoDArray[startR][startCol];

                        }
                    }

                    iteration++;
                }


                list.add(count);
            }
        }


        Collections.sort(list);

        return list.get(list.size()-1);
    }
}
