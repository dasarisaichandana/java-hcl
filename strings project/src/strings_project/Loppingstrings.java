package strings_project;

public class Loppingstrings {

	public static void main(String[] args) {
		String str="my name is sai chandana ,my hobies is sai playing and i want to become sai good .";
		name(str);
		
	}
		
		public static void name(String sing){
			int i=0;
			while(true) {
			int found = sing.indexOf("sai",i);
			if(found == -1) break;
			int start= found+4;
			int end= sing.indexOf(" ",start);
			System.out.println(sing.substring(start,end));
			i=end+1;
			
			
		}

		}
		}

	


