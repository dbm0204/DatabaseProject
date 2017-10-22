import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.cli.ParseException;
public class Main
{
	private static CommandLineParser cli;
	private ArrayList<Doctor> doc_array;
	private ArrayList<Patient> pat_array;
	private ArrayList<Disease> die_array;
	public Main(){
		this.doc_array=new ArrayList<Doctor>();
		this.pat_array=new ArrayList<Patient>();
		this.die_array=new ArrayList<Disease>();
		
	}
	public static ArrayList<Doctor> processTexttoDoc(String FilePath)throws IOException {
		ArrayList<Doctor> result= new ArrayList<Doctor>();
		Scanner scan = new Scanner(new File(FilePath));
		while(scan.hasNextLine()){
			String line= scan.nextLine();
			String[] lineArray= line.split(","); //Split at the Delimiter
			result.add(new Doctor(lineArray[0],lineArray[1],lineArray[2],lineArray[3]));
		}
		scan.close();
		return result;
	}
	public static ArrayList<Patient> processTextToPatient(String FilePath)throws IOException {
		ArrayList<Patient> result = new ArrayList<Patient>();
		Scanner scan = new Scanner(new File(FilePath));
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String[] lineArray = line.split(",");
			result.add(new Patient(lineArray[0], lineArray[1], lineArray[2], lineArray[3], lineArray[4], lineArray[5], lineArray[6]));
		}
		scan.close();
		return result;
	}
	public static ArrayList<Disease> processTextToDisease(String FilePath) throws IOException{
		ArrayList<Disease> result = new ArrayList<Disease>();
		Scanner scan= new Scanner(new File(FilePath));
		while(scan.hasNextLine()){
			String line= scan.nextLine();
			String[] lineArray =line.split(",");
			result.add( new Disease(lineArray[0], lineArray[1], lineArray[2], lineArray[3],lineArray[4]));
		}
		scan.close();
		return result;
	}
	public static void main(String[] args){
		Main obj = new Main();
		try {
			CommandLineParser cli = new CommandLineParser(args);
			cli.parse();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		try{
			obj.doc_array=processTexttoDoc(cli.getDocFile());
			obj.pat_array=processTextToPatient(cli.getPatFile());
			obj.die_array=processTextToDisease(cli.getDieFile());
		} catch(IOException e){
			e.printStackTrace();
		}	
	}
	public ArrayList<Disease> getDie_array() {
		return die_array;
	}
	public ArrayList<Patient> getPat_array() {
		return pat_array;
	}
	public ArrayList<Doctor> getDoc_array() {
		return doc_array;
	}	
}
