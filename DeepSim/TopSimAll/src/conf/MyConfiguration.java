package conf;

import java.io.IOException;

import utils.GraphGenerator;
import utils.Print;

public class MyConfiguration {
	//global setting
	
//	public static  String basePath_in = "/Users/songjs/Desktop/workspace/Uniwalk";
	public static  String basePath_in = "../../";
//	public static  String basePath_out = "/Users/songjs/Desktop/workspace/Uniwalk";
	public static  String basePath_out = "../../";
	// public static String realdata = basePath +"/realdata";
	public static  String SEPARATOR = ",";
//	public static  String SEPARATOR = "\t";
	public static final String SEPARATOR_KV = ":";
	public static  int TOPK = 20;
	public static  double MIN = 0.000000001;
	public static  double C = 0.6;
	public static int testTopK[] = {20};	//single
//	public static int testTopK[] = {30};	// Dev	需要30的来找候选集，之后下面计算TopK的时候直接用了MyConfiguration.TOPK=10
	
	// configuration for undirected_unweighted graph
	public static  int fileNum = 14;
	public static  int u_u_count[] = {10313,1380,38741,10000,10000,333,1034,1000,1000,1000,1000,786,3015,3011,5242,3024,6000,6000,6000};
	public static  int u_u_avgD = 5;
	public static  String in_u_u_graphPath[] = {
		basePath_in+"/lshrank_data/realdata/blog.txt",
		basePath_in+"/lshrank_data/realdata/moreno_crime_crime.txt",
		basePath_in+"/lshrank_data/realdata/arxiv_author_pub.txt",
		basePath_in+"/lshrank_data/power_graph/power_biGraph_10000_5.txt",
		basePath_in+"/lshrank_data/randomdata/biGraph_10k_5.txt",
		basePath_in+"/input_u_u/0_333_5038.txt",
		basePath_in+"/input_u_u/107_1034_53498.txt",
		basePath_in+"/input_u_u/Power_law_1000_5000.txt",
		basePath_in+"/input_u_u/Power_law_1000_10000.txt",
		basePath_in+"/input_u_u/Power_law_1000_15000.txt",
		basePath_in+"/input_u_u/Power_law_1000_20000.txt",
		basePath_in+"/input_u_u/1684_786_28048.txt",
		basePath_in+"/input_u_u/as19971108_3015_10695.txt",
		basePath_in+"/input_u_u/as19971109_3011_10687.txt",
		basePath_in+"/input_u_u/ca-GrQc_5242_28980.txt",
		basePath_in+"/input_u_u/as19971110_3024_10773.txt",
		basePath_in+"/input_u_u/oregon2_010331_6000_17033.txt",
		basePath_in+"/input_u_u/oregon2_010407_6000_16852.txt",
		basePath_in+"/input_u_u/ca-HepPh_6000_195023.txt"};
	
	public static  String out_u_u_graphPath_simrank[] = {
		basePath_out+"/output_u_u/SimRank/blog",
		basePath_out+"/output_u_u/SimRank/moreno_crime_crime",
		basePath_out+"/output_u_u/SimRank/arxiv_author_pub",
		basePath_out+"/output_u_u/SimRank/power_biGraph_10000_5",
		basePath_out+"/output_u_u/SimRank/biGraph_10k_5",
		basePath_out+"/output_u_u/SimRank/0_333_5038",
		basePath_out+"/output_u_u/SimRank/107_1034_53498",
		basePath_out+"/output_u_u/SimRank/Power_law_1000_5000",
		basePath_out+"/output_u_u/SimRank/Power_law_1000_10000",
		basePath_out+"/output_u_u/SimRank/Power_law_1000_15000",
		basePath_out+"/output_u_u/SimRank/Power_law_1000_20000",
		basePath_out+"/output_u_u/SimRank/1684_786_28048",
		basePath_out+"/output_u_u/SimRank/as19971108_3015_10695",
		basePath_out+"/output_u_u/SimRank/as19971109_3011_10687",
		basePath_out+"/output_u_u/SimRank/ca-GrQc_5242_28980",
		basePath_out+"/output_u_u/SimRank/as19971110_3024_10773",
		basePath_out+"/output_u_u/SimRank/oregon2_010331_6000_17033",
		basePath_out+"/output_u_u/SimRank/oregon2_010407_6000_16852",
		basePath_out+"/output_u_u/SimRank/ca-HepPh_6000_195023"};
	
	public static  String out_u_u_graphPath_topSimSingle[] = {
		basePath_out+"/output_u_u/topSimSingle/moreno_crime_crime",
		basePath_out+"/output_u_u/topSimSingle/arxiv_author_pub",
		basePath_out+"/output_u_u/topSimSingle/power_biGraph_10000_5",
		basePath_out+"/output_u_u/topSimSingle/biGraph_10k_5",
		basePath_out+"/output_u_u/topSimSingle/0_333_5038",
		basePath_out+"/output_u_u/topSimSingle/107_1034_53498",
		basePath_out+"/output_u_u/topSimSingle/Power_law_1000_5000",
		basePath_out+"/output_u_u/topSimSingle/Power_law_1000_10000",
		basePath_out+"/output_u_u/topSimSingle/Power_law_1000_15000",
		basePath_out+"/output_u_u/topSimSingle/Power_law_1000_20000",
		basePath_out+"/output_u_u/topSimSingle/1684_786_28048",
		basePath_out+"/output_u_u/topSimSingle/as19971108_3015_10695",
		basePath_out+"/output_u_u/topSimSingle/as19971109_3011_10687",
		basePath_out+"/output_u_u/topSimSingle/ca-GrQc_5242_28980",
		basePath_out+"/output_u_u/topSimSingle/as19971110_3024_10773",
		basePath_out+"/output_u_u/topSimSingle/oregon2_010331_6000_17033",
		basePath_out+"/output_u_u/topSimSingle/oregon2_010407_6000_16852",
		basePath_out+"/output_u_u/topSimSingle/ca-HepPh_6000_195023"};
	
