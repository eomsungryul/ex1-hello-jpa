package cascade;

import java.io.File;
import java.io.IOException;

public class test {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source = "E:\\EOM\\Project\\TMS 2.0\\비콘관련\\리뉴얼 비콘(프리미엄 포함)_200729\\리뉴얼 비콘(프리미엄 포함)_200729";
		subDirList(source);

	}

	public static void subDirList(String source){

		File dir = new File(source);

		File[] fileList = dir.listFiles();

		try{

			for(int i = 0 ; i < fileList.length ; i++){

				File file = fileList[i];

				if(file.isFile()){

					// 파일이 있다면 파일 이름 출력
//					System.out.println("\t 파일 이름 = " + file.getName());
					System.out.println(file.getName().replaceAll(".png", ""));

				}else if(file.isDirectory()){

//					System.out.println("디렉토리 이름 = " + file.getName());
					// 서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
//					if(file.getName().indexOf("반품")==-1&&file.getName().indexOf("프리미엄")==-1) {
//						subDirList(file.getCanonicalPath().toString());
//					}


//					if(file.getName().indexOf("반품")>-1) {
////						System.out.println("디렉토리 이름 = " + file.getName());
//						subDirList(file.getCanonicalPath().toString());
//					}

					if(file.getName().indexOf("프리미엄")>-1) {
//						System.out.println("디렉토리 이름 = " + file.getName());
						subDirList(file.getCanonicalPath().toString());
					}





				}
			}

		}catch(IOException e){



		}

	}




}
