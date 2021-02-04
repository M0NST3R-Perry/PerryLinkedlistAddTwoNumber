package Practice001;
import java.util.LinkedList;

public class LinkedlistTest {
    
	
	public static void main(String[] args) {
		    int sum;
		    int carry=0;
		
	        LinkedList<Integer> nums1=new LinkedList<Integer>();
	        LinkedList<Integer> nums2=new LinkedList<Integer>();
	        LinkedList<Integer> nums3=new LinkedList<Integer>();
	        nums1.add(1);
	        nums1.add(2);
	        nums1.add(6);
	        
	        nums2.add(2);
	        nums2.add(9);
	        nums2.add(6);	        	        
	        try {
	        for(int i=0;i<nums1.size() || i<nums2.size();i++){	        		           
	            
	            //LinkedList1 2皆不為空
	            if(nums1.get(i)!=null&&nums2.get(i)!=null) {
	            	sum=nums1.get(i)+nums2.get(i);
	            	if(sum>=10) {
	            	   carry=sum/10;
	            	   sum=sum%10;
	            	}
	            	nums3.add(sum);
	            }
	            //LinkedList1空了
	            else if(nums1.get(i)==null){
	            	sum=nums2.get(i);
	            	nums3.add(sum);
	            }
	            //LinkedList2空了
                else if(nums2.get(i)==null){
                	sum=nums1.get(i);
                	nums3.add(sum);
	            }
	            
	            if(carry==1) {
	        		nums3.set(i-1,nums3.get(i-1)+1);
	        	}
	            
	        }
	        System.out.println(nums3);

	}catch(Exception e) {
		System.out.println("有些錯誤");
	}
	        
	}
}