	public static  String out_u_u_graphPath_single[] = {
		basePath_out+"/output_u_u/Single/moreno_crime_crime",
		basePath_out+"/output_u_u/Single/arxiv_author_pub",
		basePath_out+"/output_u_u/Single/power_biGraph_10000_5",
		basePath_out+"/output_u_u/Single/biGraph_10k_5",
		basePath_out+"/output_u_u/Single/0_333_5038",
		basePath_out+"/output_u_u/Single/107_1034_53498",
		basePath_out+"/output_u_u/Single/Power_law_1000_5000",
		basePath_out+"/output_u_u/Single/Power_law_1000_10000",
		basePath_out+"/output_u_u/Single/Power_law_1000_15000",
		basePath_out+"/output_u_u/Single/Power_law_1000_20000",
		basePath_out+"/output_u_u/Single/1684_786_28048",
		basePath_out+"/output_u_u/Single/as19971108_3015_10695",
		basePath_out+"/output_u_u/Single/as19971109_3011_10687",
		basePath_out+"/output_u_u/Single/GrQc_5242_28980",
		basePath_out+"/output_u_u/Single/as19971110_3024_10773",
		basePath_out+"/output_u_u/Single/oregon2_010331_6000_17033",
		basePath_out+"/output_u_u/Single/oregon2_010407_6000_16852",
		basePath_out+"/output_u_u/Single/HepPh_6000_195023"};
	
	
	public static  String out_u_u_graphPath_double[] = {basePath_out+"/output_u_u/Double/0_333_5038",
		basePath_out+"/output_u_u/Double/107_1034_53498",
		basePath_out+"/output_u_u/Double/as20000102_6474_13895",
		basePath_out+"/output_u_u/Double/Power_law_1000_5000",
		basePath_out+"/output_u_u/Double/Power_law_1000_10000",
		basePath_out+"/output_u_u/Double/Power_law_1000_15000",
		basePath_out+"/output_u_u/Double/Power_law_1000_20000"};
	public static  String out_u_u_graphPath_topSimDouble[] = {basePath_out+"/output_u_u/topSimDouble/0_333_5038",
		basePath_out+"/output_u_u/topSimDouble/107_1034_53498",
		basePath_out+"/output_u_u/topSimDouble/as20000102_6474_13895",
		basePath_out+"/output_u_u/topSimDouble/Power_law_1000_5000",
		basePath_out+"/output_u_u/topSimDouble/Power_law_1000_10000",
		basePath_out+"/output_u_u/topSimDouble/Power_law_1000_15000",
		basePath_out+"/output_u_u/topSimDouble/Power_law_1000_20000"};
	
	
	public static  String out_u_u_graphPath_topSimDev[] = {basePath_out+"/output_u_u/topSimDev/0_333_5038",
		basePath_out+"/output_u_u/topSimDev/107_1034_53498",
		basePath_out+"/output_u_u/topSimDev/Power_law_1000_5000",
		basePath_out+"/output_u_u/topSimDev/Power_law_1000_10000",
		basePath_out+"/output_u_u/topSimDev/Power_law_1000_15000",
		basePath_out+"/output_u_u/topSimDev/Power_law_1000_20000",
		basePath_out+"/output_u_u/topSimDev/1684_786_28048",
		basePath_out+"/output_u_u/topSimDev/as19971108_3015_10695",
		basePath_out+"/output_u_u/topSimDev/as19971109_3011_10687",
		basePath_out+"/output_u_u/topSimDev/ca-GrQc_5242_28980",
		basePath_out+"/output_u_u/topSimDev/as19971110_3024_10773",
		basePath_out+"/output_u_u/topSimDev/oregon2_010331_6000_17033",
		basePath_out+"/output_u_u/topSimDev/oregon2_010407_6000_16852",
		basePath_out+"/output_u_u/topSimDev/ca-HepPh_6000_195023"};
	
	public static String out_u_u_graphPath_producePaths[] = {basePath_out+"/output_u_u/paths/0_333_5038",
		basePath_out+"/output_u_u/paths/107_1034_53498",
		basePath_out+"/output_u_u/paths/Power_law_1000_5000",
		basePath_out+"/output_u_u/paths/Power_law_1000_10000",
		basePath_out+"/output_u_u/paths/Power_law_1000_15000",
		basePath_out+"/output_u_u/paths/Power_law_1000_20000",
		basePath_out+"/output_u_u/paths/1684_786_28048",
		basePath_out+"/output_u_u/paths/as19971108_3015_10695",
		basePath_out+"/output_u_u/paths/as19971109_3011_10687",
		basePath_out+"/output_u_u/paths/ca-GrQc_5242_28980",
		basePath_out+"/output_u_u/paths/as19971110_3024_10773",
		basePath_out+"/output_u_u/paths/oregon2_010331_6000_17033",
		basePath_out+"/output_u_u/paths/oregon2_010407_6000_16852",
		basePath_out+"/output_u_u/paths/ca-HepPh_6000_195023"};
	

	
	public static void main(String[] args) throws IOException {

	
	}
	
}
