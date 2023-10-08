package strategyPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sortType = sc.nextLine();

        ISortData sortData = null;

        try{
            sortType = sortType.toLowerCase();

            //System.out.println(sortType);
            //System.out.println(SortTypeEnum.Bubble.name().toLowerCase());

            if(sortType.equals(SortTypeEnum.Quick.name().toLowerCase())){
                sortData = new QuickSort();
            }
            else if(sortType.equals(SortTypeEnum.Bubble.name().toLowerCase())){
                sortData = new BubbleSort();
            }
            else if(sortType.equals(SortTypeEnum.Insertion.name().toLowerCase())){
                sortData = new InsertionSort();
            }
            else if(sortType.equals(SortTypeEnum.Merge.name().toLowerCase())){
                sortData = new MergeSort();
            }
            sortData.sort();
        }
        catch (NullPointerException ex){
            System.out.println(ex.toString());
        }

    }
}
