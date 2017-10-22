import org.apache.commons.cli.*;
public class CommandLineParser{
	private String DoctorDataFile;
	private String PatientDataFile;
	private String DiseaseDataFile;
	private String[] args;
	public CommandLineParser(String[] args) {
		this.setArgs(args);
		
	}

	public String getDocFile(){
		return this.DoctorDataFile;
	}
	public String getPatFile(){
		return this.PatientDataFile;
	}
	public String getDieFile(){
		return this.DiseaseDataFile;
	}
	public void parse() throws ParseException{
		Option helpOption = 	Option.builder("h")
					.longOpt("help")
					.required(false)
					.desc("-p for Doctor input -q for patient input -r for Disease input")
					.build();
		Option DocInputFile = 	Option.builder("p")
					.longOpt("doc")
					.required(true)
					.desc("Doctor Data File")
					.build();
		
		Option PatInputFile = 	Option.builder("q")
					.longOpt("pat")
					.required(true)
					.desc("Patient Data File")
					.build();
		
		Option DiseaseInputFile= 	Option.builder("r")
						.longOpt("die")
						.required(true)
						.desc("Disese Data File")
						.build();
		
		Options options = new Options();
		options.addOption(helpOption);
		options.addOption(DocInputFile);
		options.addOption(PatInputFile);
		options.addOption(DiseaseInputFile);
		DefaultParser parser = new DefaultParser();
		CommandLine cmdLine = parser.parse(options, args);
		if(cmdLine.hasOption("help")){
			HelpFormatter formatter  = new HelpFormatter();
			formatter.printHelp("Datbase Application", options);
		} else if(cmdLine.hasOption("p")){
			DoctorDataFile= cmdLine.getParsedOptionValue("p").toString();
		} else if(cmdLine.hasOption("q")){
			PatientDataFile= cmdLine.getParsedOptionValue("q").toString();
		} else if(cmdLine.hasOption("r")){
			DiseaseDataFile=cmdLine.getParsedOptionValue("r").toString();
		}
	}
	public String[] getArgs() {
		return args;
	}
	public void setArgs(String[] args) {
		this.args = args;
	}

}	
