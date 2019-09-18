package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class OSVTest extends Test {
	public Stats osv = new Stats();
	
	public Stats osvNomOnly = new Stats();
	public Stats osvAccOnly = new Stats();
	public Stats osvNomAcc = new Stats();
	public Stats osvErgOnly = new Stats();
	public Stats osvAbsOnly = new Stats();
	public Stats osvErgAbs = new Stats();
	
	public Stats osvSAgr123 = new Stats();
//	public Stats osvSAgrWe = new Stats();
	
	public Stats osvOAgr123 = new Stats();
//	public Stats osvOAgrWe = new Stats();
	
	public Stats osvSOAgr123 = new Stats();
//	public Stats osvSOAgrWe = new Stats();
	
	public Stats osvSAgrSP = new Stats();
	public Stats osvOAgrSP = new Stats();
	public Stats osvSOAgrSP = new Stats();
	
	public Stats osvSAgr123_SP = new Stats();
	public Stats osvSAgr123_SP_Nom = new Stats();
	public Stats osvSAgr123_SP_Acc = new Stats();
	public Stats osvSAgr123_SP_NomAcc = new Stats();
	public Stats osvSAgr123_SP_Erg = new Stats();
	public Stats osvSAgr123_SP_Abs = new Stats();
	public Stats osvSAgr123_SP_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP = new Stats();
	public Stats osvOAgr123_SP_Nom = new Stats();
	public Stats osvOAgr123_SP_Acc = new Stats();
	public Stats osvOAgr123_SP_NomAcc = new Stats();
	public Stats osvOAgr123_SP_Erg = new Stats();
	public Stats osvOAgr123_SP_Abs = new Stats();
	public Stats osvOAgr123_SP_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP = new Stats();
	public Stats osvSOAgr123_SP_Nom = new Stats();
	public Stats osvSOAgr123_SP_Acc = new Stats();
	public Stats osvSOAgr123_SP_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_Erg = new Stats();
	public Stats osvSOAgr123_SP_Abs = new Stats();
	public Stats osvSOAgr123_SP_ErgAbs = new Stats();
	
	public Stats osvSAgrMF = new Stats();
	public Stats osvSAgrMF_Nom = new Stats();
	public Stats osvSAgrMF_Acc = new Stats();
	public Stats osvSAgrMF_NomAcc = new Stats();
	public Stats osvSAgrMF_Erg = new Stats();
	public Stats osvSAgrMF_Abs = new Stats();
	public Stats osvSAgrMF_ErgAbs = new Stats();
	
	public Stats osvSAgrMFN = new Stats();
	public Stats osvSAgrMFN_Nom = new Stats();
	public Stats osvSAgrMFN_Acc = new Stats();
	public Stats osvSAgrMFN_NomAcc = new Stats();
	public Stats osvSAgrMFN_Erg = new Stats();
	public Stats osvSAgrMFN_Abs = new Stats();
	public Stats osvSAgrMFN_ErgAbs = new Stats();
	
	public Stats osvSAgrCN = new Stats();
	public Stats osvSAgrCN_Nom = new Stats();
	public Stats osvSAgrCN_Acc = new Stats();
	public Stats osvSAgrCN_NomAcc = new Stats();
	public Stats osvSAgrCN_Erg = new Stats();
	public Stats osvSAgrCN_Abs = new Stats();
	public Stats osvSAgrCN_ErgAbs = new Stats();
	
	public Stats osvSAgrAI = new Stats();
	public Stats osvSAgrAI_Nom = new Stats();
	public Stats osvSAgrAI_Acc = new Stats();
	public Stats osvSAgrAI_NomAcc = new Stats();
	public Stats osvSAgrAI_Erg = new Stats();
	public Stats osvSAgrAI_Abs = new Stats();
	public Stats osvSAgrAI_ErgAbs = new Stats();
	
	public Stats osvSAgrHN = new Stats();
	public Stats osvSAgrHN_Nom = new Stats();
	public Stats osvSAgrHN_Acc = new Stats();
	public Stats osvSAgrHN_NomAcc = new Stats();
	public Stats osvSAgrHN_Erg = new Stats();
	public Stats osvSAgrHN_Abs = new Stats();
	public Stats osvSAgrHN_ErgAbs = new Stats();
	
	public Stats osvSAgrHAI = new Stats();
	public Stats osvSAgrHAI_Nom = new Stats();
	public Stats osvSAgrHAI_Acc = new Stats();
	public Stats osvSAgrHAI_NomAcc = new Stats();
	public Stats osvSAgrHAI_Erg = new Stats();
	public Stats osvSAgrHAI_Abs = new Stats();
	public Stats osvSAgrHAI_ErgAbs = new Stats();
	
	public Stats osvSAgrMNM = new Stats();
	public Stats osvSAgrMNM_Nom = new Stats();
	public Stats osvSAgrMNM_Acc = new Stats();
	public Stats osvSAgrMNM_NomAcc = new Stats();
	public Stats osvSAgrMNM_Erg = new Stats();
	public Stats osvSAgrMNM_Abs = new Stats();
	public Stats osvSAgrMNM_ErgAbs = new Stats();
	
	public Stats osvOAgrMF = new Stats();
	public Stats osvOAgrMF_Nom = new Stats();
	public Stats osvOAgrMF_Acc = new Stats();
	public Stats osvOAgrMF_NomAcc = new Stats();
	public Stats osvOAgrMF_Erg = new Stats();
	public Stats osvOAgrMF_Abs = new Stats();
	public Stats osvOAgrMF_ErgAbs = new Stats();
	
	public Stats osvOAgrMFN = new Stats();
	public Stats osvOAgrMFN_Nom = new Stats();
	public Stats osvOAgrMFN_Acc = new Stats();
	public Stats osvOAgrMFN_NomAcc = new Stats();
	public Stats osvOAgrMFN_Erg = new Stats();
	public Stats osvOAgrMFN_Abs = new Stats();
	public Stats osvOAgrMFN_ErgAbs = new Stats();
	
	public Stats osvOAgrCN = new Stats();
	public Stats osvOAgrCN_Nom = new Stats();
	public Stats osvOAgrCN_Acc = new Stats();
	public Stats osvOAgrCN_NomAcc = new Stats();
	public Stats osvOAgrCN_Erg = new Stats();
	public Stats osvOAgrCN_Abs = new Stats();
	public Stats osvOAgrCN_ErgAbs = new Stats();
	
	public Stats osvOAgrAI = new Stats();
	public Stats osvOAgrAI_Nom = new Stats();
	public Stats osvOAgrAI_Acc = new Stats();
	public Stats osvOAgrAI_NomAcc = new Stats();
	public Stats osvOAgrAI_Erg = new Stats();
	public Stats osvOAgrAI_Abs = new Stats();
	public Stats osvOAgrAI_ErgAbs = new Stats();
	
	public Stats osvOAgrHN = new Stats();
	public Stats osvOAgrHN_Nom = new Stats();
	public Stats osvOAgrHN_Acc = new Stats();
	public Stats osvOAgrHN_NomAcc = new Stats();
	public Stats osvOAgrHN_Erg = new Stats();
	public Stats osvOAgrHN_Abs = new Stats();
	public Stats osvOAgrHN_ErgAbs = new Stats();
	
	public Stats osvOAgrHAI = new Stats();
	public Stats osvOAgrHAI_Nom = new Stats();
	public Stats osvOAgrHAI_Acc = new Stats();
	public Stats osvOAgrHAI_NomAcc = new Stats();
	public Stats osvOAgrHAI_Erg = new Stats();
	public Stats osvOAgrHAI_Abs = new Stats();
	public Stats osvOAgrHAI_ErgAbs = new Stats();
	
	public Stats osvOAgrMNM = new Stats();
	public Stats osvOAgrMNM_Nom = new Stats();
	public Stats osvOAgrMNM_Acc = new Stats();
	public Stats osvOAgrMNM_NomAcc = new Stats();
	public Stats osvOAgrMNM_Erg = new Stats();
	public Stats osvOAgrMNM_Abs = new Stats();
	public Stats osvOAgrMNM_ErgAbs = new Stats();
	
	public Stats osvSOAgrMF = new Stats();
	public Stats osvSOAgrMF_Nom = new Stats();
	public Stats osvSOAgrMF_Acc = new Stats();
	public Stats osvSOAgrMF_NomAcc = new Stats();
	public Stats osvSOAgrMF_Erg = new Stats();
	public Stats osvSOAgrMF_Abs = new Stats();
	public Stats osvSOAgrMF_ErgAbs = new Stats();
	
	public Stats osvSOAgrMFN = new Stats();
	public Stats osvSOAgrMFN_Nom = new Stats();
	public Stats osvSOAgrMFN_Acc = new Stats();
	public Stats osvSOAgrMFN_NomAcc = new Stats();
	public Stats osvSOAgrMFN_Erg = new Stats();
	public Stats osvSOAgrMFN_Abs = new Stats();
	public Stats osvSOAgrMFN_ErgAbs = new Stats();
	
	public Stats osvSOAgrCN = new Stats();
	public Stats osvSOAgrCN_Nom = new Stats();
	public Stats osvSOAgrCN_Acc = new Stats();
	public Stats osvSOAgrCN_NomAcc = new Stats();
	public Stats osvSOAgrCN_Erg = new Stats();
	public Stats osvSOAgrCN_Abs = new Stats();
	public Stats osvSOAgrCN_ErgAbs = new Stats();
	
	public Stats osvSOAgrAI = new Stats();
	public Stats osvSOAgrAI_Nom = new Stats();
	public Stats osvSOAgrAI_Acc = new Stats();
	public Stats osvSOAgrAI_NomAcc = new Stats();
	public Stats osvSOAgrAI_Erg = new Stats();
	public Stats osvSOAgrAI_Abs = new Stats();
	public Stats osvSOAgrAI_ErgAbs = new Stats();
	
	public Stats osvSOAgrHN = new Stats();
	public Stats osvSOAgrHN_Nom = new Stats();
	public Stats osvSOAgrHN_Acc = new Stats();
	public Stats osvSOAgrHN_NomAcc = new Stats();
	public Stats osvSOAgrHN_Erg = new Stats();
	public Stats osvSOAgrHN_Abs = new Stats();
	public Stats osvSOAgrHN_ErgAbs = new Stats();
	
	public Stats osvSOAgrHAI = new Stats();
	public Stats osvSOAgrHAI_Nom = new Stats();
	public Stats osvSOAgrHAI_Acc = new Stats();
	public Stats osvSOAgrHAI_NomAcc = new Stats();
	public Stats osvSOAgrHAI_Erg = new Stats();
	public Stats osvSOAgrHAI_Abs = new Stats();
	public Stats osvSOAgrHAI_ErgAbs = new Stats();
	
	public Stats osvSOAgrMNM = new Stats();
	public Stats osvSOAgrMNM_Nom = new Stats();
	public Stats osvSOAgrMNM_Acc = new Stats();
	public Stats osvSOAgrMNM_NomAcc = new Stats();
	public Stats osvSOAgrMNM_Erg = new Stats();
	public Stats osvSOAgrMNM_Abs = new Stats();
	public Stats osvSOAgrMNM_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_MF = new Stats();
	public Stats osvSAgr123_SP_MF_Nom = new Stats();
	public Stats osvSAgr123_SP_MF_Acc = new Stats();
	public Stats osvSAgr123_SP_MF_NomAcc = new Stats();
	public Stats osvSAgr123_SP_MF_Erg = new Stats();
	public Stats osvSAgr123_SP_MF_Abs = new Stats();
	public Stats osvSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_MFN = new Stats();
	public Stats osvSAgr123_SP_MFN_Nom = new Stats();
	public Stats osvSAgr123_SP_MFN_Acc = new Stats();
	public Stats osvSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats osvSAgr123_SP_MFN_Erg = new Stats();
	public Stats osvSAgr123_SP_MFN_Abs = new Stats();
	public Stats osvSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_CN = new Stats();
	public Stats osvSAgr123_SP_CN_Nom = new Stats();
	public Stats osvSAgr123_SP_CN_Acc = new Stats();
	public Stats osvSAgr123_SP_CN_NomAcc = new Stats();
	public Stats osvSAgr123_SP_CN_Erg = new Stats();
	public Stats osvSAgr123_SP_CN_Abs = new Stats();
	public Stats osvSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_AI = new Stats();
	public Stats osvSAgr123_SP_AI_Nom = new Stats();
	public Stats osvSAgr123_SP_AI_Acc = new Stats();
	public Stats osvSAgr123_SP_AI_NomAcc = new Stats();
	public Stats osvSAgr123_SP_AI_Erg = new Stats();
	public Stats osvSAgr123_SP_AI_Abs = new Stats();
	public Stats osvSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_HN = new Stats();
	public Stats osvSAgr123_SP_HN_Nom = new Stats();
	public Stats osvSAgr123_SP_HN_Acc = new Stats();
	public Stats osvSAgr123_SP_HN_NomAcc = new Stats();
	public Stats osvSAgr123_SP_HN_Erg = new Stats();
	public Stats osvSAgr123_SP_HN_Abs = new Stats();
	public Stats osvSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_HAI = new Stats();
	public Stats osvSAgr123_SP_HAI_Nom = new Stats();
	public Stats osvSAgr123_SP_HAI_Acc = new Stats();
	public Stats osvSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats osvSAgr123_SP_HAI_Erg = new Stats();
	public Stats osvSAgr123_SP_HAI_Abs = new Stats();
	public Stats osvSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_MNM = new Stats();
	public Stats osvSAgr123_SP_MNM_Nom = new Stats();
	public Stats osvSAgr123_SP_MNM_Acc = new Stats();
	public Stats osvSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats osvSAgr123_SP_MNM_Erg = new Stats();
	public Stats osvSAgr123_SP_MNM_Abs = new Stats();
	public Stats osvSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_MF = new Stats();
	public Stats osvOAgr123_SP_MF_Nom = new Stats();
	public Stats osvOAgr123_SP_MF_Acc = new Stats();
	public Stats osvOAgr123_SP_MF_NomAcc = new Stats();
	public Stats osvOAgr123_SP_MF_Erg = new Stats();
	public Stats osvOAgr123_SP_MF_Abs = new Stats();
	public Stats osvOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_MFN = new Stats();
	public Stats osvOAgr123_SP_MFN_Nom = new Stats();
	public Stats osvOAgr123_SP_MFN_Acc = new Stats();
	public Stats osvOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats osvOAgr123_SP_MFN_Erg = new Stats();
	public Stats osvOAgr123_SP_MFN_Abs = new Stats();
	public Stats osvOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_CN = new Stats();
	public Stats osvOAgr123_SP_CN_Nom = new Stats();
	public Stats osvOAgr123_SP_CN_Acc = new Stats();
	public Stats osvOAgr123_SP_CN_NomAcc = new Stats();
	public Stats osvOAgr123_SP_CN_Erg = new Stats();
	public Stats osvOAgr123_SP_CN_Abs = new Stats();
	public Stats osvOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_AI = new Stats();
	public Stats osvOAgr123_SP_AI_Nom = new Stats();
	public Stats osvOAgr123_SP_AI_Acc = new Stats();
	public Stats osvOAgr123_SP_AI_NomAcc = new Stats();
	public Stats osvOAgr123_SP_AI_Erg = new Stats();
	public Stats osvOAgr123_SP_AI_Abs = new Stats();
	public Stats osvOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_HN = new Stats();
	public Stats osvOAgr123_SP_HN_Nom = new Stats();
	public Stats osvOAgr123_SP_HN_Acc = new Stats();
	public Stats osvOAgr123_SP_HN_NomAcc = new Stats();
	public Stats osvOAgr123_SP_HN_Erg = new Stats();
	public Stats osvOAgr123_SP_HN_Abs = new Stats();
	public Stats osvOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_HAI = new Stats();
	public Stats osvOAgr123_SP_HAI_Nom = new Stats();
	public Stats osvOAgr123_SP_HAI_Acc = new Stats();
	public Stats osvOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats osvOAgr123_SP_HAI_Erg = new Stats();
	public Stats osvOAgr123_SP_HAI_Abs = new Stats();
	public Stats osvOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_MNM = new Stats();
	public Stats osvOAgr123_SP_MNM_Nom = new Stats();
	public Stats osvOAgr123_SP_MNM_Acc = new Stats();
	public Stats osvOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats osvOAgr123_SP_MNM_Erg = new Stats();
	public Stats osvOAgr123_SP_MNM_Abs = new Stats();
	public Stats osvOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_MF = new Stats();
	public Stats osvSOAgr123_SP_MF_Nom = new Stats();
	public Stats osvSOAgr123_SP_MF_Acc = new Stats();
	public Stats osvSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_MF_Erg = new Stats();
	public Stats osvSOAgr123_SP_MF_Abs = new Stats();
	public Stats osvSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_MFN = new Stats();
	public Stats osvSOAgr123_SP_MFN_Nom = new Stats();
	public Stats osvSOAgr123_SP_MFN_Acc = new Stats();
	public Stats osvSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_MFN_Erg = new Stats();
	public Stats osvSOAgr123_SP_MFN_Abs = new Stats();
	public Stats osvSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_CN = new Stats();
	public Stats osvSOAgr123_SP_CN_Nom = new Stats();
	public Stats osvSOAgr123_SP_CN_Acc = new Stats();
	public Stats osvSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_CN_Erg = new Stats();
	public Stats osvSOAgr123_SP_CN_Abs = new Stats();
	public Stats osvSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_AI = new Stats();
	public Stats osvSOAgr123_SP_AI_Nom = new Stats();
	public Stats osvSOAgr123_SP_AI_Acc = new Stats();
	public Stats osvSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_AI_Erg = new Stats();
	public Stats osvSOAgr123_SP_AI_Abs = new Stats();
	public Stats osvSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_HN = new Stats();
	public Stats osvSOAgr123_SP_HN_Nom = new Stats();
	public Stats osvSOAgr123_SP_HN_Acc = new Stats();
	public Stats osvSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_HN_Erg = new Stats();
	public Stats osvSOAgr123_SP_HN_Abs = new Stats();
	public Stats osvSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_HAI = new Stats();
	public Stats osvSOAgr123_SP_HAI_Nom = new Stats();
	public Stats osvSOAgr123_SP_HAI_Acc = new Stats();
	public Stats osvSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_HAI_Erg = new Stats();
	public Stats osvSOAgr123_SP_HAI_Abs = new Stats();
	public Stats osvSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_MNM = new Stats();
	public Stats osvSOAgr123_SP_MNM_Nom = new Stats();
	public Stats osvSOAgr123_SP_MNM_Acc = new Stats();
	public Stats osvSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_MNM_Erg = new Stats();
	public Stats osvSOAgr123_SP_MNM_Abs = new Stats();
	public Stats osvSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public OSVTest() {
		all = new Stats[]{osv, osvNomOnly, osvAccOnly, osvNomAcc, osvErgOnly, osvAbsOnly, osvErgAbs,
				osvSAgr123, /*osvSAgrWe,*/ osvOAgr123, /*osvOAgrWe,*/ osvSOAgr123, /*osvSOAgrWe,*/
				osvSAgrSP, osvOAgrSP, osvSOAgrSP,
				osvSAgr123_SP, osvSAgr123_SP_Nom, osvSAgr123_SP_Acc, osvSAgr123_SP_NomAcc, osvSAgr123_SP_Erg, osvSAgr123_SP_Abs, osvSAgr123_SP_ErgAbs,
				osvOAgr123_SP, osvOAgr123_SP_Nom, osvOAgr123_SP_Acc, osvOAgr123_SP_NomAcc, osvOAgr123_SP_Erg, osvOAgr123_SP_Abs, osvOAgr123_SP_ErgAbs,
				osvSOAgr123_SP, osvSOAgr123_SP_Nom, osvSOAgr123_SP_Acc, osvSOAgr123_SP_NomAcc, osvSOAgr123_SP_Erg, osvSOAgr123_SP_Abs, osvSOAgr123_SP_ErgAbs,
				osvSAgrMF, osvSAgrMF_Nom, osvSAgrMF_Acc, osvSAgrMF_NomAcc, osvSAgrMF_Erg, osvSAgrMF_Abs, osvSAgrMF_ErgAbs,
				osvSAgrMFN, osvSAgrMFN_Nom, osvSAgrMFN_Acc, osvSAgrMFN_NomAcc, osvSAgrMFN_Erg, osvSAgrMFN_Abs, osvSAgrMFN_ErgAbs,
				osvSAgrCN, osvSAgrCN_Nom, osvSAgrCN_Acc, osvSAgrCN_NomAcc, osvSAgrCN_Erg, osvSAgrCN_Abs, osvSAgrCN_ErgAbs,
				osvSAgrAI, osvSAgrAI_Nom, osvSAgrAI_Acc, osvSAgrAI_NomAcc, osvSAgrAI_Erg, osvSAgrAI_Abs, osvSAgrAI_ErgAbs,
				osvSAgrHN, osvSAgrHN_Nom, osvSAgrHN_Acc, osvSAgrHN_NomAcc, osvSAgrHN_Erg, osvSAgrHN_Abs, osvSAgrHN_ErgAbs,
				osvSAgrHAI, osvSAgrHAI_Nom, osvSAgrHAI_Acc, osvSAgrHAI_NomAcc, osvSAgrHAI_Erg, osvSAgrHAI_Abs, osvSAgrHAI_ErgAbs,
				osvSAgrMNM, osvSAgrMNM_Nom, osvSAgrMNM_Acc, osvSAgrMNM_NomAcc, osvSAgrMNM_Erg, osvSAgrMNM_Abs, osvSAgrMNM_ErgAbs,
				osvOAgrMF, osvOAgrMF_Nom, osvOAgrMF_Acc, osvOAgrMF_NomAcc, osvOAgrMF_Erg, osvOAgrMF_Abs, osvOAgrMF_ErgAbs,
				osvOAgrMFN, osvOAgrMFN_Nom, osvOAgrMFN_Acc, osvOAgrMFN_NomAcc, osvOAgrMFN_Erg, osvOAgrMFN_Abs, osvOAgrMFN_ErgAbs,
				osvOAgrCN, osvOAgrCN_Nom, osvOAgrCN_Acc, osvOAgrCN_NomAcc, osvOAgrCN_Erg, osvOAgrCN_Abs, osvOAgrCN_ErgAbs,
				osvOAgrAI, osvOAgrAI_Nom, osvOAgrAI_Acc, osvOAgrAI_NomAcc, osvOAgrAI_Erg, osvOAgrAI_Abs, osvOAgrAI_ErgAbs,
				osvOAgrHN, osvOAgrHN_Nom, osvOAgrHN_Acc, osvOAgrHN_NomAcc, osvOAgrHN_Erg, osvOAgrHN_Abs, osvOAgrHN_ErgAbs,
				osvOAgrHAI, osvOAgrHAI_Nom, osvOAgrHAI_Acc, osvOAgrHAI_NomAcc, osvOAgrHAI_Erg, osvOAgrHAI_Abs, osvOAgrHAI_ErgAbs,
				osvOAgrMNM, osvOAgrMNM_Nom, osvOAgrMNM_Acc, osvOAgrMNM_NomAcc, osvOAgrMNM_Erg, osvOAgrMNM_Abs, osvOAgrMNM_ErgAbs,
				osvSOAgrMF, osvSOAgrMF_Nom, osvSOAgrMF_Acc, osvSOAgrMF_NomAcc, osvSOAgrMF_Erg, osvSOAgrMF_Abs, osvSOAgrMF_ErgAbs,
				osvSOAgrMFN, osvSOAgrMFN_Nom, osvSOAgrMFN_Acc, osvSOAgrMFN_NomAcc, osvSOAgrMFN_Erg, osvSOAgrMFN_Abs, osvSOAgrMFN_ErgAbs,
				osvSOAgrCN, osvSOAgrCN_Nom, osvSOAgrCN_Acc, osvSOAgrCN_NomAcc, osvSOAgrCN_Erg, osvSOAgrCN_Abs, osvSOAgrCN_ErgAbs,
				osvSOAgrAI, osvSOAgrAI_Nom, osvSOAgrAI_Acc, osvSOAgrAI_NomAcc, osvSOAgrAI_Erg, osvSOAgrAI_Abs, osvSOAgrAI_ErgAbs,
				osvSOAgrHN, osvSOAgrHN_Nom, osvSOAgrHN_Acc, osvSOAgrHN_NomAcc, osvSOAgrHN_Erg, osvSOAgrHN_Abs, osvSOAgrHN_ErgAbs,
				osvSOAgrHAI, osvSOAgrHAI_Nom,  osvSOAgrHAI_Acc, osvSOAgrHAI_NomAcc, osvSOAgrHAI_Erg, osvSOAgrHAI_Abs, osvSOAgrHAI_ErgAbs,
				osvSOAgrMNM, osvSOAgrMNM_Nom, osvSOAgrMNM_Acc, osvSOAgrMNM_NomAcc, osvSOAgrMNM_Erg, osvSOAgrMNM_Abs, osvSOAgrMNM_ErgAbs,
				osvSAgr123_SP_MF, osvSAgr123_SP_MF_Nom, osvSAgr123_SP_MF_Acc, osvSAgr123_SP_MF_NomAcc, osvSAgr123_SP_MF_Erg, osvSAgr123_SP_MF_Abs, osvSAgr123_SP_MF_ErgAbs,
				osvSAgr123_SP_MFN, osvSAgr123_SP_MFN_Nom, osvSAgr123_SP_MFN_Acc, osvSAgr123_SP_MFN_NomAcc, osvSAgr123_SP_MFN_Erg, osvSAgr123_SP_MFN_Abs, osvSAgr123_SP_MFN_ErgAbs,
				osvSAgr123_SP_CN, osvSAgr123_SP_CN_Nom, osvSAgr123_SP_CN_Acc, osvSAgr123_SP_CN_NomAcc, osvSAgr123_SP_CN_Erg, osvSAgr123_SP_CN_Abs, osvSAgr123_SP_CN_ErgAbs,
				osvSAgr123_SP_AI, osvSAgr123_SP_AI_Nom, osvSAgr123_SP_AI_Acc, osvSAgr123_SP_AI_NomAcc, osvSAgr123_SP_AI_Erg, osvSAgr123_SP_AI_Abs, osvSAgr123_SP_AI_ErgAbs,
				osvSAgr123_SP_HN, osvSAgr123_SP_HN_Nom, osvSAgr123_SP_HN_Acc, osvSAgr123_SP_HN_NomAcc, osvSAgr123_SP_HN_Erg, osvSAgr123_SP_HN_Abs, osvSAgr123_SP_HN_ErgAbs,
				osvSAgr123_SP_HAI, osvSAgr123_SP_HAI_Nom, osvSAgr123_SP_HAI_Acc, osvSAgr123_SP_HAI_NomAcc, osvSAgr123_SP_HAI_Erg, osvSAgr123_SP_HAI_Abs, osvSAgr123_SP_HAI_ErgAbs,
				osvSAgr123_SP_MNM, osvSAgr123_SP_MNM_Nom, osvSAgr123_SP_MNM_Acc, osvSAgr123_SP_MNM_NomAcc, osvSAgr123_SP_MNM_Erg, osvSAgr123_SP_MNM_Abs, osvSAgr123_SP_MNM_ErgAbs,
				osvOAgr123_SP_MF, osvOAgr123_SP_MF_Nom, osvOAgr123_SP_MF_Acc, osvOAgr123_SP_MF_NomAcc, osvOAgr123_SP_MF_Erg, osvOAgr123_SP_MF_Abs, osvOAgr123_SP_MF_ErgAbs,
				osvOAgr123_SP_MFN, osvOAgr123_SP_MFN_Nom, osvOAgr123_SP_MFN_Acc, osvOAgr123_SP_MFN_NomAcc, osvOAgr123_SP_MFN_Erg, osvOAgr123_SP_MFN_Abs, osvOAgr123_SP_MFN_ErgAbs,
				osvOAgr123_SP_CN, osvOAgr123_SP_CN_Nom, osvOAgr123_SP_CN_Acc, osvOAgr123_SP_CN_NomAcc, osvOAgr123_SP_CN_Erg, osvOAgr123_SP_CN_Abs, osvOAgr123_SP_CN_ErgAbs,
				osvOAgr123_SP_AI, osvOAgr123_SP_AI_Nom, osvOAgr123_SP_AI_Acc, osvOAgr123_SP_AI_NomAcc, osvOAgr123_SP_AI_Erg, osvOAgr123_SP_AI_Abs, osvOAgr123_SP_AI_ErgAbs,
				osvOAgr123_SP_HN, osvOAgr123_SP_HN_Nom, osvOAgr123_SP_HN_Acc, osvOAgr123_SP_HN_NomAcc, osvOAgr123_SP_HN_Erg, osvOAgr123_SP_HN_Abs, osvOAgr123_SP_HN_ErgAbs,
				osvOAgr123_SP_HAI, osvOAgr123_SP_HAI_Nom, osvOAgr123_SP_HAI_Acc, osvOAgr123_SP_HAI_NomAcc, osvOAgr123_SP_HAI_Erg, osvOAgr123_SP_HAI_Abs, osvOAgr123_SP_HAI_ErgAbs,
				osvOAgr123_SP_MNM, osvOAgr123_SP_MNM_Nom, osvOAgr123_SP_MNM_Acc, osvOAgr123_SP_MNM_NomAcc, osvOAgr123_SP_MNM_Erg, osvOAgr123_SP_MNM_Abs, osvOAgr123_SP_MNM_ErgAbs,
				osvSOAgr123_SP_MF, osvSOAgr123_SP_MF_Nom, osvSOAgr123_SP_MF_Acc, osvSOAgr123_SP_MF_NomAcc, osvSOAgr123_SP_MF_Erg, osvSOAgr123_SP_MF_Abs, osvSOAgr123_SP_MF_ErgAbs,
				osvSOAgr123_SP_MFN, osvSOAgr123_SP_MFN_Nom, osvSOAgr123_SP_MFN_Acc, osvSOAgr123_SP_MFN_NomAcc, osvSOAgr123_SP_MFN_Erg, osvSOAgr123_SP_MFN_Abs, osvSOAgr123_SP_MFN_ErgAbs,
				osvSOAgr123_SP_CN, osvSOAgr123_SP_CN_Nom, osvSOAgr123_SP_CN_Acc, osvSOAgr123_SP_CN_NomAcc, osvSOAgr123_SP_CN_Erg, osvSOAgr123_SP_CN_Abs, osvSOAgr123_SP_CN_ErgAbs,
				osvSOAgr123_SP_AI, osvSOAgr123_SP_AI_Nom, osvSOAgr123_SP_AI_Acc, osvSOAgr123_SP_AI_NomAcc, osvSOAgr123_SP_AI_Erg, osvSOAgr123_SP_AI_Abs, osvSOAgr123_SP_AI_ErgAbs,
				osvSOAgr123_SP_HN, osvSOAgr123_SP_HN_Nom, osvSOAgr123_SP_HN_Acc, osvSOAgr123_SP_HN_NomAcc, osvSOAgr123_SP_HN_Erg, osvSOAgr123_SP_HN_Abs, osvSOAgr123_SP_HN_ErgAbs,
				osvSOAgr123_SP_HAI, osvSOAgr123_SP_HAI_Nom,  osvSOAgr123_SP_HAI_Acc, osvSOAgr123_SP_HAI_NomAcc, osvSOAgr123_SP_HAI_Erg, osvSOAgr123_SP_HAI_Abs, osvSOAgr123_SP_HAI_ErgAbs,
				osvSOAgr123_SP_MNM, osvSOAgr123_SP_MNM_Nom, osvSOAgr123_SP_MNM_Acc, osvSOAgr123_SP_MNM_NomAcc, osvSOAgr123_SP_MNM_Erg, osvSOAgr123_SP_MNM_Abs, osvSOAgr123_SP_MNM_ErgAbs};
	}
	
	protected void entropyCalc(ArrayList<Event> events, Event ev, HashMap<String, HashMap<String, Word>> lexicons) {
		for(int i = 0; i < all.length; i++) {
			all[i].count++;
			ArrayList<Double> probs = new ArrayList<>();
			// compute the entropy for probability of events, given we know what is being done to
			for(Event e:events) {
				if(e.obj.equals(Objects.valueOf(first.get(conditionCode[i]).word.toUpperCase())) &&
						e.probability > 0.0) {
					probs.add(e.probability);								
				}
			}
			
			BigDecimal pObj = new BigDecimal((double)probs.size()/*1.0*/);
			pObj = pObj.divide(new BigDecimal(/*8*/40.0D), MathContext.DECIMAL128);
			eta1 = calcEntropy(probs, pObj);
			
			all[i].eta1.add(eta1);
			all[i].eventProbs.add(ev.probability);
			
			probs = new ArrayList<>();
			double factor = 0.0;
			
			// compute the entropy for probability of events, given we know what is being do to
			// and by who
			for(Event e:events) {
				// reduce the event space to only those events involving the obj
				if(e.obj.equals(Objects.valueOf(first.get(conditionCode[i]).word.toUpperCase())) &&
						e.probability > 0.0) {
					factor++;
					if (e.person.equals(People.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
						// how many of those events involve both the obj and subj?
						probs.add(e.probability);
					}
				}
			}
			// divide the number of events that could occur involving both the obj and subj
			// by the total number of events that could occur given the obj
			BigDecimal pSubj_givenObj = new BigDecimal((double)probs.size());
			pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
			
			eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
			all[i].eta2.add(eta2);
		}
//// ---------CASELESS---------------------------------------------------------------------------------------------------//
//		osv.count++;
//		ArrayList<Double> probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("caseless").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);								
//			}
//		}
//		
//		BigDecimal pObj = new BigDecimal((double)probs.size()/*1.0*/);
//		pObj = pObj.divide(new BigDecimal(/*8*/40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osv.eta1.add(eta1);
//		osv.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		double factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			// reduce the event space to only those events involving the obj
//			if(e.obj.equals(Objects.valueOf(first.get("caseless").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.person.equals(People.valueOf(second.get("caseless").word.toUpperCase()))) {
//					// how many of those events involve both the obj and subj?
//					probs.add(e.probability);
//				}
//			}
//		}
//		// divide the number of events that could occur involving both the obj and subj
//		// by the total number of events that could occur given the obj
//		BigDecimal pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osv.eta2.add(eta2);
//	
//// ---------NOM ONLY (eg. Oromo, acc is "bare form")-------------------------------------------------------------------//
//		osvNomOnly.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvNomOnly.eta1.add(eta1);
//		osvNomOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvNomOnly.eta2.add(eta2);
//		
//// ---------ACC ONLY---------------------------------------------------------------------------------------------------//
//		osvAccOnly.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvAccOnly.eta1.add(eta1);
//		osvAccOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvAccOnly.eta2.add(eta2);
//		
//// ---------NOM + ACC--------------------------------------------------------------------------------------------------//
//		osvNomAcc.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvNomAcc.eta1.add(eta1);
//		osvNomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvNomAcc.eta2.add(eta2);
//							
//// ---------ERG ONLY---------------------------------------------------------------------------------------------------//
//		osvErgOnly.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvErgOnly.eta1.add(eta1);
//		osvErgOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvErgOnly.eta2.add(eta2);
//							
//// ---------ABS ONLY---------------------------------------------------------------------------------------------------//
//		osvAbsOnly.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvAbsOnly.eta1.add(eta1);
//		osvAbsOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvAbsOnly.eta2.add(eta2);
//							
//// ---------ERG + ABS-------------------------------------------------------------------------------------------------//
//		osvErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvErgAbs.eta1.add(eta1);
//		osvErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		osvSAgr123.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgr123.eta1.add(eta1);
//		osvSAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgr123.eta2.add(eta2);
//		
//// ---------SUBJ:inclusive/exclusive We INFL-------------------------------------------------------------------------------------------------//
//// NEEDS TO INCLUDE NUMBER DISTINCTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
////		osvSAgrWe.count++;
////		probs = new ArrayList<>();
////		// compute the entropy for probability of events, given we know what is being done to
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("s-we").word.toUpperCase())) &&
////					e.probability > 0.0) {
////				probs.add(e.probability);
////			}
////		}
////		
////		pObj = new BigDecimal((double)probs.size());
////		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
////		eta1 = calcEntropy(probs, pObj);
////		
////		osvSAgrWe.eta1.add(eta1);
////		osvSAgrWe.eventProbs.add(ev.probability);
////		
////		probs = new ArrayList<>();
////		factor = 0.0;
////		
////		// compute the entropy for probability of events, given we know what is being do to
////		// and by who
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("s-we").word.toUpperCase())) &&
////					e.probability > 0.0) {
////				factor++;
////				if(e.person.equals(People.valueOf(second.get("s-we").word.toUpperCase()))) {
////					probs.add(e.probability);
////				}
////			}
////		}
////		
////		pSubj_givenObj = new BigDecimal((double)probs.size());
////		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
////		
////		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
////		osvSAgrWe.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		osvOAgr123.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgr123.eta1.add(eta1);
//		osvOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgr123.eta2.add(eta2);
//		
//// ---------OBJ:inclusive/exclusive We INFL-------------------------------------------------------------------------------------------------//
//// NEEDS TO INCLUDE NUMBER DISTINCTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
////		osvOAgrWe.count++;
////		probs = new ArrayList<>();
////		// compute the entropy for probability of events, given we know what is being done to
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("o-we").word.toUpperCase())) &&
////					e.probability > 0.0) {
////				probs.add(e.probability);
////			}
////		}
////		
////		pObj = new BigDecimal((double)probs.size());
////		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
////		eta1 = calcEntropy(probs, pObj);
////		
////		osvOAgrWe.eta1.add(eta1);
////		osvOAgrWe.eventProbs.add(ev.probability);
////		
////		probs = new ArrayList<>();
////		factor = 0.0;
////		
////		// compute the entropy for probability of events, given we know what is being do to
////		// and by who
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("o-we").word.toUpperCase())) &&
////					e.probability > 0.0) {
////				factor++;
////				if(e.person.equals(People.valueOf(second.get("o-we").word.toUpperCase()))) {
////					probs.add(e.probability);
////				}
////			}
////		}
////		
////		pSubj_givenObj = new BigDecimal((double)probs.size());
////		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
////		
////		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
////		osvOAgrWe.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgr123.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSOAgr123.eta1.add(eta1);
//		osvSOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgr123.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:inclusive/exclusive We INFL-------------------------------------------------------------------------------------------------//
//// NEEDS TO INCLUDE NUMBER DISTINCTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
////		osvSOAgrWe.count++;
////		probs = new ArrayList<>();
////		// compute the entropy for probability of events, given we know what is being done to
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("so-we").word.toUpperCase())) &&
////					e.probability > 0.0) {
////				probs.add(e.probability);
////			}
////		}
////		
////		pObj = new BigDecimal((double)probs.size());
////		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
////		eta1 = calcEntropy(probs, pObj);
////		
////		osvSOAgrWe.eta1.add(eta1);
////		osvSOAgrWe.eventProbs.add(ev.probability);
////		
////		probs = new ArrayList<>();
////		factor = 0.0;
////		
////		// compute the entropy for probability of events, given we know what is being do to
////		// and by who
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("so-we").word.toUpperCase())) &&
////					e.probability > 0.0) {
////				factor++;
////				if(e.person.equals(People.valueOf(second.get("so-we").word.toUpperCase()))) {
////					probs.add(e.probability);
////				}
////			}
////		}
////		
////		pSubj_givenObj = new BigDecimal((double)probs.size());
////		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
////		
////		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
////		osvSOAgrWe.eta2.add(eta2);
//		
//// ---------SUBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrSP.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSAgrSP.eta1.add(eta1);
//		osvSAgrSP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrSP.eta2.add(eta2);
//
//// ---------OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrSP.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvOAgrSP.eta1.add(eta1);
//		osvOAgrSP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrSP.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrSP.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrSP.eta1.add(eta1);
//		osvSOAgrSP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrSP.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		osvSAgr123_SP.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSAgr123_SP.eta1.add(eta1);
//		osvSAgr123_SP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgr123_SP.eta2.add(eta2);
//
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		osvOAgr123_SP.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvOAgr123_SP.eta1.add(eta1);
//		osvOAgr123_SP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgr123_SP.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgr123_SP.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgr123_SP.eta1.add(eta1);
//		osvSOAgr123_SP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgr123_SP.eta2.add(eta2);
//
//// ---------SUBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrMF.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMF.eta1.add(eta1);
//		osvSAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMF.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM ONLY-------------------------------------------------------------------//
//		osvSAgrMF_Nom.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMF_Nom.eta1.add(eta1);
//		osvSAgrMF_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mf+nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMF_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		osvSAgrMF_Acc.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMF_Acc.eta1.add(eta1);
//		osvSAgrMF_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mf+acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMF_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		osvSAgrMF_NomAcc.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMF_NomAcc.eta1.add(eta1);
//		osvSAgrMF_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mf+nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMF_NomAcc.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		osvSAgrMF_Erg.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMF_Erg.eta1.add(eta1);
//		osvSAgrMF_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mf+erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMF_Erg.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		osvSAgrMF_Abs.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMF_Abs.eta1.add(eta1);
//		osvSAgrMF_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mf+abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMF_Abs.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		osvSAgrMF_ErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMF_ErgAbs.eta1.add(eta1);
//		osvSAgrMF_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mf+ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMF_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrMFN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMFN.eta1.add(eta1);
//		osvSAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMFN.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM ONLY-------------------------------------------------------------------//
//		osvSAgrMFN_Nom.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMFN_Nom.eta1.add(eta1);
//		osvSAgrMFN_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mfn+nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMFN_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		osvSAgrMFN_Acc.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMFN_Acc.eta1.add(eta1);
//		osvSAgrMFN_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mfn+acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMFN_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		osvSAgrMFN_NomAcc.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMFN_NomAcc.eta1.add(eta1);
//		osvSAgrMFN_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mfn+nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMFN_NomAcc.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		osvSAgrMFN_Erg.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMFN_Erg.eta1.add(eta1);
//		osvSAgrMFN_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mfn+erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMFN_Erg.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM/NEUT INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		osvSAgrMFN_Abs.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMFN_Abs.eta1.add(eta1);
//		osvSAgrMFN_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mfn+abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMFN_Abs.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		osvSAgrMFN_ErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMFN_ErgAbs.eta1.add(eta1);
//		osvSAgrMFN_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mfn+ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMFN_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrCN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrCN.eta1.add(eta1);
//		osvSAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrCN.eta2.add(eta2);
//		
//// ---------SUBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrAI.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrAI.eta1.add(eta1);
//		osvSAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrAI.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrHN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrHN.eta1.add(eta1);
//		osvSAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrHN.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrHAI.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrHAI.eta1.add(eta1);
//		osvSAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrHAI.eta2.add(eta2);
//		
//// ---------SUBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		osvSAgrMNM.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvSAgrMNM.eta1.add(eta1);
//		osvSAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("s-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSAgrMNM.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrMF.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgrMF.eta1.add(eta1);
//		osvOAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrMF.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrMFN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgrMFN.eta1.add(eta1);
//		osvOAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrMFN.eta2.add(eta2);
//		
//// ---------OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrCN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgrCN.eta1.add(eta1);
//		osvOAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrCN.eta2.add(eta2);
//		
//// ---------OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrAI.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgrAI.eta1.add(eta1);
//		osvOAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrAI.eta2.add(eta2);
//		
//// ---------OBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrHN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgrHN.eta1.add(eta1);
//		osvOAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrHN.eta2.add(eta2);
//		
//// ---------OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrHAI.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgrHAI.eta1.add(eta1);
//		osvOAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrHAI.eta2.add(eta2);
//		
//// ---------OBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		osvOAgrMNM.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//		
//		osvOAgrMNM.eta1.add(eta1);
//		osvOAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("o-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvOAgrMNM.eta2.add(eta2);
//		
////---------SUBJ&OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrMF.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrMF.eta1.add(eta1);
//		osvSOAgrMF.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrMF.eta2.add(eta2);
//
//// ---------SUBJ&OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrMFN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrMFN.eta1.add(eta1);
//		osvSOAgrMFN.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrMFN.eta2.add(eta2);
//
//// ---------SUBJ&OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrCN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrCN.eta1.add(eta1);
//		osvSOAgrCN.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrCN.eta2.add(eta2);
//
//// ---------SUBJ&OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrAI.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrAI.eta1.add(eta1);
//		osvSOAgrAI.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrAI.eta2.add(eta2);
//
//// ---------SUBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrHN.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrHN.eta1.add(eta1);
//		osvSOAgrHN.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrHN.eta2.add(eta2);
//
//// ---------SUBJ&OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrHAI.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrHAI.eta1.add(eta1);
//		osvSOAgrHAI.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrHAI.eta2.add(eta2);
//
//// ---------SUBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		osvSOAgrMNM.count++;
//		probs = new ArrayList<>();
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//
//		pObj = new BigDecimal((double)probs.size());
//		pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pObj);
//
//		osvSOAgrMNM.eta1.add(eta1);
//		osvSOAgrMNM.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.person.equals(People.valueOf(second.get("so-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pSubj_givenObj = new BigDecimal((double)probs.size());
//		pSubj_givenObj = pSubj_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pSubj_givenObj));
//		osvSOAgrMNM.eta2.add(eta2);
	}
}
