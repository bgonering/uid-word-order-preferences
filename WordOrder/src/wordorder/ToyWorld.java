package wordorder;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.math3.stat.inference.TTest;

public class ToyWorld {

	public static void main(String[] args) throws IOException {
	//	TTest t = new TTest();
		ArrayList<Event> events = genEvents();
//		RandomCollection<Event> world = genWorld(events);
		
		BigDecimal etaNought = baseEntropy(events);
		System.out.println("eta0 = " + etaNought.doubleValue());
		Stats ideal = new Stats();
		SVOTest svoTest = new SVOTest();
		SOVTest sovTest = new SOVTest();
		VSOTest vsoTest = new VSOTest();
		VOSTest vosTest = new VOSTest();
		OSVTest osvTest = new OSVTest();
		OVSTest ovsTest = new OVSTest();
		
		HashMap<String, HashMap<String, Word>> lexicons = genLexicons();
				
//		for (int i = 0; i <= 30000/*000000*/; i++) {
		for(int i = 0; i < 40; i++) {
//			Event ev = world.next();
			Event ev = events.get(i);
			
			ArrayList<Utterance> utt = new ArrayList<>();
			ArrayList<Utterance> nomUtt = new ArrayList<>();
			ArrayList<Utterance> accUtt = new ArrayList<>();
			ArrayList<Utterance> nomAccUtt = new ArrayList<>();
			ArrayList<Utterance> ergUtt = new ArrayList<>();
			ArrayList<Utterance> absUtt = new ArrayList<>();
			ArrayList<Utterance> ergAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123Utt = new ArrayList<>();
//			ArrayList<Utterance> sAgrWeUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123Utt = new ArrayList<>();
//			ArrayList<Utterance> oAgrWeUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123Utt = new ArrayList<>();
//			ArrayList<Utterance> soAgrWeUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrSPUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrSPUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrSPUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SPUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SPUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SPUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_ErgAbsUtt = new ArrayList<>();
			
//			ArrayList<Utterance> sAgrSDPUtt = new ArrayList<>();
//			ArrayList<Utterance> oAgrSDPUtt = new ArrayList<>();
//			ArrayList<Utterance> soAgrSDPUtt = new ArrayList<>();
//			
//			ArrayList<Utterance> sAgrSDPPUtt = new ArrayList<>();
//			ArrayList<Utterance> oAgrSDPPUtt = new ArrayList<>();
//			ArrayList<Utterance> soAgrSDPPUtt = new ArrayList<>();
//			utt.add(new Utterance(ev, j));
//			ArrayList<Utterance> sAgrSCUtt = new ArrayList<>();
//			ArrayList<Utterance> oAgrSCUtt = new ArrayList<>();
//			ArrayList<Utterance> soAgrSCUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrMFUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMF_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMF_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMF_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMF_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMF_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMF_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrMFNUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMFN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMFN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMFN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMFN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMFN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMFN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrCNUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrCN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrCN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrCN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrCN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrCN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrCN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrAIUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrHNUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrHAIUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrHAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgrMNMUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMNM_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMNM_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMNM_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMNM_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMNM_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgrMNM_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgrMFUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMF_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMF_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMF_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMF_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMF_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMF_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgrMFNUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMFN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMFN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMFN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMFN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMFN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMFN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgrCNUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrCN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrCN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrCN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrCN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrCN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrCN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgrAIUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgrHNUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgrHAIUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrHAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgrMNMUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMNM_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMNM_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMNM_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMNM_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMNM_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgrMNM_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgrMFUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMF_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMF_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMF_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMF_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMF_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMF_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgrMFNUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMFN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMFN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMFN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMFN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMFN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMFN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgrCNUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrCN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrCN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrCN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrCN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrCN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrCN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgrAIUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgrHNUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgrHAIUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrHAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgrMNMUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMNM_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMNM_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMNM_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMNM_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMNM_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgrMNM_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SP_MFUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MF_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MF_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MF_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MF_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MF_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MF_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SP_MFNUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MFN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MFN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MFN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MFN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MFN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MFN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SP_CNUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_CN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_CN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_CN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_CN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_CN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_CN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SP_AIUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_AI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SP_HNUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SP_HAIUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_HAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> sAgr123_SP_MNMUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MNM_NomUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MNM_AccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MNM_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MNM_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MNM_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> sAgr123_SP_MNM_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SP_MFUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MF_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MF_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MF_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MF_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MF_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MF_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SP_MFNUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MFN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MFN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MFN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MFN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MFN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MFN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SP_CNUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_CN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_CN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_CN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_CN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_CN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_CN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SP_AIUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_AI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SP_HNUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SP_HAIUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_HAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> oAgr123_SP_MNMUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MNM_NomUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MNM_AccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MNM_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MNM_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MNM_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> oAgr123_SP_MNM_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SP_MFUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MF_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MF_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MF_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MF_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MF_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MF_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SP_MFNUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MFN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MFN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MFN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MFN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MFN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MFN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SP_CNUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_CN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_CN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_CN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_CN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_CN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_CN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SP_AIUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_AI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SP_HNUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HN_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HN_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HN_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HN_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HN_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HN_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SP_HAIUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HAI_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HAI_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HAI_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HAI_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HAI_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_HAI_ErgAbsUtt = new ArrayList<>();
			
			ArrayList<Utterance> soAgr123_SP_MNMUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MNM_NomUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MNM_AccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MNM_NomAccUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MNM_ErgUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MNM_AbsUtt = new ArrayList<>();
			ArrayList<Utterance> soAgr123_SP_MNM_ErgAbsUtt = new ArrayList<>();
						
			ArrayList<Word> protoUttS_123 = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123 = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123 = new ArrayList<Word>();
			
			protoUttS_123.add(lexicons.get("s-123").get(ev.person.toString()));
			protoUttO_123.add(lexicons.get("o-123").get(ev.person.toString()));
			protoUttSO_123.add(lexicons.get("so-123").get(ev.person.toString()));
			
			protoUttS_123.add(lexicons.get("s-123").get(ev.action.toString()));
			protoUttO_123.add(lexicons.get("o-123").get(ev.action.toString()));
			protoUttSO_123.add(lexicons.get("so-123").get(ev.action.toString()));
			
			protoUttS_123.add(lexicons.get("s-123").get(ev.obj.toString()));
			protoUttO_123.add(lexicons.get("o-123").get(ev.obj.toString()));
			protoUttSO_123.add(lexicons.get("so-123").get(ev.obj.toString()));
		
			ArrayList<Word> protoUttS_SP = new ArrayList<Word>();
			ArrayList<Word> protoUttO_SP = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_SP = new ArrayList<Word>();

			protoUttS_SP.add(lexicons.get("s-sp").get(ev.person.toString()));
			protoUttO_SP.add(lexicons.get("o-sp").get(ev.person.toString()));
			protoUttSO_SP.add(lexicons.get("so-sp").get(ev.person.toString()));

			protoUttS_SP.add(lexicons.get("s-sp").get(ev.action.toString()));
			protoUttO_SP.add(lexicons.get("o-sp").get(ev.action.toString()));
			protoUttSO_SP.add(lexicons.get("so-sp").get(ev.action.toString()));

			protoUttS_SP.add(lexicons.get("s-sp").get(ev.obj.toString()));
			protoUttO_SP.add(lexicons.get("o-sp").get(ev.obj.toString()));
			protoUttSO_SP.add(lexicons.get("so-sp").get(ev.obj.toString()));

			ArrayList<Word> protoUttS_We = new ArrayList<Word>();
			ArrayList<Word> protoUttO_We = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_We = new ArrayList<Word>();

			protoUttS_We.add(lexicons.get("s-we").get(ev.person.toString()));
			protoUttO_We.add(lexicons.get("o-we").get(ev.person.toString()));
			protoUttSO_We.add(lexicons.get("so-we").get(ev.person.toString()));

			protoUttS_We.add(lexicons.get("s-we").get(ev.action.toString()));
			protoUttO_We.add(lexicons.get("o-we").get(ev.action.toString()));
			protoUttSO_We.add(lexicons.get("so-we").get(ev.action.toString()));

			protoUttS_We.add(lexicons.get("s-we").get(ev.obj.toString()));
			protoUttO_We.add(lexicons.get("o-we").get(ev.obj.toString()));
			protoUttSO_We.add(lexicons.get("so-we").get(ev.obj.toString()));
			
			ArrayList<Word> protoUttS_123SP = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SP = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SP = new ArrayList<Word>();

			protoUttS_123SP.add(lexicons.get("s-123+sp").get(ev.person.toString()));
			protoUttO_123SP.add(lexicons.get("o-123+sp").get(ev.person.toString()));
			protoUttSO_123SP.add(lexicons.get("so-123+sp").get(ev.person.toString()));

			protoUttS_123SP.add(lexicons.get("s-123+sp").get(ev.action.toString()));
			protoUttO_123SP.add(lexicons.get("o-123+sp").get(ev.action.toString()));
			protoUttSO_123SP.add(lexicons.get("so-123+sp").get(ev.action.toString()));

			protoUttS_123SP.add(lexicons.get("s-123+sp").get(ev.obj.toString()));
			protoUttO_123SP.add(lexicons.get("o-123+sp").get(ev.obj.toString()));
			protoUttSO_123SP.add(lexicons.get("so-123+sp").get(ev.obj.toString()));
			
			ArrayList<Word> protoUttS_MF = new ArrayList<Word>();
			ArrayList<Word> protoUttO_MF = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_MF = new ArrayList<Word>();
			
			protoUttS_MF.add(lexicons.get("s-mf").get(ev.person.toString()));
			protoUttO_MF.add(lexicons.get("o-mf").get(ev.person.toString()));
			protoUttSO_MF.add(lexicons.get("so-mf").get(ev.person.toString()));
			
			protoUttS_MF.add(lexicons.get("s-mf").get(ev.action.toString()));
			protoUttO_MF.add(lexicons.get("o-mf").get(ev.action.toString()));
			protoUttSO_MF.add(lexicons.get("so-mf").get(ev.action.toString()));
			
			protoUttS_MF.add(lexicons.get("s-mf").get(ev.obj.toString()));
			protoUttO_MF.add(lexicons.get("o-mf").get(ev.obj.toString()));
			protoUttSO_MF.add(lexicons.get("so-mf").get(ev.obj.toString()));

			ArrayList<Word> protoUttS_123SPMF = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SPMF = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SPMF = new ArrayList<Word>();

			protoUttS_123SPMF.add(lexicons.get("s-123+sp+mf").get(ev.person.toString()));
			protoUttO_123SPMF.add(lexicons.get("o-123+sp+mf").get(ev.person.toString()));
			protoUttSO_123SPMF.add(lexicons.get("so-123+sp+mf").get(ev.person.toString()));

			protoUttS_123SPMF.add(lexicons.get("s-123+sp+mf").get(ev.action.toString()));
			protoUttO_123SPMF.add(lexicons.get("o-123+sp+mf").get(ev.action.toString()));
			protoUttSO_123SPMF.add(lexicons.get("so-123+sp+mf").get(ev.action.toString()));

			protoUttS_123SPMF.add(lexicons.get("s-123+sp+mf").get(ev.obj.toString()));
			protoUttO_123SPMF.add(lexicons.get("o-123+sp+mf").get(ev.obj.toString()));
			protoUttSO_123SPMF.add(lexicons.get("so-123+sp+mf").get(ev.obj.toString()));
			
			ArrayList<Word> protoUttS_MFN = new ArrayList<Word>();
			ArrayList<Word> protoUttO_MFN = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_MFN = new ArrayList<Word>();
			
			protoUttS_MFN.add(lexicons.get("s-mfn").get(ev.person.toString()));
			protoUttO_MFN.add(lexicons.get("o-mfn").get(ev.person.toString()));
			protoUttSO_MFN.add(lexicons.get("so-mfn").get(ev.person.toString()));
			
			protoUttS_MFN.add(lexicons.get("s-mfn").get(ev.action.toString()));
			protoUttO_MFN.add(lexicons.get("o-mfn").get(ev.action.toString()));
			protoUttSO_MFN.add(lexicons.get("so-mfn").get(ev.action.toString()));
			
			protoUttS_MFN.add(lexicons.get("s-mfn").get(ev.obj.toString()));
			protoUttO_MFN.add(lexicons.get("o-mfn").get(ev.obj.toString()));
			protoUttSO_MFN.add(lexicons.get("so-mfn").get(ev.obj.toString()));

			ArrayList<Word> protoUttS_123SPMFN = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SPMFN = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SPMFN = new ArrayList<Word>();

			protoUttS_123SPMFN.add(lexicons.get("s-123+sp+mfn").get(ev.person.toString()));
			protoUttO_123SPMFN.add(lexicons.get("o-123+sp+mfn").get(ev.person.toString()));
			protoUttSO_123SPMFN.add(lexicons.get("so-123+sp+mfn").get(ev.person.toString()));

			protoUttS_123SPMFN.add(lexicons.get("s-123+sp+mfn").get(ev.action.toString()));
			protoUttO_123SPMFN.add(lexicons.get("o-123+sp+mfn").get(ev.action.toString()));
			protoUttSO_123SPMFN.add(lexicons.get("so-123+sp+mfn").get(ev.action.toString()));

			protoUttS_123SPMFN.add(lexicons.get("s-123+sp+mfn").get(ev.obj.toString()));
			protoUttO_123SPMFN.add(lexicons.get("o-123+sp+mfn").get(ev.obj.toString()));
			protoUttSO_123SPMFN.add(lexicons.get("so-123+sp+mfn").get(ev.obj.toString()));
						
			ArrayList<Word> protoUttS_CN = new ArrayList<Word>();
			ArrayList<Word> protoUttO_CN = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_CN = new ArrayList<Word>();
			
			protoUttS_CN.add(lexicons.get("s-cn").get(ev.person.toString()));
			protoUttO_CN.add(lexicons.get("o-cn").get(ev.person.toString()));
			protoUttSO_CN.add(lexicons.get("so-cn").get(ev.person.toString()));
			
			protoUttS_CN.add(lexicons.get("s-cn").get(ev.action.toString()));
			protoUttO_CN.add(lexicons.get("o-cn").get(ev.action.toString()));
			protoUttSO_CN.add(lexicons.get("so-cn").get(ev.action.toString()));
			
			protoUttS_CN.add(lexicons.get("s-cn").get(ev.obj.toString()));
			protoUttO_CN.add(lexicons.get("o-cn").get(ev.obj.toString()));
			protoUttSO_CN.add(lexicons.get("so-cn").get(ev.obj.toString()));

			ArrayList<Word> protoUttS_123SPCN = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SPCN = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SPCN = new ArrayList<Word>();

			protoUttS_123SPCN.add(lexicons.get("s-123+sp+cn").get(ev.person.toString()));
			protoUttO_123SPCN.add(lexicons.get("o-123+sp+cn").get(ev.person.toString()));
			protoUttSO_123SPCN.add(lexicons.get("so-123+sp+cn").get(ev.person.toString()));

			protoUttS_123SPCN.add(lexicons.get("s-123+sp+cn").get(ev.action.toString()));
			protoUttO_123SPCN.add(lexicons.get("o-123+sp+cn").get(ev.action.toString()));
			protoUttSO_123SPCN.add(lexicons.get("so-123+sp+cn").get(ev.action.toString()));

			protoUttS_123SPCN.add(lexicons.get("s-123+sp+cn").get(ev.obj.toString()));
			protoUttO_123SPCN.add(lexicons.get("o-123+sp+cn").get(ev.obj.toString()));
			protoUttSO_123SPCN.add(lexicons.get("so-123+sp+cn").get(ev.obj.toString()));		
						
			ArrayList<Word> protoUttS_AI = new ArrayList<Word>();
			ArrayList<Word> protoUttO_AI = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_AI = new ArrayList<Word>();
			
			protoUttS_AI.add(lexicons.get("s-ai").get(ev.person.toString()));
			protoUttO_AI.add(lexicons.get("o-ai").get(ev.person.toString()));
			protoUttSO_AI.add(lexicons.get("so-ai").get(ev.person.toString()));
			
			protoUttS_AI.add(lexicons.get("s-ai").get(ev.action.toString()));
			protoUttO_AI.add(lexicons.get("o-ai").get(ev.action.toString()));
			protoUttSO_AI.add(lexicons.get("so-ai").get(ev.action.toString()));
			
			protoUttS_AI.add(lexicons.get("s-ai").get(ev.obj.toString()));
			protoUttO_AI.add(lexicons.get("o-ai").get(ev.obj.toString()));
			protoUttSO_AI.add(lexicons.get("so-ai").get(ev.obj.toString()));

			ArrayList<Word> protoUttS_123SPAI = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SPAI = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SPAI = new ArrayList<Word>();

			protoUttS_123SPAI.add(lexicons.get("s-123+sp+ai").get(ev.person.toString()));
			protoUttO_123SPAI.add(lexicons.get("o-123+sp+ai").get(ev.person.toString()));
			protoUttSO_123SPAI.add(lexicons.get("so-123+sp+ai").get(ev.person.toString()));

			protoUttS_123SPAI.add(lexicons.get("s-123+sp+ai").get(ev.action.toString()));
			protoUttO_123SPAI.add(lexicons.get("o-123+sp+ai").get(ev.action.toString()));
			protoUttSO_123SPAI.add(lexicons.get("so-123+sp+ai").get(ev.action.toString()));

			protoUttS_123SPAI.add(lexicons.get("s-123+sp+ai").get(ev.obj.toString()));
			protoUttO_123SPAI.add(lexicons.get("o-123+sp+ai").get(ev.obj.toString()));
			protoUttSO_123SPAI.add(lexicons.get("so-123+sp+ai").get(ev.obj.toString()));
			
			ArrayList<Word> protoUttS_HN = new ArrayList<Word>();
			ArrayList<Word> protoUttO_HN = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_HN = new ArrayList<Word>();
			
			protoUttS_HN.add(lexicons.get("s-hn").get(ev.person.toString()));
			protoUttO_HN.add(lexicons.get("o-hn").get(ev.person.toString()));
			protoUttSO_HN.add(lexicons.get("so-hn").get(ev.person.toString()));
			
			protoUttS_HN.add(lexicons.get("s-hn").get(ev.action.toString()));
			protoUttO_HN.add(lexicons.get("o-hn").get(ev.action.toString()));
			protoUttSO_HN.add(lexicons.get("so-hn").get(ev.action.toString()));
			
			protoUttS_HN.add(lexicons.get("s-hn").get(ev.obj.toString()));
			protoUttO_HN.add(lexicons.get("o-hn").get(ev.obj.toString()));
			protoUttSO_HN.add(lexicons.get("so-hn").get(ev.obj.toString()));
			
			ArrayList<Word> protoUttS_123SPHN = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SPHN = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SPHN = new ArrayList<Word>();

			protoUttS_123SPHN.add(lexicons.get("s-123+sp+hn").get(ev.person.toString()));
			protoUttO_123SPHN.add(lexicons.get("o-123+sp+hn").get(ev.person.toString()));
			protoUttSO_123SPHN.add(lexicons.get("so-123+sp+hn").get(ev.person.toString()));

			protoUttS_123SPHN.add(lexicons.get("s-123+sp+hn").get(ev.action.toString()));
			protoUttO_123SPHN.add(lexicons.get("o-123+sp+hn").get(ev.action.toString()));
			protoUttSO_123SPHN.add(lexicons.get("so-123+sp+hn").get(ev.action.toString()));

			protoUttS_123SPHN.add(lexicons.get("s-123+sp+hn").get(ev.obj.toString()));
			protoUttO_123SPHN.add(lexicons.get("o-123+sp+hn").get(ev.obj.toString()));
			protoUttSO_123SPHN.add(lexicons.get("so-123+sp+hn").get(ev.obj.toString()));
			
			ArrayList<Word> protoUttS_HAI = new ArrayList<Word>();
			ArrayList<Word> protoUttO_HAI = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_HAI = new ArrayList<Word>();
			
			protoUttS_HAI.add(lexicons.get("s-hai").get(ev.person.toString()));
			protoUttO_HAI.add(lexicons.get("o-hai").get(ev.person.toString()));
			protoUttSO_HAI.add(lexicons.get("so-hai").get(ev.person.toString()));
			
			protoUttS_HAI.add(lexicons.get("s-hai").get(ev.action.toString()));
			protoUttO_HAI.add(lexicons.get("o-hai").get(ev.action.toString()));
			protoUttSO_HAI.add(lexicons.get("so-hai").get(ev.action.toString()));
			
			protoUttS_HAI.add(lexicons.get("s-hai").get(ev.obj.toString()));
			protoUttO_HAI.add(lexicons.get("o-hai").get(ev.obj.toString()));
			protoUttSO_HAI.add(lexicons.get("so-hai").get(ev.obj.toString()));

			ArrayList<Word> protoUttS_123SPHAI = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SPHAI = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SPHAI = new ArrayList<Word>();

			protoUttS_123SPHAI.add(lexicons.get("s-123+sp+hai").get(ev.person.toString()));
			protoUttO_123SPHAI.add(lexicons.get("o-123+sp+hai").get(ev.person.toString()));
			protoUttSO_123SPHAI.add(lexicons.get("so-123+sp+hai").get(ev.person.toString()));

			protoUttS_123SPHAI.add(lexicons.get("s-123+sp+hai").get(ev.action.toString()));
			protoUttO_123SPHAI.add(lexicons.get("o-123+sp+hai").get(ev.action.toString()));
			protoUttSO_123SPHAI.add(lexicons.get("so-123+sp+hai").get(ev.action.toString()));

			protoUttS_123SPHAI.add(lexicons.get("s-123+sp+hai").get(ev.obj.toString()));
			protoUttO_123SPHAI.add(lexicons.get("o-123+sp+hai").get(ev.obj.toString()));
			protoUttSO_123SPHAI.add(lexicons.get("so-123+sp+hai").get(ev.obj.toString()));
			
			ArrayList<Word> protoUttS_MNM = new ArrayList<Word>();
			ArrayList<Word> protoUttO_MNM = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_MNM = new ArrayList<Word>();
			
			protoUttS_MNM.add(lexicons.get("s-mnm").get(ev.person.toString()));
			protoUttO_MNM.add(lexicons.get("o-mnm").get(ev.person.toString()));
			protoUttSO_MNM.add(lexicons.get("so-mnm").get(ev.person.toString()));
			
			protoUttS_MNM.add(lexicons.get("s-mnm").get(ev.action.toString()));
			protoUttO_MNM.add(lexicons.get("o-mnm").get(ev.action.toString()));
			protoUttSO_MNM.add(lexicons.get("so-mnm").get(ev.action.toString()));
			
			protoUttS_MNM.add(lexicons.get("s-mnm").get(ev.obj.toString()));
			protoUttO_MNM.add(lexicons.get("o-mnm").get(ev.obj.toString()));
			protoUttSO_MNM.add(lexicons.get("so-mnm").get(ev.obj.toString()));

			ArrayList<Word> protoUttS_123SPMNM = new ArrayList<Word>();
			ArrayList<Word> protoUttO_123SPMNM = new ArrayList<Word>();
			ArrayList<Word> protoUttSO_123SPMNM = new ArrayList<Word>();

			protoUttS_123SPMNM.add(lexicons.get("s-123+sp+mnm").get(ev.person.toString()));
			protoUttO_123SPMNM.add(lexicons.get("o-123+sp+mnm").get(ev.person.toString()));
			protoUttSO_123SPMNM.add(lexicons.get("so-123+sp+mnm").get(ev.person.toString()));

			protoUttS_123SPMNM.add(lexicons.get("s-123+sp+mnm").get(ev.action.toString()));
			protoUttO_123SPMNM.add(lexicons.get("o-123+sp+mnm").get(ev.action.toString()));
			protoUttSO_123SPMNM.add(lexicons.get("so-123+sp+mnm").get(ev.action.toString()));

			protoUttS_123SPMNM.add(lexicons.get("s-123+sp+mnm").get(ev.obj.toString()));
			protoUttO_123SPMNM.add(lexicons.get("o-123+sp+mnm").get(ev.obj.toString()));
			protoUttSO_123SPMNM.add(lexicons.get("so-123+sp+mnm").get(ev.obj.toString()));

			for(int j = 0; j < 6; j++) {
				utt.add(new Utterance(ev, j));
				nomUtt.add(new Utterance(ev,j, 1));
				accUtt.add(new Utterance(ev, j, 2));
				nomAccUtt.add(new Utterance(ev, j, 3));
				ergUtt.add(new Utterance(ev, j, 4));
				absUtt.add(new Utterance(ev, j, 5));
				ergAbsUtt.add(new Utterance(ev, j, 6));
				
				sAgr123Utt.add(new Utterance(protoUttS_123, j, 0, 2));
//				sAgrWeUtt.add(new Utterance(protoUttS_We, j, 0, 2));
				
				oAgr123Utt.add(new Utterance(protoUttO_123, j, 0, 4));
//				oAgrMFUtt.add(new Utterance(protoUttO_We, j, 0, 4));
				
				soAgr123Utt.add(new Utterance(protoUttSO_123, j, 0, 6));
//				soAgrMFUtt.add(new Utterance(protoUttSO_We, j, 0, 6));
				
				sAgrSPUtt.add(new Utterance(protoUttS_SP, j, 0, 7));
				oAgrSPUtt.add(new Utterance(protoUttO_SP, j, 0, 8));
				soAgrSPUtt.add(new Utterance(protoUttSO_SP, j, 0, 9));
				
				sAgr123_SPUtt.add(new Utterance(protoUttS_123SP, j, 0, 10));
				sAgr123_SP_NomUtt.add(new Utterance(protoUttS_123SP, j, 1, 10));
				sAgr123_SP_AccUtt.add(new Utterance(protoUttS_123SP, j, 2, 10));
				sAgr123_SP_NomAccUtt.add(new Utterance(protoUttS_123SP, j, 3, 10));
				sAgr123_SP_ErgUtt.add(new Utterance(protoUttS_123SP, j, 4, 10));
				sAgr123_SP_AbsUtt.add(new Utterance(protoUttS_123SP, j, 5, 10));
				sAgr123_SP_ErgAbsUtt.add(new Utterance(protoUttS_123SP, j, 6, 10));
				
				oAgr123_SPUtt.add(new Utterance(protoUttO_123SP, j, 0, 11));
				oAgr123_SP_NomUtt.add(new Utterance(protoUttO_123SP, j, 1, 11));
				oAgr123_SP_AccUtt.add(new Utterance(protoUttO_123SP, j, 2, 11));
				oAgr123_SP_NomAccUtt.add(new Utterance(protoUttO_123SP, j, 3, 11));
				oAgr123_SP_ErgUtt.add(new Utterance(protoUttO_123SP, j, 4, 11));
				oAgr123_SP_AbsUtt.add(new Utterance(protoUttO_123SP, j, 5, 11));
				oAgr123_SP_ErgAbsUtt.add(new Utterance(protoUttO_123SP, j, 6, 11));
				
				soAgr123_SPUtt.add(new Utterance(protoUttSO_123SP, j, 0, 12));
				soAgr123_SP_NomUtt.add(new Utterance(protoUttSO_123SP, j, 1, 12));
				soAgr123_SP_AccUtt.add(new Utterance(protoUttSO_123SP, j, 2, 12));
				soAgr123_SP_NomAccUtt.add(new Utterance(protoUttSO_123SP, j, 3, 12));
				soAgr123_SP_ErgUtt.add(new Utterance(protoUttSO_123SP, j, 4, 12));
				soAgr123_SP_AbsUtt.add(new Utterance(protoUttSO_123SP, j, 5, 12));
				soAgr123_SP_ErgAbsUtt.add(new Utterance(protoUttSO_123SP, j, 6, 12));
				
				sAgrMFUtt.add(new Utterance(protoUttS_MF, j, 0, 1));
				sAgrMF_NomUtt.add(new Utterance(protoUttS_MF, j, 1, 1));
				sAgrMF_AccUtt.add(new Utterance(protoUttS_MF, j, 2, 1));
				sAgrMF_NomAccUtt.add(new Utterance(protoUttS_MF, j, 3, 1));
				sAgrMF_ErgUtt.add(new Utterance(protoUttS_MF, j, 4, 1));
				sAgrMF_AbsUtt.add(new Utterance(protoUttS_MF, j, 5, 1));
				sAgrMF_ErgAbsUtt.add(new Utterance(protoUttS_MF, j, 6, 1));
				
				sAgrMFNUtt.add(new Utterance(protoUttS_MFN, j, 0, 1));
				sAgrMFN_NomUtt.add(new Utterance(protoUttS_MFN, j, 1, 1));
				sAgrMFN_AccUtt.add(new Utterance(protoUttS_MFN, j, 2, 1));
				sAgrMFN_NomAccUtt.add(new Utterance(protoUttS_MFN, j, 3, 1));
				sAgrMFN_ErgUtt.add(new Utterance(protoUttS_MFN, j, 4, 1));
				sAgrMFN_AbsUtt.add(new Utterance(protoUttS_MFN, j, 5, 1));
				sAgrMFN_ErgAbsUtt.add(new Utterance(protoUttS_MFN, j, 6, 1));
				
				sAgrCNUtt.add(new Utterance(protoUttS_CN, j, 0, 1));
				sAgrCN_NomUtt.add(new Utterance(protoUttS_CN, j, 1, 1));
				sAgrCN_AccUtt.add(new Utterance(protoUttS_CN, j, 2, 1));
				sAgrCN_NomAccUtt.add(new Utterance(protoUttS_CN, j, 3, 1));
				sAgrCN_ErgUtt.add(new Utterance(protoUttS_CN, j, 4, 1));
				sAgrCN_AbsUtt.add(new Utterance(protoUttS_CN, j, 5, 1));
				sAgrCN_ErgAbsUtt.add(new Utterance(protoUttS_CN, j, 6, 1));
				
				sAgrAIUtt.add(new Utterance(protoUttS_AI, j, 0, 1));
				sAgrAI_NomUtt.add(new Utterance(protoUttS_AI, j, 1, 1));
				sAgrAI_AccUtt.add(new Utterance(protoUttS_AI, j, 2, 1));
				sAgrAI_NomAccUtt.add(new Utterance(protoUttS_AI, j, 3, 1));
				sAgrAI_ErgUtt.add(new Utterance(protoUttS_AI, j, 4, 1));
				sAgrAI_AbsUtt.add(new Utterance(protoUttS_AI, j, 5, 1));
				sAgrAI_ErgAbsUtt.add(new Utterance(protoUttS_AI, j, 6, 1));
				
				sAgrHNUtt.add(new Utterance(protoUttS_HN, j, 0, 1));
				sAgrHN_NomUtt.add(new Utterance(protoUttS_HN, j, 1, 1));
				sAgrHN_AccUtt.add(new Utterance(protoUttS_HN, j, 2, 1));
				sAgrHN_NomAccUtt.add(new Utterance(protoUttS_HN, j, 3, 1));
				sAgrHN_ErgUtt.add(new Utterance(protoUttS_HN, j, 4, 1));
				sAgrHN_AbsUtt.add(new Utterance(protoUttS_HN, j, 5, 1));
				sAgrHN_ErgAbsUtt.add(new Utterance(protoUttS_HN, j, 6, 1));
				
				sAgrHAIUtt.add(new Utterance(protoUttS_HAI, j, 0, 1));
				sAgrHAI_NomUtt.add(new Utterance(protoUttS_HAI, j, 1, 1));
				sAgrHAI_AccUtt.add(new Utterance(protoUttS_HAI, j, 2, 1));
				sAgrHAI_NomAccUtt.add(new Utterance(protoUttS_HAI, j, 3, 1));
				sAgrHAI_ErgUtt.add(new Utterance(protoUttS_HAI, j, 4, 1));
				sAgrHAI_AbsUtt.add(new Utterance(protoUttS_HAI, j, 5, 1));
				sAgrHAI_ErgAbsUtt.add(new Utterance(protoUttS_HAI, j, 6, 1));
				
				sAgrMNMUtt.add(new Utterance(protoUttS_MNM, j, 0, 1));
				sAgrMNM_NomUtt.add(new Utterance(protoUttS_MNM, j, 1, 1));
				sAgrMNM_AccUtt.add(new Utterance(protoUttS_MNM, j, 2, 1));
				sAgrMNM_NomAccUtt.add(new Utterance(protoUttS_MNM, j, 3, 1));
				sAgrMNM_ErgUtt.add(new Utterance(protoUttS_MNM, j, 4, 1));
				sAgrMNM_AbsUtt.add(new Utterance(protoUttS_MNM, j, 5, 1));
				sAgrMNM_ErgAbsUtt.add(new Utterance(protoUttS_MNM, j, 6, 1));
				
				oAgrMFUtt.add(new Utterance(protoUttO_MF, j, 0, 3));
				oAgrMF_NomUtt.add(new Utterance(protoUttO_MF, j, 1, 3));
				oAgrMF_AccUtt.add(new Utterance(protoUttO_MF, j, 2, 3));
				oAgrMF_NomAccUtt.add(new Utterance(protoUttO_MF, j, 3, 3));
				oAgrMF_ErgUtt.add(new Utterance(protoUttO_MF, j, 4, 3));
				oAgrMF_AbsUtt.add(new Utterance(protoUttO_MF, j, 5, 3));
				oAgrMF_ErgAbsUtt.add(new Utterance(protoUttO_MF, j, 6, 3));
				
				oAgrMFNUtt.add(new Utterance(protoUttO_MFN, j, 0, 3));
				oAgrMFN_NomUtt.add(new Utterance(protoUttO_MFN, j, 1, 3));
				oAgrMFN_AccUtt.add(new Utterance(protoUttO_MFN, j, 2, 3));
				oAgrMFN_NomAccUtt.add(new Utterance(protoUttO_MFN, j, 3, 3));
				oAgrMFN_ErgUtt.add(new Utterance(protoUttO_MFN, j, 4, 3));
				oAgrMFN_AbsUtt.add(new Utterance(protoUttO_MFN, j, 5, 3));
				oAgrMFN_ErgAbsUtt.add(new Utterance(protoUttO_MFN, j, 6, 3));
				
				oAgrCNUtt.add(new Utterance(protoUttO_CN, j, 0, 3));
				oAgrCN_NomUtt.add(new Utterance(protoUttO_CN, j, 1, 3));
				oAgrCN_AccUtt.add(new Utterance(protoUttO_CN, j, 2, 3));
				oAgrCN_NomAccUtt.add(new Utterance(protoUttO_CN, j, 3, 3));
				oAgrCN_ErgUtt.add(new Utterance(protoUttO_CN, j, 4, 3));
				oAgrCN_AbsUtt.add(new Utterance(protoUttO_CN, j, 5, 3));
				oAgrCN_ErgAbsUtt.add(new Utterance(protoUttO_CN, j, 6, 3));
				
				oAgrAIUtt.add(new Utterance(protoUttO_AI, j, 0, 3));
				oAgrAI_NomUtt.add(new Utterance(protoUttO_AI, j, 1, 3));
				oAgrAI_AccUtt.add(new Utterance(protoUttO_AI, j, 2, 3));
				oAgrAI_NomAccUtt.add(new Utterance(protoUttO_AI, j, 3, 3));
				oAgrAI_ErgUtt.add(new Utterance(protoUttO_AI, j, 4, 3));
				oAgrAI_AbsUtt.add(new Utterance(protoUttO_AI, j, 5, 3));
				oAgrAI_ErgAbsUtt.add(new Utterance(protoUttO_AI, j, 6, 3));
				
				oAgrHNUtt.add(new Utterance(protoUttO_HN, j, 0, 3));
				oAgrHN_NomUtt.add(new Utterance(protoUttO_HN, j, 1, 3));
				oAgrHN_AccUtt.add(new Utterance(protoUttO_HN, j, 2, 3));
				oAgrHN_NomAccUtt.add(new Utterance(protoUttO_HN, j, 3, 3));
				oAgrHN_ErgUtt.add(new Utterance(protoUttO_HN, j, 4, 3));
				oAgrHN_AbsUtt.add(new Utterance(protoUttO_HN, j, 5, 3));
				oAgrHN_ErgAbsUtt.add(new Utterance(protoUttO_HN, j, 6, 3));
				
				oAgrHAIUtt.add(new Utterance(protoUttO_HAI, j, 0, 3));
				oAgrHAI_NomUtt.add(new Utterance(protoUttO_HAI, j, 1, 3));
				oAgrHAI_AccUtt.add(new Utterance(protoUttO_HAI, j, 2, 3));
				oAgrHAI_NomAccUtt.add(new Utterance(protoUttO_HAI, j, 3, 3));
				oAgrHAI_ErgUtt.add(new Utterance(protoUttO_HAI, j, 4, 3));
				oAgrHAI_AbsUtt.add(new Utterance(protoUttO_HAI, j, 5, 3));
				oAgrHAI_ErgAbsUtt.add(new Utterance(protoUttO_HAI, j, 6, 3));
				
				oAgrMNMUtt.add(new Utterance(protoUttO_MNM, j, 0, 3));
				oAgrMNM_NomUtt.add(new Utterance(protoUttO_MNM, j, 1, 3));
				oAgrMNM_AccUtt.add(new Utterance(protoUttO_MNM, j, 2, 3));
				oAgrMNM_NomAccUtt.add(new Utterance(protoUttO_MNM, j, 3, 3));
				oAgrMNM_ErgUtt.add(new Utterance(protoUttO_MNM, j, 4, 3));
				oAgrMNM_AbsUtt.add(new Utterance(protoUttO_MNM, j, 5, 3));
				oAgrMNM_ErgAbsUtt.add(new Utterance(protoUttO_MNM, j, 6, 3));
				
				soAgrMFUtt.add(new Utterance(protoUttS_MF, j, 0, 5));
				soAgrMF_NomUtt.add(new Utterance(protoUttS_MF, j, 1, 5));
				soAgrMF_AccUtt.add(new Utterance(protoUttS_MF, j, 2, 5));
				soAgrMF_NomAccUtt.add(new Utterance(protoUttS_MF, j, 3, 5));
				soAgrMF_ErgUtt.add(new Utterance(protoUttS_MF, j, 4, 5));
				soAgrMF_AbsUtt.add(new Utterance(protoUttS_MF, j, 5, 5));
				soAgrMF_ErgAbsUtt.add(new Utterance(protoUttS_MF, j, 6, 5));
				
				soAgrMFNUtt.add(new Utterance(protoUttS_MFN, j, 0, 5));
				soAgrMFN_NomUtt.add(new Utterance(protoUttS_MFN, j, 1, 5));
				soAgrMFN_AccUtt.add(new Utterance(protoUttS_MFN, j, 2, 5));
				soAgrMFN_NomAccUtt.add(new Utterance(protoUttS_MFN, j, 3, 5));
				soAgrMFN_ErgUtt.add(new Utterance(protoUttS_MFN, j, 4, 5));
				soAgrMFN_AbsUtt.add(new Utterance(protoUttS_MFN, j, 5, 5));
				soAgrMFN_ErgAbsUtt.add(new Utterance(protoUttS_MFN, j, 6, 5));
				
				soAgrCNUtt.add(new Utterance(protoUttS_CN, j, 0, 5));
				soAgrCN_NomUtt.add(new Utterance(protoUttS_CN, j, 1, 5));
				soAgrCN_AccUtt.add(new Utterance(protoUttS_CN, j, 2, 5));
				soAgrCN_NomAccUtt.add(new Utterance(protoUttS_CN, j, 3, 5));
				soAgrCN_ErgUtt.add(new Utterance(protoUttS_CN, j, 4, 5));
				soAgrCN_AbsUtt.add(new Utterance(protoUttS_CN, j, 5, 5));
				soAgrCN_ErgAbsUtt.add(new Utterance(protoUttS_CN, j, 6, 5));
				
				soAgrAIUtt.add(new Utterance(protoUttS_AI, j, 0, 5));
				soAgrAI_NomUtt.add(new Utterance(protoUttS_AI, j, 1, 5));
				soAgrAI_AccUtt.add(new Utterance(protoUttS_AI, j, 2, 5));
				soAgrAI_NomAccUtt.add(new Utterance(protoUttS_AI, j, 3, 5));
				soAgrAI_ErgUtt.add(new Utterance(protoUttS_AI, j, 4, 5));
				soAgrAI_AbsUtt.add(new Utterance(protoUttS_AI, j, 5, 5));
				soAgrAI_ErgAbsUtt.add(new Utterance(protoUttS_AI, j, 6, 5));
				
				soAgrHNUtt.add(new Utterance(protoUttS_HN, j, 0, 5));
				soAgrHN_NomUtt.add(new Utterance(protoUttS_HN, j, 1, 5));
				soAgrHN_AccUtt.add(new Utterance(protoUttS_HN, j, 2, 5));
				soAgrHN_NomAccUtt.add(new Utterance(protoUttS_HN, j, 3, 5));
				soAgrHN_ErgUtt.add(new Utterance(protoUttS_HN, j, 4, 5));
				soAgrHN_AbsUtt.add(new Utterance(protoUttS_HN, j, 5, 5));
				soAgrHN_ErgAbsUtt.add(new Utterance(protoUttS_HN, j, 6, 5));
				
				soAgrHAIUtt.add(new Utterance(protoUttS_HAI, j, 0, 5));
				soAgrHAI_NomUtt.add(new Utterance(protoUttS_HAI, j, 1, 5));
				soAgrHAI_AccUtt.add(new Utterance(protoUttS_HAI, j, 2, 5));
				soAgrHAI_NomAccUtt.add(new Utterance(protoUttS_HAI, j, 3, 5));
				soAgrHAI_ErgUtt.add(new Utterance(protoUttS_HAI, j, 4, 5));
				soAgrHAI_AbsUtt.add(new Utterance(protoUttS_HAI, j, 5, 5));
				soAgrHAI_ErgAbsUtt.add(new Utterance(protoUttS_HAI, j, 6, 5));
				
				soAgrMNMUtt.add(new Utterance(protoUttS_MNM, j, 0, 5));
				soAgrMNM_NomUtt.add(new Utterance(protoUttS_MNM, j, 1, 5));
				soAgrMNM_AccUtt.add(new Utterance(protoUttS_MNM, j, 2, 5));
				soAgrMNM_NomAccUtt.add(new Utterance(protoUttS_MNM, j, 3, 5));
				soAgrMNM_ErgUtt.add(new Utterance(protoUttS_MNM, j, 4, 5));
				soAgrMNM_AbsUtt.add(new Utterance(protoUttS_MNM, j, 5, 5));
				soAgrMNM_ErgAbsUtt.add(new Utterance(protoUttS_MNM, j, 6, 5));
				
				sAgr123_SP_MFUtt.add(new Utterance(protoUttS_123SPMF, j, 0, 13));
				sAgr123_SP_MF_NomUtt.add(new Utterance(protoUttS_123SPMF, j, 1, 13));
				sAgr123_SP_MF_AccUtt.add(new Utterance(protoUttS_123SPMF, j, 2, 13));
				sAgr123_SP_MF_NomAccUtt.add(new Utterance(protoUttS_123SPMF, j, 3, 13));
				sAgr123_SP_MF_ErgUtt.add(new Utterance(protoUttS_123SPMF, j, 4, 13));
				sAgr123_SP_MF_AbsUtt.add(new Utterance(protoUttS_123SPMF, j, 5, 13));
				sAgr123_SP_MF_ErgAbsUtt.add(new Utterance(protoUttS_123SPMF, j, 6, 13));
				
				oAgr123_SP_MFUtt.add(new Utterance(protoUttO_123SPMF, j, 0, 14));
				oAgr123_SP_MF_NomUtt.add(new Utterance(protoUttO_123SPMF, j, 1, 14));
				oAgr123_SP_MF_AccUtt.add(new Utterance(protoUttO_123SPMF, j, 2, 14));
				oAgr123_SP_MF_NomAccUtt.add(new Utterance(protoUttO_123SPMF, j, 3, 14));
				oAgr123_SP_MF_ErgUtt.add(new Utterance(protoUttO_123SPMF, j, 4, 14));
				oAgr123_SP_MF_AbsUtt.add(new Utterance(protoUttO_123SPMF, j, 5, 14));
				oAgr123_SP_MF_ErgAbsUtt.add(new Utterance(protoUttO_123SPMF, j, 6, 14));
				
				soAgr123_SP_MFUtt.add(new Utterance(protoUttSO_123SPMF, j, 0, 15));
				soAgr123_SP_MF_NomUtt.add(new Utterance(protoUttSO_123SPMF, j, 1, 15));
				soAgr123_SP_MF_AccUtt.add(new Utterance(protoUttSO_123SPMF, j, 2, 15));
				soAgr123_SP_MF_NomAccUtt.add(new Utterance(protoUttSO_123SPMF, j, 3, 15));
				soAgr123_SP_MF_ErgUtt.add(new Utterance(protoUttSO_123SPMF, j, 4, 15));
				soAgr123_SP_MF_AbsUtt.add(new Utterance(protoUttSO_123SPMF, j, 5, 15));
				soAgr123_SP_MF_ErgAbsUtt.add(new Utterance(protoUttSO_123SPMF, j, 6, 15));
				
				sAgr123_SP_MFNUtt.add(new Utterance(protoUttS_123SPMFN, j, 0, 13));
				sAgr123_SP_MFN_NomUtt.add(new Utterance(protoUttS_123SPMFN, j, 1, 13));
				sAgr123_SP_MFN_AccUtt.add(new Utterance(protoUttS_123SPMFN, j, 2, 13));
				sAgr123_SP_MFN_NomAccUtt.add(new Utterance(protoUttS_123SPMFN, j, 3, 13));
				sAgr123_SP_MFN_ErgUtt.add(new Utterance(protoUttS_123SPMFN, j, 4, 13));
				sAgr123_SP_MFN_AbsUtt.add(new Utterance(protoUttS_123SPMFN, j, 5, 13));
				sAgr123_SP_MFN_ErgAbsUtt.add(new Utterance(protoUttS_123SPMFN, j, 6, 13));
				
				oAgr123_SP_MFNUtt.add(new Utterance(protoUttO_123SPMFN, j, 0, 14));
				oAgr123_SP_MFN_NomUtt.add(new Utterance(protoUttO_123SPMFN, j, 1, 14));
				oAgr123_SP_MFN_AccUtt.add(new Utterance(protoUttO_123SPMFN, j, 2, 14));
				oAgr123_SP_MFN_NomAccUtt.add(new Utterance(protoUttO_123SPMFN, j, 3, 14));
				oAgr123_SP_MFN_ErgUtt.add(new Utterance(protoUttO_123SPMFN, j, 4, 14));
				oAgr123_SP_MFN_AbsUtt.add(new Utterance(protoUttO_123SPMFN, j, 5, 14));
				oAgr123_SP_MFN_ErgAbsUtt.add(new Utterance(protoUttO_123SPMFN, j, 6, 14));
				
				soAgr123_SP_MFNUtt.add(new Utterance(protoUttSO_123SPMFN, j, 0, 15));
				soAgr123_SP_MFN_NomUtt.add(new Utterance(protoUttSO_123SPMFN, j, 1, 15));
				soAgr123_SP_MFN_AccUtt.add(new Utterance(protoUttSO_123SPMFN, j, 2, 15));
				soAgr123_SP_MFN_NomAccUtt.add(new Utterance(protoUttSO_123SPMFN, j, 3, 15));
				soAgr123_SP_MFN_ErgUtt.add(new Utterance(protoUttSO_123SPMFN, j, 4, 15));
				soAgr123_SP_MFN_AbsUtt.add(new Utterance(protoUttSO_123SPMFN, j, 5, 15));
				soAgr123_SP_MFN_ErgAbsUtt.add(new Utterance(protoUttSO_123SPMFN, j, 6, 15));
				
				sAgr123_SP_CNUtt.add(new Utterance(protoUttS_123SPCN, j, 0, 13));
				sAgr123_SP_CN_NomUtt.add(new Utterance(protoUttS_123SPCN, j, 1, 13));
				sAgr123_SP_CN_AccUtt.add(new Utterance(protoUttS_123SPCN, j, 2, 13));
				sAgr123_SP_CN_NomAccUtt.add(new Utterance(protoUttS_123SPCN, j, 3, 13));
				sAgr123_SP_CN_ErgUtt.add(new Utterance(protoUttS_123SPCN, j, 4, 13));
				sAgr123_SP_CN_AbsUtt.add(new Utterance(protoUttS_123SPCN, j, 5, 13));
				sAgr123_SP_CN_ErgAbsUtt.add(new Utterance(protoUttS_123SPCN, j, 6, 13));
				
				oAgr123_SP_CNUtt.add(new Utterance(protoUttO_123SPCN, j, 0, 14));
				oAgr123_SP_CN_NomUtt.add(new Utterance(protoUttO_123SPCN, j, 1, 14));
				oAgr123_SP_CN_AccUtt.add(new Utterance(protoUttO_123SPCN, j, 2, 14));
				oAgr123_SP_CN_NomAccUtt.add(new Utterance(protoUttO_123SPCN, j, 3, 14));
				oAgr123_SP_CN_ErgUtt.add(new Utterance(protoUttO_123SPCN, j, 4, 14));
				oAgr123_SP_CN_AbsUtt.add(new Utterance(protoUttO_123SPCN, j, 5, 14));
				oAgr123_SP_CN_ErgAbsUtt.add(new Utterance(protoUttO_123SPCN, j, 6, 14));
				
				soAgr123_SP_CNUtt.add(new Utterance(protoUttSO_123SPCN, j, 0, 15));
				soAgr123_SP_CN_NomUtt.add(new Utterance(protoUttSO_123SPCN, j, 1, 15));
				soAgr123_SP_CN_AccUtt.add(new Utterance(protoUttSO_123SPCN, j, 2, 15));
				soAgr123_SP_CN_NomAccUtt.add(new Utterance(protoUttSO_123SPCN, j, 3, 15));
				soAgr123_SP_CN_ErgUtt.add(new Utterance(protoUttSO_123SPCN, j, 4, 15));
				soAgr123_SP_CN_AbsUtt.add(new Utterance(protoUttSO_123SPCN, j, 5, 15));
				soAgr123_SP_CN_ErgAbsUtt.add(new Utterance(protoUttSO_123SPCN, j, 6, 15));
				
				sAgr123_SP_AIUtt.add(new Utterance(protoUttS_123SPAI, j, 0, 13));
				sAgr123_SP_AI_NomUtt.add(new Utterance(protoUttS_123SPAI, j, 1, 13));
				sAgr123_SP_AI_AccUtt.add(new Utterance(protoUttS_123SPAI, j, 2, 13));
				sAgr123_SP_AI_NomAccUtt.add(new Utterance(protoUttS_123SPAI, j, 3, 13));
				sAgr123_SP_AI_ErgUtt.add(new Utterance(protoUttS_123SPAI, j, 4, 13));
				sAgr123_SP_AI_AbsUtt.add(new Utterance(protoUttS_123SPAI, j, 5, 13));
				sAgr123_SP_AI_ErgAbsUtt.add(new Utterance(protoUttS_123SPAI, j, 6, 13));
				
				oAgr123_SP_AIUtt.add(new Utterance(protoUttO_123SPAI, j, 0, 14));
				oAgr123_SP_AI_NomUtt.add(new Utterance(protoUttO_123SPAI, j, 1, 14));
				oAgr123_SP_AI_AccUtt.add(new Utterance(protoUttO_123SPAI, j, 2, 14));
				oAgr123_SP_AI_NomAccUtt.add(new Utterance(protoUttO_123SPAI, j, 3, 14));
				oAgr123_SP_AI_ErgUtt.add(new Utterance(protoUttO_123SPAI, j, 4, 14));
				oAgr123_SP_AI_AbsUtt.add(new Utterance(protoUttO_123SPAI, j, 5, 14));
				oAgr123_SP_AI_ErgAbsUtt.add(new Utterance(protoUttO_123SPAI, j, 6, 14));
				
				soAgr123_SP_AIUtt.add(new Utterance(protoUttSO_123SPAI, j, 0, 15));
				soAgr123_SP_AI_NomUtt.add(new Utterance(protoUttSO_123SPAI, j, 1, 15));
				soAgr123_SP_AI_AccUtt.add(new Utterance(protoUttSO_123SPAI, j, 2, 15));
				soAgr123_SP_AI_NomAccUtt.add(new Utterance(protoUttSO_123SPAI, j, 3, 15));
				soAgr123_SP_AI_ErgUtt.add(new Utterance(protoUttSO_123SPAI, j, 4, 15));
				soAgr123_SP_AI_AbsUtt.add(new Utterance(protoUttSO_123SPAI, j, 5, 15));
				soAgr123_SP_AI_ErgAbsUtt.add(new Utterance(protoUttSO_123SPAI, j, 6, 15));
				
				sAgr123_SP_HNUtt.add(new Utterance(protoUttS_123SPHN, j, 0, 13));
				sAgr123_SP_HN_NomUtt.add(new Utterance(protoUttS_123SPHN, j, 1, 13));
				sAgr123_SP_HN_AccUtt.add(new Utterance(protoUttS_123SPHN, j, 2, 13));
				sAgr123_SP_HN_NomAccUtt.add(new Utterance(protoUttS_123SPHN, j, 3, 13));
				sAgr123_SP_HN_ErgUtt.add(new Utterance(protoUttS_123SPHN, j, 4, 13));
				sAgr123_SP_HN_AbsUtt.add(new Utterance(protoUttS_123SPHN, j, 5, 13));
				sAgr123_SP_HN_ErgAbsUtt.add(new Utterance(protoUttS_123SPHN, j, 6, 13));
				
				oAgr123_SP_HNUtt.add(new Utterance(protoUttO_123SPHN, j, 0, 14));
				oAgr123_SP_HN_NomUtt.add(new Utterance(protoUttO_123SPHN, j, 1, 14));
				oAgr123_SP_HN_AccUtt.add(new Utterance(protoUttO_123SPHN, j, 2, 14));
				oAgr123_SP_HN_NomAccUtt.add(new Utterance(protoUttO_123SPHN, j, 3, 14));
				oAgr123_SP_HN_ErgUtt.add(new Utterance(protoUttO_123SPHN, j, 4, 14));
				oAgr123_SP_HN_AbsUtt.add(new Utterance(protoUttO_123SPHN, j, 5, 14));
				oAgr123_SP_HN_ErgAbsUtt.add(new Utterance(protoUttO_123SPHN, j, 6, 14));
				
				soAgr123_SP_HNUtt.add(new Utterance(protoUttSO_123SPHN, j, 0, 15));
				soAgr123_SP_HN_NomUtt.add(new Utterance(protoUttSO_123SPHN, j, 1, 15));
				soAgr123_SP_HN_AccUtt.add(new Utterance(protoUttSO_123SPHN, j, 2, 15));
				soAgr123_SP_HN_NomAccUtt.add(new Utterance(protoUttSO_123SPHN, j, 3, 15));
				soAgr123_SP_HN_ErgUtt.add(new Utterance(protoUttSO_123SPHN, j, 4, 15));
				soAgr123_SP_HN_AbsUtt.add(new Utterance(protoUttSO_123SPHN, j, 5, 15));
				soAgr123_SP_HN_ErgAbsUtt.add(new Utterance(protoUttSO_123SPHN, j, 6, 15));
				
				sAgr123_SP_HAIUtt.add(new Utterance(protoUttS_123SPHAI, j, 0, 13));
				sAgr123_SP_HAI_NomUtt.add(new Utterance(protoUttS_123SPHAI, j, 1, 13));
				sAgr123_SP_HAI_AccUtt.add(new Utterance(protoUttS_123SPHAI, j, 2, 13));
				sAgr123_SP_HAI_NomAccUtt.add(new Utterance(protoUttS_123SPHAI, j, 3, 13));
				sAgr123_SP_HAI_ErgUtt.add(new Utterance(protoUttS_123SPHAI, j, 4, 13));
				sAgr123_SP_HAI_AbsUtt.add(new Utterance(protoUttS_123SPHAI, j, 5, 13));
				sAgr123_SP_HAI_ErgAbsUtt.add(new Utterance(protoUttS_123SPHAI, j, 6, 13));
				
				oAgr123_SP_HAIUtt.add(new Utterance(protoUttO_123SPHAI, j, 0, 14));
				oAgr123_SP_HAI_NomUtt.add(new Utterance(protoUttO_123SPHAI, j, 1, 14));
				oAgr123_SP_HAI_AccUtt.add(new Utterance(protoUttO_123SPHAI, j, 2, 14));
				oAgr123_SP_HAI_NomAccUtt.add(new Utterance(protoUttO_123SPHAI, j, 3, 14));
				oAgr123_SP_HAI_ErgUtt.add(new Utterance(protoUttO_123SPHAI, j, 4, 14));
				oAgr123_SP_HAI_AbsUtt.add(new Utterance(protoUttO_123SPHAI, j, 5, 14));
				oAgr123_SP_HAI_ErgAbsUtt.add(new Utterance(protoUttO_123SPHAI, j, 6, 14));
				
				soAgr123_SP_HAIUtt.add(new Utterance(protoUttSO_123SPHAI, j, 0, 15));
				soAgr123_SP_HAI_NomUtt.add(new Utterance(protoUttSO_123SPHAI, j, 1, 15));
				soAgr123_SP_HAI_AccUtt.add(new Utterance(protoUttSO_123SPHAI, j, 2, 15));
				soAgr123_SP_HAI_NomAccUtt.add(new Utterance(protoUttSO_123SPHAI, j, 3, 15));
				soAgr123_SP_HAI_ErgUtt.add(new Utterance(protoUttSO_123SPHAI, j, 4, 15));
				soAgr123_SP_HAI_AbsUtt.add(new Utterance(protoUttSO_123SPHAI, j, 5, 15));
				soAgr123_SP_HAI_ErgAbsUtt.add(new Utterance(protoUttSO_123SPHAI, j, 6, 15));
				
				sAgr123_SP_MNMUtt.add(new Utterance(protoUttS_123SPMNM, j, 0, 13));
				sAgr123_SP_MNM_NomUtt.add(new Utterance(protoUttS_123SPMNM, j, 1, 13));
				sAgr123_SP_MNM_AccUtt.add(new Utterance(protoUttS_123SPMNM, j, 2, 13));
				sAgr123_SP_MNM_NomAccUtt.add(new Utterance(protoUttS_123SPMNM, j, 3, 13));
				sAgr123_SP_MNM_ErgUtt.add(new Utterance(protoUttS_123SPMNM, j, 4, 13));
				sAgr123_SP_MNM_AbsUtt.add(new Utterance(protoUttS_123SPMNM, j, 5, 13));
				sAgr123_SP_MNM_ErgAbsUtt.add(new Utterance(protoUttS_123SPMNM, j, 6, 13));
				
				oAgr123_SP_MNMUtt.add(new Utterance(protoUttO_123SPMNM, j, 0, 14));
				oAgr123_SP_MNM_NomUtt.add(new Utterance(protoUttO_123SPMNM, j, 1, 14));
				oAgr123_SP_MNM_AccUtt.add(new Utterance(protoUttO_123SPMNM, j, 2, 14));
				oAgr123_SP_MNM_NomAccUtt.add(new Utterance(protoUttO_123SPMNM, j, 3, 14));
				oAgr123_SP_MNM_ErgUtt.add(new Utterance(protoUttO_123SPMNM, j, 4, 14));
				oAgr123_SP_MNM_AbsUtt.add(new Utterance(protoUttO_123SPMNM, j, 5, 14));
				oAgr123_SP_MNM_ErgAbsUtt.add(new Utterance(protoUttO_123SPMNM, j, 6, 14));
				
				soAgr123_SP_MNMUtt.add(new Utterance(protoUttSO_123SPMNM, j, 0, 15));
				soAgr123_SP_MNM_NomUtt.add(new Utterance(protoUttSO_123SPMNM, j, 1, 15));
				soAgr123_SP_MNM_AccUtt.add(new Utterance(protoUttSO_123SPMNM, j, 2, 15));
				soAgr123_SP_MNM_NomAccUtt.add(new Utterance(protoUttSO_123SPMNM, j, 3, 15));
				soAgr123_SP_MNM_ErgUtt.add(new Utterance(protoUttSO_123SPMNM, j, 4, 15));
				soAgr123_SP_MNM_AbsUtt.add(new Utterance(protoUttSO_123SPMNM, j, 5, 15));
				soAgr123_SP_MNM_ErgAbsUtt.add(new Utterance(protoUttSO_123SPMNM, j, 6, 15));
			}
			
			for(int j = 0; j < 6; j++) {
				HashMap<String, Word> first = new HashMap<>();
				first.put("caseless", utt.get(j).firstWord);
				first.put("nom", nomUtt.get(j).firstWord);
				first.put("acc", accUtt.get(j).firstWord);
				first.put("nomacc", nomAccUtt.get(j).firstWord);
				first.put("erg", ergUtt.get(j).firstWord);
				first.put("abs", absUtt.get(j).firstWord);
				first.put("ergabs", ergAbsUtt.get(j).firstWord);
				
				first.put("s-123", sAgr123Utt.get(j).firstWord);
//				first.put("s-we", sAgrWeUtt.get(j).firstWord);
				
				first.put("o-123", oAgr123Utt.get(j).firstWord);
//				first.put("o-we", oAgrWeUtt.get(j).firstWord);
				
				first.put("so-123", soAgr123Utt.get(j).firstWord);
//				first.put("s-we", soAgrWeUtt.get(j).firstWord);
				
				first.put("s-sp", sAgrSPUtt.get(j).firstWord);
				first.put("o-sp", oAgrSPUtt.get(j).firstWord);
				first.put("so-sp", soAgrSPUtt.get(j).firstWord);
				
				first.put("s-123+sp", sAgr123_SPUtt.get(j).firstWord);
				first.put("s-123+sp+nom", sAgr123_SP_NomUtt.get(j).firstWord);
				first.put("s-123+sp+acc", sAgr123_SP_AccUtt.get(j).firstWord);
				first.put("s-123+sp+nomacc", sAgr123_SP_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+erg", sAgr123_SP_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+abs", sAgr123_SP_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+ergabs", sAgr123_SP_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp", oAgr123_SPUtt.get(j).firstWord);
				first.put("o-123+sp+nom", oAgr123_SP_NomUtt.get(j).firstWord);
				first.put("o-123+sp+acc", oAgr123_SP_AccUtt.get(j).firstWord);
				first.put("o-123+sp+nomacc", oAgr123_SP_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+erg", oAgr123_SP_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+abs", oAgr123_SP_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+ergabs", oAgr123_SP_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-123+sp", soAgr123_SPUtt.get(j).firstWord);
				first.put("so-123+sp+nom", soAgr123_SP_NomUtt.get(j).firstWord);
				first.put("so-123+sp+acc", soAgr123_SP_AccUtt.get(j).firstWord);
				first.put("so-123+sp+nomacc", soAgr123_SP_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+erg", soAgr123_SP_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+abs", soAgr123_SP_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+ergabs", soAgr123_SP_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-mf", sAgrMFUtt.get(j).firstWord);
				first.put("s-mf+nom", sAgrMF_NomUtt.get(j).firstWord);
				first.put("s-mf+acc", sAgrMF_AccUtt.get(j).firstWord);
				first.put("s-mf+nomacc", sAgrMF_NomAccUtt.get(j).firstWord);
				first.put("s-mf+erg", sAgrMF_ErgUtt.get(j).firstWord);
				first.put("s-mf+abs", sAgrMF_AbsUtt.get(j).firstWord);
				first.put("s-mf+ergabs", sAgrMF_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-mfn", sAgrMFNUtt.get(j).firstWord);
				first.put("s-mfn+nom", sAgrMFN_NomUtt.get(j).firstWord);
				first.put("s-mfn+acc", sAgrMFN_AccUtt.get(j).firstWord);
				first.put("s-mfn+nomacc", sAgrMFN_NomAccUtt.get(j).firstWord);
				first.put("s-mfn+erg", sAgrMFN_ErgUtt.get(j).firstWord);
				first.put("s-mfn+abs", sAgrMFN_AbsUtt.get(j).firstWord);
				first.put("s-mfn+ergabs", sAgrMFN_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-cn", sAgrCNUtt.get(j).firstWord);
				first.put("s-cn+nom", sAgrCN_NomUtt.get(j).firstWord);
				first.put("s-cn+acc", sAgrCN_AccUtt.get(j).firstWord);
				first.put("s-cn+nomacc", sAgrCN_NomAccUtt.get(j).firstWord);
				first.put("s-cn+erg", sAgrCN_ErgUtt.get(j).firstWord);
				first.put("s-cn+abs", sAgrCN_AbsUtt.get(j).firstWord);
				first.put("s-cn+ergabs", sAgrCN_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-ai", sAgrAIUtt.get(j).firstWord);
				first.put("s-ai+nom", sAgrAI_NomUtt.get(j).firstWord);
				first.put("s-ai+acc", sAgrAI_AccUtt.get(j).firstWord);
				first.put("s-ai+nomacc", sAgrAI_NomAccUtt.get(j).firstWord);
				first.put("s-ai+erg", sAgrAI_ErgUtt.get(j).firstWord);
				first.put("s-ai+abs", sAgrAI_AbsUtt.get(j).firstWord);
				first.put("s-ai+ergabs", sAgrAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-hn", sAgrHNUtt.get(j).firstWord);
				first.put("s-hn+nom", sAgrHN_NomUtt.get(j).firstWord);
				first.put("s-hn+acc", sAgrHN_AccUtt.get(j).firstWord);
				first.put("s-hn+nomacc", sAgrHN_NomAccUtt.get(j).firstWord);
				first.put("s-hn+erg", sAgrHN_ErgUtt.get(j).firstWord);
				first.put("s-hn+abs", sAgrHN_AbsUtt.get(j).firstWord);
				first.put("s-hn+ergabs", sAgrHN_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-hai", sAgrHAIUtt.get(j).firstWord);
				first.put("s-hai+nom", sAgrHAI_NomUtt.get(j).firstWord);
				first.put("s-hai+acc", sAgrHAI_AccUtt.get(j).firstWord);
				first.put("s-hai+nomacc", sAgrHAI_NomAccUtt.get(j).firstWord);
				first.put("s-hai+erg", sAgrHAI_ErgUtt.get(j).firstWord);
				first.put("s-hai+abs", sAgrHAI_AbsUtt.get(j).firstWord);
				first.put("s-hai+ergabs", sAgrHAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-mnm", sAgrMNMUtt.get(j).firstWord);
				first.put("s-mnm+nom", sAgrMNM_NomUtt.get(j).firstWord);
				first.put("s-mnm+acc", sAgrMNM_AccUtt.get(j).firstWord);
				first.put("s-mnm+nomacc", sAgrMNM_NomAccUtt.get(j).firstWord);
				first.put("s-mnm+erg", sAgrMNM_ErgUtt.get(j).firstWord);
				first.put("s-mnm+abs", sAgrMNM_AbsUtt.get(j).firstWord);
				first.put("s-mnm+ergabs", sAgrMNM_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-mf", oAgrMFUtt.get(j).firstWord);
				first.put("o-mf+nom", oAgrMF_NomUtt.get(j).firstWord);
				first.put("o-mf+acc", oAgrMF_AccUtt.get(j).firstWord);
				first.put("o-mf+nomacc", oAgrMF_NomAccUtt.get(j).firstWord);
				first.put("o-mf+erg", oAgrMF_ErgUtt.get(j).firstWord);
				first.put("o-mf+abs", oAgrMF_AbsUtt.get(j).firstWord);
				first.put("o-mf+ergabs", oAgrMF_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-mfn", oAgrMFNUtt.get(j).firstWord);
				first.put("o-mfn+nom", oAgrMFN_NomUtt.get(j).firstWord);
				first.put("o-mfn+acc", oAgrMFN_AccUtt.get(j).firstWord);
				first.put("o-mfn+nomacc", oAgrMFN_NomAccUtt.get(j).firstWord);
				first.put("o-mfn+erg", oAgrMFN_ErgUtt.get(j).firstWord);
				first.put("o-mfn+abs", oAgrMFN_AbsUtt.get(j).firstWord);
				first.put("o-mfn+ergabs", oAgrMFN_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-cn", oAgrCNUtt.get(j).firstWord);
				first.put("o-cn+nom", oAgrCN_NomUtt.get(j).firstWord);
				first.put("o-cn+acc", oAgrCN_AccUtt.get(j).firstWord);
				first.put("o-cn+nomacc", oAgrCN_NomAccUtt.get(j).firstWord);
				first.put("o-cn+erg", oAgrCN_ErgUtt.get(j).firstWord);
				first.put("o-cn+abs", oAgrCN_AbsUtt.get(j).firstWord);
				first.put("o-cn+ergabs", oAgrCN_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-ai", oAgrAIUtt.get(j).firstWord);
				first.put("o-ai+nom", oAgrAI_NomUtt.get(j).firstWord);
				first.put("o-ai+acc", oAgrAI_AccUtt.get(j).firstWord);
				first.put("o-ai+nomacc", oAgrAI_NomAccUtt.get(j).firstWord);
				first.put("o-ai+erg", oAgrAI_ErgUtt.get(j).firstWord);
				first.put("o-ai+abs", oAgrAI_AbsUtt.get(j).firstWord);
				first.put("o-ai+ergabs", oAgrAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-hn", oAgrHNUtt.get(j).firstWord);
				first.put("o-hn+nom", oAgrHN_NomUtt.get(j).firstWord);
				first.put("o-hn+acc", oAgrHN_AccUtt.get(j).firstWord);
				first.put("o-hn+nomacc", oAgrHN_NomAccUtt.get(j).firstWord);
				first.put("o-hn+erg", oAgrHN_ErgUtt.get(j).firstWord);
				first.put("o-hn+abs", oAgrHN_AbsUtt.get(j).firstWord);
				first.put("o-hn+ergabs", oAgrHN_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-hai", oAgrHAIUtt.get(j).firstWord);
				first.put("o-hai+nom", oAgrHAI_NomUtt.get(j).firstWord);
				first.put("o-hai+acc", oAgrHAI_AccUtt.get(j).firstWord);
				first.put("o-hai+nomacc", oAgrHAI_NomAccUtt.get(j).firstWord);
				first.put("o-hai+erg", oAgrHAI_ErgUtt.get(j).firstWord);
				first.put("o-hai+abs", oAgrHAI_AbsUtt.get(j).firstWord);
				first.put("o-hai+ergabs", oAgrHAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-mnm", oAgrMNMUtt.get(j).firstWord);
				first.put("o-mnm+nom", oAgrMNM_NomUtt.get(j).firstWord);
				first.put("o-mnm+acc", oAgrMNM_AccUtt.get(j).firstWord);
				first.put("o-mnm+nomacc", oAgrMNM_NomAccUtt.get(j).firstWord);
				first.put("o-mnm+erg", oAgrMNM_ErgUtt.get(j).firstWord);
				first.put("o-mnm+abs", oAgrMNM_AbsUtt.get(j).firstWord);
				first.put("o-mnm+ergabs", oAgrMNM_ErgAbsUtt.get(j).firstWord);
								
				first.put("so-mf", soAgrMFUtt.get(j).firstWord);
				first.put("so-mf+nom", soAgrMF_NomUtt.get(j).firstWord);
				first.put("so-mf+acc", soAgrMF_AccUtt.get(j).firstWord);
				first.put("so-mf+nomacc", soAgrMF_NomAccUtt.get(j).firstWord);
				first.put("so-mf+erg", soAgrMF_ErgUtt.get(j).firstWord);
				first.put("so-mf+abs", soAgrMF_AbsUtt.get(j).firstWord);
				first.put("so-mf+ergabs", soAgrMF_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-mfn", soAgrMFNUtt.get(j).firstWord);
				first.put("so-mfn+nom", soAgrMFN_NomUtt.get(j).firstWord);
				first.put("so-mfn+acc", soAgrMFN_AccUtt.get(j).firstWord);
				first.put("so-mfn+nomacc", soAgrMFN_NomAccUtt.get(j).firstWord);
				first.put("so-mfn+erg", soAgrMFN_ErgUtt.get(j).firstWord);
				first.put("so-mfn+abs", soAgrMFN_AbsUtt.get(j).firstWord);
				first.put("so-mfn+ergabs", soAgrMFN_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-cn", soAgrCNUtt.get(j).firstWord);
				first.put("so-cn+nom", soAgrCN_NomUtt.get(j).firstWord);
				first.put("so-cn+acc", soAgrCN_AccUtt.get(j).firstWord);
				first.put("so-cn+nomacc", soAgrCN_NomAccUtt.get(j).firstWord);
				first.put("so-cn+erg", soAgrCN_ErgUtt.get(j).firstWord);
				first.put("so-cn+abs", soAgrCN_AbsUtt.get(j).firstWord);
				first.put("so-cn+ergabs", soAgrCN_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-ai", soAgrAIUtt.get(j).firstWord);
				first.put("so-ai+nom", soAgrAI_NomUtt.get(j).firstWord);
				first.put("so-ai+acc", soAgrAI_AccUtt.get(j).firstWord);
				first.put("so-ai+nomacc", soAgrAI_NomAccUtt.get(j).firstWord);
				first.put("so-ai+erg", soAgrAI_ErgUtt.get(j).firstWord);
				first.put("so-ai+abs", soAgrAI_AbsUtt.get(j).firstWord);
				first.put("so-ai+ergabs", soAgrAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-hn", soAgrHNUtt.get(j).firstWord);
				first.put("so-hn+nom", soAgrHN_NomUtt.get(j).firstWord);
				first.put("so-hn+acc", soAgrHN_AccUtt.get(j).firstWord);
				first.put("so-hn+nomacc", soAgrHN_NomAccUtt.get(j).firstWord);
				first.put("so-hn+erg", soAgrHN_ErgUtt.get(j).firstWord);
				first.put("so-hn+abs", soAgrHN_AbsUtt.get(j).firstWord);
				first.put("so-hn+ergabs", soAgrHN_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-hai", soAgrHAIUtt.get(j).firstWord);
				first.put("so-hai+nom", soAgrHAI_NomUtt.get(j).firstWord);
				first.put("so-hai+acc", soAgrHAI_AccUtt.get(j).firstWord);
				first.put("so-hai+nomacc", soAgrHAI_NomAccUtt.get(j).firstWord);
				first.put("so-hai+erg", soAgrHAI_ErgUtt.get(j).firstWord);
				first.put("so-hai+abs", soAgrHAI_AbsUtt.get(j).firstWord);
				first.put("so-hai+ergabs", soAgrHAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-mnm", soAgrMNMUtt.get(j).firstWord);
				first.put("so-mnm+nom", soAgrMNM_NomUtt.get(j).firstWord);
				first.put("so-mnm+acc", soAgrMNM_AccUtt.get(j).firstWord);
				first.put("so-mnm+nomacc", soAgrMNM_NomAccUtt.get(j).firstWord);
				first.put("so-mnm+erg", soAgrMNM_ErgUtt.get(j).firstWord);
				first.put("so-mnm+abs", soAgrMNM_AbsUtt.get(j).firstWord);
				first.put("so-mnm+ergabs", soAgrMNM_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-123+sp+mf", sAgr123_SP_MFUtt.get(j).firstWord);
				first.put("s-123+sp+mf+nom", sAgr123_SP_MF_NomUtt.get(j).firstWord);
				first.put("s-123+sp+mf+acc", sAgr123_SP_MF_AccUtt.get(j).firstWord);
				first.put("s-123+sp+mf+nomacc", sAgr123_SP_MF_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+mf+erg", sAgr123_SP_MF_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+mf+abs", sAgr123_SP_MF_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+mf+ergabs", sAgr123_SP_MF_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-123+sp+mfn", sAgr123_SP_MFNUtt.get(j).firstWord);
				first.put("s-123+sp+mfn+nom", sAgr123_SP_MFN_NomUtt.get(j).firstWord);
				first.put("s-123+sp+mfn+acc", sAgr123_SP_MFN_AccUtt.get(j).firstWord);
				first.put("s-123+sp+mfn+nomacc", sAgr123_SP_MFN_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+mfn+erg", sAgr123_SP_MFN_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+mfn+abs", sAgr123_SP_MFN_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+mfn+ergabs", sAgr123_SP_MFN_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-123+sp+cn", sAgr123_SP_CNUtt.get(j).firstWord);
				first.put("s-123+sp+cn+nom", sAgr123_SP_CN_NomUtt.get(j).firstWord);
				first.put("s-123+sp+cn+acc", sAgr123_SP_CN_AccUtt.get(j).firstWord);
				first.put("s-123+sp+cn+nomacc", sAgr123_SP_CN_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+cn+erg", sAgr123_SP_CN_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+cn+abs", sAgr123_SP_CN_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+cn+ergabs", sAgr123_SP_CN_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-123+sp+ai", sAgr123_SP_AIUtt.get(j).firstWord);
				first.put("s-123+sp+ai+nom", sAgr123_SP_AI_NomUtt.get(j).firstWord);
				first.put("s-123+sp+ai+acc", sAgr123_SP_AI_AccUtt.get(j).firstWord);
				first.put("s-123+sp+ai+nomacc", sAgr123_SP_AI_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+ai+erg", sAgr123_SP_AI_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+ai+abs", sAgr123_SP_AI_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+ai+ergabs", sAgr123_SP_AI_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-123+sp+hn", sAgr123_SP_HNUtt.get(j).firstWord);
				first.put("s-123+sp+hn+nom", sAgr123_SP_HN_NomUtt.get(j).firstWord);
				first.put("s-123+sp+hn+acc", sAgr123_SP_HN_AccUtt.get(j).firstWord);
				first.put("s-123+sp+hn+nomacc", sAgr123_SP_HN_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+hn+erg", sAgr123_SP_HN_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+hn+abs", sAgr123_SP_HN_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+hn+ergabs", sAgr123_SP_HN_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-123+sp+hai", sAgr123_SP_HAIUtt.get(j).firstWord);
				first.put("s-123+sp+hai+nom", sAgr123_SP_HAI_NomUtt.get(j).firstWord);
				first.put("s-123+sp+hai+acc", sAgr123_SP_HAI_AccUtt.get(j).firstWord);
				first.put("s-123+sp+hai+nomacc", sAgr123_SP_HAI_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+hai+erg", sAgr123_SP_HAI_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+hai+abs", sAgr123_SP_HAI_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+hai+ergabs", sAgr123_SP_HAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("s-123+sp+mnm", sAgr123_SP_MNMUtt.get(j).firstWord);
				first.put("s-123+sp+mnm+nom", sAgr123_SP_MNM_NomUtt.get(j).firstWord);
				first.put("s-123+sp+mnm+acc", sAgr123_SP_MNM_AccUtt.get(j).firstWord);
				first.put("s-123+sp+mnm+nomacc", sAgr123_SP_MNM_NomAccUtt.get(j).firstWord);
				first.put("s-123+sp+mnm+erg", sAgr123_SP_MNM_ErgUtt.get(j).firstWord);
				first.put("s-123+sp+mnm+abs", sAgr123_SP_MNM_AbsUtt.get(j).firstWord);
				first.put("s-123+sp+mnm+ergabs", sAgr123_SP_MNM_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp+mf", oAgr123_SP_MFUtt.get(j).firstWord);
				first.put("o-123+sp+mf+nom", oAgr123_SP_MF_NomUtt.get(j).firstWord);
				first.put("o-123+sp+mf+acc", oAgr123_SP_MF_AccUtt.get(j).firstWord);
				first.put("o-123+sp+mf+nomacc", oAgr123_SP_MF_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+mf+erg", oAgr123_SP_MF_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+mf+abs", oAgr123_SP_MF_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+mf+ergabs", oAgr123_SP_MF_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp+mfn", oAgr123_SP_MFNUtt.get(j).firstWord);
				first.put("o-123+sp+mfn+nom", oAgr123_SP_MFN_NomUtt.get(j).firstWord);
				first.put("o-123+sp+mfn+acc", oAgr123_SP_MFN_AccUtt.get(j).firstWord);
				first.put("o-123+sp+mfn+nomacc", oAgr123_SP_MFN_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+mfn+erg", oAgr123_SP_MFN_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+mfn+abs", oAgr123_SP_MFN_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+mfn+ergabs", oAgr123_SP_MFN_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp+cn", oAgr123_SP_CNUtt.get(j).firstWord);
				first.put("o-123+sp+cn+nom", oAgr123_SP_CN_NomUtt.get(j).firstWord);
				first.put("o-123+sp+cn+acc", oAgr123_SP_CN_AccUtt.get(j).firstWord);
				first.put("o-123+sp+cn+nomacc", oAgr123_SP_CN_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+cn+erg", oAgr123_SP_CN_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+cn+abs", oAgr123_SP_CN_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+cn+ergabs", oAgr123_SP_CN_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp+ai", oAgr123_SP_AIUtt.get(j).firstWord);
				first.put("o-123+sp+ai+nom", oAgr123_SP_AI_NomUtt.get(j).firstWord);
				first.put("o-123+sp+ai+acc", oAgr123_SP_AI_AccUtt.get(j).firstWord);
				first.put("o-123+sp+ai+nomacc", oAgr123_SP_AI_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+ai+erg", oAgr123_SP_AI_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+ai+abs", oAgr123_SP_AI_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+ai+ergabs", oAgr123_SP_AI_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp+hn", oAgr123_SP_HNUtt.get(j).firstWord);
				first.put("o-123+sp+hn+nom", oAgr123_SP_HN_NomUtt.get(j).firstWord);
				first.put("o-123+sp+hn+acc", oAgr123_SP_HN_AccUtt.get(j).firstWord);
				first.put("o-123+sp+hn+nomacc", oAgr123_SP_HN_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+hn+erg", oAgr123_SP_HN_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+hn+abs", oAgr123_SP_HN_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+hn+ergabs", oAgr123_SP_HN_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp+hai", oAgr123_SP_HAIUtt.get(j).firstWord);
				first.put("o-123+sp+hai+nom", oAgr123_SP_HAI_NomUtt.get(j).firstWord);
				first.put("o-123+sp+hai+acc", oAgr123_SP_HAI_AccUtt.get(j).firstWord);
				first.put("o-123+sp+hai+nomacc", oAgr123_SP_HAI_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+hai+erg", oAgr123_SP_HAI_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+hai+abs", oAgr123_SP_HAI_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+hai+ergabs", oAgr123_SP_HAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("o-123+sp+mnm", oAgr123_SP_MNMUtt.get(j).firstWord);
				first.put("o-123+sp+mnm+nom", oAgr123_SP_MNM_NomUtt.get(j).firstWord);
				first.put("o-123+sp+mnm+acc", oAgr123_SP_MNM_AccUtt.get(j).firstWord);
				first.put("o-123+sp+mnm+nomacc", oAgr123_SP_MNM_NomAccUtt.get(j).firstWord);
				first.put("o-123+sp+mnm+erg", oAgr123_SP_MNM_ErgUtt.get(j).firstWord);
				first.put("o-123+sp+mnm+abs", oAgr123_SP_MNM_AbsUtt.get(j).firstWord);
				first.put("o-123+sp+mnm+ergabs", oAgr123_SP_MNM_ErgAbsUtt.get(j).firstWord);
								
				first.put("so-123+sp+mf", soAgr123_SP_MFUtt.get(j).firstWord);
				first.put("so-123+sp+mf+nom", soAgr123_SP_MF_NomUtt.get(j).firstWord);
				first.put("so-123+sp+mf+acc", soAgr123_SP_MF_AccUtt.get(j).firstWord);
				first.put("so-123+sp+mf+nomacc", soAgr123_SP_MF_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+mf+erg", soAgr123_SP_MF_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+mf+abs", soAgr123_SP_MF_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+mf+ergabs", soAgr123_SP_MF_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-123+sp+mfn", soAgr123_SP_MFNUtt.get(j).firstWord);
				first.put("so-123+sp+mfn+nom", soAgr123_SP_MFN_NomUtt.get(j).firstWord);
				first.put("so-123+sp+mfn+acc", soAgr123_SP_MFN_AccUtt.get(j).firstWord);
				first.put("so-123+sp+mfn+nomacc", soAgr123_SP_MFN_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+mfn+erg", soAgr123_SP_MFN_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+mfn+abs", soAgr123_SP_MFN_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+mfn+ergabs", soAgr123_SP_MFN_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-123+sp+cn", soAgr123_SP_CNUtt.get(j).firstWord);
				first.put("so-123+sp+cn+nom", soAgr123_SP_CN_NomUtt.get(j).firstWord);
				first.put("so-123+sp+cn+acc", soAgr123_SP_CN_AccUtt.get(j).firstWord);
				first.put("so-123+sp+cn+nomacc", soAgr123_SP_CN_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+cn+erg", soAgr123_SP_CN_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+cn+abs", soAgr123_SP_CN_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+cn+ergabs", soAgr123_SP_CN_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-123+sp+ai", soAgr123_SP_AIUtt.get(j).firstWord);
				first.put("so-123+sp+ai+nom", soAgr123_SP_AI_NomUtt.get(j).firstWord);
				first.put("so-123+sp+ai+acc", soAgr123_SP_AI_AccUtt.get(j).firstWord);
				first.put("so-123+sp+ai+nomacc", soAgr123_SP_AI_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+ai+erg", soAgr123_SP_AI_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+ai+abs", soAgr123_SP_AI_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+ai+ergabs", soAgr123_SP_AI_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-123+sp+hn", soAgr123_SP_HNUtt.get(j).firstWord);
				first.put("so-123+sp+hn+nom", soAgr123_SP_HN_NomUtt.get(j).firstWord);
				first.put("so-123+sp+hn+acc", soAgr123_SP_HN_AccUtt.get(j).firstWord);
				first.put("so-123+sp+hn+nomacc", soAgr123_SP_HN_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+hn+erg", soAgr123_SP_HN_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+hn+abs", soAgr123_SP_HN_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+hn+ergabs", soAgr123_SP_HN_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-123+sp+hai", soAgr123_SP_HAIUtt.get(j).firstWord);
				first.put("so-123+sp+hai+nom", soAgr123_SP_HAI_NomUtt.get(j).firstWord);
				first.put("so-123+sp+hai+acc", soAgr123_SP_HAI_AccUtt.get(j).firstWord);
				first.put("so-123+sp+hai+nomacc", soAgr123_SP_HAI_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+hai+erg", soAgr123_SP_HAI_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+hai+abs", soAgr123_SP_HAI_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+hai+ergabs", soAgr123_SP_HAI_ErgAbsUtt.get(j).firstWord);
				
				first.put("so-123+sp+mnm", soAgr123_SP_MNMUtt.get(j).firstWord);
				first.put("so-123+sp+mnm+nom", soAgr123_SP_MNM_NomUtt.get(j).firstWord);
				first.put("so-123+sp+mnm+acc", soAgr123_SP_MNM_AccUtt.get(j).firstWord);
				first.put("so-123+sp+mnm+nomacc", soAgr123_SP_MNM_NomAccUtt.get(j).firstWord);
				first.put("so-123+sp+mnm+erg", soAgr123_SP_MNM_ErgUtt.get(j).firstWord);
				first.put("so-123+sp+mnm+abs", soAgr123_SP_MNM_AbsUtt.get(j).firstWord);
				first.put("so-123+sp+mnm+ergabs", soAgr123_SP_MNM_ErgAbsUtt.get(j).firstWord);
				
				HashMap<String, Word> second = new HashMap<>();
				second.put("caseless", utt.get(j).secondWord);
				second.put("nom", nomUtt.get(j).secondWord);
				second.put("acc", accUtt.get(j).secondWord);
				second.put("nomacc", nomAccUtt.get(j).secondWord);
				second.put("erg", ergUtt.get(j).secondWord);
				second.put("abs", absUtt.get(j).secondWord);
				second.put("ergabs", ergAbsUtt.get(j).secondWord);
				
				second.put("s-123", sAgr123Utt.get(j).secondWord);
//				second.put("s-we", sAgrWeUtt.get(j).secondWord);
				
				second.put("o-123", oAgr123Utt.get(j).secondWord);
//				second.put("o-we", oAgrWeUtt.get(j).secondWord);
				
				second.put("so-123", soAgr123Utt.get(j).secondWord);
//				second.put("so-we", soAgrWeUtt.get(j).secondWord);
				
				second.put("s-sp", sAgrSPUtt.get(j).secondWord);
				second.put("o-sp", oAgrSPUtt.get(j).secondWord);
				second.put("so-sp", soAgrSPUtt.get(j).secondWord);
				
				second.put("s-123+sp", sAgr123_SPUtt.get(j).secondWord);
				second.put("s-123+sp+nom", sAgr123_SP_NomUtt.get(j).secondWord);
				second.put("s-123+sp+acc", sAgr123_SP_AccUtt.get(j).secondWord);
				second.put("s-123+sp+nomacc", sAgr123_SP_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+erg", sAgr123_SP_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+abs", sAgr123_SP_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+ergabs", sAgr123_SP_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp", oAgr123_SPUtt.get(j).secondWord);
				second.put("o-123+sp+nom", oAgr123_SP_NomUtt.get(j).secondWord);
				second.put("o-123+sp+acc", oAgr123_SP_AccUtt.get(j).secondWord);
				second.put("o-123+sp+nomacc", oAgr123_SP_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+erg", oAgr123_SP_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+abs", oAgr123_SP_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+ergabs", oAgr123_SP_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp", soAgr123_SPUtt.get(j).secondWord);
				second.put("so-123+sp+nom", soAgr123_SP_NomUtt.get(j).secondWord);
				second.put("so-123+sp+acc", soAgr123_SP_AccUtt.get(j).secondWord);
				second.put("so-123+sp+nomacc", soAgr123_SP_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+erg", soAgr123_SP_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+abs", soAgr123_SP_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+ergabs", soAgr123_SP_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-mf", sAgrMFUtt.get(j).secondWord);
				second.put("s-mf+nom", sAgrMF_NomUtt.get(j).secondWord);
				second.put("s-mf+acc", sAgrMF_AccUtt.get(j).secondWord);
				second.put("s-mf+nomacc", sAgrMF_NomAccUtt.get(j).secondWord);
				second.put("s-mf+erg", sAgrMF_ErgUtt.get(j).secondWord);
				second.put("s-mf+abs", sAgrMF_AbsUtt.get(j).secondWord);
				second.put("s-mf+ergabs", sAgrMF_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-mfn", sAgrMFNUtt.get(j).secondWord);
				second.put("s-mfn+nom", sAgrMFN_NomUtt.get(j).secondWord);
				second.put("s-mfn+acc", sAgrMFN_AccUtt.get(j).secondWord);
				second.put("s-mfn+nomacc", sAgrMFN_NomAccUtt.get(j).secondWord);
				second.put("s-mfn+erg", sAgrMFN_ErgUtt.get(j).secondWord);
				second.put("s-mfn+abs", sAgrMFN_AbsUtt.get(j).secondWord);
				second.put("s-mfn+ergabs", sAgrMFN_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-cn", sAgrCNUtt.get(j).secondWord);
				second.put("s-cn+nom", sAgrCN_NomUtt.get(j).secondWord);
				second.put("s-cn+acc", sAgrCN_AccUtt.get(j).secondWord);
				second.put("s-cn+nomacc", sAgrCN_NomAccUtt.get(j).secondWord);
				second.put("s-cn+erg", sAgrCN_ErgUtt.get(j).secondWord);
				second.put("s-cn+abs", sAgrCN_AbsUtt.get(j).secondWord);
				second.put("s-cn+ergabs", sAgrCN_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-ai", sAgrAIUtt.get(j).secondWord);
				second.put("s-ai+nom", sAgrAI_NomUtt.get(j).secondWord);
				second.put("s-ai+acc", sAgrAI_AccUtt.get(j).secondWord);
				second.put("s-ai+nomacc", sAgrAI_NomAccUtt.get(j).secondWord);
				second.put("s-ai+erg", sAgrAI_ErgUtt.get(j).secondWord);
				second.put("s-ai+abs", sAgrAI_AbsUtt.get(j).secondWord);
				second.put("s-ai+ergabs", sAgrAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-hn", sAgrHNUtt.get(j).secondWord);
				second.put("s-hn+nom", sAgrHN_NomUtt.get(j).secondWord);
				second.put("s-hn+acc", sAgrHN_AccUtt.get(j).secondWord);
				second.put("s-hn+nomacc", sAgrHN_NomAccUtt.get(j).secondWord);
				second.put("s-hn+erg", sAgrHN_ErgUtt.get(j).secondWord);
				second.put("s-hn+abs", sAgrHN_AbsUtt.get(j).secondWord);
				second.put("s-hn+ergabs", sAgrHN_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-hai", sAgrHAIUtt.get(j).secondWord);
				second.put("s-hai+nom", sAgrHAI_NomUtt.get(j).secondWord);
				second.put("s-hai+acc", sAgrHAI_AccUtt.get(j).secondWord);
				second.put("s-hai+nomacc", sAgrHAI_NomAccUtt.get(j).secondWord);
				second.put("s-hai+erg", sAgrHAI_ErgUtt.get(j).secondWord);
				second.put("s-hai+abs", sAgrHAI_AbsUtt.get(j).secondWord);
				second.put("s-hai+ergabs", sAgrHAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-mnm", sAgrMNMUtt.get(j).secondWord);
				second.put("s-mnm+nom", sAgrMNM_NomUtt.get(j).secondWord);
				second.put("s-mnm+acc", sAgrMNM_AccUtt.get(j).secondWord);
				second.put("s-mnm+nomacc", sAgrMNM_NomAccUtt.get(j).secondWord);
				second.put("s-mnm+erg", sAgrMNM_ErgUtt.get(j).secondWord);
				second.put("s-mnm+abs", sAgrMNM_AbsUtt.get(j).secondWord);
				second.put("s-mnm+ergabs", sAgrMNM_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-mf", oAgrMFUtt.get(j).secondWord);
				second.put("o-mf+nom", oAgrMF_NomUtt.get(j).secondWord);
				second.put("o-mf+acc", oAgrMF_AccUtt.get(j).secondWord);
				second.put("o-mf+nomacc", oAgrMF_NomAccUtt.get(j).secondWord);
				second.put("o-mf+erg", oAgrMF_ErgUtt.get(j).secondWord);
				second.put("o-mf+abs", oAgrMF_AbsUtt.get(j).secondWord);
				second.put("o-mf+ergabs", oAgrMF_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-mfn", oAgrMFNUtt.get(j).secondWord);
				second.put("o-mfn+nom", oAgrMFN_NomUtt.get(j).secondWord);
				second.put("o-mfn+acc", oAgrMFN_AccUtt.get(j).secondWord);
				second.put("o-mfn+nomacc", oAgrMFN_NomAccUtt.get(j).secondWord);
				second.put("o-mfn+erg", oAgrMFN_ErgUtt.get(j).secondWord);
				second.put("o-mfn+abs", oAgrMFN_AbsUtt.get(j).secondWord);
				second.put("o-mfn+ergabs", oAgrMFN_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-cn", oAgrCNUtt.get(j).secondWord);
				second.put("o-cn+nom", oAgrCN_NomUtt.get(j).secondWord);
				second.put("o-cn+acc", oAgrCN_AccUtt.get(j).secondWord);
				second.put("o-cn+nomacc", oAgrCN_NomAccUtt.get(j).secondWord);
				second.put("o-cn+erg", oAgrCN_ErgUtt.get(j).secondWord);
				second.put("o-cn+abs", oAgrCN_AbsUtt.get(j).secondWord);
				second.put("o-cn+ergabs", oAgrCN_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-ai", oAgrAIUtt.get(j).secondWord);
				second.put("o-ai+nom", oAgrAI_NomUtt.get(j).secondWord);
				second.put("o-ai+acc", oAgrAI_AccUtt.get(j).secondWord);
				second.put("o-ai+nomacc", oAgrAI_NomAccUtt.get(j).secondWord);
				second.put("o-ai+erg", oAgrAI_ErgUtt.get(j).secondWord);
				second.put("o-ai+abs", oAgrAI_AbsUtt.get(j).secondWord);
				second.put("o-ai+ergabs", oAgrAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-hn", oAgrHNUtt.get(j).secondWord);
				second.put("o-hn+nom", oAgrHN_NomUtt.get(j).secondWord);
				second.put("o-hn+acc", oAgrHN_AccUtt.get(j).secondWord);
				second.put("o-hn+nomacc", oAgrHN_NomAccUtt.get(j).secondWord);
				second.put("o-hn+erg", oAgrHN_ErgUtt.get(j).secondWord);
				second.put("o-hn+abs", oAgrHN_AbsUtt.get(j).secondWord);
				second.put("o-hn+ergabs", oAgrHN_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-hai", oAgrHAIUtt.get(j).secondWord);
				second.put("o-hai+nom", oAgrHAI_NomUtt.get(j).secondWord);
				second.put("o-hai+acc", oAgrHAI_AccUtt.get(j).secondWord);
				second.put("o-hai+nomacc", oAgrHAI_NomAccUtt.get(j).secondWord);
				second.put("o-hai+erg", oAgrHAI_ErgUtt.get(j).secondWord);
				second.put("o-hai+abs", oAgrHAI_AbsUtt.get(j).secondWord);
				second.put("o-hai+ergabs", oAgrHAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-mnm", oAgrMNMUtt.get(j).secondWord);
				second.put("o-mnm+nom", oAgrMNM_NomUtt.get(j).secondWord);
				second.put("o-mnm+acc", oAgrMNM_AccUtt.get(j).secondWord);
				second.put("o-mnm+nomacc", oAgrMNM_NomAccUtt.get(j).secondWord);
				second.put("o-mnm+erg", oAgrMNM_ErgUtt.get(j).secondWord);
				second.put("o-mnm+abs", oAgrMNM_AbsUtt.get(j).secondWord);
				second.put("o-mnm+ergabs", oAgrMNM_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-mf", soAgrMFUtt.get(j).secondWord);
				second.put("so-mf+nom", soAgrMF_NomUtt.get(j).secondWord);
				second.put("so-mf+acc", soAgrMF_AccUtt.get(j).secondWord);
				second.put("so-mf+nomacc", soAgrMF_NomAccUtt.get(j).secondWord);
				second.put("so-mf+erg", soAgrMF_ErgUtt.get(j).secondWord);
				second.put("so-mf+abs", soAgrMF_AbsUtt.get(j).secondWord);
				second.put("so-mf+ergabs", soAgrMF_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-mfn", soAgrMFNUtt.get(j).secondWord);
				second.put("so-mfn+nom", soAgrMFN_NomUtt.get(j).secondWord);
				second.put("so-mfn+acc", soAgrMFN_AccUtt.get(j).secondWord);
				second.put("so-mfn+nomacc", soAgrMFN_NomAccUtt.get(j).secondWord);
				second.put("so-mfn+erg", soAgrMFN_ErgUtt.get(j).secondWord);
				second.put("so-mfn+abs", soAgrMFN_AbsUtt.get(j).secondWord);
				second.put("so-mfn+ergabs", soAgrMFN_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-cn", soAgrCNUtt.get(j).secondWord);
				second.put("so-cn+nom", soAgrCN_NomUtt.get(j).secondWord);
				second.put("so-cn+acc", soAgrCN_AccUtt.get(j).secondWord);
				second.put("so-cn+nomacc", soAgrCN_NomAccUtt.get(j).secondWord);
				second.put("so-cn+erg", soAgrCN_ErgUtt.get(j).secondWord);
				second.put("so-cn+abs", soAgrCN_AbsUtt.get(j).secondWord);
				second.put("so-cn+ergabs", soAgrCN_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-ai", soAgrAIUtt.get(j).secondWord);
				second.put("so-ai+nom", soAgrAI_NomUtt.get(j).secondWord);
				second.put("so-ai+acc", soAgrAI_AccUtt.get(j).secondWord);
				second.put("so-ai+nomacc", soAgrAI_NomAccUtt.get(j).secondWord);
				second.put("so-ai+erg", soAgrAI_ErgUtt.get(j).secondWord);
				second.put("so-ai+abs", soAgrAI_AbsUtt.get(j).secondWord);
				second.put("so-ai+ergabs", soAgrAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-hn", soAgrHNUtt.get(j).secondWord);
				second.put("so-hn+nom", soAgrHN_NomUtt.get(j).secondWord);
				second.put("so-hn+acc", soAgrHN_AccUtt.get(j).secondWord);
				second.put("so-hn+nomacc", soAgrHN_NomAccUtt.get(j).secondWord);
				second.put("so-hn+erg", soAgrHN_ErgUtt.get(j).secondWord);
				second.put("so-hn+abs", soAgrHN_AbsUtt.get(j).secondWord);
				second.put("so-hn+ergabs", soAgrHN_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-hai", soAgrHAIUtt.get(j).secondWord);
				second.put("so-hai+nom", soAgrHAI_NomUtt.get(j).secondWord);
				second.put("so-hai+acc", soAgrHAI_AccUtt.get(j).secondWord);
				second.put("so-hai+nomacc", soAgrHAI_NomAccUtt.get(j).secondWord);
				second.put("so-hai+erg", soAgrHAI_ErgUtt.get(j).secondWord);
				second.put("so-hai+abs", soAgrHAI_AbsUtt.get(j).secondWord);
				second.put("so-hai+ergabs", soAgrHAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-mnm", soAgrMNMUtt.get(j).secondWord);
				second.put("so-mnm+nom", soAgrMNM_NomUtt.get(j).secondWord);
				second.put("so-mnm+acc", soAgrMNM_AccUtt.get(j).secondWord);
				second.put("so-mnm+nomacc", soAgrMNM_NomAccUtt.get(j).secondWord);
				second.put("so-mnm+erg", soAgrMNM_ErgUtt.get(j).secondWord);
				second.put("so-mnm+abs", soAgrMNM_AbsUtt.get(j).secondWord);
				second.put("so-mnm+ergabs", soAgrMNM_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-123+sp+mf", sAgr123_SP_MFUtt.get(j).secondWord);
				second.put("s-123+sp+mf+nom", sAgr123_SP_MF_NomUtt.get(j).secondWord);
				second.put("s-123+sp+mf+acc", sAgr123_SP_MF_AccUtt.get(j).secondWord);
				second.put("s-123+sp+mf+nomacc", sAgr123_SP_MF_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+mf+erg", sAgr123_SP_MF_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+mf+abs", sAgr123_SP_MF_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+mf+ergabs", sAgr123_SP_MF_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-123+sp+mfn", sAgr123_SP_MFNUtt.get(j).secondWord);
				second.put("s-123+sp+mfn+nom", sAgr123_SP_MFN_NomUtt.get(j).secondWord);
				second.put("s-123+sp+mfn+acc", sAgr123_SP_MFN_AccUtt.get(j).secondWord);
				second.put("s-123+sp+mfn+nomacc", sAgr123_SP_MFN_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+mfn+erg", sAgr123_SP_MFN_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+mfn+abs", sAgr123_SP_MFN_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+mfn+ergabs", sAgr123_SP_MFN_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-123+sp+cn", sAgr123_SP_CNUtt.get(j).secondWord);
				second.put("s-123+sp+cn+nom", sAgr123_SP_CN_NomUtt.get(j).secondWord);
				second.put("s-123+sp+cn+acc", sAgr123_SP_CN_AccUtt.get(j).secondWord);
				second.put("s-123+sp+cn+nomacc", sAgr123_SP_CN_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+cn+erg", sAgr123_SP_CN_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+cn+abs", sAgr123_SP_CN_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+cn+ergabs", sAgr123_SP_CN_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-123+sp+ai", sAgr123_SP_AIUtt.get(j).secondWord);
				second.put("s-123+sp+ai+nom", sAgr123_SP_AI_NomUtt.get(j).secondWord);
				second.put("s-123+sp+ai+acc", sAgr123_SP_AI_AccUtt.get(j).secondWord);
				second.put("s-123+sp+ai+nomacc", sAgr123_SP_AI_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+ai+erg", sAgr123_SP_AI_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+ai+abs", sAgr123_SP_AI_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+ai+ergabs", sAgr123_SP_AI_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-123+sp+hn", sAgr123_SP_HNUtt.get(j).secondWord);
				second.put("s-123+sp+hn+nom", sAgr123_SP_HN_NomUtt.get(j).secondWord);
				second.put("s-123+sp+hn+acc", sAgr123_SP_HN_AccUtt.get(j).secondWord);
				second.put("s-123+sp+hn+nomacc", sAgr123_SP_HN_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+hn+erg", sAgr123_SP_HN_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+hn+abs", sAgr123_SP_HN_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+hn+ergabs", sAgr123_SP_HN_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-123+sp+hai", sAgr123_SP_HAIUtt.get(j).secondWord);
				second.put("s-123+sp+hai+nom", sAgr123_SP_HAI_NomUtt.get(j).secondWord);
				second.put("s-123+sp+hai+acc", sAgr123_SP_HAI_AccUtt.get(j).secondWord);
				second.put("s-123+sp+hai+nomacc", sAgr123_SP_HAI_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+hai+erg", sAgr123_SP_HAI_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+hai+abs", sAgr123_SP_HAI_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+hai+ergabs", sAgr123_SP_HAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("s-123+sp+mnm", sAgr123_SP_MNMUtt.get(j).secondWord);
				second.put("s-123+sp+mnm+nom", sAgr123_SP_MNM_NomUtt.get(j).secondWord);
				second.put("s-123+sp+mnm+acc", sAgr123_SP_MNM_AccUtt.get(j).secondWord);
				second.put("s-123+sp+mnm+nomacc", sAgr123_SP_MNM_NomAccUtt.get(j).secondWord);
				second.put("s-123+sp+mnm+erg", sAgr123_SP_MNM_ErgUtt.get(j).secondWord);
				second.put("s-123+sp+mnm+abs", sAgr123_SP_MNM_AbsUtt.get(j).secondWord);
				second.put("s-123+sp+mnm+ergabs", sAgr123_SP_MNM_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp+mf", oAgr123_SP_MFUtt.get(j).secondWord);
				second.put("o-123+sp+mf+nom", oAgr123_SP_MF_NomUtt.get(j).secondWord);
				second.put("o-123+sp+mf+acc", oAgr123_SP_MF_AccUtt.get(j).secondWord);
				second.put("o-123+sp+mf+nomacc", oAgr123_SP_MF_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+mf+erg", oAgr123_SP_MF_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+mf+abs", oAgr123_SP_MF_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+mf+ergabs", oAgr123_SP_MF_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp+mfn", oAgr123_SP_MFNUtt.get(j).secondWord);
				second.put("o-123+sp+mfn+nom", oAgr123_SP_MFN_NomUtt.get(j).secondWord);
				second.put("o-123+sp+mfn+acc", oAgr123_SP_MFN_AccUtt.get(j).secondWord);
				second.put("o-123+sp+mfn+nomacc", oAgr123_SP_MFN_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+mfn+erg", oAgr123_SP_MFN_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+mfn+abs", oAgr123_SP_MFN_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+mfn+ergabs", oAgr123_SP_MFN_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp+cn", oAgr123_SP_CNUtt.get(j).secondWord);
				second.put("o-123+sp+cn+nom", oAgr123_SP_CN_NomUtt.get(j).secondWord);
				second.put("o-123+sp+cn+acc", oAgr123_SP_CN_AccUtt.get(j).secondWord);
				second.put("o-123+sp+cn+nomacc", oAgr123_SP_CN_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+cn+erg", oAgr123_SP_CN_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+cn+abs", oAgr123_SP_CN_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+cn+ergabs", oAgr123_SP_CN_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp+ai", oAgr123_SP_AIUtt.get(j).secondWord);
				second.put("o-123+sp+ai+nom", oAgr123_SP_AI_NomUtt.get(j).secondWord);
				second.put("o-123+sp+ai+acc", oAgr123_SP_AI_AccUtt.get(j).secondWord);
				second.put("o-123+sp+ai+nomacc", oAgr123_SP_AI_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+ai+erg", oAgr123_SP_AI_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+ai+abs", oAgr123_SP_AI_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+ai+ergabs", oAgr123_SP_AI_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp+hn", oAgr123_SP_HNUtt.get(j).secondWord);
				second.put("o-123+sp+hn+nom", oAgr123_SP_HN_NomUtt.get(j).secondWord);
				second.put("o-123+sp+hn+acc", oAgr123_SP_HN_AccUtt.get(j).secondWord);
				second.put("o-123+sp+hn+nomacc", oAgr123_SP_HN_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+hn+erg", oAgr123_SP_HN_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+hn+abs", oAgr123_SP_HN_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+hn+ergabs", oAgr123_SP_HN_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp+hai", oAgr123_SP_HAIUtt.get(j).secondWord);
				second.put("o-123+sp+hai+nom", oAgr123_SP_HAI_NomUtt.get(j).secondWord);
				second.put("o-123+sp+hai+acc", oAgr123_SP_HAI_AccUtt.get(j).secondWord);
				second.put("o-123+sp+hai+nomacc", oAgr123_SP_HAI_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+hai+erg", oAgr123_SP_HAI_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+hai+abs", oAgr123_SP_HAI_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+hai+ergabs", oAgr123_SP_HAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("o-123+sp+mnm", oAgr123_SP_MNMUtt.get(j).secondWord);
				second.put("o-123+sp+mnm+nom", oAgr123_SP_MNM_NomUtt.get(j).secondWord);
				second.put("o-123+sp+mnm+acc", oAgr123_SP_MNM_AccUtt.get(j).secondWord);
				second.put("o-123+sp+mnm+nomacc", oAgr123_SP_MNM_NomAccUtt.get(j).secondWord);
				second.put("o-123+sp+mnm+erg", oAgr123_SP_MNM_ErgUtt.get(j).secondWord);
				second.put("o-123+sp+mnm+abs", oAgr123_SP_MNM_AbsUtt.get(j).secondWord);
				second.put("o-123+sp+mnm+ergabs", oAgr123_SP_MNM_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp+mf", soAgr123_SP_MFUtt.get(j).secondWord);
				second.put("so-123+sp+mf+nom", soAgr123_SP_MF_NomUtt.get(j).secondWord);
				second.put("so-123+sp+mf+acc", soAgr123_SP_MF_AccUtt.get(j).secondWord);
				second.put("so-123+sp+mf+nomacc", soAgr123_SP_MF_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+mf+erg", soAgr123_SP_MF_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+mf+abs", soAgr123_SP_MF_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+mf+ergabs", soAgr123_SP_MF_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp+mfn", soAgr123_SP_MFNUtt.get(j).secondWord);
				second.put("so-123+sp+mfn+nom", soAgr123_SP_MFN_NomUtt.get(j).secondWord);
				second.put("so-123+sp+mfn+acc", soAgr123_SP_MFN_AccUtt.get(j).secondWord);
				second.put("so-123+sp+mfn+nomacc", soAgr123_SP_MFN_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+mfn+erg", soAgr123_SP_MFN_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+mfn+abs", soAgr123_SP_MFN_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+mfn+ergabs", soAgr123_SP_MFN_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp+cn", soAgr123_SP_CNUtt.get(j).secondWord);
				second.put("so-123+sp+cn+nom", soAgr123_SP_CN_NomUtt.get(j).secondWord);
				second.put("so-123+sp+cn+acc", soAgr123_SP_CN_AccUtt.get(j).secondWord);
				second.put("so-123+sp+cn+nomacc", soAgr123_SP_CN_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+cn+erg", soAgr123_SP_CN_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+cn+abs", soAgr123_SP_CN_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+cn+ergabs", soAgr123_SP_CN_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp+ai", soAgr123_SP_AIUtt.get(j).secondWord);
				second.put("so-123+sp+ai+nom", soAgr123_SP_AI_NomUtt.get(j).secondWord);
				second.put("so-123+sp+ai+acc", soAgr123_SP_AI_AccUtt.get(j).secondWord);
				second.put("so-123+sp+ai+nomacc", soAgr123_SP_AI_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+ai+erg", soAgr123_SP_AI_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+ai+abs", soAgr123_SP_AI_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+ai+ergabs", soAgr123_SP_AI_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp+hn", soAgr123_SP_HNUtt.get(j).secondWord);
				second.put("so-123+sp+hn+nom", soAgr123_SP_HN_NomUtt.get(j).secondWord);
				second.put("so-123+sp+hn+acc", soAgr123_SP_HN_AccUtt.get(j).secondWord);
				second.put("so-123+sp+hn+nomacc", soAgr123_SP_HN_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+hn+erg", soAgr123_SP_HN_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+hn+abs", soAgr123_SP_HN_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+hn+ergabs", soAgr123_SP_HN_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp+hai", soAgr123_SP_HAIUtt.get(j).secondWord);
				second.put("so-123+sp+hai+nom", soAgr123_SP_HAI_NomUtt.get(j).secondWord);
				second.put("so-123+sp+hai+acc", soAgr123_SP_HAI_AccUtt.get(j).secondWord);
				second.put("so-123+sp+hai+nomacc", soAgr123_SP_HAI_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+hai+erg", soAgr123_SP_HAI_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+hai+abs", soAgr123_SP_HAI_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+hai+ergabs", soAgr123_SP_HAI_ErgAbsUtt.get(j).secondWord);
				
				second.put("so-123+sp+mnm", soAgr123_SP_MNMUtt.get(j).secondWord);
				second.put("so-123+sp+mnm+nom", soAgr123_SP_MNM_NomUtt.get(j).secondWord);
				second.put("so-123+sp+mnm+acc", soAgr123_SP_MNM_AccUtt.get(j).secondWord);
				second.put("so-123+sp+mnm+nomacc", soAgr123_SP_MNM_NomAccUtt.get(j).secondWord);
				second.put("so-123+sp+mnm+erg", soAgr123_SP_MNM_ErgUtt.get(j).secondWord);
				second.put("so-123+sp+mnm+abs", soAgr123_SP_MNM_AbsUtt.get(j).secondWord);
				second.put("so-123+sp+mnm+ergabs", soAgr123_SP_MNM_ErgAbsUtt.get(j).secondWord);
				
				HashMap<String, Word> third = new HashMap<>();
				third.put("caseless", utt.get(j).thirdWord);
				third.put("nom", nomUtt.get(j).thirdWord);
				third.put("acc", accUtt.get(j).thirdWord);
				third.put("nomacc", nomAccUtt.get(j).thirdWord);
				third.put("erg", ergUtt.get(j).thirdWord);
				third.put("abs", absUtt.get(j).thirdWord);
				third.put("ergabs", ergAbsUtt.get(j).thirdWord);
				
				third.put("s-123", sAgr123Utt.get(j).thirdWord);
//				third.put("s-we", sAgrWeUtt.get(j).thirdWord);
				
				third.put("o-123", oAgr123Utt.get(j).thirdWord);
//				third.put("o-we", oAgrWeUtt.get(j).thirdWord);
				
				third.put("so-123", soAgr123Utt.get(j).thirdWord);
//				third.put("so-we", soAgrWeUtt.get(j).thirdWord);
				
				third.put("s-sp", sAgrSPUtt.get(j).thirdWord);
				third.put("o-sp", oAgrSPUtt.get(j).thirdWord);
				third.put("so-sp", soAgrSPUtt.get(j).thirdWord);
				
				third.put("s-123+sp", sAgr123_SPUtt.get(j).thirdWord);
				third.put("s-123+sp+nom", sAgr123_SP_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+acc", sAgr123_SP_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+nomacc", sAgr123_SP_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+erg", sAgr123_SP_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+abs", sAgr123_SP_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+ergabs", sAgr123_SP_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp", oAgr123_SPUtt.get(j).thirdWord);
				third.put("o-123+sp+nom", oAgr123_SP_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+acc", oAgr123_SP_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+nomacc", oAgr123_SP_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+erg", oAgr123_SP_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+abs", oAgr123_SP_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+ergabs", oAgr123_SP_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp", soAgr123_SPUtt.get(j).thirdWord);
				third.put("so-123+sp+nom", soAgr123_SP_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+acc", soAgr123_SP_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+nomacc", soAgr123_SP_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+erg", soAgr123_SP_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+abs", soAgr123_SP_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+ergabs", soAgr123_SP_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-mf", sAgrMFUtt.get(j).thirdWord);
				third.put("s-mf+nom", sAgrMF_NomUtt.get(j).thirdWord);
				third.put("s-mf+acc", sAgrMF_AccUtt.get(j).thirdWord);
				third.put("s-mf+nomacc", sAgrMF_NomAccUtt.get(j).thirdWord);
				third.put("s-mf+erg", sAgrMF_ErgUtt.get(j).thirdWord);
				third.put("s-mf+abs", sAgrMF_AbsUtt.get(j).thirdWord);
				third.put("s-mf+ergabs", sAgrMF_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-mfn", sAgrMFNUtt.get(j).thirdWord);
				third.put("s-mfn+nom", sAgrMFN_NomUtt.get(j).thirdWord);
				third.put("s-mfn+acc", sAgrMFN_AccUtt.get(j).thirdWord);
				third.put("s-mfn+nomacc", sAgrMFN_NomAccUtt.get(j).thirdWord);
				third.put("s-mfn+erg", sAgrMFN_ErgUtt.get(j).thirdWord);
				third.put("s-mfn+abs", sAgrMFN_AbsUtt.get(j).thirdWord);
				third.put("s-mfn+ergabs", sAgrMFN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-cn", sAgrCNUtt.get(j).thirdWord);
				third.put("s-cn+nom", sAgrCN_NomUtt.get(j).thirdWord);
				third.put("s-cn+acc", sAgrCN_AccUtt.get(j).thirdWord);
				third.put("s-cn+nomacc", sAgrCN_NomAccUtt.get(j).thirdWord);
				third.put("s-cn+erg", sAgrCN_ErgUtt.get(j).thirdWord);
				third.put("s-cn+abs", sAgrCN_AbsUtt.get(j).thirdWord);
				third.put("s-cn+ergabs", sAgrCN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-ai", sAgrAIUtt.get(j).thirdWord);
				third.put("s-ai+nom", sAgrAI_NomUtt.get(j).thirdWord);
				third.put("s-ai+acc", sAgrAI_AccUtt.get(j).thirdWord);
				third.put("s-ai+nomacc", sAgrAI_NomAccUtt.get(j).thirdWord);
				third.put("s-ai+erg", sAgrAI_ErgUtt.get(j).thirdWord);
				third.put("s-ai+abs", sAgrAI_AbsUtt.get(j).thirdWord);
				third.put("s-ai+ergabs", sAgrAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-hn", sAgrHNUtt.get(j).thirdWord);
				third.put("s-hn+nom", sAgrHN_NomUtt.get(j).thirdWord);
				third.put("s-hn+acc", sAgrHN_AccUtt.get(j).thirdWord);
				third.put("s-hn+nomacc", sAgrHN_NomAccUtt.get(j).thirdWord);
				third.put("s-hn+erg", sAgrHN_ErgUtt.get(j).thirdWord);
				third.put("s-hn+abs", sAgrHN_AbsUtt.get(j).thirdWord);
				third.put("s-hn+ergabs", sAgrHN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-hai", sAgrHAIUtt.get(j).thirdWord);
				third.put("s-hai+nom", sAgrHAI_NomUtt.get(j).thirdWord);
				third.put("s-hai+acc", sAgrHAI_AccUtt.get(j).thirdWord);
				third.put("s-hai+nomacc", sAgrHAI_NomAccUtt.get(j).thirdWord);
				third.put("s-hai+erg", sAgrHAI_ErgUtt.get(j).thirdWord);
				third.put("s-hai+abs", sAgrHAI_AbsUtt.get(j).thirdWord);
				third.put("s-hai+ergabs", sAgrHAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-mnm", sAgrMNMUtt.get(j).thirdWord);
				third.put("s-mnm+nom", sAgrMNM_NomUtt.get(j).thirdWord);
				third.put("s-mnm+acc", sAgrMNM_AccUtt.get(j).thirdWord);
				third.put("s-mnm+nomacc", sAgrMNM_NomAccUtt.get(j).thirdWord);
				third.put("s-mnm+erg", sAgrMNM_ErgUtt.get(j).thirdWord);
				third.put("s-mnm+abs", sAgrMNM_AbsUtt.get(j).thirdWord);
				third.put("s-mnm+ergabs", sAgrMNM_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-mf", oAgrMFUtt.get(j).thirdWord);
				third.put("o-mf+nom", oAgrMF_NomUtt.get(j).thirdWord);
				third.put("o-mf+acc", oAgrMF_AccUtt.get(j).thirdWord);
				third.put("o-mf+nomacc", oAgrMF_NomAccUtt.get(j).thirdWord);
				third.put("o-mf+erg", oAgrMF_ErgUtt.get(j).thirdWord);
				third.put("o-mf+abs", oAgrMF_AbsUtt.get(j).thirdWord);
				third.put("o-mf+ergabs", oAgrMF_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-mfn", oAgrMFNUtt.get(j).thirdWord);
				third.put("o-mfn+nom", oAgrMFN_NomUtt.get(j).thirdWord);
				third.put("o-mfn+acc", oAgrMFN_AccUtt.get(j).thirdWord);
				third.put("o-mfn+nomacc", oAgrMFN_NomAccUtt.get(j).thirdWord);
				third.put("o-mfn+erg", oAgrMFN_ErgUtt.get(j).thirdWord);
				third.put("o-mfn+abs", oAgrMFN_AbsUtt.get(j).thirdWord);
				third.put("o-mfn+ergabs", oAgrMFN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-cn", oAgrCNUtt.get(j).thirdWord);
				third.put("o-cn+nom", oAgrCN_NomUtt.get(j).thirdWord);
				third.put("o-cn+acc", oAgrCN_AccUtt.get(j).thirdWord);
				third.put("o-cn+nomacc", oAgrCN_NomAccUtt.get(j).thirdWord);
				third.put("o-cn+erg", oAgrCN_ErgUtt.get(j).thirdWord);
				third.put("o-cn+abs", oAgrCN_AbsUtt.get(j).thirdWord);
				third.put("o-cn+ergabs", oAgrCN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-ai", oAgrAIUtt.get(j).thirdWord);
				third.put("o-ai+nom", oAgrAI_NomUtt.get(j).thirdWord);
				third.put("o-ai+acc", oAgrAI_AccUtt.get(j).thirdWord);
				third.put("o-ai+nomacc", oAgrAI_NomAccUtt.get(j).thirdWord);
				third.put("o-ai+erg", oAgrAI_ErgUtt.get(j).thirdWord);
				third.put("o-ai+abs", oAgrAI_AbsUtt.get(j).thirdWord);
				third.put("o-ai+ergabs", oAgrAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-hn", oAgrHNUtt.get(j).thirdWord);
				third.put("o-hn+nom", oAgrHN_NomUtt.get(j).thirdWord);
				third.put("o-hn+acc", oAgrHN_AccUtt.get(j).thirdWord);
				third.put("o-hn+nomacc", oAgrHN_NomAccUtt.get(j).thirdWord);
				third.put("o-hn+erg", oAgrHN_ErgUtt.get(j).thirdWord);
				third.put("o-hn+abs", oAgrHN_AbsUtt.get(j).thirdWord);
				third.put("o-hn+ergabs", oAgrHN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-hai", oAgrHAIUtt.get(j).thirdWord);
				third.put("o-hai+nom", oAgrHAI_NomUtt.get(j).thirdWord);
				third.put("o-hai+acc", oAgrHAI_AccUtt.get(j).thirdWord);
				third.put("o-hai+nomacc", oAgrHAI_NomAccUtt.get(j).thirdWord);
				third.put("o-hai+erg", oAgrHAI_ErgUtt.get(j).thirdWord);
				third.put("o-hai+abs", oAgrHAI_AbsUtt.get(j).thirdWord);
				third.put("o-hai+ergabs", oAgrHAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-mnm", oAgrMNMUtt.get(j).thirdWord);
				third.put("o-mnm+nom", oAgrMNM_NomUtt.get(j).thirdWord);
				third.put("o-mnm+acc", oAgrMNM_AccUtt.get(j).thirdWord);
				third.put("o-mnm+nomacc", oAgrMNM_NomAccUtt.get(j).thirdWord);
				third.put("o-mnm+erg", oAgrMNM_ErgUtt.get(j).thirdWord);
				third.put("o-mnm+abs", oAgrMNM_AbsUtt.get(j).thirdWord);
				third.put("o-mnm+ergabs", oAgrMNM_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-mf", soAgrMFUtt.get(j).thirdWord);
				third.put("so-mf+nom", soAgrMF_NomUtt.get(j).thirdWord);
				third.put("so-mf+acc", soAgrMF_AccUtt.get(j).thirdWord);
				third.put("so-mf+nomacc", soAgrMF_NomAccUtt.get(j).thirdWord);
				third.put("so-mf+erg", soAgrMF_ErgUtt.get(j).thirdWord);
				third.put("so-mf+abs", soAgrMF_AbsUtt.get(j).thirdWord);
				third.put("so-mf+ergabs", soAgrMF_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-mfn", soAgrMFNUtt.get(j).thirdWord);
				third.put("so-mfn+nom", soAgrMFN_NomUtt.get(j).thirdWord);
				third.put("so-mfn+acc", soAgrMFN_AccUtt.get(j).thirdWord);
				third.put("so-mfn+nomacc", soAgrMFN_NomAccUtt.get(j).thirdWord);
				third.put("so-mfn+erg", soAgrMFN_ErgUtt.get(j).thirdWord);
				third.put("so-mfn+abs", soAgrMFN_AbsUtt.get(j).thirdWord);
				third.put("so-mfn+ergabs", soAgrMFN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-cn", soAgrCNUtt.get(j).thirdWord);
				third.put("so-cn+nom", soAgrCN_NomUtt.get(j).thirdWord);
				third.put("so-cn+acc", soAgrCN_AccUtt.get(j).thirdWord);
				third.put("so-cn+nomacc", soAgrCN_NomAccUtt.get(j).thirdWord);
				third.put("so-cn+erg", soAgrCN_ErgUtt.get(j).thirdWord);
				third.put("so-cn+abs", soAgrCN_AbsUtt.get(j).thirdWord);
				third.put("so-cn+ergabs", soAgrCN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-ai", soAgrAIUtt.get(j).thirdWord);
				third.put("so-ai+nom", soAgrAI_NomUtt.get(j).thirdWord);
				third.put("so-ai+acc", soAgrAI_AccUtt.get(j).thirdWord);
				third.put("so-ai+nomacc", soAgrAI_NomAccUtt.get(j).thirdWord);
				third.put("so-ai+erg", soAgrAI_ErgUtt.get(j).thirdWord);
				third.put("so-ai+abs", soAgrAI_AbsUtt.get(j).thirdWord);
				third.put("so-ai+ergabs", soAgrAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-hn", soAgrHNUtt.get(j).thirdWord);
				third.put("so-hn+nom", soAgrHN_NomUtt.get(j).thirdWord);
				third.put("so-hn+acc", soAgrHN_AccUtt.get(j).thirdWord);
				third.put("so-hn+nomacc", soAgrHN_NomAccUtt.get(j).thirdWord);
				third.put("so-hn+erg", soAgrHN_ErgUtt.get(j).thirdWord);
				third.put("so-hn+abs", soAgrHN_AbsUtt.get(j).thirdWord);
				third.put("so-hn+ergabs", soAgrHN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-hai", soAgrHAIUtt.get(j).thirdWord);
				third.put("so-hai+nom", soAgrHAI_NomUtt.get(j).thirdWord);
				third.put("so-hai+acc", soAgrHAI_AccUtt.get(j).thirdWord);
				third.put("so-hai+nomacc", soAgrHAI_NomAccUtt.get(j).thirdWord);
				third.put("so-hai+erg", soAgrHAI_ErgUtt.get(j).thirdWord);
				third.put("so-hai+abs", soAgrHAI_AbsUtt.get(j).thirdWord);
				third.put("so-hai+ergabs", soAgrHAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-mnm", soAgrMNMUtt.get(j).thirdWord);
				third.put("so-mnm+nom", soAgrMNM_NomUtt.get(j).thirdWord);
				third.put("so-mnm+acc", soAgrMNM_AccUtt.get(j).thirdWord);
				third.put("so-mnm+nomacc", soAgrMNM_NomAccUtt.get(j).thirdWord);
				third.put("so-mnm+erg", soAgrMNM_ErgUtt.get(j).thirdWord);
				third.put("so-mnm+abs", soAgrMNM_AbsUtt.get(j).thirdWord);
				third.put("so-mnm+ergabs", soAgrMNM_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-123+sp+mf", sAgr123_SP_MFUtt.get(j).thirdWord);
				third.put("s-123+sp+mf+nom", sAgr123_SP_MF_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+mf+acc", sAgr123_SP_MF_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+mf+nomacc", sAgr123_SP_MF_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+mf+erg", sAgr123_SP_MF_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+mf+abs", sAgr123_SP_MF_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+mf+ergabs", sAgr123_SP_MF_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-123+sp+mfn", sAgr123_SP_MFNUtt.get(j).thirdWord);
				third.put("s-123+sp+mfn+nom", sAgr123_SP_MFN_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+mfn+acc", sAgr123_SP_MFN_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+mfn+nomacc", sAgr123_SP_MFN_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+mfn+erg", sAgr123_SP_MFN_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+mfn+abs", sAgr123_SP_MFN_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+mfn+ergabs", sAgr123_SP_MFN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-123+sp+cn", sAgr123_SP_CNUtt.get(j).thirdWord);
				third.put("s-123+sp+cn+nom", sAgr123_SP_CN_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+cn+acc", sAgr123_SP_CN_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+cn+nomacc", sAgr123_SP_CN_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+cn+erg", sAgr123_SP_CN_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+cn+abs", sAgr123_SP_CN_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+cn+ergabs", sAgr123_SP_CN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-123+sp+ai", sAgr123_SP_AIUtt.get(j).thirdWord);
				third.put("s-123+sp+ai+nom", sAgr123_SP_AI_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+ai+acc", sAgr123_SP_AI_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+ai+nomacc", sAgr123_SP_AI_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+ai+erg", sAgr123_SP_AI_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+ai+abs", sAgr123_SP_AI_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+ai+ergabs", sAgr123_SP_AI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-123+sp+hn", sAgr123_SP_HNUtt.get(j).thirdWord);
				third.put("s-123+sp+hn+nom", sAgr123_SP_HN_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+hn+acc", sAgr123_SP_HN_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+hn+nomacc", sAgr123_SP_HN_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+hn+erg", sAgr123_SP_HN_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+hn+abs", sAgr123_SP_HN_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+hn+ergabs", sAgr123_SP_HN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-123+sp+hai", sAgr123_SP_HAIUtt.get(j).thirdWord);
				third.put("s-123+sp+hai+nom", sAgr123_SP_HAI_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+hai+acc", sAgr123_SP_HAI_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+hai+nomacc", sAgr123_SP_HAI_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+hai+erg", sAgr123_SP_HAI_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+hai+abs", sAgr123_SP_HAI_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+hai+ergabs", sAgr123_SP_HAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("s-123+sp+mnm", sAgr123_SP_MNMUtt.get(j).thirdWord);
				third.put("s-123+sp+mnm+nom", sAgr123_SP_MNM_NomUtt.get(j).thirdWord);
				third.put("s-123+sp+mnm+acc", sAgr123_SP_MNM_AccUtt.get(j).thirdWord);
				third.put("s-123+sp+mnm+nomacc", sAgr123_SP_MNM_NomAccUtt.get(j).thirdWord);
				third.put("s-123+sp+mnm+erg", sAgr123_SP_MNM_ErgUtt.get(j).thirdWord);
				third.put("s-123+sp+mnm+abs", sAgr123_SP_MNM_AbsUtt.get(j).thirdWord);
				third.put("s-123+sp+mnm+ergabs", sAgr123_SP_MNM_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp+mf", oAgr123_SP_MFUtt.get(j).thirdWord);
				third.put("o-123+sp+mf+nom", oAgr123_SP_MF_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+mf+acc", oAgr123_SP_MF_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+mf+nomacc", oAgr123_SP_MF_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+mf+erg", oAgr123_SP_MF_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+mf+abs", oAgr123_SP_MF_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+mf+ergabs", oAgr123_SP_MF_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp+mfn", oAgr123_SP_MFNUtt.get(j).thirdWord);
				third.put("o-123+sp+mfn+nom", oAgr123_SP_MFN_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+mfn+acc", oAgr123_SP_MFN_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+mfn+nomacc", oAgr123_SP_MFN_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+mfn+erg", oAgr123_SP_MFN_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+mfn+abs", oAgr123_SP_MFN_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+mfn+ergabs", oAgr123_SP_MFN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp+cn", oAgr123_SP_CNUtt.get(j).thirdWord);
				third.put("o-123+sp+cn+nom", oAgr123_SP_CN_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+cn+acc", oAgr123_SP_CN_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+cn+nomacc", oAgr123_SP_CN_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+cn+erg", oAgr123_SP_CN_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+cn+abs", oAgr123_SP_CN_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+cn+ergabs", oAgr123_SP_CN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp+ai", oAgr123_SP_AIUtt.get(j).thirdWord);
				third.put("o-123+sp+ai+nom", oAgr123_SP_AI_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+ai+acc", oAgr123_SP_AI_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+ai+nomacc", oAgr123_SP_AI_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+ai+erg", oAgr123_SP_AI_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+ai+abs", oAgr123_SP_AI_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+ai+ergabs", oAgr123_SP_AI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp+hn", oAgr123_SP_HNUtt.get(j).thirdWord);
				third.put("o-123+sp+hn+nom", oAgr123_SP_HN_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+hn+acc", oAgr123_SP_HN_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+hn+nomacc", oAgr123_SP_HN_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+hn+erg", oAgr123_SP_HN_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+hn+abs", oAgr123_SP_HN_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+hn+ergabs", oAgr123_SP_HN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp+hai", oAgr123_SP_HAIUtt.get(j).thirdWord);
				third.put("o-123+sp+hai+nom", oAgr123_SP_HAI_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+hai+acc", oAgr123_SP_HAI_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+hai+nomacc", oAgr123_SP_HAI_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+hai+erg", oAgr123_SP_HAI_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+hai+abs", oAgr123_SP_HAI_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+hai+ergabs", oAgr123_SP_HAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("o-123+sp+mnm", oAgr123_SP_MNMUtt.get(j).thirdWord);
				third.put("o-123+sp+mnm+nom", oAgr123_SP_MNM_NomUtt.get(j).thirdWord);
				third.put("o-123+sp+mnm+acc", oAgr123_SP_MNM_AccUtt.get(j).thirdWord);
				third.put("o-123+sp+mnm+nomacc", oAgr123_SP_MNM_NomAccUtt.get(j).thirdWord);
				third.put("o-123+sp+mnm+erg", oAgr123_SP_MNM_ErgUtt.get(j).thirdWord);
				third.put("o-123+sp+mnm+abs", oAgr123_SP_MNM_AbsUtt.get(j).thirdWord);
				third.put("o-123+sp+mnm+ergabs", oAgr123_SP_MNM_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp+mf", soAgr123_SP_MFUtt.get(j).thirdWord);
				third.put("so-123+sp+mf+nom", soAgr123_SP_MF_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+mf+acc", soAgr123_SP_MF_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+mf+nomacc", soAgr123_SP_MF_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+mf+erg", soAgr123_SP_MF_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+mf+abs", soAgr123_SP_MF_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+mf+ergabs", soAgr123_SP_MF_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp+mfn", soAgr123_SP_MFNUtt.get(j).thirdWord);
				third.put("so-123+sp+mfn+nom", soAgr123_SP_MFN_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+mfn+acc", soAgr123_SP_MFN_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+mfn+nomacc", soAgr123_SP_MFN_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+mfn+erg", soAgr123_SP_MFN_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+mfn+abs", soAgr123_SP_MFN_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+mfn+ergabs", soAgr123_SP_MFN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp+cn", soAgr123_SP_CNUtt.get(j).thirdWord);
				third.put("so-123+sp+cn+nom", soAgr123_SP_CN_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+cn+acc", soAgr123_SP_CN_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+cn+nomacc", soAgr123_SP_CN_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+cn+erg", soAgr123_SP_CN_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+cn+abs", soAgr123_SP_CN_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+cn+ergabs", soAgr123_SP_CN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp+ai", soAgr123_SP_AIUtt.get(j).thirdWord);
				third.put("so-123+sp+ai+nom", soAgr123_SP_AI_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+ai+acc", soAgr123_SP_AI_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+ai+nomacc", soAgr123_SP_AI_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+ai+erg", soAgr123_SP_AI_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+ai+abs", soAgr123_SP_AI_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+ai+ergabs", soAgr123_SP_AI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp+hn", soAgr123_SP_HNUtt.get(j).thirdWord);
				third.put("so-123+sp+hn+nom", soAgr123_SP_HN_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+hn+acc", soAgr123_SP_HN_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+hn+nomacc", soAgr123_SP_HN_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+hn+erg", soAgr123_SP_HN_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+hn+abs", soAgr123_SP_HN_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+hn+ergabs", soAgr123_SP_HN_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp+hai", soAgr123_SP_HAIUtt.get(j).thirdWord);
				third.put("so-123+sp+hai+nom", soAgr123_SP_HAI_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+hai+acc", soAgr123_SP_HAI_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+hai+nomacc", soAgr123_SP_HAI_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+hai+erg", soAgr123_SP_HAI_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+hai+abs", soAgr123_SP_HAI_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+hai+ergabs", soAgr123_SP_HAI_ErgAbsUtt.get(j).thirdWord);
				
				third.put("so-123+sp+mnm", soAgr123_SP_MNMUtt.get(j).thirdWord);
				third.put("so-123+sp+mnm+nom", soAgr123_SP_MNM_NomUtt.get(j).thirdWord);
				third.put("so-123+sp+mnm+acc", soAgr123_SP_MNM_AccUtt.get(j).thirdWord);
				third.put("so-123+sp+mnm+nomacc", soAgr123_SP_MNM_NomAccUtt.get(j).thirdWord);
				third.put("so-123+sp+mnm+erg", soAgr123_SP_MNM_ErgUtt.get(j).thirdWord);
				third.put("so-123+sp+mnm+abs", soAgr123_SP_MNM_AbsUtt.get(j).thirdWord);
				third.put("so-123+sp+mnm+ergabs", soAgr123_SP_MNM_ErgAbsUtt.get(j).thirdWord);
				
				switch(j) {
//-----------------------------------------------------------------------------------------------------------------------------//
//------SVO----------------------------------------------------------------------------------------------------------------------//
				case 0:	
				{
					svoTest.first = first;
					svoTest.second = second;
					svoTest.third = third;
					svoTest.calculate(events, ev, lexicons);
					
					ideal.count++;
					BigDecimal twoThirds = BigDecimal.valueOf(2.0);
					twoThirds = twoThirds.divide(BigDecimal.valueOf(3.0), MathContext.DECIMAL128);
					ideal.eta1.add(etaNought.multiply(twoThirds));
					ideal.eventProbs.add(ev.probability);
					BigDecimal oneThird = BigDecimal.valueOf(1.0);
					oneThird = oneThird.divide(BigDecimal.valueOf(3.0), MathContext.DECIMAL128);
					ideal.eta2.add(etaNought.multiply(oneThird));
				}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----SOV---------------------------------------------------------------------------------------------------------------------//
				case 1:
				{
					sovTest.first = first;
					sovTest.second = second;
					sovTest.third = third;
					sovTest.calculate(events, ev, lexicons);
				}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----VSO---------------------------------------------------------------------------------------------------------------------//
				case 2:
				{
					vsoTest.first = first;
					vsoTest.second = second;
					vsoTest.third = third;
					vsoTest.calculate(events, ev, lexicons);					
				}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----VOS---------------------------------------------------------------------------------------------------------------------//
				case 3:
				{
					vosTest.first = first;
					vosTest.second = second;
					vosTest.third = third;
					vosTest.calculate(events, ev, lexicons);
				}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----OSV---------------------------------------------------------------------------------------------------------------------//
				case 4:
				{
					osvTest.first = first;
					osvTest.second = second;
					osvTest.third = third;
					osvTest.calculate(events, ev, lexicons);				
				}
				break;
//----------------------------------------------------------------------------------------------------------------------------//
//-----OVS--------------------------------------------------------------------------------------------------------------------//
				case 5:
				{
					ovsTest.first = first;
					ovsTest.second = second;
					ovsTest.third = third;
					ovsTest.calculate(events, ev, lexicons);
				}
					break;
				default:
					break;
				}
			}
		}
		
		ideal.calcEntTraj();
		ideal.calcInfoProfiles(etaNought);
		svoTest.calcSummaryStats(etaNought);
		sovTest.calcSummaryStats(etaNought);
		vsoTest.calcSummaryStats(etaNought);
		vosTest.calcSummaryStats(etaNought);
		osvTest.calcSummaryStats(etaNought);
		ovsTest.calcSummaryStats(etaNought);
		BigDecimal[] idealDevScore = ideal.calcMeanDevScore(etaNought);
		
		System.out.println("ideal stats -\n"+
				" count: " + ideal.count + "\n" +
				" mean h1: " + ideal.aveEta1().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h1 std dev: " + ideal.calcEta1StdDev().doubleValue() + "\n" +
				" mean h2: " + ideal.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h2 std dev: " + ideal.calcEta2StdDev().doubleValue() + "\n" +
				" mean i1: " + ideal.meanI1.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i1 std dev: " + ideal.i1StdDev.doubleValue() + "\n" +
				" mean i2: " + ideal.meanI2.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i2 std dev: " + ideal.i2StdDev.doubleValue() + "\n" +
				" mean i3: " + ideal.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i3 std dev: " + ideal.calcEta2StdDev().doubleValue() + "\n" +
				" deviation score: " + idealDevScore[0].doubleValue() + "\n" +
				" std dev of score: " + idealDevScore[1].doubleValue());
		
//		System.out.println("SVO erg stats -\n"+
//							" count: " + svoTest.svoSAgrMF.count + "\n" +
//							" mean h1: " + svoTest.svoSAgrMF.aveEta1().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h1 std dev: " + svoTest.svoSAgrMF.calcEta1StdDev().doubleValue() + "\n" +
//							" mean h2: " + svoTest.svoSAgrMF.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h2 std dev: " + svoTest.svoSAgrMF.calcEta2StdDev().doubleValue() + "\n" +
//							" mean i1: " + svoTest.svoSAgrMF.meanI1.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i1 std dev: " + svoTest.svoSAgrMF.i1StdDev.doubleValue() + "\n" +
//							" mean i2: " + svoTest.svoSAgrMF.meanI2.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i2 std dev: " + svoTest.svoSAgrMF.i2StdDev.doubleValue() + "\n" +
//							" mean i3: " + svoTest.svoSAgrMF.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i3 std dev: " + svoTest.svoSAgrMF.calcEta2StdDev().doubleValue() + "\n" +
//							" deviation score: " + svoTest.svoSAgrMF.meanDevScore + "\n" +
//							" std dev of score: " + svoTest.svoSAgrMF.devScoreStdDev);
//		
//		System.out.println("\nSOV erg stats -\n"+
//				" count: " + sovTest.sovSAgrMF.count + "\n" +
//				" mean h1: " + sovTest.sovSAgrMF.aveEta1().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h1 std dev: " + sovTest.sovSAgrMF.calcEta1StdDev().doubleValue() + "\n" +
//				" mean h2: " + sovTest.sovSAgrMF.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h2 std dev: " + sovTest.sovSAgrMF.calcEta2StdDev().doubleValue() + "\n" +
//				" mean i1: " + sovTest.sovSAgrMF.meanI1.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i1 std dev: " + sovTest.sovSAgrMF.i1StdDev.doubleValue() + "\n" +
//				" mean i2: " + sovTest.sovSAgrMF.meanI2.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i2 std dev: " + sovTest.sovSAgrMF.i2StdDev.doubleValue() + "\n" +
//				" mean i3: " + sovTest.sovSAgrMF.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i3 std dev: " + sovTest.sovSAgrMF.calcEta2StdDev().doubleValue() + "\n" +
//				" deviation score: " + sovTest.sovSAgrMF.meanDevScore + "\n" +
//				" std dev of score: " + sovTest.sovSAgrMF.devScoreStdDev);
//		
//		System.out.println("\nVSO erg stats -\n"+
//				" count: " + vsoTest.vsoSAgrMF.count + "\n" +
//				" mean h1: " + vsoTest.vsoSAgrMF.aveEta1().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h1 std dev: " + vsoTest.vsoSAgrMF.calcEta1StdDev().doubleValue() + "\n" +
//				" mean h2: " + vsoTest.vsoSAgrMF.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h2 std dev: " + vsoTest.vsoSAgrMF.calcEta2StdDev().doubleValue() + "\n" +
//				" mean i1: " + vsoTest.vsoSAgrMF.meanI1.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i1 std dev: " + vsoTest.vsoSAgrMF.i1StdDev.doubleValue() + "\n" +
//				" mean i2: " + vsoTest.vsoSAgrMF.meanI2.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i2 std dev: " + vsoTest.vsoSAgrMF.i2StdDev.doubleValue() + "\n" +
//				" mean i3: " + vsoTest.vsoSAgrMF.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i3 std dev: " + vsoTest.vsoSAgrMF.calcEta2StdDev().doubleValue() + "\n" +
//				" deviation score: " + vsoTest.vsoSAgrMF.meanDevScore + "\n" +
//				" std dev of score: " + vsoTest.vsoSAgrMF.devScoreStdDev);
//		
//		System.out.println("\nVOS erg stats -\n"+
//				" count: " + vosTest.vos.count + "\n" +
//				" mean h1: " + vosTest.vosErgOnly.aveEta1().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h1 std dev: " + vosTest.vosErgOnly.calcEta1StdDev().doubleValue() + "\n" +
//				" mean h2: " + vosTest.vosErgOnly.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h2 std dev: " + vosTest.vosErgOnly.calcEta2StdDev().doubleValue() + "\n" +
//				" mean i1: " + vosTest.vosErgOnly.meanI1.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i1 std dev: " + vosTest.vosErgOnly.i1StdDev.doubleValue() + "\n" +
//				" mean i2: " + vosTest.vosErgOnly.meanI2.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i2 std dev: " + vosTest.vosErgOnly.i2StdDev.doubleValue() + "\n" +
//				" mean i3: " + vosTest.vosErgOnly.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i3 std dev: " + vosTest.vosErgOnly.calcEta2StdDev().doubleValue() + "\n" +
//				" deviation score: " + vosTest.vosErgOnly.meanDevScore + "\n" +
//				" std dev of score: " + vosTest.vosErgOnly.devScoreStdDev);
//		
//		System.out.println("\nOVS mfn stats -\n"+
//				" count: " + ovsTest.ovsSAgrMFN.count + "\n" +
//				" mean h1: " + ovsTest.ovsSAgrMFN.aveEta1().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h1 std dev: " + ovsTest.ovsSAgrMFN.calcEta1StdDev().doubleValue() + "\n" +
//				" mean h2: " + ovsTest.ovsSAgrMFN.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h2 std dev: " + ovsTest.ovsSAgrMFN.calcEta2StdDev().doubleValue() + "\n" +
//				" mean i1: " + ovsTest.ovsSAgrMFN.meanI1.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i1 std dev: " + ovsTest.ovsSAgrMFN.i1StdDev.doubleValue() + "\n" +
//				" mean i2: " + ovsTest.ovsSAgrMFN.meanI2.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i2 std dev: " + ovsTest.ovsSAgrMFN.i2StdDev.doubleValue() + "\n" +
//				" mean i3: " + ovsTest.ovsSAgrMFN.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i3 std dev: " + ovsTest.ovsSAgrMFN.calcEta2StdDev().doubleValue() + "\n" +
//				" deviation score: " + ovsTest.ovsSAgrMFN.meanDevScore + "\n" +
//				" std dev of score: " + ovsTest.ovsSAgrMFN.devScoreStdDev);
//		
//		System.out.println("\nOSV mfn stats -\n"+
//				" count: " + osvTest.osvSAgrMFN.count + "\n" +
//				" mean h1: " + osvTest.osvSAgrMFN.aveEta1().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h1 std dev: " + osvTest.osvSAgrMFN.calcEta1StdDev().doubleValue() + "\n" +
//				" mean h2: " + osvTest.osvSAgrMFN.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " h2 std dev: " + osvTest.osvSAgrMFN.calcEta2StdDev().doubleValue() + "\n" +
//				" mean i1: " + osvTest.osvSAgrMFN.meanI1.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i1 std dev: " + osvTest.osvSAgrMFN.i1StdDev.doubleValue() + "\n" +
//				" mean i2: " + osvTest.osvSAgrMFN.meanI2.divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i2 std dev: " + osvTest.osvSAgrMFN.i2StdDev.doubleValue() + "\n" +
//				" mean i3: " + osvTest.osvSAgrMFN.aveEta2().divide(etaNought, MathContext.DECIMAL128).doubleValue() + " i3 std dev: " + osvTest.osvSAgrMFN.calcEta2StdDev().doubleValue() + "\n" +
//				" deviation score: " + osvTest.osvSAgrMFN.meanDevScore + "\n" +
//				" std dev of score: " + osvTest.osvSAgrMFN.devScoreStdDev);
		
		System.out.println("\nMaurits et al.: VSO > VOS > SVO > OVS > SOV > OSV");
		
		getStats(ideal, svoTest, sovTest, vsoTest, vosTest, osvTest, ovsTest);
		
		FileWriter csvWriter = new FileWriter("uid-output2-electric-boogaloo.csv");
		csvWriter.append("Event");
		csvWriter.append(",");
		csvWriter.append("Probability");
		csvWriter.append(",");
		csvWriter.append("Word Order");
		csvWriter.append(",");
		csvWriter.append("Eta1");
		csvWriter.append(",");
		csvWriter.append("Eta2");
		csvWriter.append(",");
		csvWriter.append("I1");
		csvWriter.append(",");
		csvWriter.append("I2");
		csvWriter.append(",");
		csvWriter.append("Deviation Score");
		csvWriter.append("\n");
		for(int k = 0; k < 40; k++) {
			if(events.get(k).probability > 0.0) {
				csvWriter.append(events.get(k).person + " " + events.get(k).action + " " + events.get(k).obj);
				csvWriter.append(",");
				csvWriter.append(String.valueOf(events.get(k).probability));
				csvWriter.append(",");
				csvWriter.append("SVO");
				csvWriter.append(",");
				csvWriter.append(String.valueOf(svoTest.svo.eta1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(svoTest.svo.eta2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(svoTest.svo.i1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(svoTest.svo.i2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(svoTest.svo.devScores.get(k)));
				csvWriter.append("\n");
				
				csvWriter.append(events.get(k).person + " " + events.get(k).action + " " + events.get(k).obj);
				csvWriter.append(",");
				csvWriter.append(String.valueOf(events.get(k).probability));
				csvWriter.append(",");
				csvWriter.append("SOV");
				csvWriter.append(",");
				csvWriter.append(String.valueOf(sovTest.sov.eta1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(sovTest.sov.eta2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(sovTest.sov.i1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(sovTest.sov.i2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(sovTest.sov.devScores.get(k)));
				csvWriter.append("\n");
				
				csvWriter.append(events.get(k).person + " " + events.get(k).action + " " + events.get(k).obj);
				csvWriter.append(",");
				csvWriter.append(String.valueOf(events.get(k).probability));
				csvWriter.append(",");
				csvWriter.append("VSO");
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vsoTest.vso.eta1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vsoTest.vso.eta2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vsoTest.vso.i1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vsoTest.vso.i2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vsoTest.vso.devScores.get(k)));
				csvWriter.append("\n");
				
				csvWriter.append(events.get(k).person + " " + events.get(k).action + " " + events.get(k).obj);
				csvWriter.append(",");
				csvWriter.append(String.valueOf(events.get(k).probability));
				csvWriter.append(",");
				csvWriter.append("VOS");
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vosTest.vos.eta1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vosTest.vos.eta2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vosTest.vos.i1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vosTest.vos.i2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(vosTest.vos.devScores.get(k)));
				csvWriter.append("\n");
				
				csvWriter.append(events.get(k).person + " " + events.get(k).action + " " + events.get(k).obj);
				csvWriter.append(",");
				csvWriter.append(String.valueOf(events.get(k).probability));
				csvWriter.append(",");
				csvWriter.append("OVS");
				csvWriter.append(",");
				csvWriter.append(String.valueOf(ovsTest.ovs.eta1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(ovsTest.ovs.eta2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(ovsTest.ovs.i1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(ovsTest.ovs.i2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(ovsTest.ovs.devScores.get(k)));
				csvWriter.append("\n");
				
				csvWriter.append(events.get(k).person + " " + events.get(k).action + " " + events.get(k).obj);
				csvWriter.append(",");
				csvWriter.append(String.valueOf(events.get(k).probability));
				csvWriter.append(",");
				csvWriter.append("OSV");
				csvWriter.append(",");
				csvWriter.append(String.valueOf(osvTest.osv.eta1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(osvTest.osv.eta2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(osvTest.osv.i1.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(osvTest.osv.i2.get(k)));
				csvWriter.append(",");
				csvWriter.append(String.valueOf(osvTest.osv.devScores.get(k)));
				csvWriter.append("\n");
			}
		}
		csvWriter.flush();
		csvWriter.close();
	}
	
	public static ArrayList<Event> genEvents() {
		ArrayList<Event> events = new ArrayList<>();
		// Set probabilities of alice eating things
		events.add(new Event(People.ALICE, Actions.EAT, Objects.APPLE, 0.05));
		events.add(new Event(People.ALICE, Actions.EAT, Objects.BREAD, 0.00));
		events.add(new Event(People.ALICE, Actions.EAT, Objects.CAKE, 0.03));
		events.add(new Event(People.ALICE, Actions.EAT, Objects.RICE, 0.02));
		// Set probabilities of alice drinking things
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.COFFEE, 0.07));
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.COLA, 0.03));
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.JUICE, 0.00));
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.WATER, 0.00));
		//
		//
		// Set probabilities of bob eating things
		events.add(new Event(People.BOB, Actions.EAT, Objects.APPLE, 0.02));
		events.add(new Event(People.BOB, Actions.EAT, Objects.BREAD, 0.00));
		events.add(new Event(People.BOB, Actions.EAT, Objects.CAKE, 0.04));
		events.add(new Event(People.BOB, Actions.EAT, Objects.RICE, 0.04));
		// Set probabilities of bob drinking things
		events.add(new Event(People.BOB, Actions.DRINK, Objects.COFFEE, 0.02));
		events.add(new Event(People.BOB, Actions.DRINK, Objects.COLA, 0.04));
		events.add(new Event(People.BOB, Actions.DRINK, Objects.JUICE, 0.02));
		events.add(new Event(People.BOB, Actions.DRINK, Objects.WATER, 0.02));
		//
		//
		// Set probabilities of eve eating things
		events.add(new Event(People.EVE, Actions.EAT, Objects.APPLE, 0.00));
		events.add(new Event(People.EVE, Actions.EAT, Objects.BREAD, 0.01));
		events.add(new Event(People.EVE, Actions.EAT, Objects.CAKE, 0.00));
		events.add(new Event(People.EVE, Actions.EAT, Objects.RICE, 0.09));
		// Set probabilities of eve drinking things
		events.add(new Event(People.EVE, Actions.DRINK, Objects.COFFEE, 0.03));
		events.add(new Event(People.EVE, Actions.DRINK, Objects.COLA, 0.01));
		events.add(new Event(People.EVE, Actions.DRINK, Objects.JUICE, 0.00));
		events.add(new Event(People.EVE, Actions.DRINK, Objects.WATER, 0.06));
		//
		//
		// Set probabilities of mallory eating things
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.APPLE, 0.04));
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.BREAD, 0.04));
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.CAKE, 0.01));
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.RICE, 0.01));
		// Set probabilities of mallory drinking things
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.COFFEE, 0.00));
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.COLA, 0.01));
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.JUICE, 0.09));
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.WATER, 0.00));
		//
		//
		// Set probabilities of trent eating things
		events.add(new Event(People.TRENT, Actions.EAT, Objects.APPLE, 0.02));
		events.add(new Event(People.TRENT, Actions.EAT, Objects.BREAD, 0.00));
		events.add(new Event(People.TRENT, Actions.EAT, Objects.CAKE, 0.01));
		events.add(new Event(People.TRENT, Actions.EAT, Objects.RICE, 0.07));
		// Set probabilities of trent drinking things
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.COFFEE, 0.02));
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.COLA, 0.03));
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.JUICE, 0.03));
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.WATER, 0.02));
		// 
		//
		// Set probabilities of impossible events to 0
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.APPLE, 0));
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.BREAD, 0));
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.CAKE, 0));
		events.add(new Event(People.ALICE, Actions.DRINK, Objects.RICE, 0));
		events.add(new Event(People.ALICE, Actions.EAT, Objects.COFFEE, 0));
		events.add(new Event(People.ALICE, Actions.EAT, Objects.COLA, 0));
		events.add(new Event(People.ALICE, Actions.EAT, Objects.JUICE, 0));
		events.add(new Event(People.ALICE, Actions.EAT, Objects.WATER, 0));
		events.add(new Event(People.BOB, Actions.DRINK, Objects.APPLE, 0));
		events.add(new Event(People.BOB, Actions.DRINK, Objects.BREAD, 0));
		events.add(new Event(People.BOB, Actions.DRINK, Objects.CAKE, 0));
		events.add(new Event(People.BOB, Actions.DRINK, Objects.RICE, 0));
		events.add(new Event(People.BOB, Actions.EAT, Objects.COFFEE, 0));
		events.add(new Event(People.BOB, Actions.EAT, Objects.COLA, 0));
		events.add(new Event(People.BOB, Actions.EAT, Objects.JUICE, 0));
		events.add(new Event(People.BOB, Actions.EAT, Objects.WATER, 0));
		events.add(new Event(People.EVE, Actions.DRINK, Objects.APPLE, 0));
		events.add(new Event(People.EVE, Actions.DRINK, Objects.BREAD, 0));
		events.add(new Event(People.EVE, Actions.DRINK, Objects.CAKE, 0));
		events.add(new Event(People.EVE, Actions.DRINK, Objects.RICE, 0));
		events.add(new Event(People.EVE, Actions.EAT, Objects.COFFEE, 0));
		events.add(new Event(People.EVE, Actions.EAT, Objects.COLA, 0));
		events.add(new Event(People.EVE, Actions.EAT, Objects.JUICE, 0));
		events.add(new Event(People.EVE, Actions.EAT, Objects.WATER, 0));
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.APPLE, 0));
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.BREAD, 0));
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.CAKE, 0));
		events.add(new Event(People.MALLORY, Actions.DRINK, Objects.RICE, 0));
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.COFFEE, 0));
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.COLA, 0));
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.JUICE, 0));
		events.add(new Event(People.MALLORY, Actions.EAT, Objects.WATER, 0));
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.APPLE, 0));
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.BREAD, 0));
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.CAKE, 0));
		events.add(new Event(People.TRENT, Actions.DRINK, Objects.RICE, 0));
		events.add(new Event(People.TRENT, Actions.EAT, Objects.COFFEE, 0));
		events.add(new Event(People.TRENT, Actions.EAT, Objects.COLA, 0));
		events.add(new Event(People.TRENT, Actions.EAT, Objects.JUICE, 0));
		events.add(new Event(People.TRENT, Actions.EAT, Objects.WATER, 0));
		
		return events;
	}
	
	public static RandomCollection<Event> genWorld(ArrayList<Event> events) {
		RandomCollection<Event> world = new RandomCollection<>();
		//	ArrayList<Event> world = new ArrayList<Event>();

		for(Event e:events) {
			world.add(e.probability, e);
		}
		//				for(Event e:events) {
		//					world.add(e);
		//				}

		return world;
	}
	
	public static HashMap<String, HashMap<String, Word>> genLexicons() {
		HashMap<String, HashMap<String, Word>> lexicons = new HashMap<>();
		HashMap<String, Word> lex = new HashMap<String, Word>();
		ArrayList<Enum> al = new ArrayList<Enum>();
		al.add(NounClass.NONE);

	// 1st/2nd/3rd person subject agreement
		lex.put("alice", new Word("alice", "person", Person.THIRD));
		lex.put("bob", new Word("bob", "person", Person.THIRD));
		lex.put("eve", new Word("eve", "person", Person.THIRD));
		lex.put("mallory", new Word("mallory", "person", Person.THIRD));
		lex.put("trent", new Word("trent", "person", Person.THIRD));
		lex.put("apple", new Word("apple", "person", Person.THIRD));
		lex.put("bread", new Word("bread", "person", Person.THIRD));
		lex.put("cake", new Word("cake", "person", Person.THIRD));
		lex.put("rice", new Word("rice", "person", Person.THIRD));
		lex.put("coffee", new Word("coffee", "person", Person.THIRD));
		lex.put("cola", new Word("cola", "person", Person.THIRD));
		lex.put("juice", new Word("juice", "person", Person.THIRD));
		lex.put("water", new Word("water", "person", Person.THIRD));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123", lex);
		
		HashMap<String, Word> olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123", olex);
		
		HashMap<String, Word> solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123", solex);
		
		// Singular/plural_two agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "number", Number.SINGULAR));
		lex.put("bob", new Word("bob", "number", Number.SINGULAR));
		lex.put("eve", new Word("eve", "number", Number.SINGULAR));
		lex.put("mallory", new Word("mallory", "number", Number.SINGULAR));
		lex.put("trent", new Word("trent", "number", Number.SINGULAR));
		lex.put("apple", new Word("apple", "number", Number.SINGULAR));
		lex.put("bread", new Word("bread", "number", Number.SINGULAR));
		lex.put("cake", new Word("cake", "number", Number.SINGULAR));
		lex.put("rice", new Word("rice", "number", Number.SINGULAR));
		lex.put("coffee", new Word("coffee", "number", Number.SINGULAR));
		lex.put("cola", new Word("cola", "number", Number.SINGULAR));
		lex.put("juice", new Word("juice", "number", Number.SINGULAR));
		lex.put("water", new Word("water", "number", Number.SINGULAR));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-sp", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-sp", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-sp", solex);

		// inclusive/exclusive we person subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "person", Person.THIRD));
		lex.put("bob", new Word("bob", "person", Person.THIRD));
		lex.put("eve", new Word("eve", "person", Person.THIRD));
		lex.put("mallory", new Word("mallory", "person", Person.THIRD));
		lex.put("trent", new Word("trent", "person", Person.THIRD));
		lex.put("apple", new Word("apple", "person", Person.THIRD));
		lex.put("bread", new Word("bread", "person", Person.THIRD));
		lex.put("cake", new Word("cake", "person", Person.THIRD));
		lex.put("rice", new Word("rice", "person", Person.THIRD));
		lex.put("coffee", new Word("coffee", "person", Person.THIRD));
		lex.put("cola", new Word("cola", "person", Person.THIRD));
		lex.put("juice", new Word("juice", "person", Person.THIRD));
		lex.put("water", new Word("water", "person", Person.THIRD));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-we", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-we", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-we", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement
		lex = new HashMap<String, Word>();
		String[] inflKeys = {"person", "number"};
		Enum[] infls = {Person.THIRD, Number.SINGULAR};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp", solex);

		// MF subject agreement
		lex = new HashMap<String, Word>();
		al.add(NounClass.NONE);
		lex.put("alice", new Word("alice", "class", NounClass.FEMININE));
		lex.put("bob", new Word("bob", "class", NounClass.MASCULINE));
		lex.put("eve", new Word("eve", "class", NounClass.FEMININE));
		lex.put("mallory", new Word("mallory", "class", NounClass.FEMININE));
		lex.put("trent", new Word("trent", "class", NounClass.MASCULINE));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-mf", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-mf", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-mf", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + MF agr
		lex = new HashMap<String, Word>();
		inflKeys = new String[]{"person", "number", "class"};
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.FEMININE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.MASCULINE};
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+mf", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+mf", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+mf", solex);

		// MFN subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.FEMININE));
		lex.put("bob", new Word("bob", "class", NounClass.MASCULINE));
		lex.put("eve", new Word("eve", "class", NounClass.FEMININE));
		lex.put("mallory", new Word("mallory", "class", NounClass.FEMININE));
		lex.put("trent", new Word("trent", "class", NounClass.MASCULINE));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-mfn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-mfn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-mfn", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + MFN agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.FEMININE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.MASCULINE};
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+mfn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+mfn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+mfn", solex);

		// Common vs Neuter subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.COMMON));
		lex.put("bob", new Word("bob", "class", NounClass.COMMON));
		lex.put("eve", new Word("eve", "class", NounClass.COMMON));
		lex.put("mallory", new Word("mallory", "class", NounClass.COMMON));
		lex.put("trent", new Word("trent", "class", NounClass.COMMON));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-cn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-cn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-cn", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + CN agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.COMMON};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+cn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+cn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+cn", solex);

		// Animate vs inanimate subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.ANIMATE));
		lex.put("bob", new Word("bob", "class", NounClass.ANIMATE));
		lex.put("eve", new Word("eve", "class", NounClass.ANIMATE));
		lex.put("mallory", new Word("mallory", "class", NounClass.ANIMATE));
		lex.put("trent", new Word("trent", "class", NounClass.ANIMATE));
		lex.put("apple", new Word("apple", "class", NounClass.INANIMATE));
		lex.put("bread", new Word("bread", "class", NounClass.INANIMATE));
		lex.put("cake", new Word("cake", "class", NounClass.INANIMATE));
		lex.put("rice", new Word("rice", "class", NounClass.INANIMATE));
		lex.put("coffee", new Word("coffee", "class", NounClass.INANIMATE));
		lex.put("cola", new Word("cola", "class", NounClass.INANIMATE));
		lex.put("juice", new Word("juice", "class", NounClass.INANIMATE));
		lex.put("water", new Word("water", "class", NounClass.INANIMATE));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-ai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-ai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-ai", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + AI agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.ANIMATE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.INANIMATE};
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+ai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+ai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+ai", solex);

		// Human vs nonhuman subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.HUMAN));
		lex.put("bob", new Word("bob", "class", NounClass.HUMAN));
		lex.put("eve", new Word("eve", "class", NounClass.HUMAN));
		lex.put("mallory", new Word("mallory", "class", NounClass.HUMAN));
		lex.put("trent", new Word("trent", "class", NounClass.HUMAN));
		lex.put("apple", new Word("apple", "class", NounClass.NONHUMAN));
		lex.put("bread", new Word("bread", "class", NounClass.NONHUMAN));
		lex.put("cake", new Word("cake", "class", NounClass.NONHUMAN));
		lex.put("rice", new Word("rice", "class", NounClass.NONHUMAN));
		lex.put("coffee", new Word("coffee", "class", NounClass.NONHUMAN));
		lex.put("cola", new Word("cola", "class", NounClass.NONHUMAN));
		lex.put("juice", new Word("juice", "class", NounClass.NONHUMAN));
		lex.put("water", new Word("water", "class", NounClass.NONHUMAN));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-hn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-hn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-hn", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + HN agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.HUMAN};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.NONHUMAN};
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+hn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+hn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+hn", solex);

		// Human vs animal vs inanimate subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.HUMAN));
		lex.put("bob", new Word("bob", "class", NounClass.HUMAN));
		lex.put("eve", new Word("eve", "class", NounClass.HUMAN));
		lex.put("mallory", new Word("mallory", "class", NounClass.HUMAN));
		lex.put("trent", new Word("trent", "class", NounClass.HUMAN));
		lex.put("apple", new Word("apple", "class", NounClass.INANIMATE));
		lex.put("bread", new Word("bread", "class", NounClass.INANIMATE));
		lex.put("cake", new Word("cake", "class", NounClass.INANIMATE));
		lex.put("rice", new Word("rice", "class", NounClass.INANIMATE));
		lex.put("coffee", new Word("coffee", "class", NounClass.INANIMATE));
		lex.put("cola", new Word("cola", "class", NounClass.INANIMATE));
		lex.put("juice", new Word("juice", "class", NounClass.INANIMATE));
		lex.put("water", new Word("water", "class", NounClass.INANIMATE));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-hai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-hai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-hai", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + HAI agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.HUMAN};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.INANIMATE};
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+hai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+hai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+hai", solex);

		// Male vs nonmale subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.NONMALE));
		lex.put("bob", new Word("bob", "class", NounClass.MALE));
		lex.put("eve", new Word("eve", "class", NounClass.NONMALE));
		lex.put("mallory", new Word("mallory", "class", NounClass.NONMALE));
		lex.put("trent", new Word("trent", "class", NounClass.MALE));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-mnm", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-mnm", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-mnm", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + MNM agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.NONMALE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.MALE};
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+mnm", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+mnm", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+mnm", solex);
					
		return lexicons;
	}
	
	public static BigDecimal baseEntropy(ArrayList<Event> events) {
		BigDecimal prob = new BigDecimal(0.0);
		
		for(Event e:events) {
			double p = e.probability;
			if (p > 0.0) {
				prob = prob.add(base2Log(p).multiply(BigDecimal.valueOf(p)));
			}
		}
		return prob.multiply(BigDecimal.valueOf(-1.0));
	}
	
	public static NounClass randomNClass(NounClass[] nC) {
		Random r = new Random();
		int i = r.nextInt(nC.length);
		return nC[i];
	}
	
	public static BigDecimal base2Log(double x) {
		BigDecimal eLog = BigDecimal.valueOf(Math.log(x));
		return eLog.divide(BigDecimal.valueOf(Math.log(2.0D)), MathContext.DECIMAL128);
	}
	
	public static BigDecimal calcEntropy(ArrayList<Double> probs, BigDecimal conditionalProb) {
		BigDecimal probSum = new BigDecimal(0.0);
		
		for(double prob:probs) {
			BigDecimal p = BigDecimal.valueOf(prob);
			p = p.divide(conditionalProb, MathContext.DECIMAL128);
			probSum = probSum.add(p.multiply(base2Log(p.doubleValue())));
		}
		return probSum.multiply(BigDecimal.valueOf(-1.0));
	}
	
	public static void getStats(Stats ideal, SVOTest svoTest, SOVTest sovTest, VSOTest vsoTest, VOSTest vosTest, OSVTest osvTest, OVSTest ovsTest) {
		ArrayList<HashMap<String, BigDecimal>> unranked = new ArrayList<HashMap<String, BigDecimal>>();
		HashMap<String, BigDecimal> scores = new HashMap<String, BigDecimal>();
		scores.put("ideal", ideal.meanDevScore);
		scores.put("SVO", svoTest.svo.meanDevScore);
		scores.put("SOV", sovTest.sov.meanDevScore);
		scores.put("VSO", vsoTest.vso.meanDevScore);
		scores.put("VOS", vosTest.vos.meanDevScore);
		scores.put("OVS", ovsTest.ovs.meanDevScore);
		scores.put("OSV", osvTest.osv.meanDevScore);
		unranked.add(scores);
		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-nom", svoTest.svoNomOnly.meanDevScore);
//		scores.put("SOV-nom", sovTest.sovNomOnly.meanDevScore);
//		scores.put("VSO-nom", vsoTest.vsoNomOnly.meanDevScore);
//		scores.put("VOS-nom", vosTest.vosNomOnly.meanDevScore);
//		scores.put("OVS-nom", ovsTest.ovsNomOnly.meanDevScore);
//		scores.put("OSV-nom", osvTest.osvNomOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-acc", svoTest.svoAccOnly.meanDevScore);
//		scores.put("SOV-acc", sovTest.sovAccOnly.meanDevScore);
//		scores.put("VSO-acc", vsoTest.vsoAccOnly.meanDevScore);
//		scores.put("VOS-acc", vosTest.vosAccOnly.meanDevScore);
//		scores.put("OVS-acc", ovsTest.ovsAccOnly.meanDevScore);
//		scores.put("OSV-acc", osvTest.osvAccOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-nomacc", svoTest.svoNomAcc.meanDevScore);
//		scores.put("SOV-nomacc", sovTest.sovNomAcc.meanDevScore);
//		scores.put("VSO-nomacc", vsoTest.vsoNomAcc.meanDevScore);
//		scores.put("VOS-nomacc", vosTest.vosNomAcc.meanDevScore);
//		scores.put("OVS-nomacc", ovsTest.ovsNomAcc.meanDevScore);
//		scores.put("OSV-nomacc", osvTest.osvNomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-erg", svoTest.svoErgOnly.meanDevScore);
//		scores.put("SOV-erg", sovTest.sovErgOnly.meanDevScore);
//		scores.put("VSO-erg", vsoTest.vsoErgOnly.meanDevScore);
//		scores.put("VOS-erg", vosTest.vosErgOnly.meanDevScore);
//		scores.put("OVS-erg", ovsTest.ovsErgOnly.meanDevScore);
//		scores.put("OSV-erg", osvTest.osvErgOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-abs", svoTest.svoAbsOnly.meanDevScore);
//		scores.put("SOV-abs", sovTest.sovAbsOnly.meanDevScore);
//		scores.put("VSO-abs", vsoTest.vsoAbsOnly.meanDevScore);
//		scores.put("VOS-abs", vosTest.vosAbsOnly.meanDevScore);
//		scores.put("OVS-abs", ovsTest.ovsAbsOnly.meanDevScore);
//		scores.put("OSV-abs", osvTest.osvAbsOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-ergabs", svoTest.svoErgAbs.meanDevScore);
//		scores.put("SOV-ergabs", sovTest.sovErgAbs.meanDevScore);
//		scores.put("VSO-ergabs", vsoTest.vsoErgAbs.meanDevScore);
//		scores.put("VOS-ergabs", vosTest.vosErgAbs.meanDevScore);
//		scores.put("OVS-ergabs", ovsTest.ovsErgAbs.meanDevScore);
//		scores.put("OSV-ergabs", osvTest.osvErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123", svoTest.svoSAgr123.meanDevScore);
//		scores.put("SOV-s:123", sovTest.sovSAgr123.meanDevScore);
//		scores.put("VSO-s:123", vsoTest.vsoSAgr123.meanDevScore);
//		scores.put("VOS-s:123", vosTest.vosSAgr123.meanDevScore);
//		scores.put("OVS-s:123", ovsTest.ovsSAgr123.meanDevScore);
//		scores.put("OSV-s:123", osvTest.osvSAgr123.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123", svoTest.svoOAgr123.meanDevScore);
//		scores.put("SOV-o:123", sovTest.sovOAgr123.meanDevScore);
//		scores.put("VSO-o:123", vsoTest.vsoOAgr123.meanDevScore);
//		scores.put("VOS-o:123", vosTest.vosOAgr123.meanDevScore);
//		scores.put("OVS-o:123", ovsTest.ovsOAgr123.meanDevScore);
//		scores.put("OSV-o:123", osvTest.osvOAgr123.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123", svoTest.svoSOAgr123.meanDevScore);
//		scores.put("SOV-so:123", sovTest.sovSOAgr123.meanDevScore);
//		scores.put("VSO-so:123", vsoTest.vsoSOAgr123.meanDevScore);
//		scores.put("VOS-so:123", vosTest.vosSOAgr123.meanDevScore);
//		scores.put("OVS-so:123", ovsTest.ovsSOAgr123.meanDevScore);
//		scores.put("OSV-so:123", osvTest.osvSOAgr123.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:sp", svoTest.svoSAgrSP.meanDevScore);
//		scores.put("SOV-s:sp", sovTest.sovSAgrSP.meanDevScore);
//		scores.put("VSO-s:sp", vsoTest.vsoSAgrSP.meanDevScore);
//		scores.put("VOS-s:sp", vosTest.vosSAgrSP.meanDevScore);
//		scores.put("OVS-s:sp", ovsTest.ovsSAgrSP.meanDevScore);
//		scores.put("OSV-s:sp", osvTest.osvSAgrSP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:sp", svoTest.svoOAgrSP.meanDevScore);
//		scores.put("SOV-o:sp", sovTest.sovOAgrSP.meanDevScore);
//		scores.put("VSO-o:sp", vsoTest.vsoOAgrSP.meanDevScore);
//		scores.put("VOS-o:sp", vosTest.vosOAgrSP.meanDevScore);
//		scores.put("OVS-o:sp", ovsTest.ovsOAgrSP.meanDevScore);
//		scores.put("OSV-o:sp", osvTest.osvOAgrSP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:sp", svoTest.svoSOAgrSP.meanDevScore);
//		scores.put("SOV-so:sp", sovTest.sovSOAgrSP.meanDevScore);
//		scores.put("VSO-so:sp", vsoTest.vsoSOAgrSP.meanDevScore);
//		scores.put("VOS-so:sp", vosTest.vosSOAgrSP.meanDevScore);
//		scores.put("OVS-so:sp", ovsTest.ovsSOAgrSP.meanDevScore);
//		scores.put("OSV-so:sp", osvTest.osvSOAgrSP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp", svoTest.svoSAgr123_SP.meanDevScore);
//		scores.put("SOV-s:123+sp", sovTest.sovSAgr123_SP.meanDevScore);
//		scores.put("VSO-s:123+sp", vsoTest.vsoSAgr123_SP.meanDevScore);
//		scores.put("VOS-s:123+sp", vosTest.vosSAgr123_SP.meanDevScore);
//		scores.put("OVS-s:123+sp", ovsTest.ovsSAgr123_SP.meanDevScore);
//		scores.put("OSV-s:123+sp", osvTest.osvSAgr123_SP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp", svoTest.svoOAgr123_SP.meanDevScore);
//		scores.put("SOV-o:123+sp", sovTest.sovOAgr123_SP.meanDevScore);
//		scores.put("VSO-o:123+sp", vsoTest.vsoOAgr123_SP.meanDevScore);
//		scores.put("VOS-o:123+sp", vosTest.vosOAgr123_SP.meanDevScore);
//		scores.put("OVS-o:123+sp", ovsTest.ovsOAgr123_SP.meanDevScore);
//		scores.put("OSV-o:123+sp", osvTest.osvOAgr123_SP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp", svoTest.svoSOAgr123_SP.meanDevScore);
//		scores.put("SOV-so:123+sp", sovTest.sovSOAgr123_SP.meanDevScore);
//		scores.put("VSO-so:123+sp", vsoTest.vsoSOAgr123_SP.meanDevScore);
//		scores.put("VOS-so:123+sp", vosTest.vosSOAgr123_SP.meanDevScore);
//		scores.put("OVS-so:123+sp", ovsTest.ovsSOAgr123_SP.meanDevScore);
//		scores.put("OSV-so:123+sp", osvTest.osvSOAgr123_SP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf", svoTest.svoSAgrMF.meanDevScore);
//		scores.put("SOV-s:mf", sovTest.sovSAgrMF.meanDevScore);
//		scores.put("VSO-s:mf", vsoTest.vsoSAgrMF.meanDevScore);
//		scores.put("VOS-s:mf", vosTest.vosSAgrMF.meanDevScore);
//		scores.put("OVS-s:mf", ovsTest.ovsSAgrMF.meanDevScore);
//		scores.put("OSV-s:mf", osvTest.osvSAgrMF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+nom", svoTest.svoSAgrMF_Nom.meanDevScore);
//		scores.put("SOV-s:mf+nom", sovTest.sovSAgrMF_Nom.meanDevScore);
//		scores.put("VSO-s:mf+nom", vsoTest.vsoSAgrMF_Nom.meanDevScore);
//		scores.put("VOS-s:mf+nom", vosTest.vosSAgrMF_Nom.meanDevScore);
//		scores.put("OVS-s:mf+nom", ovsTest.ovsSAgrMF_Nom.meanDevScore);
//		scores.put("OSV-s:mf+nom", osvTest.osvSAgrMF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+acc", svoTest.svoSAgrMF_Acc.meanDevScore);
//		scores.put("SOV-s:mf+acc", sovTest.sovSAgrMF_Acc.meanDevScore);
//		scores.put("VSO-s:mf+acc", vsoTest.vsoSAgrMF_Acc.meanDevScore);
//		scores.put("VOS-s:mf+acc", vosTest.vosSAgrMF_Acc.meanDevScore);
//		scores.put("OVS-s:mf+acc", ovsTest.ovsSAgrMF_Acc.meanDevScore);
//		scores.put("OSV-s:mf+acc", osvTest.osvSAgrMF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+nomacc", svoTest.svoSAgrMF_NomAcc.meanDevScore);
//		scores.put("SOV-s:mf+nomacc", sovTest.sovSAgrMF_NomAcc.meanDevScore);
//		scores.put("VSO-s:mf+nomacc", vsoTest.vsoSAgrMF_NomAcc.meanDevScore);
//		scores.put("VOS-s:mf+nomacc", vosTest.vosSAgrMF_NomAcc.meanDevScore);
//		scores.put("OVS-s:mf+nomacc", ovsTest.ovsSAgrMF_NomAcc.meanDevScore);
//		scores.put("OSV-s:mf+nomacc", osvTest.osvSAgrMF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+erg", svoTest.svoSAgrMF_Erg.meanDevScore);
//		scores.put("SOV-s:mf+erg", sovTest.sovSAgrMF_Erg.meanDevScore);
//		scores.put("VSO-s:mf+erg", vsoTest.vsoSAgrMF_Erg.meanDevScore);
//		scores.put("VOS-s:mf+erg", vosTest.vosSAgrMF_Erg.meanDevScore);
//		scores.put("OVS-s:mf+erg", ovsTest.ovsSAgrMF_Erg.meanDevScore);
//		scores.put("OSV-s:mf+erg", osvTest.osvSAgrMF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+abs", svoTest.svoSAgrMF_Abs.meanDevScore);
//		scores.put("SOV-s:mf+abs", sovTest.sovSAgrMF_Abs.meanDevScore);
//		scores.put("VSO-s:mf+abs", vsoTest.vsoSAgrMF_Abs.meanDevScore);
//		scores.put("VOS-s:mf+abs", vosTest.vosSAgrMF_Abs.meanDevScore);
//		scores.put("OVS-s:mf+abs", ovsTest.ovsSAgrMF_Abs.meanDevScore);
//		scores.put("OSV-s:mf+abs", osvTest.osvSAgrMF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+ergabs", svoTest.svoSAgrMF_ErgAbs.meanDevScore);
//		scores.put("SOV-s:mf+ergabs", sovTest.sovSAgrMF_ErgAbs.meanDevScore);
//		scores.put("VSO-s:mf+ergabs", vsoTest.vsoSAgrMF_ErgAbs.meanDevScore);
//		scores.put("VOS-s:mf+ergabs", vosTest.vosSAgrMF_ErgAbs.meanDevScore);
//		scores.put("OVS-s:mf+ergabs", ovsTest.ovsSAgrMF_ErgAbs.meanDevScore);
//		scores.put("OSV-s:mf+ergabs", osvTest.osvSAgrMF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn", svoTest.svoSAgrMFN.meanDevScore);
//		scores.put("SOV-s:mfn", sovTest.sovSAgrMFN.meanDevScore);
//		scores.put("VSO-s:mfn", vsoTest.vsoSAgrMFN.meanDevScore);
//		scores.put("VOS-s:mfn", vosTest.vosSAgrMFN.meanDevScore);
//		scores.put("OVS-s:mfn", ovsTest.ovsSAgrMFN.meanDevScore);
//		scores.put("OSV-s:mfn", osvTest.osvSAgrMFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+nom", svoTest.svoSAgrMFN_Nom.meanDevScore);
//		scores.put("SOV-s:mfn+nom", sovTest.sovSAgrMFN_Nom.meanDevScore);
//		scores.put("VSO-s:mfn+nom", vsoTest.vsoSAgrMFN_Nom.meanDevScore);
//		scores.put("VOS-s:mfn+nom", vosTest.vosSAgrMFN_Nom.meanDevScore);
//		scores.put("OVS-s:mfn+nom", ovsTest.ovsSAgrMFN_Nom.meanDevScore);
//		scores.put("OSV-s:mfn+nom", osvTest.osvSAgrMFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+acc", svoTest.svoSAgrMFN_Acc.meanDevScore);
//		scores.put("SOV-s:mfn+acc", sovTest.sovSAgrMFN_Acc.meanDevScore);
//		scores.put("VSO-s:mfn+acc", vsoTest.vsoSAgrMFN_Acc.meanDevScore);
//		scores.put("VOS-s:mfn+acc", vosTest.vosSAgrMFN_Acc.meanDevScore);
//		scores.put("OVS-s:mfn+acc", ovsTest.ovsSAgrMFN_Acc.meanDevScore);
//		scores.put("OSV-s:mfn+acc", osvTest.osvSAgrMFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+nomacc", svoTest.svoSAgrMFN_NomAcc.meanDevScore);
//		scores.put("SOV-s:mfn+nomacc", sovTest.sovSAgrMFN_NomAcc.meanDevScore);
//		scores.put("VSO-s:mfn+nomacc", vsoTest.vsoSAgrMFN_NomAcc.meanDevScore);
//		scores.put("VOS-s:mfn+nomacc", vosTest.vosSAgrMFN_NomAcc.meanDevScore);
//		scores.put("OVS-s:mfn+nomacc", ovsTest.ovsSAgrMFN_NomAcc.meanDevScore);
//		scores.put("OSV-s:mfn+nomacc", osvTest.osvSAgrMFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+erg", svoTest.svoSAgrMFN_Erg.meanDevScore);
//		scores.put("SOV-s:mfn+erg", sovTest.sovSAgrMFN_Erg.meanDevScore);
//		scores.put("VSO-s:mfn+erg", vsoTest.vsoSAgrMFN_Erg.meanDevScore);
//		scores.put("VOS-s:mfn+erg", vosTest.vosSAgrMFN_Erg.meanDevScore);
//		scores.put("OVS-s:mfn+erg", ovsTest.ovsSAgrMFN_Erg.meanDevScore);
//		scores.put("OSV-s:mfn+erg", osvTest.osvSAgrMFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+abs", svoTest.svoSAgrMFN_Abs.meanDevScore);
//		scores.put("SOV-s:mfn+abs", sovTest.sovSAgrMFN_Abs.meanDevScore);
//		scores.put("VSO-s:mfn+abs", vsoTest.vsoSAgrMFN_Abs.meanDevScore);
//		scores.put("VOS-s:mfn+abs", vosTest.vosSAgrMFN_Abs.meanDevScore);
//		scores.put("OVS-s:mfn+abs", ovsTest.ovsSAgrMFN_Abs.meanDevScore);
//		scores.put("OSV-s:mfn+abs", osvTest.osvSAgrMFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+ergabs", svoTest.svoSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:mfn+ergabs", sovTest.sovSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:mfn+ergabs", vsoTest.vsoSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:mfn+ergabs", vosTest.vosSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:mfn+ergabs", ovsTest.ovsSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:mfn+ergabs", osvTest.osvSAgrMFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn", svoTest.svoSAgrCN.meanDevScore);
//		scores.put("SOV-s:cn", sovTest.sovSAgrCN.meanDevScore);
//		scores.put("VSO-s:cn", vsoTest.vsoSAgrCN.meanDevScore);
//		scores.put("VOS-s:cn", vosTest.vosSAgrCN.meanDevScore);
//		scores.put("OVS-s:cn", ovsTest.ovsSAgrCN.meanDevScore);
//		scores.put("OSV-s:cn", osvTest.osvSAgrCN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+nom", svoTest.svoSAgrCN_Nom.meanDevScore);
//		scores.put("SOV-s:cn+nom", sovTest.sovSAgrCN_Nom.meanDevScore);
//		scores.put("VSO-s:cn+nom", vsoTest.vsoSAgrCN_Nom.meanDevScore);
//		scores.put("VOS-s:cn+nom", vosTest.vosSAgrCN_Nom.meanDevScore);
//		scores.put("OVS-s:cn+nom", ovsTest.ovsSAgrCN_Nom.meanDevScore);
//		scores.put("OSV-s:cn+nom", osvTest.osvSAgrCN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+acc", svoTest.svoSAgrCN_Acc.meanDevScore);
//		scores.put("SOV-s:cn+acc", sovTest.sovSAgrCN_Acc.meanDevScore);
//		scores.put("VSO-s:cn+acc", vsoTest.vsoSAgrCN_Acc.meanDevScore);
//		scores.put("VOS-s:cn+acc", vosTest.vosSAgrCN_Acc.meanDevScore);
//		scores.put("OVS-s:cn+acc", ovsTest.ovsSAgrCN_Acc.meanDevScore);
//		scores.put("OSV-s:cn+acc", osvTest.osvSAgrCN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+nomacc", svoTest.svoSAgrCN_NomAcc.meanDevScore);
//		scores.put("SOV-s:cn+nomacc", sovTest.sovSAgrCN_NomAcc.meanDevScore);
//		scores.put("VSO-s:cn+nomacc", vsoTest.vsoSAgrCN_NomAcc.meanDevScore);
//		scores.put("VOS-s:cn+nomacc", vosTest.vosSAgrCN_NomAcc.meanDevScore);
//		scores.put("OVS-s:cn+nomacc", ovsTest.ovsSAgrCN_NomAcc.meanDevScore);
//		scores.put("OSV-s:cn+nomacc", osvTest.osvSAgrCN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+erg", svoTest.svoSAgrCN_Erg.meanDevScore);
//		scores.put("SOV-s:cn+erg", sovTest.sovSAgrCN_Erg.meanDevScore);
//		scores.put("VSO-s:cn+erg", vsoTest.vsoSAgrCN_Erg.meanDevScore);
//		scores.put("VOS-s:cn+erg", vosTest.vosSAgrCN_Erg.meanDevScore);
//		scores.put("OVS-s:cn+erg", ovsTest.ovsSAgrCN_Erg.meanDevScore);
//		scores.put("OSV-s:cn+erg", osvTest.osvSAgrCN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+abs", svoTest.svoSAgrCN_Abs.meanDevScore);
//		scores.put("SOV-s:cn+abs", sovTest.sovSAgrCN_Abs.meanDevScore);
//		scores.put("VSO-s:cn+abs", vsoTest.vsoSAgrCN_Abs.meanDevScore);
//		scores.put("VOS-s:cn+abs", vosTest.vosSAgrCN_Abs.meanDevScore);
//		scores.put("OVS-s:cn+abs", ovsTest.ovsSAgrCN_Abs.meanDevScore);
//		scores.put("OSV-s:cn+abs", osvTest.osvSAgrCN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+ergabs", svoTest.svoSAgrCN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:cn+ergabs", sovTest.sovSAgrCN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:cn+ergabs", vsoTest.vsoSAgrCN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:cn+ergabs", vosTest.vosSAgrCN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:cn+ergabs", ovsTest.ovsSAgrCN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:cn+ergabs", osvTest.osvSAgrCN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai", svoTest.svoSAgrAI.meanDevScore);
//		scores.put("SOV-s:ai", sovTest.sovSAgrAI.meanDevScore);
//		scores.put("VSO-s:ai", vsoTest.vsoSAgrAI.meanDevScore);
//		scores.put("VOS-s:ai", vosTest.vosSAgrAI.meanDevScore);
//		scores.put("OVS-s:ai", ovsTest.ovsSAgrAI.meanDevScore);
//		scores.put("OSV-s:ai", osvTest.osvSAgrAI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+nom", svoTest.svoSAgrAI_Nom.meanDevScore);
//		scores.put("SOV-s:ai+nom", sovTest.sovSAgrAI_Nom.meanDevScore);
//		scores.put("VSO-s:ai+nom", vsoTest.vsoSAgrAI_Nom.meanDevScore);
//		scores.put("VOS-s:ai+nom", vosTest.vosSAgrAI_Nom.meanDevScore);
//		scores.put("OVS-s:ai+nom", ovsTest.ovsSAgrAI_Nom.meanDevScore);
//		scores.put("OSV-s:ai+nom", osvTest.osvSAgrAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+acc", svoTest.svoSAgrAI_Acc.meanDevScore);
//		scores.put("SOV-s:ai+acc", sovTest.sovSAgrAI_Acc.meanDevScore);
//		scores.put("VSO-s:ai+acc", vsoTest.vsoSAgrAI_Acc.meanDevScore);
//		scores.put("VOS-s:ai+acc", vosTest.vosSAgrAI_Acc.meanDevScore);
//		scores.put("OVS-s:ai+acc", ovsTest.ovsSAgrAI_Acc.meanDevScore);
//		scores.put("OSV-s:ai+acc", osvTest.osvSAgrAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+nomacc", svoTest.svoSAgrAI_NomAcc.meanDevScore);
//		scores.put("SOV-s:ai+nomacc", sovTest.sovSAgrAI_NomAcc.meanDevScore);
//		scores.put("VSO-s:ai+nomacc", vsoTest.vsoSAgrAI_NomAcc.meanDevScore);
//		scores.put("VOS-s:ai+nomacc", vosTest.vosSAgrAI_NomAcc.meanDevScore);
//		scores.put("OVS-s:ai+nomacc", ovsTest.ovsSAgrAI_NomAcc.meanDevScore);
//		scores.put("OSV-s:ai+nomacc", osvTest.osvSAgrAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+erg", svoTest.svoSAgrAI_Erg.meanDevScore);
//		scores.put("SOV-s:ai+erg", sovTest.sovSAgrAI_Erg.meanDevScore);
//		scores.put("VSO-s:ai+erg", vsoTest.vsoSAgrAI_Erg.meanDevScore);
//		scores.put("VOS-s:ai+erg", vosTest.vosSAgrAI_Erg.meanDevScore);
//		scores.put("OVS-s:ai+erg", ovsTest.ovsSAgrAI_Erg.meanDevScore);
//		scores.put("OSV-s:ai+erg", osvTest.osvSAgrAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+abs", svoTest.svoSAgrAI_Abs.meanDevScore);
//		scores.put("SOV-s:ai+abs", sovTest.sovSAgrAI_Abs.meanDevScore);
//		scores.put("VSO-s:ai+abs", vsoTest.vsoSAgrAI_Abs.meanDevScore);
//		scores.put("VOS-s:ai+abs", vosTest.vosSAgrAI_Abs.meanDevScore);
//		scores.put("OVS-s:ai+abs", ovsTest.ovsSAgrAI_Abs.meanDevScore);
//		scores.put("OSV-s:ai+abs", osvTest.osvSAgrAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+ergabs", svoTest.svoSAgrAI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:ai+ergabs", sovTest.sovSAgrAI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:ai+ergabs", vsoTest.vsoSAgrAI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:ai+ergabs", vosTest.vosSAgrAI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:ai+ergabs", ovsTest.ovsSAgrAI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:ai+ergabs", osvTest.osvSAgrAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn", svoTest.svoSAgrHN.meanDevScore);
//		scores.put("SOV-s:hn", sovTest.sovSAgrHN.meanDevScore);
//		scores.put("VSO-s:hn", vsoTest.vsoSAgrHN.meanDevScore);
//		scores.put("VOS-s:hn", vosTest.vosSAgrHN.meanDevScore);
//		scores.put("OVS-s:hn", ovsTest.ovsSAgrHN.meanDevScore);
//		scores.put("OSV-s:hn", osvTest.osvSAgrHN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+nom", svoTest.svoSAgrHN_Nom.meanDevScore);
//		scores.put("SOV-s:hn+nom", sovTest.sovSAgrHN_Nom.meanDevScore);
//		scores.put("VSO-s:hn+nom", vsoTest.vsoSAgrHN_Nom.meanDevScore);
//		scores.put("VOS-s:hn+nom", vosTest.vosSAgrHN_Nom.meanDevScore);
//		scores.put("OVS-s:hn+nom", ovsTest.ovsSAgrHN_Nom.meanDevScore);
//		scores.put("OSV-s:hn+nom", osvTest.osvSAgrHN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+acc", svoTest.svoSAgrHN_Acc.meanDevScore);
//		scores.put("SOV-s:hn+acc", sovTest.sovSAgrHN_Acc.meanDevScore);
//		scores.put("VSO-s:hn+acc", vsoTest.vsoSAgrHN_Acc.meanDevScore);
//		scores.put("VOS-s:hn+acc", vosTest.vosSAgrHN_Acc.meanDevScore);
//		scores.put("OVS-s:hn+acc", ovsTest.ovsSAgrHN_Acc.meanDevScore);
//		scores.put("OSV-s:hn+acc", osvTest.osvSAgrHN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+nomacc", svoTest.svoSAgrHN_NomAcc.meanDevScore);
//		scores.put("SOV-s:hn+nomacc", sovTest.sovSAgrHN_NomAcc.meanDevScore);
//		scores.put("VSO-s:hn+nomacc", vsoTest.vsoSAgrHN_NomAcc.meanDevScore);
//		scores.put("VOS-s:hn+nomacc", vosTest.vosSAgrHN_NomAcc.meanDevScore);
//		scores.put("OVS-s:hn+nomacc", ovsTest.ovsSAgrHN_NomAcc.meanDevScore);
//		scores.put("OSV-s:hn+nomacc", osvTest.osvSAgrHN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+erg", svoTest.svoSAgrHN_Erg.meanDevScore);
//		scores.put("SOV-s:hn+erg", sovTest.sovSAgrHN_Erg.meanDevScore);
//		scores.put("VSO-s:hn+erg", vsoTest.vsoSAgrHN_Erg.meanDevScore);
//		scores.put("VOS-s:hn+erg", vosTest.vosSAgrHN_Erg.meanDevScore);
//		scores.put("OVS-s:hn+erg", ovsTest.ovsSAgrHN_Erg.meanDevScore);
//		scores.put("OSV-s:hn+erg", osvTest.osvSAgrHN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+abs", svoTest.svoSAgrHN_Abs.meanDevScore);
//		scores.put("SOV-s:hn+abs", sovTest.sovSAgrHN_Abs.meanDevScore);
//		scores.put("VSO-s:hn+abs", vsoTest.vsoSAgrHN_Abs.meanDevScore);
//		scores.put("VOS-s:hn+abs", vosTest.vosSAgrHN_Abs.meanDevScore);
//		scores.put("OVS-s:hn+abs", ovsTest.ovsSAgrHN_Abs.meanDevScore);
//		scores.put("OSV-s:hn+abs", osvTest.osvSAgrHN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+ergabs", svoTest.svoSAgrHN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:hn+ergabs", sovTest.sovSAgrHN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:hn+ergabs", vsoTest.vsoSAgrHN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:hn+ergabs", vosTest.vosSAgrHN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:hn+ergabs", ovsTest.ovsSAgrHN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:hn+ergabs", osvTest.osvSAgrHN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai", svoTest.svoSAgrHAI.meanDevScore);
//		scores.put("SOV-s:hai", sovTest.sovSAgrHAI.meanDevScore);
//		scores.put("VSO-s:hai", vsoTest.vsoSAgrHAI.meanDevScore);
//		scores.put("VOS-s:hai", vosTest.vosSAgrHAI.meanDevScore);
//		scores.put("OVS-s:hai", ovsTest.ovsSAgrHAI.meanDevScore);
//		scores.put("OSV-s:hai", osvTest.osvSAgrHAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+nom", svoTest.svoSAgrHAI_Nom.meanDevScore);
//		scores.put("SOV-s:hai+nom", sovTest.sovSAgrHAI_Nom.meanDevScore);
//		scores.put("VSO-s:hai+nom", vsoTest.vsoSAgrHAI_Nom.meanDevScore);
//		scores.put("VOS-s:hai+nom", vosTest.vosSAgrHAI_Nom.meanDevScore);
//		scores.put("OVS-s:hai+nom", ovsTest.ovsSAgrHAI_Nom.meanDevScore);
//		scores.put("OSV-s:hai+nom", osvTest.osvSAgrHAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+acc", svoTest.svoSAgrHAI_Acc.meanDevScore);
//		scores.put("SOV-s:hai+acc", sovTest.sovSAgrHAI_Acc.meanDevScore);
//		scores.put("VSO-s:hai+acc", vsoTest.vsoSAgrHAI_Acc.meanDevScore);
//		scores.put("VOS-s:hai+acc", vosTest.vosSAgrHAI_Acc.meanDevScore);
//		scores.put("OVS-s:hai+acc", ovsTest.ovsSAgrHAI_Acc.meanDevScore);
//		scores.put("OSV-s:hai+acc", osvTest.osvSAgrHAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+nomacc", svoTest.svoSAgrHAI_NomAcc.meanDevScore);
//		scores.put("SOV-s:hai+nomacc", sovTest.sovSAgrHAI_NomAcc.meanDevScore);
//		scores.put("VSO-s:hai+nomacc", vsoTest.vsoSAgrHAI_NomAcc.meanDevScore);
//		scores.put("VOS-s:hai+nomacc", vosTest.vosSAgrHAI_NomAcc.meanDevScore);
//		scores.put("OVS-s:hai+nomacc", ovsTest.ovsSAgrHAI_NomAcc.meanDevScore);
//		scores.put("OSV-s:hai+nomacc", osvTest.osvSAgrHAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+erg", svoTest.svoSAgrHAI_Erg.meanDevScore);
//		scores.put("SOV-s:hai+erg", sovTest.sovSAgrHAI_Erg.meanDevScore);
//		scores.put("VSO-s:hai+erg", vsoTest.vsoSAgrHAI_Erg.meanDevScore);
//		scores.put("VOS-s:hai+erg", vosTest.vosSAgrHAI_Erg.meanDevScore);
//		scores.put("OVS-s:hai+erg", ovsTest.ovsSAgrHAI_Erg.meanDevScore);
//		scores.put("OSV-s:hai+erg", osvTest.osvSAgrHAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+abs", svoTest.svoSAgrHAI_Abs.meanDevScore);
//		scores.put("SOV-s:hai+abs", sovTest.sovSAgrHAI_Abs.meanDevScore);
//		scores.put("VSO-s:hai+abs", vsoTest.vsoSAgrHAI_Abs.meanDevScore);
//		scores.put("VOS-s:hai+abs", vosTest.vosSAgrHAI_Abs.meanDevScore);
//		scores.put("OVS-s:hai+abs", ovsTest.ovsSAgrHAI_Abs.meanDevScore);
//		scores.put("OSV-s:hai+abs", osvTest.osvSAgrHAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+ergabs", svoTest.svoSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:hai+ergabs", sovTest.sovSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:hai+ergabs", vsoTest.vsoSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:hai+ergabs", vosTest.vosSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:hai+ergabs", ovsTest.ovsSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:hai+ergabs", osvTest.osvSAgrHAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm", svoTest.svoSAgrMNM.meanDevScore);
//		scores.put("SOV-s:mnm", sovTest.sovSAgrMNM.meanDevScore);
//		scores.put("VSO-s:mnm", vsoTest.vsoSAgrMNM.meanDevScore);
//		scores.put("VOS-s:mnm", vosTest.vosSAgrMNM.meanDevScore);
//		scores.put("OVS-s:mnm", ovsTest.ovsSAgrMNM.meanDevScore);
//		scores.put("OSV-s:mnm", osvTest.osvSAgrMNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+nom", svoTest.svoSAgrMNM_Nom.meanDevScore);
//		scores.put("SOV-s:mnm+nom", sovTest.sovSAgrMNM_Nom.meanDevScore);
//		scores.put("VSO-s:mnm+nom", vsoTest.vsoSAgrMNM_Nom.meanDevScore);
//		scores.put("VOS-s:mnm+nom", vosTest.vosSAgrMNM_Nom.meanDevScore);
//		scores.put("OVS-s:mnm+nom", ovsTest.ovsSAgrMNM_Nom.meanDevScore);
//		scores.put("OSV-s:mnm+nom", osvTest.osvSAgrMNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+acc", svoTest.svoSAgrMNM_Acc.meanDevScore);
//		scores.put("SOV-s:mnm+acc", sovTest.sovSAgrMNM_Acc.meanDevScore);
//		scores.put("VSO-s:mnm+acc", vsoTest.vsoSAgrMNM_Acc.meanDevScore);
//		scores.put("VOS-s:mnm+acc", vosTest.vosSAgrMNM_Acc.meanDevScore);
//		scores.put("OVS-s:mnm+acc", ovsTest.ovsSAgrMNM_Acc.meanDevScore);
//		scores.put("OSV-s:mnm+acc", osvTest.osvSAgrMNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+nomacc", svoTest.svoSAgrMNM_NomAcc.meanDevScore);
//		scores.put("SOV-s:mnm+nomacc", sovTest.sovSAgrMNM_NomAcc.meanDevScore);
//		scores.put("VSO-s:mnm+nomacc", vsoTest.vsoSAgrMNM_NomAcc.meanDevScore);
//		scores.put("VOS-s:mnm+nomacc", vosTest.vosSAgrMNM_NomAcc.meanDevScore);
//		scores.put("OVS-s:mnm+nomacc", ovsTest.ovsSAgrMNM_NomAcc.meanDevScore);
//		scores.put("OSV-s:mnm+nomacc", osvTest.osvSAgrMNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+erg", svoTest.svoSAgrMNM_Erg.meanDevScore);
//		scores.put("SOV-s:mnm+erg", sovTest.sovSAgrMNM_Erg.meanDevScore);
//		scores.put("VSO-s:mnm+erg", vsoTest.vsoSAgrMNM_Erg.meanDevScore);
//		scores.put("VOS-s:mnm+erg", vosTest.vosSAgrMNM_Erg.meanDevScore);
//		scores.put("OVS-s:mnm+erg", ovsTest.ovsSAgrMNM_Erg.meanDevScore);
//		scores.put("OSV-s:mnm+erg", osvTest.osvSAgrMNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+abs", svoTest.svoSAgrMNM_Abs.meanDevScore);
//		scores.put("SOV-s:mnm+abs", sovTest.sovSAgrMNM_Abs.meanDevScore);
//		scores.put("VSO-s:mnm+abs", vsoTest.vsoSAgrMNM_Abs.meanDevScore);
//		scores.put("VOS-s:mnm+abs", vosTest.vosSAgrMNM_Abs.meanDevScore);
//		scores.put("OVS-s:mnm+abs", ovsTest.ovsSAgrMNM_Abs.meanDevScore);
//		scores.put("OSV-s:mnm+abs", osvTest.osvSAgrMNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+ergabs", svoTest.svoSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("SOV-s:mnm+ergabs", sovTest.sovSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VSO-s:mnm+ergabs", vsoTest.vsoSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VOS-s:mnm+ergabs", vosTest.vosSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OVS-s:mnm+ergabs", ovsTest.ovsSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OSV-s:mnm+ergabs", osvTest.osvSAgrMNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf", svoTest.svoOAgrMF.meanDevScore);
//		scores.put("SOV-o:mf", sovTest.sovOAgrMF.meanDevScore);
//		scores.put("VSO-o:mf", vsoTest.vsoOAgrMF.meanDevScore);
//		scores.put("VOS-o:mf", vosTest.vosOAgrMF.meanDevScore);
//		scores.put("OVS-o:mf", ovsTest.ovsOAgrMF.meanDevScore);
//		scores.put("OSV-o:mf", osvTest.osvOAgrMF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+nom", svoTest.svoOAgrMF_Nom.meanDevScore);
//		scores.put("SOV-o:mf+nom", sovTest.sovOAgrMF_Nom.meanDevScore);
//		scores.put("VSO-o:mf+nom", vsoTest.vsoOAgrMF_Nom.meanDevScore);
//		scores.put("VOS-o:mf+nom", vosTest.vosOAgrMF_Nom.meanDevScore);
//		scores.put("OVS-o:mf+nom", ovsTest.ovsOAgrMF_Nom.meanDevScore);
//		scores.put("OSV-o:mf+nom", osvTest.osvOAgrMF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+acc", svoTest.svoOAgrMF_Acc.meanDevScore);
//		scores.put("SOV-o:mf+acc", sovTest.sovOAgrMF_Acc.meanDevScore);
//		scores.put("VSO-o:mf+acc", vsoTest.vsoOAgrMF_Acc.meanDevScore);
//		scores.put("VOS-o:mf+acc", vosTest.vosOAgrMF_Acc.meanDevScore);
//		scores.put("OVS-o:mf+acc", ovsTest.ovsOAgrMF_Acc.meanDevScore);
//		scores.put("OSV-o:mf+acc", osvTest.osvOAgrMF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+nomacc", svoTest.svoOAgrMF_NomAcc.meanDevScore);
//		scores.put("SOV-o:mf+nomacc", sovTest.sovOAgrMF_NomAcc.meanDevScore);
//		scores.put("VSO-o:mf+nomacc", vsoTest.vsoOAgrMF_NomAcc.meanDevScore);
//		scores.put("VOS-o:mf+nomacc", vosTest.vosOAgrMF_NomAcc.meanDevScore);
//		scores.put("OVS-o:mf+nomacc", ovsTest.ovsOAgrMF_NomAcc.meanDevScore);
//		scores.put("OSV-o:mf+nomacc", osvTest.osvOAgrMF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+erg", svoTest.svoOAgrMF_Erg.meanDevScore);
//		scores.put("SOV-o:mf+erg", sovTest.sovOAgrMF_Erg.meanDevScore);
//		scores.put("VSO-o:mf+erg", vsoTest.vsoOAgrMF_Erg.meanDevScore);
//		scores.put("VOS-o:mf+erg", vosTest.vosOAgrMF_Erg.meanDevScore);
//		scores.put("OVS-o:mf+erg", ovsTest.ovsOAgrMF_Erg.meanDevScore);
//		scores.put("OSV-o:mf+erg", osvTest.osvOAgrMF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+abs", svoTest.svoOAgrMF_Abs.meanDevScore);
//		scores.put("SOV-o:mf+abs", sovTest.sovOAgrMF_Abs.meanDevScore);
//		scores.put("VSO-o:mf+abs", vsoTest.vsoOAgrMF_Abs.meanDevScore);
//		scores.put("VOS-o:mf+abs", vosTest.vosOAgrMF_Abs.meanDevScore);
//		scores.put("OVS-o:mf+abs", ovsTest.ovsOAgrMF_Abs.meanDevScore);
//		scores.put("OSV-o:mf+abs", osvTest.osvOAgrMF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+ergabs", svoTest.svoOAgrMF_ErgAbs.meanDevScore);
//		scores.put("SOV-o:mf+ergabs", sovTest.sovOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VSO-o:mf+ergabs", vsoTest.vsoOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VOS-o:mf+ergabs", vosTest.vosOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OVS-o:mf+ergabs", ovsTest.ovsOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OSV-o:mf+ergabs", osvTest.osvOAgrMF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn", svoTest.svoOAgrMFN.meanDevScore);
//		scores.put("SOV-o:mfn", sovTest.sovOAgrMFN.meanDevScore);
//		scores.put("VSO-o:mfn", vsoTest.vsoOAgrMFN.meanDevScore);
//		scores.put("VOS-o:mfn", vosTest.vosOAgrMFN.meanDevScore);
//		scores.put("OVS-o:mfn", ovsTest.ovsOAgrMFN.meanDevScore);
//		scores.put("OSV-o:mfn", osvTest.osvOAgrMFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+nom", svoTest.svoOAgrMFN_Nom.meanDevScore);
//		scores.put("SOV-o:mfn+nom", sovTest.sovOAgrMFN_Nom.meanDevScore);
//		scores.put("VSO-o:mfn+nom", vsoTest.vsoOAgrMFN_Nom.meanDevScore);
//		scores.put("VOS-o:mfn+nom", vosTest.vosOAgrMFN_Nom.meanDevScore);
//		scores.put("OVS-o:mfn+nom", ovsTest.ovsOAgrMFN_Nom.meanDevScore);
//		scores.put("OSV-o:mfn+nom", osvTest.osvOAgrMFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+acc", svoTest.svoOAgrMFN_Acc.meanDevScore);
//		scores.put("SOV-o:mfn+acc", sovTest.sovOAgrMFN_Acc.meanDevScore);
//		scores.put("VSO-o:mfn+acc", vsoTest.vsoOAgrMFN_Acc.meanDevScore);
//		scores.put("VOS-o:mfn+acc", vosTest.vosOAgrMFN_Acc.meanDevScore);
//		scores.put("OVS-o:mfn+acc", ovsTest.ovsOAgrMFN_Acc.meanDevScore);
//		scores.put("OSV-o:mfn+acc", osvTest.osvOAgrMFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+nomacc", svoTest.svoOAgrMFN_NomAcc.meanDevScore);
//		scores.put("SOV-o:mfn+nomacc", sovTest.sovOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VSO-o:mfn+nomacc", vsoTest.vsoOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VOS-o:mfn+nomacc", vosTest.vosOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OVS-o:mfn+nomacc", ovsTest.ovsOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OSV-o:mfn+nomacc", osvTest.osvOAgrMFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+erg", svoTest.svoOAgrMFN_Erg.meanDevScore);
//		scores.put("SOV-o:mfn+erg", sovTest.sovOAgrMFN_Erg.meanDevScore);
//		scores.put("VSO-o:mfn+erg", vsoTest.vsoOAgrMFN_Erg.meanDevScore);
//		scores.put("VOS-o:mfn+erg", vosTest.vosOAgrMFN_Erg.meanDevScore);
//		scores.put("OVS-o:mfn+erg", ovsTest.ovsOAgrMFN_Erg.meanDevScore);
//		scores.put("OSV-o:mfn+erg", osvTest.osvOAgrMFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+abs", svoTest.svoOAgrMFN_Abs.meanDevScore);
//		scores.put("SOV-o:mfn+abs", sovTest.sovOAgrMFN_Abs.meanDevScore);
//		scores.put("VSO-o:mfn+abs", vsoTest.vsoOAgrMFN_Abs.meanDevScore);
//		scores.put("VOS-o:mfn+abs", vosTest.vosOAgrMFN_Abs.meanDevScore);
//		scores.put("OVS-o:mfn+abs", ovsTest.ovsOAgrMFN_Abs.meanDevScore);
//		scores.put("OSV-o:mfn+abs", osvTest.osvOAgrMFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+ergabs", svoTest.svoOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:mfn+ergabs", sovTest.sovOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:mfn+ergabs", vsoTest.vsoOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:mfn+ergabs", vosTest.vosOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:mfn+ergabs", ovsTest.ovsOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:mfn+ergabs", osvTest.osvOAgrMFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn", svoTest.svoOAgrCN.meanDevScore);
//		scores.put("SOV-o:cn", sovTest.sovOAgrCN.meanDevScore);
//		scores.put("VSO-o:cn", vsoTest.vsoOAgrCN.meanDevScore);
//		scores.put("VOS-o:cn", vosTest.vosOAgrCN.meanDevScore);
//		scores.put("OVS-o:cn", ovsTest.ovsOAgrCN.meanDevScore);
//		scores.put("OSV-o:cn", osvTest.osvOAgrCN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+nom", svoTest.svoOAgrCN_Nom.meanDevScore);
//		scores.put("SOV-o:cn+nom", sovTest.sovOAgrCN_Nom.meanDevScore);
//		scores.put("VSO-o:cn+nom", vsoTest.vsoOAgrCN_Nom.meanDevScore);
//		scores.put("VOS-o:cn+nom", vosTest.vosOAgrCN_Nom.meanDevScore);
//		scores.put("OVS-o:cn+nom", ovsTest.ovsOAgrCN_Nom.meanDevScore);
//		scores.put("OSV-o:cn+nom", osvTest.osvOAgrCN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+acc", svoTest.svoOAgrCN_Acc.meanDevScore);
//		scores.put("SOV-o:cn+acc", sovTest.sovOAgrCN_Acc.meanDevScore);
//		scores.put("VSO-o:cn+acc", vsoTest.vsoOAgrCN_Acc.meanDevScore);
//		scores.put("VOS-o:cn+acc", vosTest.vosOAgrCN_Acc.meanDevScore);
//		scores.put("OVS-o:cn+acc", ovsTest.ovsOAgrCN_Acc.meanDevScore);
//		scores.put("OSV-o:cn+acc", osvTest.osvOAgrCN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+nomacc", svoTest.svoOAgrCN_NomAcc.meanDevScore);
//		scores.put("SOV-o:cn+nomacc", sovTest.sovOAgrCN_NomAcc.meanDevScore);
//		scores.put("VSO-o:cn+nomacc", vsoTest.vsoOAgrCN_NomAcc.meanDevScore);
//		scores.put("VOS-o:cn+nomacc", vosTest.vosOAgrCN_NomAcc.meanDevScore);
//		scores.put("OVS-o:cn+nomacc", ovsTest.ovsOAgrCN_NomAcc.meanDevScore);
//		scores.put("OSV-o:cn+nomacc", osvTest.osvOAgrCN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+erg", svoTest.svoOAgrCN_Erg.meanDevScore);
//		scores.put("SOV-o:cn+erg", sovTest.sovOAgrCN_Erg.meanDevScore);
//		scores.put("VSO-o:cn+erg", vsoTest.vsoOAgrCN_Erg.meanDevScore);
//		scores.put("VOS-o:cn+erg", vosTest.vosOAgrCN_Erg.meanDevScore);
//		scores.put("OVS-o:cn+erg", ovsTest.ovsOAgrCN_Erg.meanDevScore);
//		scores.put("OSV-o:cn+erg", osvTest.osvOAgrCN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+abs", svoTest.svoOAgrCN_Abs.meanDevScore);
//		scores.put("SOV-o:cn+abs", sovTest.sovOAgrCN_Abs.meanDevScore);
//		scores.put("VSO-o:cn+abs", vsoTest.vsoOAgrCN_Abs.meanDevScore);
//		scores.put("VOS-o:cn+abs", vosTest.vosOAgrCN_Abs.meanDevScore);
//		scores.put("OVS-o:cn+abs", ovsTest.ovsOAgrCN_Abs.meanDevScore);
//		scores.put("OSV-o:cn+abs", osvTest.osvOAgrCN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+ergabs", svoTest.svoOAgrCN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:cn+ergabs", sovTest.sovOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:cn+ergabs", vsoTest.vsoOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:cn+ergabs", vosTest.vosOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:cn+ergabs", ovsTest.ovsOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:cn+ergabs", osvTest.osvOAgrCN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai", svoTest.svoOAgrAI.meanDevScore);
//		scores.put("SOV-o:ai", sovTest.sovOAgrAI.meanDevScore);
//		scores.put("VSO-o:ai", vsoTest.vsoOAgrAI.meanDevScore);
//		scores.put("VOS-o:ai", vosTest.vosOAgrAI.meanDevScore);
//		scores.put("OVS-o:ai", ovsTest.ovsOAgrAI.meanDevScore);
//		scores.put("OSV-o:ai", osvTest.osvOAgrAI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+nom", svoTest.svoOAgrAI_Nom.meanDevScore);
//		scores.put("SOV-o:ai+nom", sovTest.sovOAgrAI_Nom.meanDevScore);
//		scores.put("VSO-o:ai+nom", vsoTest.vsoOAgrAI_Nom.meanDevScore);
//		scores.put("VOS-o:ai+nom", vosTest.vosOAgrAI_Nom.meanDevScore);
//		scores.put("OVS-o:ai+nom", ovsTest.ovsOAgrAI_Nom.meanDevScore);
//		scores.put("OSV-o:ai+nom", osvTest.osvOAgrAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+acc", svoTest.svoOAgrAI_Acc.meanDevScore);
//		scores.put("SOV-o:ai+acc", sovTest.sovOAgrAI_Acc.meanDevScore);
//		scores.put("VSO-o:ai+acc", vsoTest.vsoOAgrAI_Acc.meanDevScore);
//		scores.put("VOS-o:ai+acc", vosTest.vosOAgrAI_Acc.meanDevScore);
//		scores.put("OVS-o:ai+acc", ovsTest.ovsOAgrAI_Acc.meanDevScore);
//		scores.put("OSV-o:ai+acc", osvTest.osvOAgrAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+nomacc", svoTest.svoOAgrAI_NomAcc.meanDevScore);
//		scores.put("SOV-o:ai+nomacc", sovTest.sovOAgrAI_NomAcc.meanDevScore);
//		scores.put("VSO-o:ai+nomacc", vsoTest.vsoOAgrAI_NomAcc.meanDevScore);
//		scores.put("VOS-o:ai+nomacc", vosTest.vosOAgrAI_NomAcc.meanDevScore);
//		scores.put("OVS-o:ai+nomacc", ovsTest.ovsOAgrAI_NomAcc.meanDevScore);
//		scores.put("OSV-o:ai+nomacc", osvTest.osvOAgrAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+erg", svoTest.svoOAgrAI_Erg.meanDevScore);
//		scores.put("SOV-o:ai+erg", sovTest.sovOAgrAI_Erg.meanDevScore);
//		scores.put("VSO-o:ai+erg", vsoTest.vsoOAgrAI_Erg.meanDevScore);
//		scores.put("VOS-o:ai+erg", vosTest.vosOAgrAI_Erg.meanDevScore);
//		scores.put("OVS-o:ai+erg", ovsTest.ovsOAgrAI_Erg.meanDevScore);
//		scores.put("OSV-o:ai+erg", osvTest.osvOAgrAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+abs", svoTest.svoOAgrAI_Abs.meanDevScore);
//		scores.put("SOV-o:ai+abs", sovTest.sovOAgrAI_Abs.meanDevScore);
//		scores.put("VSO-o:ai+abs", vsoTest.vsoOAgrAI_Abs.meanDevScore);
//		scores.put("VOS-o:ai+abs", vosTest.vosOAgrAI_Abs.meanDevScore);
//		scores.put("OVS-o:ai+abs", ovsTest.ovsOAgrAI_Abs.meanDevScore);
//		scores.put("OSV-o:ai+abs", osvTest.osvOAgrAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+ergabs", svoTest.svoOAgrAI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:ai+ergabs", sovTest.sovOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:ai+ergabs", vsoTest.vsoOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:ai+ergabs", vosTest.vosOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:ai+ergabs", ovsTest.ovsOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:ai+ergabs", osvTest.osvOAgrAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn", svoTest.svoOAgrHN.meanDevScore);
//		scores.put("SOV-o:hn", sovTest.sovOAgrHN.meanDevScore);
//		scores.put("VSO-o:hn", vsoTest.vsoOAgrHN.meanDevScore);
//		scores.put("VOS-o:hn", vosTest.vosOAgrHN.meanDevScore);
//		scores.put("OVS-o:hn", ovsTest.ovsOAgrHN.meanDevScore);
//		scores.put("OSV-o:hn", osvTest.osvOAgrHN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+nom", svoTest.svoOAgrHN_Nom.meanDevScore);
//		scores.put("SOV-o:hn+nom", sovTest.sovOAgrHN_Nom.meanDevScore);
//		scores.put("VSO-o:hn+nom", vsoTest.vsoOAgrHN_Nom.meanDevScore);
//		scores.put("VOS-o:hn+nom", vosTest.vosOAgrHN_Nom.meanDevScore);
//		scores.put("OVS-o:hn+nom", ovsTest.ovsOAgrHN_Nom.meanDevScore);
//		scores.put("OSV-o:hn+nom", osvTest.osvOAgrHN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+acc", svoTest.svoOAgrHN_Acc.meanDevScore);
//		scores.put("SOV-o:hn+acc", sovTest.sovOAgrHN_Acc.meanDevScore);
//		scores.put("VSO-o:hn+acc", vsoTest.vsoOAgrHN_Acc.meanDevScore);
//		scores.put("VOS-o:hn+acc", vosTest.vosOAgrHN_Acc.meanDevScore);
//		scores.put("OVS-o:hn+acc", ovsTest.ovsOAgrHN_Acc.meanDevScore);
//		scores.put("OSV-o:hn+acc", osvTest.osvOAgrHN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+nomacc", svoTest.svoOAgrHN_NomAcc.meanDevScore);
//		scores.put("SOV-o:hn+nomacc", sovTest.sovOAgrHN_NomAcc.meanDevScore);
//		scores.put("VSO-o:hn+nomacc", vsoTest.vsoOAgrHN_NomAcc.meanDevScore);
//		scores.put("VOS-o:hn+nomacc", vosTest.vosOAgrHN_NomAcc.meanDevScore);
//		scores.put("OVS-o:hn+nomacc", ovsTest.ovsOAgrHN_NomAcc.meanDevScore);
//		scores.put("OSV-o:hn+nomacc", osvTest.osvOAgrHN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+erg", svoTest.svoOAgrHN_Erg.meanDevScore);
//		scores.put("SOV-o:hn+erg", sovTest.sovOAgrHN_Erg.meanDevScore);
//		scores.put("VSO-o:hn+erg", vsoTest.vsoOAgrHN_Erg.meanDevScore);
//		scores.put("VOS-o:hn+erg", vosTest.vosOAgrHN_Erg.meanDevScore);
//		scores.put("OVS-o:hn+erg", ovsTest.ovsOAgrHN_Erg.meanDevScore);
//		scores.put("OSV-o:hn+erg", osvTest.osvOAgrHN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+abs", svoTest.svoOAgrHN_Abs.meanDevScore);
//		scores.put("SOV-o:hn+abs", sovTest.sovOAgrHN_Abs.meanDevScore);
//		scores.put("VSO-o:hn+abs", vsoTest.vsoOAgrHN_Abs.meanDevScore);
//		scores.put("VOS-o:hn+abs", vosTest.vosOAgrHN_Abs.meanDevScore);
//		scores.put("OVS-o:hn+abs", ovsTest.ovsOAgrHN_Abs.meanDevScore);
//		scores.put("OSV-o:hn+abs", osvTest.osvOAgrHN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+ergabs", svoTest.svoOAgrHN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:hn+ergabs", sovTest.sovOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:hn+ergabs", vsoTest.vsoOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:hn+ergabs", vosTest.vosOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:hn+ergabs", ovsTest.ovsOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:hn+ergabs", osvTest.osvOAgrHN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai", svoTest.svoOAgrHAI.meanDevScore);
//		scores.put("SOV-o:hai", sovTest.sovOAgrHAI.meanDevScore);
//		scores.put("VSO-o:hai", vsoTest.vsoOAgrHAI.meanDevScore);
//		scores.put("VOS-o:hai", vosTest.vosOAgrHAI.meanDevScore);
//		scores.put("OVS-o:hai", ovsTest.ovsOAgrHAI.meanDevScore);
//		scores.put("OSV-o:hai", osvTest.osvOAgrHAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+nom", svoTest.svoOAgrHAI_Nom.meanDevScore);
//		scores.put("SOV-o:hai+nom", sovTest.sovOAgrHAI_Nom.meanDevScore);
//		scores.put("VSO-o:hai+nom", vsoTest.vsoOAgrHAI_Nom.meanDevScore);
//		scores.put("VOS-o:hai+nom", vosTest.vosOAgrHAI_Nom.meanDevScore);
//		scores.put("OVS-o:hai+nom", ovsTest.ovsOAgrHAI_Nom.meanDevScore);
//		scores.put("OSV-o:hai+nom", osvTest.osvOAgrHAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+acc", svoTest.svoOAgrHAI_Acc.meanDevScore);
//		scores.put("SOV-o:hai+acc", sovTest.sovOAgrHAI_Acc.meanDevScore);
//		scores.put("VSO-o:hai+acc", vsoTest.vsoOAgrHAI_Acc.meanDevScore);
//		scores.put("VOS-o:hai+acc", vosTest.vosOAgrHAI_Acc.meanDevScore);
//		scores.put("OVS-o:hai+acc", ovsTest.ovsOAgrHAI_Acc.meanDevScore);
//		scores.put("OSV-o:hai+acc", osvTest.osvOAgrHAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+nomacc", svoTest.svoOAgrHAI_NomAcc.meanDevScore);
//		scores.put("SOV-o:hai+nomacc", sovTest.sovOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VSO-o:hai+nomacc", vsoTest.vsoOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VOS-o:hai+nomacc", vosTest.vosOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OVS-o:hai+nomacc", ovsTest.ovsOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OSV-o:hai+nomacc", osvTest.osvOAgrHAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+erg", svoTest.svoOAgrHAI_Erg.meanDevScore);
//		scores.put("SOV-o:hai+erg", sovTest.sovOAgrHAI_Erg.meanDevScore);
//		scores.put("VSO-o:hai+erg", vsoTest.vsoOAgrHAI_Erg.meanDevScore);
//		scores.put("VOS-o:hai+erg", vosTest.vosOAgrHAI_Erg.meanDevScore);
//		scores.put("OVS-o:hai+erg", ovsTest.ovsOAgrHAI_Erg.meanDevScore);
//		scores.put("OSV-o:hai+erg", osvTest.osvOAgrHAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+abs", svoTest.svoOAgrHAI_Abs.meanDevScore);
//		scores.put("SOV-o:hai+abs", sovTest.sovOAgrHAI_Abs.meanDevScore);
//		scores.put("VSO-o:hai+abs", vsoTest.vsoOAgrHAI_Abs.meanDevScore);
//		scores.put("VOS-o:hai+abs", vosTest.vosOAgrHAI_Abs.meanDevScore);
//		scores.put("OVS-o:hai+abs", ovsTest.ovsOAgrHAI_Abs.meanDevScore);
//		scores.put("OSV-o:hai+abs", osvTest.osvOAgrHAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+ergabs", svoTest.svoOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:hai+ergabs", sovTest.sovOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:hai+ergabs", vsoTest.vsoOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:hai+ergabs", vosTest.vosOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:hai+ergabs", ovsTest.ovsOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:hai+ergabs", osvTest.osvOAgrHAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm", svoTest.svoOAgrMNM.meanDevScore);
//		scores.put("SOV-o:mnm", sovTest.sovOAgrMNM.meanDevScore);
//		scores.put("VSO-o:mnm", vsoTest.vsoOAgrMNM.meanDevScore);
//		scores.put("VOS-o:mnm", vosTest.vosOAgrMNM.meanDevScore);
//		scores.put("OVS-o:mnm", ovsTest.ovsOAgrMNM.meanDevScore);
//		scores.put("OSV-o:mnm", osvTest.osvOAgrMNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+nom", svoTest.svoOAgrMNM_Nom.meanDevScore);
//		scores.put("SOV-o:mnm+nom", sovTest.sovOAgrMNM_Nom.meanDevScore);
//		scores.put("VSO-o:mnm+nom", vsoTest.vsoOAgrMNM_Nom.meanDevScore);
//		scores.put("VOS-o:mnm+nom", vosTest.vosOAgrMNM_Nom.meanDevScore);
//		scores.put("OVS-o:mnm+nom", ovsTest.ovsOAgrMNM_Nom.meanDevScore);
//		scores.put("OSV-o:mnm+nom", osvTest.osvOAgrMNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+acc", svoTest.svoOAgrMNM_Acc.meanDevScore);
//		scores.put("SOV-o:mnm+acc", sovTest.sovOAgrMNM_Acc.meanDevScore);
//		scores.put("VSO-o:mnm+acc", vsoTest.vsoOAgrMNM_Acc.meanDevScore);
//		scores.put("VOS-o:mnm+acc", vosTest.vosOAgrMNM_Acc.meanDevScore);
//		scores.put("OVS-o:mnm+acc", ovsTest.ovsOAgrMNM_Acc.meanDevScore);
//		scores.put("OSV-o:mnm+acc", osvTest.osvOAgrMNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+nomacc", svoTest.svoOAgrMNM_NomAcc.meanDevScore);
//		scores.put("SOV-o:mnm+nomacc", sovTest.sovOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VSO-o:mnm+nomacc", vsoTest.vsoOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VOS-o:mnm+nomacc", vosTest.vosOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OVS-o:mnm+nomacc", ovsTest.ovsOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OSV-o:mnm+nomacc", osvTest.osvOAgrMNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+erg", svoTest.svoOAgrMNM_Erg.meanDevScore);
//		scores.put("SOV-o:mnm+erg", sovTest.sovOAgrMNM_Erg.meanDevScore);
//		scores.put("VSO-o:mnm+erg", vsoTest.vsoOAgrMNM_Erg.meanDevScore);
//		scores.put("VOS-o:mnm+erg", vosTest.vosOAgrMNM_Erg.meanDevScore);
//		scores.put("OVS-o:mnm+erg", ovsTest.ovsOAgrMNM_Erg.meanDevScore);
//		scores.put("OSV-o:mnm+erg", osvTest.osvOAgrMNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+abs", svoTest.svoOAgrMNM_Abs.meanDevScore);
//		scores.put("SOV-o:mnm+abs", sovTest.sovOAgrMNM_Abs.meanDevScore);
//		scores.put("VSO-o:mnm+abs", vsoTest.vsoOAgrMNM_Abs.meanDevScore);
//		scores.put("VOS-o:mnm+abs", vosTest.vosOAgrMNM_Abs.meanDevScore);
//		scores.put("OVS-o:mnm+abs", ovsTest.ovsOAgrMNM_Abs.meanDevScore);
//		scores.put("OSV-o:mnm+abs", osvTest.osvOAgrMNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+ergabs", svoTest.svoOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("SOV-o:mnm+ergabs", sovTest.sovOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VSO-o:mnm+ergabs", vsoTest.vsoOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VOS-o:mnm+ergabs", vosTest.vosOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OVS-o:mnm+ergabs", ovsTest.ovsOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OSV-o:mnm+ergabs", osvTest.osvOAgrMNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf", svoTest.svoSOAgrMF.meanDevScore);
//		scores.put("SOV-so:mf", sovTest.sovSOAgrMF.meanDevScore);
//		scores.put("VSO-so:mf", vsoTest.vsoSOAgrMF.meanDevScore);
//		scores.put("VOS-so:mf", vosTest.vosSOAgrMF.meanDevScore);
//		scores.put("OVS-so:mf", ovsTest.ovsSOAgrMF.meanDevScore);
//		scores.put("OSV-so:mf", osvTest.osvSOAgrMF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+nom", svoTest.svoSOAgrMF_Nom.meanDevScore);
//		scores.put("SOV-so:mf+nom", sovTest.sovSOAgrMF_Nom.meanDevScore);
//		scores.put("VSO-so:mf+nom", vsoTest.vsoSOAgrMF_Nom.meanDevScore);
//		scores.put("VOS-so:mf+nom", vosTest.vosSOAgrMF_Nom.meanDevScore);
//		scores.put("OVS-so:mf+nom", ovsTest.ovsSOAgrMF_Nom.meanDevScore);
//		scores.put("OSV-so:mf+nom", osvTest.osvSOAgrMF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+acc", svoTest.svoSOAgrMF_Acc.meanDevScore);
//		scores.put("SOV-so:mf+acc", sovTest.sovSOAgrMF_Acc.meanDevScore);
//		scores.put("VSO-so:mf+acc", vsoTest.vsoSOAgrMF_Acc.meanDevScore);
//		scores.put("VOS-so:mf+acc", vosTest.vosSOAgrMF_Acc.meanDevScore);
//		scores.put("OVS-so:mf+acc", ovsTest.ovsSOAgrMF_Acc.meanDevScore);
//		scores.put("OSV-so:mf+acc", osvTest.osvSOAgrMF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+nomacc", svoTest.svoSOAgrMF_NomAcc.meanDevScore);
//		scores.put("SOV-so:mf+nomacc", sovTest.sovSOAgrMF_NomAcc.meanDevScore);
//		scores.put("VSO-so:mf+nomacc", vsoTest.vsoSOAgrMF_NomAcc.meanDevScore);
//		scores.put("VOS-so:mf+nomacc", vosTest.vosSOAgrMF_NomAcc.meanDevScore);
//		scores.put("OVS-so:mf+nomacc", ovsTest.ovsSOAgrMF_NomAcc.meanDevScore);
//		scores.put("OSV-so:mf+nomacc", osvTest.osvSOAgrMF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+erg", svoTest.svoSOAgrMF_Erg.meanDevScore);
//		scores.put("SOV-so:mf+erg", sovTest.sovSOAgrMF_Erg.meanDevScore);
//		scores.put("VSO-so:mf+erg", vsoTest.vsoSOAgrMF_Erg.meanDevScore);
//		scores.put("VOS-so:mf+erg", vosTest.vosSOAgrMF_Erg.meanDevScore);
//		scores.put("OVS-so:mf+erg", ovsTest.ovsSOAgrMF_Erg.meanDevScore);
//		scores.put("OSV-so:mf+erg", osvTest.osvSOAgrMF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+abs", svoTest.svoSOAgrMF_Abs.meanDevScore);
//		scores.put("SOV-so:mf+abs", sovTest.sovSOAgrMF_Abs.meanDevScore);
//		scores.put("VSO-so:mf+abs", vsoTest.vsoSOAgrMF_Abs.meanDevScore);
//		scores.put("VOS-so:mf+abs", vosTest.vosSOAgrMF_Abs.meanDevScore);
//		scores.put("OVS-so:mf+abs", ovsTest.ovsSOAgrMF_Abs.meanDevScore);
//		scores.put("OSV-so:mf+abs", osvTest.osvSOAgrMF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+ergabs", svoTest.svoSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("SOV-so:mf+ergabs", sovTest.sovSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VSO-so:mf+ergabs", vsoTest.vsoSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VOS-so:mf+ergabs", vosTest.vosSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OVS-so:mf+ergabs", ovsTest.ovsSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OSV-so:mf+ergabs", osvTest.osvSOAgrMF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn", svoTest.svoSOAgrMFN.meanDevScore);
//		scores.put("SOV-so:mfn", sovTest.sovSOAgrMFN.meanDevScore);
//		scores.put("VSO-so:mfn", vsoTest.vsoSOAgrMFN.meanDevScore);
//		scores.put("VOS-so:mfn", vosTest.vosSOAgrMFN.meanDevScore);
//		scores.put("OVS-so:mfn", ovsTest.ovsSOAgrMFN.meanDevScore);
//		scores.put("OSV-so:mfn", osvTest.osvSOAgrMFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+nom", svoTest.svoSOAgrMFN_Nom.meanDevScore);
//		scores.put("SOV-so:mfn+nom", sovTest.sovSOAgrMFN_Nom.meanDevScore);
//		scores.put("VSO-so:mfn+nom", vsoTest.vsoSOAgrMFN_Nom.meanDevScore);
//		scores.put("VOS-so:mfn+nom", vosTest.vosSOAgrMFN_Nom.meanDevScore);
//		scores.put("OVS-so:mfn+nom", ovsTest.ovsSOAgrMFN_Nom.meanDevScore);
//		scores.put("OSV-so:mfn+nom", osvTest.osvSOAgrMFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+acc", svoTest.svoSOAgrMFN_Acc.meanDevScore);
//		scores.put("SOV-so:mfn+acc", sovTest.sovSOAgrMFN_Acc.meanDevScore);
//		scores.put("VSO-so:mfn+acc", vsoTest.vsoSOAgrMFN_Acc.meanDevScore);
//		scores.put("VOS-so:mfn+acc", vosTest.vosSOAgrMFN_Acc.meanDevScore);
//		scores.put("OVS-so:mfn+acc", ovsTest.ovsSOAgrMFN_Acc.meanDevScore);
//		scores.put("OSV-so:mfn+acc", osvTest.osvSOAgrMFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+nomacc", svoTest.svoSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("SOV-so:mfn+nomacc", sovTest.sovSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VSO-so:mfn+nomacc", vsoTest.vsoSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VOS-so:mfn+nomacc", vosTest.vosSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OVS-so:mfn+nomacc", ovsTest.ovsSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OSV-so:mfn+nomacc", osvTest.osvSOAgrMFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+erg", svoTest.svoSOAgrMFN_Erg.meanDevScore);
//		scores.put("SOV-so:mfn+erg", sovTest.sovSOAgrMFN_Erg.meanDevScore);
//		scores.put("VSO-so:mfn+erg", vsoTest.vsoSOAgrMFN_Erg.meanDevScore);
//		scores.put("VOS-so:mfn+erg", vosTest.vosSOAgrMFN_Erg.meanDevScore);
//		scores.put("OVS-so:mfn+erg", ovsTest.ovsSOAgrMFN_Erg.meanDevScore);
//		scores.put("OSV-so:mfn+erg", osvTest.osvSOAgrMFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+abs", svoTest.svoSOAgrMFN_Abs.meanDevScore);
//		scores.put("SOV-so:mfn+abs", sovTest.sovSOAgrMFN_Abs.meanDevScore);
//		scores.put("VSO-so:mfn+abs", vsoTest.vsoSOAgrMFN_Abs.meanDevScore);
//		scores.put("VOS-so:mfn+abs", vosTest.vosSOAgrMFN_Abs.meanDevScore);
//		scores.put("OVS-so:mfn+abs", ovsTest.ovsSOAgrMFN_Abs.meanDevScore);
//		scores.put("OSV-so:mfn+abs", osvTest.osvSOAgrMFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+ergabs", svoTest.svoSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:mfn+ergabs", sovTest.sovSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:mfn+ergabs", vsoTest.vsoSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:mfn+ergabs", vosTest.vosSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:mfn+ergabs", ovsTest.ovsSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:mfn+ergabs", osvTest.osvSOAgrMFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn", svoTest.svoSOAgrCN.meanDevScore);
//		scores.put("SOV-so:cn", sovTest.sovSOAgrCN.meanDevScore);
//		scores.put("VSO-so:cn", vsoTest.vsoSOAgrCN.meanDevScore);
//		scores.put("VOS-so:cn", vosTest.vosSOAgrCN.meanDevScore);
//		scores.put("OVS-so:cn", ovsTest.ovsSOAgrCN.meanDevScore);
//		scores.put("OSV-so:cn", osvTest.osvSOAgrCN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+nom", svoTest.svoSOAgrCN_Nom.meanDevScore);
//		scores.put("SOV-so:cn+nom", sovTest.sovSOAgrCN_Nom.meanDevScore);
//		scores.put("VSO-so:cn+nom", vsoTest.vsoSOAgrCN_Nom.meanDevScore);
//		scores.put("VOS-so:cn+nom", vosTest.vosSOAgrCN_Nom.meanDevScore);
//		scores.put("OVS-so:cn+nom", ovsTest.ovsSOAgrCN_Nom.meanDevScore);
//		scores.put("OSV-so:cn+nom", osvTest.osvSOAgrCN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+acc", svoTest.svoSOAgrCN_Acc.meanDevScore);
//		scores.put("SOV-so:cn+acc", sovTest.sovSOAgrCN_Acc.meanDevScore);
//		scores.put("VSO-so:cn+acc", vsoTest.vsoSOAgrCN_Acc.meanDevScore);
//		scores.put("VOS-so:cn+acc", vosTest.vosSOAgrCN_Acc.meanDevScore);
//		scores.put("OVS-so:cn+acc", ovsTest.ovsSOAgrCN_Acc.meanDevScore);
//		scores.put("OSV-so:cn+acc", osvTest.osvSOAgrCN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+nomacc", svoTest.svoSOAgrCN_NomAcc.meanDevScore);
//		scores.put("SOV-so:cn+nomacc", sovTest.sovSOAgrCN_NomAcc.meanDevScore);
//		scores.put("VSO-so:cn+nomacc", vsoTest.vsoSOAgrCN_NomAcc.meanDevScore);
//		scores.put("VOS-so:cn+nomacc", vosTest.vosSOAgrCN_NomAcc.meanDevScore);
//		scores.put("OVS-so:cn+nomacc", ovsTest.ovsSOAgrCN_NomAcc.meanDevScore);
//		scores.put("OSV-so:cn+nomacc", osvTest.osvSOAgrCN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+erg", svoTest.svoSOAgrCN_Erg.meanDevScore);
//		scores.put("SOV-so:cn+erg", sovTest.sovSOAgrCN_Erg.meanDevScore);
//		scores.put("VSO-so:cn+erg", vsoTest.vsoSOAgrCN_Erg.meanDevScore);
//		scores.put("VOS-so:cn+erg", vosTest.vosSOAgrCN_Erg.meanDevScore);
//		scores.put("OVS-so:cn+erg", ovsTest.ovsSOAgrCN_Erg.meanDevScore);
//		scores.put("OSV-so:cn+erg", osvTest.osvSOAgrCN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+abs", svoTest.svoSOAgrCN_Abs.meanDevScore);
//		scores.put("SOV-so:cn+abs", sovTest.sovSOAgrCN_Abs.meanDevScore);
//		scores.put("VSO-so:cn+abs", vsoTest.vsoSOAgrCN_Abs.meanDevScore);
//		scores.put("VOS-so:cn+abs", vosTest.vosSOAgrCN_Abs.meanDevScore);
//		scores.put("OVS-so:cn+abs", ovsTest.ovsSOAgrCN_Abs.meanDevScore);
//		scores.put("OSV-so:cn+abs", osvTest.osvSOAgrCN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+ergabs", svoTest.svoSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:cn+ergabs", sovTest.sovSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:cn+ergabs", vsoTest.vsoSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:cn+ergabs", vosTest.vosSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:cn+ergabs", ovsTest.ovsSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:cn+ergabs", osvTest.osvSOAgrCN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai", svoTest.svoSOAgrAI.meanDevScore);
//		scores.put("SOV-so:ai", sovTest.sovSOAgrAI.meanDevScore);
//		scores.put("VSO-so:ai", vsoTest.vsoSOAgrAI.meanDevScore);
//		scores.put("VOS-so:ai", vosTest.vosSOAgrAI.meanDevScore);
//		scores.put("OVS-so:ai", ovsTest.ovsSOAgrAI.meanDevScore);
//		scores.put("OSV-so:ai", osvTest.osvSOAgrAI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+nom", svoTest.svoSOAgrAI_Nom.meanDevScore);
//		scores.put("SOV-so:ai+nom", sovTest.sovSOAgrAI_Nom.meanDevScore);
//		scores.put("VSO-so:ai+nom", vsoTest.vsoSOAgrAI_Nom.meanDevScore);
//		scores.put("VOS-so:ai+nom", vosTest.vosSOAgrAI_Nom.meanDevScore);
//		scores.put("OVS-so:ai+nom", ovsTest.ovsSOAgrAI_Nom.meanDevScore);
//		scores.put("OSV-so:ai+nom", osvTest.osvSOAgrAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+acc", svoTest.svoSOAgrAI_Acc.meanDevScore);
//		scores.put("SOV-so:ai+acc", sovTest.sovSOAgrAI_Acc.meanDevScore);
//		scores.put("VSO-so:ai+acc", vsoTest.vsoSOAgrAI_Acc.meanDevScore);
//		scores.put("VOS-so:ai+acc", vosTest.vosSOAgrAI_Acc.meanDevScore);
//		scores.put("OVS-so:ai+acc", ovsTest.ovsSOAgrAI_Acc.meanDevScore);
//		scores.put("OSV-so:ai+acc", osvTest.osvSOAgrAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+nomacc", svoTest.svoSOAgrAI_NomAcc.meanDevScore);
//		scores.put("SOV-so:ai+nomacc", sovTest.sovSOAgrAI_NomAcc.meanDevScore);
//		scores.put("VSO-so:ai+nomacc", vsoTest.vsoSOAgrAI_NomAcc.meanDevScore);
//		scores.put("VOS-so:ai+nomacc", vosTest.vosSOAgrAI_NomAcc.meanDevScore);
//		scores.put("OVS-so:ai+nomacc", ovsTest.ovsSOAgrAI_NomAcc.meanDevScore);
//		scores.put("OSV-so:ai+nomacc", osvTest.osvSOAgrAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+erg", svoTest.svoSOAgrAI_Erg.meanDevScore);
//		scores.put("SOV-so:ai+erg", sovTest.sovSOAgrAI_Erg.meanDevScore);
//		scores.put("VSO-so:ai+erg", vsoTest.vsoSOAgrAI_Erg.meanDevScore);
//		scores.put("VOS-so:ai+erg", vosTest.vosSOAgrAI_Erg.meanDevScore);
//		scores.put("OVS-so:ai+erg", ovsTest.ovsSOAgrAI_Erg.meanDevScore);
//		scores.put("OSV-so:ai+erg", osvTest.osvSOAgrAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+abs", svoTest.svoSOAgrAI_Abs.meanDevScore);
//		scores.put("SOV-so:ai+abs", sovTest.sovSOAgrAI_Abs.meanDevScore);
//		scores.put("VSO-so:ai+abs", vsoTest.vsoSOAgrAI_Abs.meanDevScore);
//		scores.put("VOS-so:ai+abs", vosTest.vosSOAgrAI_Abs.meanDevScore);
//		scores.put("OVS-so:ai+abs", ovsTest.ovsSOAgrAI_Abs.meanDevScore);
//		scores.put("OSV-so:ai+abs", osvTest.osvSOAgrAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+ergabs", svoTest.svoSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:ai+ergabs", sovTest.sovSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:ai+ergabs", vsoTest.vsoSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:ai+ergabs", vosTest.vosSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:ai+ergabs", ovsTest.ovsSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:ai+ergabs", osvTest.osvSOAgrAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn", svoTest.svoSOAgrHN.meanDevScore);
//		scores.put("SOV-so:hn", sovTest.sovSOAgrHN.meanDevScore);
//		scores.put("VSO-so:hn", vsoTest.vsoSOAgrHN.meanDevScore);
//		scores.put("VOS-so:hn", vosTest.vosSOAgrHN.meanDevScore);
//		scores.put("OVS-so:hn", ovsTest.ovsSOAgrHN.meanDevScore);
//		scores.put("OSV-so:hn", osvTest.osvSOAgrHN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+nom", svoTest.svoSOAgrHN_Nom.meanDevScore);
//		scores.put("SOV-so:hn+nom", sovTest.sovSOAgrHN_Nom.meanDevScore);
//		scores.put("VSO-so:hn+nom", vsoTest.vsoSOAgrHN_Nom.meanDevScore);
//		scores.put("VOS-so:hn+nom", vosTest.vosSOAgrHN_Nom.meanDevScore);
//		scores.put("OVS-so:hn+nom", ovsTest.ovsSOAgrHN_Nom.meanDevScore);
//		scores.put("OSV-so:hn+nom", osvTest.osvSOAgrHN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+acc", svoTest.svoSOAgrHN_Acc.meanDevScore);
//		scores.put("SOV-so:hn+acc", sovTest.sovSOAgrHN_Acc.meanDevScore);
//		scores.put("VSO-so:hn+acc", vsoTest.vsoSOAgrHN_Acc.meanDevScore);
//		scores.put("VOS-so:hn+acc", vosTest.vosSOAgrHN_Acc.meanDevScore);
//		scores.put("OVS-so:hn+acc", ovsTest.ovsSOAgrHN_Acc.meanDevScore);
//		scores.put("OSV-so:hn+acc", osvTest.osvSOAgrHN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+nomacc", svoTest.svoSOAgrHN_NomAcc.meanDevScore);
//		scores.put("SOV-so:hn+nomacc", sovTest.sovSOAgrHN_NomAcc.meanDevScore);
//		scores.put("VSO-so:hn+nomacc", vsoTest.vsoSOAgrHN_NomAcc.meanDevScore);
//		scores.put("VOS-so:hn+nomacc", vosTest.vosSOAgrHN_NomAcc.meanDevScore);
//		scores.put("OVS-so:hn+nomacc", ovsTest.ovsSOAgrHN_NomAcc.meanDevScore);
//		scores.put("OSV-so:hn+nomacc", osvTest.osvSOAgrHN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+erg", svoTest.svoSOAgrHN_Erg.meanDevScore);
//		scores.put("SOV-so:hn+erg", sovTest.sovSOAgrHN_Erg.meanDevScore);
//		scores.put("VSO-so:hn+erg", vsoTest.vsoSOAgrHN_Erg.meanDevScore);
//		scores.put("VOS-so:hn+erg", vosTest.vosSOAgrHN_Erg.meanDevScore);
//		scores.put("OVS-so:hn+erg", ovsTest.ovsSOAgrHN_Erg.meanDevScore);
//		scores.put("OSV-so:hn+erg", osvTest.osvSOAgrHN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+abs", svoTest.svoSOAgrHN_Abs.meanDevScore);
//		scores.put("SOV-so:hn+abs", sovTest.sovSOAgrHN_Abs.meanDevScore);
//		scores.put("VSO-so:hn+abs", vsoTest.vsoSOAgrHN_Abs.meanDevScore);
//		scores.put("VOS-so:hn+abs", vosTest.vosSOAgrHN_Abs.meanDevScore);
//		scores.put("OVS-so:hn+abs", ovsTest.ovsSOAgrHN_Abs.meanDevScore);
//		scores.put("OSV-so:hn+abs", osvTest.osvSOAgrHN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+ergabs", svoTest.svoSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:hn+ergabs", sovTest.sovSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:hn+ergabs", vsoTest.vsoSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:hn+ergabs", vosTest.vosSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:hn+ergabs", ovsTest.ovsSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:hn+ergabs", osvTest.osvSOAgrHN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai", svoTest.svoSOAgrHAI.meanDevScore);
//		scores.put("SOV-so:hai", sovTest.sovSOAgrHAI.meanDevScore);
//		scores.put("VSO-so:hai", vsoTest.vsoSOAgrHAI.meanDevScore);
//		scores.put("VOS-so:hai", vosTest.vosSOAgrHAI.meanDevScore);
//		scores.put("OVS-so:hai", ovsTest.ovsSOAgrHAI.meanDevScore);
//		scores.put("OSV-so:hai", osvTest.osvSOAgrHAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+nom", svoTest.svoSOAgrHAI_Nom.meanDevScore);
//		scores.put("SOV-so:hai+nom", sovTest.sovSOAgrHAI_Nom.meanDevScore);
//		scores.put("VSO-so:hai+nom", vsoTest.vsoSOAgrHAI_Nom.meanDevScore);
//		scores.put("VOS-so:hai+nom", vosTest.vosSOAgrHAI_Nom.meanDevScore);
//		scores.put("OVS-so:hai+nom", ovsTest.ovsSOAgrHAI_Nom.meanDevScore);
//		scores.put("OSV-so:hai+nom", osvTest.osvSOAgrHAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+acc", svoTest.svoSOAgrHAI_Acc.meanDevScore);
//		scores.put("SOV-so:hai+acc", sovTest.sovSOAgrHAI_Acc.meanDevScore);
//		scores.put("VSO-so:hai+acc", vsoTest.vsoSOAgrHAI_Acc.meanDevScore);
//		scores.put("VOS-so:hai+acc", vosTest.vosSOAgrHAI_Acc.meanDevScore);
//		scores.put("OVS-so:hai+acc", ovsTest.ovsSOAgrHAI_Acc.meanDevScore);
//		scores.put("OSV-so:hai+acc", osvTest.osvSOAgrHAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+nomacc", svoTest.svoSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("SOV-so:hai+nomacc", sovTest.sovSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VSO-so:hai+nomacc", vsoTest.vsoSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VOS-so:hai+nomacc", vosTest.vosSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OVS-so:hai+nomacc", ovsTest.ovsSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OSV-so:hai+nomacc", osvTest.osvSOAgrHAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+erg", svoTest.svoSOAgrHAI_Erg.meanDevScore);
//		scores.put("SOV-so:hai+erg", sovTest.sovSOAgrHAI_Erg.meanDevScore);
//		scores.put("VSO-so:hai+erg", vsoTest.vsoSOAgrHAI_Erg.meanDevScore);
//		scores.put("VOS-so:hai+erg", vosTest.vosSOAgrHAI_Erg.meanDevScore);
//		scores.put("OVS-so:hai+erg", ovsTest.ovsSOAgrHAI_Erg.meanDevScore);
//		scores.put("OSV-so:hai+erg", osvTest.osvSOAgrHAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+abs", svoTest.svoSOAgrHAI_Abs.meanDevScore);
//		scores.put("SOV-so:hai+abs", sovTest.sovSOAgrHAI_Abs.meanDevScore);
//		scores.put("VSO-so:hai+abs", vsoTest.vsoSOAgrHAI_Abs.meanDevScore);
//		scores.put("VOS-so:hai+abs", vosTest.vosSOAgrHAI_Abs.meanDevScore);
//		scores.put("OVS-so:hai+abs", ovsTest.ovsSOAgrHAI_Abs.meanDevScore);
//		scores.put("OSV-so:hai+abs", osvTest.osvSOAgrHAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+ergabs", svoTest.svoSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:hai+ergabs", sovTest.sovSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:hai+ergabs", vsoTest.vsoSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:hai+ergabs", vosTest.vosSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:hai+ergabs", ovsTest.ovsSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:hai+ergabs", osvTest.osvSOAgrHAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm", svoTest.svoSOAgrMNM.meanDevScore);
//		scores.put("SOV-so:mnm", sovTest.sovSOAgrMNM.meanDevScore);
//		scores.put("VSO-so:mnm", vsoTest.vsoSOAgrMNM.meanDevScore);
//		scores.put("VOS-so:mnm", vosTest.vosSOAgrMNM.meanDevScore);
//		scores.put("OVS-so:mnm", ovsTest.ovsSOAgrMNM.meanDevScore);
//		scores.put("OSV-so:mnm", osvTest.osvSOAgrMNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+nom", svoTest.svoSOAgrMNM_Nom.meanDevScore);
//		scores.put("SOV-so:mnm+nom", sovTest.sovSOAgrMNM_Nom.meanDevScore);
//		scores.put("VSO-so:mnm+nom", vsoTest.vsoSOAgrMNM_Nom.meanDevScore);
//		scores.put("VOS-so:mnm+nom", vosTest.vosSOAgrMNM_Nom.meanDevScore);
//		scores.put("OVS-so:mnm+nom", ovsTest.ovsSOAgrMNM_Nom.meanDevScore);
//		scores.put("OSV-so:mnm+nom", osvTest.osvSOAgrMNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+acc", svoTest.svoSOAgrMNM_Acc.meanDevScore);
//		scores.put("SOV-so:mnm+acc", sovTest.sovSOAgrMNM_Acc.meanDevScore);
//		scores.put("VSO-so:mnm+acc", vsoTest.vsoSOAgrMNM_Acc.meanDevScore);
//		scores.put("VOS-so:mnm+acc", vosTest.vosSOAgrMNM_Acc.meanDevScore);
//		scores.put("OVS-so:mnm+acc", ovsTest.ovsSOAgrMNM_Acc.meanDevScore);
//		scores.put("OSV-so:mnm+acc", osvTest.osvSOAgrMNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+nomacc", svoTest.svoSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("SOV-so:mnm+nomacc", sovTest.sovSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VSO-so:mnm+nomacc", vsoTest.vsoSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VOS-so:mnm+nomacc", vosTest.vosSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OVS-so:mnm+nomacc", ovsTest.ovsSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OSV-so:mnm+nomacc", osvTest.osvSOAgrMNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+erg", svoTest.svoSOAgrMNM_Erg.meanDevScore);
//		scores.put("SOV-so:mnm+erg", sovTest.sovSOAgrMNM_Erg.meanDevScore);
//		scores.put("VSO-so:mnm+erg", vsoTest.vsoSOAgrMNM_Erg.meanDevScore);
//		scores.put("VOS-so:mnm+erg", vosTest.vosSOAgrMNM_Erg.meanDevScore);
//		scores.put("OVS-so:mnm+erg", ovsTest.ovsSOAgrMNM_Erg.meanDevScore);
//		scores.put("OSV-so:mnm+erg", osvTest.osvSOAgrMNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+abs", svoTest.svoSOAgrMNM_Abs.meanDevScore);
//		scores.put("SOV-so:mnm+abs", sovTest.sovSOAgrMNM_Abs.meanDevScore);
//		scores.put("VSO-so:mnm+abs", vsoTest.vsoSOAgrMNM_Abs.meanDevScore);
//		scores.put("VOS-so:mnm+abs", vosTest.vosSOAgrMNM_Abs.meanDevScore);
//		scores.put("OVS-so:mnm+abs", ovsTest.ovsSOAgrMNM_Abs.meanDevScore);
//		scores.put("OSV-so:mnm+abs", osvTest.osvSOAgrMNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+ergabs", svoTest.svoSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("SOV-so:mnm+ergabs", sovTest.sovSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VSO-so:mnm+ergabs", vsoTest.vsoSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VOS-so:mnm+ergabs", vosTest.vosSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OVS-so:mnm+ergabs", ovsTest.ovsSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OSV-so:mnm+ergabs", osvTest.osvSOAgrMNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf", svoTest.svoSAgr123_SP_MF.meanDevScore);
//		scores.put("SOV-s:123+sp+mf", sovTest.sovSAgr123_SP_MF.meanDevScore);
//		scores.put("VSO-s:123+sp+mf", vsoTest.vsoSAgr123_SP_MF.meanDevScore);
//		scores.put("VOS-s:123+sp+mf", vosTest.vosSAgr123_SP_MF.meanDevScore);
//		scores.put("OVS-s:123+sp+mf", ovsTest.ovsSAgr123_SP_MF.meanDevScore);
//		scores.put("OSV-s:123+sp+mf", osvTest.osvSAgr123_SP_MF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+nom", svoTest.svoSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+nom", sovTest.sovSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+nom", vsoTest.vsoSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+nom", vosTest.vosSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+nom", ovsTest.ovsSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+nom", osvTest.osvSAgr123_SP_MF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+acc", svoTest.svoSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+acc", sovTest.sovSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+acc", vsoTest.vsoSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+acc", vosTest.vosSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+acc", ovsTest.ovsSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+acc", osvTest.osvSAgr123_SP_MF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+nomacc", svoTest.svoSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+nomacc", sovTest.sovSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+nomacc", vsoTest.vsoSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+nomacc", vosTest.vosSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+nomacc", ovsTest.ovsSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+nomacc", osvTest.osvSAgr123_SP_MF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+erg", svoTest.svoSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+erg", sovTest.sovSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+erg", vsoTest.vsoSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+erg", vosTest.vosSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+erg", ovsTest.ovsSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+erg", osvTest.osvSAgr123_SP_MF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+abs", svoTest.svoSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+abs", sovTest.sovSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+abs", vsoTest.vsoSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+abs", vosTest.vosSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+abs", ovsTest.ovsSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+abs", osvTest.osvSAgr123_SP_MF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+ergabs", svoTest.svoSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+ergabs", sovTest.sovSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+ergabs", vsoTest.vsoSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+ergabs", vosTest.vosSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+ergabs", ovsTest.ovsSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+ergabs", osvTest.osvSAgr123_SP_MF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn", svoTest.svoSAgr123_SP_MFN.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn", sovTest.sovSAgr123_SP_MFN.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn", vsoTest.vsoSAgr123_SP_MFN.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn", vosTest.vosSAgr123_SP_MFN.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn", ovsTest.ovsSAgr123_SP_MFN.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn", osvTest.osvSAgr123_SP_MFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+nom", svoTest.svoSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+nom", sovTest.sovSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+nom", vsoTest.vsoSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+nom", vosTest.vosSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+nom", ovsTest.ovsSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+nom", osvTest.osvSAgr123_SP_MFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+acc", svoTest.svoSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+acc", sovTest.sovSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+acc", vsoTest.vsoSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+acc", vosTest.vosSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+acc", ovsTest.ovsSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+acc", osvTest.osvSAgr123_SP_MFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+nomacc", svoTest.svoSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+nomacc", sovTest.sovSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+nomacc", vsoTest.vsoSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+nomacc", vosTest.vosSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+nomacc", ovsTest.ovsSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+nomacc", osvTest.osvSAgr123_SP_MFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+erg", svoTest.svoSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+erg", sovTest.sovSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+erg", vsoTest.vsoSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+erg", vosTest.vosSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+erg", ovsTest.ovsSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+erg", osvTest.osvSAgr123_SP_MFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+abs", svoTest.svoSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+abs", sovTest.sovSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+abs", vsoTest.vsoSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+abs", vosTest.vosSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+abs", ovsTest.ovsSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+abs", osvTest.osvSAgr123_SP_MFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+ergabs", svoTest.svoSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+ergabs", sovTest.sovSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+ergabs", vsoTest.vsoSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+ergabs", vosTest.vosSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+ergabs", ovsTest.ovsSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+ergabs", osvTest.osvSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn", svoTest.svoSAgr123_SP_CN.meanDevScore);
//		scores.put("SOV-s:123+sp+cn", sovTest.sovSAgr123_SP_CN.meanDevScore);
//		scores.put("VSO-s:123+sp+cn", vsoTest.vsoSAgr123_SP_CN.meanDevScore);
//		scores.put("VOS-s:123+sp+cn", vosTest.vosSAgr123_SP_CN.meanDevScore);
//		scores.put("OVS-s:123+sp+cn", ovsTest.ovsSAgr123_SP_CN.meanDevScore);
//		scores.put("OSV-s:123+sp+cn", osvTest.osvSAgr123_SP_CN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+nom", svoTest.svoSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+nom", sovTest.sovSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+nom", vsoTest.vsoSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+nom", vosTest.vosSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+nom", ovsTest.ovsSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+nom", osvTest.osvSAgr123_SP_CN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+acc", svoTest.svoSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+acc", sovTest.sovSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+acc", vsoTest.vsoSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+acc", vosTest.vosSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+acc", ovsTest.ovsSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+acc", osvTest.osvSAgr123_SP_CN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+nomacc", svoTest.svoSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+nomacc", sovTest.sovSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+nomacc", vsoTest.vsoSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+nomacc", vosTest.vosSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+nomacc", ovsTest.ovsSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+nomacc", osvTest.osvSAgr123_SP_CN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+erg", svoTest.svoSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+erg", sovTest.sovSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+erg", vsoTest.vsoSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+erg", vosTest.vosSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+erg", ovsTest.ovsSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+erg", osvTest.osvSAgr123_SP_CN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+abs", svoTest.svoSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+abs", sovTest.sovSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+abs", vsoTest.vsoSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+abs", vosTest.vosSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+abs", ovsTest.ovsSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+abs", osvTest.osvSAgr123_SP_CN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+ergabs", svoTest.svoSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+ergabs", sovTest.sovSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+ergabs", vsoTest.vsoSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+ergabs", vosTest.vosSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+ergabs", ovsTest.ovsSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+ergabs", osvTest.osvSAgr123_SP_CN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai", svoTest.svoSAgr123_SP_AI.meanDevScore);
//		scores.put("SOV-s:123+sp+ai", sovTest.sovSAgr123_SP_AI.meanDevScore);
//		scores.put("VSO-s:123+sp+ai", vsoTest.vsoSAgr123_SP_AI.meanDevScore);
//		scores.put("VOS-s:123+sp+ai", vosTest.vosSAgr123_SP_AI.meanDevScore);
//		scores.put("OVS-s:123+sp+ai", ovsTest.ovsSAgr123_SP_AI.meanDevScore);
//		scores.put("OSV-s:123+sp+ai", osvTest.osvSAgr123_SP_AI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+nom", svoTest.svoSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+nom", sovTest.sovSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+nom", vsoTest.vsoSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+nom", vosTest.vosSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+nom", ovsTest.ovsSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+nom", osvTest.osvSAgr123_SP_AI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+acc", svoTest.svoSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+acc", sovTest.sovSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+acc", vsoTest.vsoSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+acc", vosTest.vosSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+acc", ovsTest.ovsSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+acc", osvTest.osvSAgr123_SP_AI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+nomacc", svoTest.svoSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+nomacc", sovTest.sovSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+nomacc", vsoTest.vsoSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+nomacc", vosTest.vosSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+nomacc", ovsTest.ovsSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+nomacc", osvTest.osvSAgr123_SP_AI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+erg", svoTest.svoSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+erg", sovTest.sovSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+erg", vsoTest.vsoSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+erg", vosTest.vosSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+erg", ovsTest.ovsSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+erg", osvTest.osvSAgr123_SP_AI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+abs", svoTest.svoSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+abs", sovTest.sovSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+abs", vsoTest.vsoSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+abs", vosTest.vosSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+abs", ovsTest.ovsSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+abs", osvTest.osvSAgr123_SP_AI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+ergabs", svoTest.svoSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+ergabs", sovTest.sovSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+ergabs", vsoTest.vsoSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+ergabs", vosTest.vosSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+ergabs", ovsTest.ovsSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+ergabs", osvTest.osvSAgr123_SP_AI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn", svoTest.svoSAgr123_SP_HN.meanDevScore);
//		scores.put("SOV-s:123+sp+hn", sovTest.sovSAgr123_SP_HN.meanDevScore);
//		scores.put("VSO-s:123+sp+hn", vsoTest.vsoSAgr123_SP_HN.meanDevScore);
//		scores.put("VOS-s:123+sp+hn", vosTest.vosSAgr123_SP_HN.meanDevScore);
//		scores.put("OVS-s:123+sp+hn", ovsTest.ovsSAgr123_SP_HN.meanDevScore);
//		scores.put("OSV-s:123+sp+hn", osvTest.osvSAgr123_SP_HN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+nom", svoTest.svoSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+nom", sovTest.sovSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+nom", vsoTest.vsoSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+nom", vosTest.vosSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+nom", ovsTest.ovsSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+nom", osvTest.osvSAgr123_SP_HN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+acc", svoTest.svoSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+acc", sovTest.sovSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+acc", vsoTest.vsoSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+acc", vosTest.vosSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+acc", ovsTest.ovsSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+acc", osvTest.osvSAgr123_SP_HN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+nomacc", svoTest.svoSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+nomacc", sovTest.sovSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+nomacc", vsoTest.vsoSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+nomacc", vosTest.vosSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+nomacc", ovsTest.ovsSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+nomacc", osvTest.osvSAgr123_SP_HN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+erg", svoTest.svoSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+erg", sovTest.sovSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+erg", vsoTest.vsoSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+erg", vosTest.vosSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+erg", ovsTest.ovsSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+erg", osvTest.osvSAgr123_SP_HN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+abs", svoTest.svoSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+abs", sovTest.sovSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+abs", vsoTest.vsoSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+abs", vosTest.vosSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+abs", ovsTest.ovsSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+abs", osvTest.osvSAgr123_SP_HN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+ergabs", svoTest.svoSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+ergabs", sovTest.sovSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+ergabs", vsoTest.vsoSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+ergabs", vosTest.vosSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+ergabs", ovsTest.ovsSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+ergabs", osvTest.osvSAgr123_SP_HN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai", svoTest.svoSAgr123_SP_HAI.meanDevScore);
//		scores.put("SOV-s:123+sp+hai", sovTest.sovSAgr123_SP_HAI.meanDevScore);
//		scores.put("VSO-s:123+sp+hai", vsoTest.vsoSAgr123_SP_HAI.meanDevScore);
//		scores.put("VOS-s:123+sp+hai", vosTest.vosSAgr123_SP_HAI.meanDevScore);
//		scores.put("OVS-s:123+sp+hai", ovsTest.ovsSAgr123_SP_HAI.meanDevScore);
//		scores.put("OSV-s:123+sp+hai", osvTest.osvSAgr123_SP_HAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+nom", svoTest.svoSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+nom", sovTest.sovSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+nom", vsoTest.vsoSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+nom", vosTest.vosSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+nom", ovsTest.ovsSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+nom", osvTest.osvSAgr123_SP_HAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+acc", svoTest.svoSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+acc", sovTest.sovSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+acc", vsoTest.vsoSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+acc", vosTest.vosSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+acc", ovsTest.ovsSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+acc", osvTest.osvSAgr123_SP_HAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+nomacc", svoTest.svoSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+nomacc", sovTest.sovSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+nomacc", vsoTest.vsoSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+nomacc", vosTest.vosSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+nomacc", ovsTest.ovsSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+nomacc", osvTest.osvSAgr123_SP_HAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+erg", svoTest.svoSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+erg", sovTest.sovSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+erg", vsoTest.vsoSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+erg", vosTest.vosSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+erg", ovsTest.ovsSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+erg", osvTest.osvSAgr123_SP_HAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+abs", svoTest.svoSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+abs", sovTest.sovSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+abs", vsoTest.vsoSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+abs", vosTest.vosSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+abs", ovsTest.ovsSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+abs", osvTest.osvSAgr123_SP_HAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+ergabs", svoTest.svoSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+ergabs", sovTest.sovSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+ergabs", vsoTest.vsoSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+ergabs", vosTest.vosSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+ergabs", ovsTest.ovsSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+ergabs", osvTest.osvSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm", svoTest.svoSAgr123_SP_MNM.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm", sovTest.sovSAgr123_SP_MNM.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm", vsoTest.vsoSAgr123_SP_MNM.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm", vosTest.vosSAgr123_SP_MNM.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm", ovsTest.ovsSAgr123_SP_MNM.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm", osvTest.osvSAgr123_SP_MNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+nom", svoTest.svoSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+nom", sovTest.sovSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+nom", vsoTest.vsoSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+nom", vosTest.vosSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+nom", ovsTest.ovsSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+nom", osvTest.osvSAgr123_SP_MNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+acc", svoTest.svoSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+acc", sovTest.sovSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+acc", vsoTest.vsoSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+acc", vosTest.vosSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+acc", ovsTest.ovsSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+acc", osvTest.osvSAgr123_SP_MNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+nomacc", svoTest.svoSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+nomacc", sovTest.sovSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+nomacc", vsoTest.vsoSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+nomacc", vosTest.vosSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+nomacc", ovsTest.ovsSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+nomacc", osvTest.osvSAgr123_SP_MNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+erg", svoTest.svoSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+erg", sovTest.sovSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+erg", vsoTest.vsoSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+erg", vosTest.vosSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+erg", ovsTest.ovsSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+erg", osvTest.osvSAgr123_SP_MNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+abs", svoTest.svoSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+abs", sovTest.sovSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+abs", vsoTest.vsoSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+abs", vosTest.vosSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+abs", ovsTest.ovsSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+abs", osvTest.osvSAgr123_SP_MNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+ergabs", svoTest.svoSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+ergabs", sovTest.sovSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+ergabs", vsoTest.vsoSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+ergabs", vosTest.vosSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+ergabs", ovsTest.ovsSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+ergabs", osvTest.osvSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf", svoTest.svoOAgr123_SP_MF.meanDevScore);
//		scores.put("SOV-o:123+sp+mf", sovTest.sovOAgr123_SP_MF.meanDevScore);
//		scores.put("VSO-o:123+sp+mf", vsoTest.vsoOAgr123_SP_MF.meanDevScore);
//		scores.put("VOS-o:123+sp+mf", vosTest.vosOAgr123_SP_MF.meanDevScore);
//		scores.put("OVS-o:123+sp+mf", ovsTest.ovsOAgr123_SP_MF.meanDevScore);
//		scores.put("OSV-o:123+sp+mf", osvTest.osvOAgr123_SP_MF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+nom", svoTest.svoOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+nom", sovTest.sovOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+nom", vsoTest.vsoOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+nom", vosTest.vosOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+nom", ovsTest.ovsOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+nom", osvTest.osvOAgr123_SP_MF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+acc", svoTest.svoOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+acc", sovTest.sovOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+acc", vsoTest.vsoOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+acc", vosTest.vosOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+acc", ovsTest.ovsOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+acc", osvTest.osvOAgr123_SP_MF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+nomacc", svoTest.svoOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+nomacc", sovTest.sovOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+nomacc", vsoTest.vsoOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+nomacc", vosTest.vosOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+nomacc", ovsTest.ovsOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+nomacc", osvTest.osvOAgr123_SP_MF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+erg", svoTest.svoOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+erg", sovTest.sovOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+erg", vsoTest.vsoOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+erg", vosTest.vosOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+erg", ovsTest.ovsOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+erg", osvTest.osvOAgr123_SP_MF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+abs", svoTest.svoOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+abs", sovTest.sovOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+abs", vsoTest.vsoOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+abs", vosTest.vosOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+abs", ovsTest.ovsOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+abs", osvTest.osvOAgr123_SP_MF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+ergabs", svoTest.svoOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+ergabs", sovTest.sovOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+ergabs", vsoTest.vsoOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+ergabs", vosTest.vosOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+ergabs", ovsTest.ovsOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+ergabs", osvTest.osvOAgr123_SP_MF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn", svoTest.svoOAgr123_SP_MFN.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn", sovTest.sovOAgr123_SP_MFN.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn", vsoTest.vsoOAgr123_SP_MFN.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn", vosTest.vosOAgr123_SP_MFN.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn", ovsTest.ovsOAgr123_SP_MFN.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn", osvTest.osvOAgr123_SP_MFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+nom", svoTest.svoOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+nom", sovTest.sovOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+nom", vsoTest.vsoOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+nom", vosTest.vosOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+nom", ovsTest.ovsOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+nom", osvTest.osvOAgr123_SP_MFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+acc", svoTest.svoOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+acc", sovTest.sovOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+acc", vsoTest.vsoOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+acc", vosTest.vosOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+acc", ovsTest.ovsOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+acc", osvTest.osvOAgr123_SP_MFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+nomacc", svoTest.svoOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+nomacc", sovTest.sovOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+nomacc", vsoTest.vsoOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+nomacc", vosTest.vosOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+nomacc", ovsTest.ovsOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+nomacc", osvTest.osvOAgr123_SP_MFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+erg", svoTest.svoOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+erg", sovTest.sovOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+erg", vsoTest.vsoOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+erg", vosTest.vosOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+erg", ovsTest.ovsOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+erg", osvTest.osvOAgr123_SP_MFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+abs", svoTest.svoOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+abs", sovTest.sovOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+abs", vsoTest.vsoOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+abs", vosTest.vosOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+abs", ovsTest.ovsOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+abs", osvTest.osvOAgr123_SP_MFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+ergabs", svoTest.svoOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+ergabs", sovTest.sovOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+ergabs", vsoTest.vsoOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+ergabs", vosTest.vosOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+ergabs", ovsTest.ovsOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+ergabs", osvTest.osvOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn", svoTest.svoOAgr123_SP_CN.meanDevScore);
//		scores.put("SOV-o:123+sp+cn", sovTest.sovOAgr123_SP_CN.meanDevScore);
//		scores.put("VSO-o:123+sp+cn", vsoTest.vsoOAgr123_SP_CN.meanDevScore);
//		scores.put("VOS-o:123+sp+cn", vosTest.vosOAgr123_SP_CN.meanDevScore);
//		scores.put("OVS-o:123+sp+cn", ovsTest.ovsOAgr123_SP_CN.meanDevScore);
//		scores.put("OSV-o:123+sp+cn", osvTest.osvOAgr123_SP_CN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+nom", svoTest.svoOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+nom", sovTest.sovOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+nom", vsoTest.vsoOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+nom", vosTest.vosOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+nom", ovsTest.ovsOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+nom", osvTest.osvOAgr123_SP_CN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+acc", svoTest.svoOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+acc", sovTest.sovOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+acc", vsoTest.vsoOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+acc", vosTest.vosOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+acc", ovsTest.ovsOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+acc", osvTest.osvOAgr123_SP_CN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+nomacc", svoTest.svoOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+nomacc", sovTest.sovOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+nomacc", vsoTest.vsoOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+nomacc", vosTest.vosOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+nomacc", ovsTest.ovsOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+nomacc", osvTest.osvOAgr123_SP_CN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+erg", svoTest.svoOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+erg", sovTest.sovOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+erg", vsoTest.vsoOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+erg", vosTest.vosOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+erg", ovsTest.ovsOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+erg", osvTest.osvOAgr123_SP_CN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+abs", svoTest.svoOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+abs", sovTest.sovOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+abs", vsoTest.vsoOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+abs", vosTest.vosOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+abs", ovsTest.ovsOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+abs", osvTest.osvOAgr123_SP_CN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+ergabs", svoTest.svoOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+ergabs", sovTest.sovOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+ergabs", vsoTest.vsoOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+ergabs", vosTest.vosOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+ergabs", ovsTest.ovsOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+ergabs", osvTest.osvOAgr123_SP_CN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai", svoTest.svoOAgr123_SP_AI.meanDevScore);
//		scores.put("SOV-o:123+sp+ai", sovTest.sovOAgr123_SP_AI.meanDevScore);
//		scores.put("VSO-o:123+sp+ai", vsoTest.vsoOAgr123_SP_AI.meanDevScore);
//		scores.put("VOS-o:123+sp+ai", vosTest.vosOAgr123_SP_AI.meanDevScore);
//		scores.put("OVS-o:123+sp+ai", ovsTest.ovsOAgr123_SP_AI.meanDevScore);
//		scores.put("OSV-o:123+sp+ai", osvTest.osvOAgr123_SP_AI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+nom", svoTest.svoOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+nom", sovTest.sovOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+nom", vsoTest.vsoOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+nom", vosTest.vosOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+nom", ovsTest.ovsOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+nom", osvTest.osvOAgr123_SP_AI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+acc", svoTest.svoOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+acc", sovTest.sovOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+acc", vsoTest.vsoOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+acc", vosTest.vosOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+acc", ovsTest.ovsOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+acc", osvTest.osvOAgr123_SP_AI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+nomacc", svoTest.svoOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+nomacc", sovTest.sovOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+nomacc", vsoTest.vsoOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+nomacc", vosTest.vosOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+nomacc", ovsTest.ovsOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+nomacc", osvTest.osvOAgr123_SP_AI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+erg", svoTest.svoOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+erg", sovTest.sovOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+erg", vsoTest.vsoOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+erg", vosTest.vosOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+erg", ovsTest.ovsOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+erg", osvTest.osvOAgr123_SP_AI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+abs", svoTest.svoOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+abs", sovTest.sovOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+abs", vsoTest.vsoOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+abs", vosTest.vosOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+abs", ovsTest.ovsOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+abs", osvTest.osvOAgr123_SP_AI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+ergabs", svoTest.svoOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+ergabs", sovTest.sovOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+ergabs", vsoTest.vsoOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+ergabs", vosTest.vosOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+ergabs", ovsTest.ovsOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+ergabs", osvTest.osvOAgr123_SP_AI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn", svoTest.svoOAgr123_SP_HN.meanDevScore);
//		scores.put("SOV-o:123+sp+hn", sovTest.sovOAgr123_SP_HN.meanDevScore);
//		scores.put("VSO-o:123+sp+hn", vsoTest.vsoOAgr123_SP_HN.meanDevScore);
//		scores.put("VOS-o:123+sp+hn", vosTest.vosOAgr123_SP_HN.meanDevScore);
//		scores.put("OVS-o:123+sp+hn", ovsTest.ovsOAgr123_SP_HN.meanDevScore);
//		scores.put("OSV-o:123+sp+hn", osvTest.osvOAgr123_SP_HN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+nom", svoTest.svoOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+nom", sovTest.sovOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+nom", vsoTest.vsoOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+nom", vosTest.vosOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+nom", ovsTest.ovsOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+nom", osvTest.osvOAgr123_SP_HN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+acc", svoTest.svoOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+acc", sovTest.sovOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+acc", vsoTest.vsoOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+acc", vosTest.vosOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+acc", ovsTest.ovsOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+acc", osvTest.osvOAgr123_SP_HN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+nomacc", svoTest.svoOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+nomacc", sovTest.sovOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+nomacc", vsoTest.vsoOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+nomacc", vosTest.vosOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+nomacc", ovsTest.ovsOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+nomacc", osvTest.osvOAgr123_SP_HN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+erg", svoTest.svoOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+erg", sovTest.sovOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+erg", vsoTest.vsoOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+erg", vosTest.vosOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+erg", ovsTest.ovsOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+erg", osvTest.osvOAgr123_SP_HN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+abs", svoTest.svoOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+abs", sovTest.sovOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+abs", vsoTest.vsoOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+abs", vosTest.vosOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+abs", ovsTest.ovsOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+abs", osvTest.osvOAgr123_SP_HN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+ergabs", svoTest.svoOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+ergabs", sovTest.sovOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+ergabs", vsoTest.vsoOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+ergabs", vosTest.vosOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+ergabs", ovsTest.ovsOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+ergabs", osvTest.osvOAgr123_SP_HN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai", svoTest.svoOAgr123_SP_HAI.meanDevScore);
//		scores.put("SOV-o:123+sp+hai", sovTest.sovOAgr123_SP_HAI.meanDevScore);
//		scores.put("VSO-o:123+sp+hai", vsoTest.vsoOAgr123_SP_HAI.meanDevScore);
//		scores.put("VOS-o:123+sp+hai", vosTest.vosOAgr123_SP_HAI.meanDevScore);
//		scores.put("OVS-o:123+sp+hai", ovsTest.ovsOAgr123_SP_HAI.meanDevScore);
//		scores.put("OSV-o:123+sp+hai", osvTest.osvOAgr123_SP_HAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+nom", svoTest.svoOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+nom", sovTest.sovOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+nom", vsoTest.vsoOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+nom", vosTest.vosOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+nom", ovsTest.ovsOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+nom", osvTest.osvOAgr123_SP_HAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+acc", svoTest.svoOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+acc", sovTest.sovOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+acc", vsoTest.vsoOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+acc", vosTest.vosOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+acc", ovsTest.ovsOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+acc", osvTest.osvOAgr123_SP_HAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+nomacc", svoTest.svoOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+nomacc", sovTest.sovOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+nomacc", vsoTest.vsoOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+nomacc", vosTest.vosOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+nomacc", ovsTest.ovsOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+nomacc", osvTest.osvOAgr123_SP_HAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+erg", svoTest.svoOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+erg", sovTest.sovOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+erg", vsoTest.vsoOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+erg", vosTest.vosOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+erg", ovsTest.ovsOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+erg", osvTest.osvOAgr123_SP_HAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+abs", svoTest.svoOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+abs", sovTest.sovOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+abs", vsoTest.vsoOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+abs", vosTest.vosOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+abs", ovsTest.ovsOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+abs", osvTest.osvOAgr123_SP_HAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+ergabs", svoTest.svoOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+ergabs", sovTest.sovOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+ergabs", vsoTest.vsoOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+ergabs", vosTest.vosOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+ergabs", ovsTest.ovsOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+ergabs", osvTest.osvOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm", svoTest.svoOAgr123_SP_MNM.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm", sovTest.sovOAgr123_SP_MNM.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm", vsoTest.vsoOAgr123_SP_MNM.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm", vosTest.vosOAgr123_SP_MNM.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm", ovsTest.ovsOAgr123_SP_MNM.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm", osvTest.osvOAgr123_SP_MNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+nom", svoTest.svoOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+nom", sovTest.sovOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+nom", vsoTest.vsoOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+nom", vosTest.vosOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+nom", ovsTest.ovsOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+nom", osvTest.osvOAgr123_SP_MNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+acc", svoTest.svoOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+acc", sovTest.sovOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+acc", vsoTest.vsoOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+acc", vosTest.vosOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+acc", ovsTest.ovsOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+acc", osvTest.osvOAgr123_SP_MNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+nomacc", svoTest.svoOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+nomacc", sovTest.sovOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+nomacc", vsoTest.vsoOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+nomacc", vosTest.vosOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+nomacc", ovsTest.ovsOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+nomacc", osvTest.osvOAgr123_SP_MNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+erg", svoTest.svoOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+erg", sovTest.sovOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+erg", vsoTest.vsoOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+erg", vosTest.vosOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+erg", ovsTest.ovsOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+erg", osvTest.osvOAgr123_SP_MNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+abs", svoTest.svoOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+abs", sovTest.sovOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+abs", vsoTest.vsoOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+abs", vosTest.vosOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+abs", ovsTest.ovsOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+abs", osvTest.osvOAgr123_SP_MNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+ergabs", svoTest.svoOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+ergabs", sovTest.sovOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+ergabs", vsoTest.vsoOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+ergabs", vosTest.vosOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+ergabs", ovsTest.ovsOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+ergabs", osvTest.osvOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf", svoTest.svoSOAgr123_SP_MF.meanDevScore);
//		scores.put("SOV-so:123+sp+mf", sovTest.sovSOAgr123_SP_MF.meanDevScore);
//		scores.put("VSO-so:123+sp+mf", vsoTest.vsoSOAgr123_SP_MF.meanDevScore);
//		scores.put("VOS-so:123+sp+mf", vosTest.vosSOAgr123_SP_MF.meanDevScore);
//		scores.put("OVS-so:123+sp+mf", ovsTest.ovsSOAgr123_SP_MF.meanDevScore);
//		scores.put("OSV-so:123+sp+mf", osvTest.osvSOAgr123_SP_MF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+nom", svoTest.svoSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+nom", sovTest.sovSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+nom", vsoTest.vsoSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+nom", vosTest.vosSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+nom", ovsTest.ovsSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+nom", osvTest.osvSOAgr123_SP_MF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+acc", svoTest.svoSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+acc", sovTest.sovSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+acc", vsoTest.vsoSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+acc", vosTest.vosSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+acc", ovsTest.ovsSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+acc", osvTest.osvSOAgr123_SP_MF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+nomacc", svoTest.svoSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+nomacc", sovTest.sovSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+nomacc", vsoTest.vsoSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+nomacc", vosTest.vosSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+nomacc", ovsTest.ovsSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+nomacc", osvTest.osvSOAgr123_SP_MF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+erg", svoTest.svoSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+erg", sovTest.sovSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+erg", vsoTest.vsoSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+erg", vosTest.vosSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+erg", ovsTest.ovsSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+erg", osvTest.osvSOAgr123_SP_MF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+abs", svoTest.svoSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+abs", sovTest.sovSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+abs", vsoTest.vsoSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+abs", vosTest.vosSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+abs", ovsTest.ovsSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+abs", osvTest.osvSOAgr123_SP_MF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+ergabs", svoTest.svoSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+ergabs", sovTest.sovSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+ergabs", vsoTest.vsoSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+ergabs", vosTest.vosSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+ergabs", ovsTest.ovsSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+ergabs", osvTest.osvSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn", svoTest.svoSOAgr123_SP_MFN.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn", sovTest.sovSOAgr123_SP_MFN.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn", vsoTest.vsoSOAgr123_SP_MFN.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn", vosTest.vosSOAgr123_SP_MFN.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn", ovsTest.ovsSOAgr123_SP_MFN.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn", osvTest.osvSOAgr123_SP_MFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+nom", svoTest.svoSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+nom", sovTest.sovSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+nom", vsoTest.vsoSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+nom", vosTest.vosSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+nom", ovsTest.ovsSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+nom", osvTest.osvSOAgr123_SP_MFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+acc", svoTest.svoSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+acc", sovTest.sovSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+acc", vsoTest.vsoSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+acc", vosTest.vosSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+acc", ovsTest.ovsSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+acc", osvTest.osvSOAgr123_SP_MFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+nomacc", svoTest.svoSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+nomacc", sovTest.sovSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+nomacc", vsoTest.vsoSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+nomacc", vosTest.vosSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+nomacc", ovsTest.ovsSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+nomacc", osvTest.osvSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+erg", svoTest.svoSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+erg", sovTest.sovSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+erg", vsoTest.vsoSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+erg", vosTest.vosSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+erg", ovsTest.ovsSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+erg", osvTest.osvSOAgr123_SP_MFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+abs", svoTest.svoSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+abs", sovTest.sovSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+abs", vsoTest.vsoSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+abs", vosTest.vosSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+abs", ovsTest.ovsSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+abs", osvTest.osvSOAgr123_SP_MFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+ergabs", svoTest.svoSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+ergabs", sovTest.sovSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+ergabs", vsoTest.vsoSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+ergabs", vosTest.vosSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+ergabs", ovsTest.ovsSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+ergabs", osvTest.osvSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn", svoTest.svoSOAgr123_SP_CN.meanDevScore);
//		scores.put("SOV-so:123+sp+cn", sovTest.sovSOAgr123_SP_CN.meanDevScore);
//		scores.put("VSO-so:123+sp+cn", vsoTest.vsoSOAgr123_SP_CN.meanDevScore);
//		scores.put("VOS-so:123+sp+cn", vosTest.vosSOAgr123_SP_CN.meanDevScore);
//		scores.put("OVS-so:123+sp+cn", ovsTest.ovsSOAgr123_SP_CN.meanDevScore);
//		scores.put("OSV-so:123+sp+cn", osvTest.osvSOAgr123_SP_CN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+nom", svoTest.svoSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+nom", sovTest.sovSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+nom", vsoTest.vsoSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+nom", vosTest.vosSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+nom", ovsTest.ovsSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+nom", osvTest.osvSOAgr123_SP_CN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+acc", svoTest.svoSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+acc", sovTest.sovSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+acc", vsoTest.vsoSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+acc", vosTest.vosSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+acc", ovsTest.ovsSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+acc", osvTest.osvSOAgr123_SP_CN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+nomacc", svoTest.svoSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+nomacc", sovTest.sovSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+nomacc", vsoTest.vsoSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+nomacc", vosTest.vosSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+nomacc", ovsTest.ovsSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+nomacc", osvTest.osvSOAgr123_SP_CN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+erg", svoTest.svoSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+erg", sovTest.sovSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+erg", vsoTest.vsoSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+erg", vosTest.vosSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+erg", ovsTest.ovsSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+erg", osvTest.osvSOAgr123_SP_CN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+abs", svoTest.svoSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+abs", sovTest.sovSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+abs", vsoTest.vsoSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+abs", vosTest.vosSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+abs", ovsTest.ovsSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+abs", osvTest.osvSOAgr123_SP_CN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+ergabs", svoTest.svoSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+ergabs", sovTest.sovSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+ergabs", vsoTest.vsoSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+ergabs", vosTest.vosSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+ergabs", ovsTest.ovsSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+ergabs", osvTest.osvSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai", svoTest.svoSOAgr123_SP_AI.meanDevScore);
//		scores.put("SOV-so:123+sp+ai", sovTest.sovSOAgr123_SP_AI.meanDevScore);
//		scores.put("VSO-so:123+sp+ai", vsoTest.vsoSOAgr123_SP_AI.meanDevScore);
//		scores.put("VOS-so:123+sp+ai", vosTest.vosSOAgr123_SP_AI.meanDevScore);
//		scores.put("OVS-so:123+sp+ai", ovsTest.ovsSOAgr123_SP_AI.meanDevScore);
//		scores.put("OSV-so:123+sp+ai", osvTest.osvSOAgr123_SP_AI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+nom", svoTest.svoSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+nom", sovTest.sovSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+nom", vsoTest.vsoSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+nom", vosTest.vosSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+nom", ovsTest.ovsSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+nom", osvTest.osvSOAgr123_SP_AI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+acc", svoTest.svoSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+acc", sovTest.sovSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+acc", vsoTest.vsoSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+acc", vosTest.vosSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+acc", ovsTest.ovsSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+acc", osvTest.osvSOAgr123_SP_AI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+nomacc", svoTest.svoSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+nomacc", sovTest.sovSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+nomacc", vsoTest.vsoSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+nomacc", vosTest.vosSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+nomacc", ovsTest.ovsSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+nomacc", osvTest.osvSOAgr123_SP_AI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+erg", svoTest.svoSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+erg", sovTest.sovSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+erg", vsoTest.vsoSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+erg", vosTest.vosSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+erg", ovsTest.ovsSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+erg", osvTest.osvSOAgr123_SP_AI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+abs", svoTest.svoSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+abs", sovTest.sovSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+abs", vsoTest.vsoSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+abs", vosTest.vosSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+abs", ovsTest.ovsSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+abs", osvTest.osvSOAgr123_SP_AI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+ergabs", svoTest.svoSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+ergabs", sovTest.sovSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+ergabs", vsoTest.vsoSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+ergabs", vosTest.vosSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+ergabs", ovsTest.ovsSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+ergabs", osvTest.osvSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn", svoTest.svoSOAgr123_SP_HN.meanDevScore);
//		scores.put("SOV-so:123+sp+hn", sovTest.sovSOAgr123_SP_HN.meanDevScore);
//		scores.put("VSO-so:123+sp+hn", vsoTest.vsoSOAgr123_SP_HN.meanDevScore);
//		scores.put("VOS-so:123+sp+hn", vosTest.vosSOAgr123_SP_HN.meanDevScore);
//		scores.put("OVS-so:123+sp+hn", ovsTest.ovsSOAgr123_SP_HN.meanDevScore);
//		scores.put("OSV-so:123+sp+hn", osvTest.osvSOAgr123_SP_HN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+nom", svoTest.svoSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+nom", sovTest.sovSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+nom", vsoTest.vsoSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+nom", vosTest.vosSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+nom", ovsTest.ovsSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+nom", osvTest.osvSOAgr123_SP_HN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+acc", svoTest.svoSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+acc", sovTest.sovSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+acc", vsoTest.vsoSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+acc", vosTest.vosSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+acc", ovsTest.ovsSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+acc", osvTest.osvSOAgr123_SP_HN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+nomacc", svoTest.svoSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+nomacc", sovTest.sovSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+nomacc", vsoTest.vsoSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+nomacc", vosTest.vosSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+nomacc", ovsTest.ovsSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+nomacc", osvTest.osvSOAgr123_SP_HN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+erg", svoTest.svoSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+erg", sovTest.sovSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+erg", vsoTest.vsoSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+erg", vosTest.vosSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+erg", ovsTest.ovsSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+erg", osvTest.osvSOAgr123_SP_HN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+abs", svoTest.svoSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+abs", sovTest.sovSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+abs", vsoTest.vsoSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+abs", vosTest.vosSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+abs", ovsTest.ovsSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+abs", osvTest.osvSOAgr123_SP_HN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+ergabs", svoTest.svoSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+ergabs", sovTest.sovSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+ergabs", vsoTest.vsoSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+ergabs", vosTest.vosSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+ergabs", ovsTest.ovsSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+ergabs", osvTest.osvSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai", svoTest.svoSOAgr123_SP_HAI.meanDevScore);
//		scores.put("SOV-so:123+sp+hai", sovTest.sovSOAgr123_SP_HAI.meanDevScore);
//		scores.put("VSO-so:123+sp+hai", vsoTest.vsoSOAgr123_SP_HAI.meanDevScore);
//		scores.put("VOS-so:123+sp+hai", vosTest.vosSOAgr123_SP_HAI.meanDevScore);
//		scores.put("OVS-so:123+sp+hai", ovsTest.ovsSOAgr123_SP_HAI.meanDevScore);
//		scores.put("OSV-so:123+sp+hai", osvTest.osvSOAgr123_SP_HAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+nom", svoTest.svoSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+nom", sovTest.sovSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+nom", vsoTest.vsoSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+nom", vosTest.vosSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+nom", ovsTest.ovsSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+nom", osvTest.osvSOAgr123_SP_HAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+acc", svoTest.svoSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+acc", sovTest.sovSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+acc", vsoTest.vsoSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+acc", vosTest.vosSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+acc", ovsTest.ovsSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+acc", osvTest.osvSOAgr123_SP_HAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+nomacc", svoTest.svoSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+nomacc", sovTest.sovSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+nomacc", vsoTest.vsoSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+nomacc", vosTest.vosSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+nomacc", ovsTest.ovsSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+nomacc", osvTest.osvSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+erg", svoTest.svoSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+erg", sovTest.sovSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+erg", vsoTest.vsoSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+erg", vosTest.vosSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+erg", ovsTest.ovsSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+erg", osvTest.osvSOAgr123_SP_HAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+abs", svoTest.svoSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+abs", sovTest.sovSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+abs", vsoTest.vsoSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+abs", vosTest.vosSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+abs", ovsTest.ovsSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+abs", osvTest.osvSOAgr123_SP_HAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+ergabs", svoTest.svoSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+ergabs", sovTest.sovSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+ergabs", vsoTest.vsoSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+ergabs", vosTest.vosSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+ergabs", ovsTest.ovsSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+ergabs", osvTest.osvSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm", svoTest.svoSOAgr123_SP_MNM.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm", sovTest.sovSOAgr123_SP_MNM.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm", vsoTest.vsoSOAgr123_SP_MNM.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm", vosTest.vosSOAgr123_SP_MNM.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm", ovsTest.ovsSOAgr123_SP_MNM.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm", osvTest.osvSOAgr123_SP_MNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+nom", svoTest.svoSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+nom", sovTest.sovSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+nom", vsoTest.vsoSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+nom", vosTest.vosSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+nom", ovsTest.ovsSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+nom", osvTest.osvSOAgr123_SP_MNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+acc", svoTest.svoSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+acc", sovTest.sovSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+acc", vsoTest.vsoSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+acc", vosTest.vosSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+acc", ovsTest.ovsSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+acc", osvTest.osvSOAgr123_SP_MNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+nomacc", svoTest.svoSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+nomacc", sovTest.sovSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+nomacc", vsoTest.vsoSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+nomacc", vosTest.vosSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+nomacc", ovsTest.ovsSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+nomacc", osvTest.osvSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+erg", svoTest.svoSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+erg", sovTest.sovSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+erg", vsoTest.vsoSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+erg", vosTest.vosSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+erg", ovsTest.ovsSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+erg", osvTest.osvSOAgr123_SP_MNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+abs", svoTest.svoSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+abs", sovTest.sovSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+abs", vsoTest.vsoSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+abs", vosTest.vosSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+abs", ovsTest.ovsSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+abs", osvTest.osvSOAgr123_SP_MNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+ergabs", svoTest.svoSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+ergabs", sovTest.sovSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+ergabs", vsoTest.vsoSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+ergabs", vosTest.vosSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+ergabs", ovsTest.ovsSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+ergabs", osvTest.osvSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
		/////////////////////////////////////////////////////////////////////////////////////
		
		for(int k = 0; k < unranked.size(); k++) {
			List<HashMap.Entry<String, BigDecimal>> list = new LinkedList<HashMap.Entry<String, BigDecimal>>(unranked.get(k).entrySet()); 
			
			Collections.sort(list, new Comparator<HashMap.Entry<String, BigDecimal>>() { 
				public int compare(HashMap.Entry<String, BigDecimal> o1,  HashMap.Entry<String, BigDecimal> o2) {
					return (o1.getValue()).compareTo(o2.getValue()); 
				}
			});
			
		    System.out.println("rank:");
		    for (HashMap.Entry<String, BigDecimal> aa : list) {
		    	System.out.println(aa.getKey() + " " + aa.getValue());
		    }
		    System.out.println("");
		    
		}
	}
	
}
