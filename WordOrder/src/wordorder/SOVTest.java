package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class SOVTest extends Test {
	public Stats sov = new Stats();
	
	public Stats sovNomOnly = new Stats();
	public Stats sovAccOnly = new Stats();
	public Stats sovNomAcc = new Stats();
	public Stats sovErgOnly = new Stats();
	public Stats sovAbsOnly = new Stats();
	public Stats sovErgAbs = new Stats();
	
	public Stats sovSAgr123 = new Stats();
//	public Stats sovSAgrWe = new Stats();
	
	public Stats sovOAgr123 = new Stats();
//	public Stats sovOAgrWe = new Stats();
	
	public Stats sovSOAgr123 = new Stats();
//	public Stats sovSOAgrWe = new Stats();
	
	public Stats sovSAgrSP = new Stats();
	public Stats sovOAgrSP = new Stats();
	public Stats sovSOAgrSP = new Stats();
	
	public Stats sovSAgr123_SP = new Stats();
	public Stats sovSAgr123_SP_Nom = new Stats();
	public Stats sovSAgr123_SP_Acc = new Stats();
	public Stats sovSAgr123_SP_NomAcc = new Stats();
	public Stats sovSAgr123_SP_Erg = new Stats();
	public Stats sovSAgr123_SP_Abs = new Stats();
	public Stats sovSAgr123_SP_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP = new Stats();
	public Stats sovOAgr123_SP_Nom = new Stats();
	public Stats sovOAgr123_SP_Acc = new Stats();
	public Stats sovOAgr123_SP_NomAcc = new Stats();
	public Stats sovOAgr123_SP_Erg = new Stats();
	public Stats sovOAgr123_SP_Abs = new Stats();
	public Stats sovOAgr123_SP_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP = new Stats();
	public Stats sovSOAgr123_SP_Nom = new Stats();
	public Stats sovSOAgr123_SP_Acc = new Stats();
	public Stats sovSOAgr123_SP_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_Erg = new Stats();
	public Stats sovSOAgr123_SP_Abs = new Stats();
	public Stats sovSOAgr123_SP_ErgAbs = new Stats();
		
	public Stats sovSAgrMF = new Stats();
	public Stats sovSAgrMF_Nom = new Stats();
	public Stats sovSAgrMF_Acc = new Stats();
	public Stats sovSAgrMF_NomAcc = new Stats();
	public Stats sovSAgrMF_Erg = new Stats();
	public Stats sovSAgrMF_Abs = new Stats();
	public Stats sovSAgrMF_ErgAbs = new Stats();
	
	public Stats sovSAgrMFN = new Stats();
	public Stats sovSAgrMFN_Nom = new Stats();
	public Stats sovSAgrMFN_Acc = new Stats();
	public Stats sovSAgrMFN_NomAcc = new Stats();
	public Stats sovSAgrMFN_Erg = new Stats();
	public Stats sovSAgrMFN_Abs = new Stats();
	public Stats sovSAgrMFN_ErgAbs = new Stats();
	
	public Stats sovSAgrCN = new Stats();
	public Stats sovSAgrCN_Nom = new Stats();
	public Stats sovSAgrCN_Acc = new Stats();
	public Stats sovSAgrCN_NomAcc = new Stats();
	public Stats sovSAgrCN_Erg = new Stats();
	public Stats sovSAgrCN_Abs = new Stats();
	public Stats sovSAgrCN_ErgAbs = new Stats();
	
	public Stats sovSAgrAI = new Stats();
	public Stats sovSAgrAI_Nom = new Stats();
	public Stats sovSAgrAI_Acc = new Stats();
	public Stats sovSAgrAI_NomAcc = new Stats();
	public Stats sovSAgrAI_Erg = new Stats();
	public Stats sovSAgrAI_Abs = new Stats();
	public Stats sovSAgrAI_ErgAbs = new Stats();
	
	public Stats sovSAgrHN = new Stats();
	public Stats sovSAgrHN_Nom = new Stats();
	public Stats sovSAgrHN_Acc = new Stats();
	public Stats sovSAgrHN_NomAcc = new Stats();
	public Stats sovSAgrHN_Erg = new Stats();
	public Stats sovSAgrHN_Abs = new Stats();
	public Stats sovSAgrHN_ErgAbs = new Stats();
	
	public Stats sovSAgrHAI = new Stats();
	public Stats sovSAgrHAI_Nom = new Stats();
	public Stats sovSAgrHAI_Acc = new Stats();
	public Stats sovSAgrHAI_NomAcc = new Stats();
	public Stats sovSAgrHAI_Erg = new Stats();
	public Stats sovSAgrHAI_Abs = new Stats();
	public Stats sovSAgrHAI_ErgAbs = new Stats();
	
	public Stats sovSAgrMNM = new Stats();
	public Stats sovSAgrMNM_Nom = new Stats();
	public Stats sovSAgrMNM_Acc = new Stats();
	public Stats sovSAgrMNM_NomAcc = new Stats();
	public Stats sovSAgrMNM_Erg = new Stats();
	public Stats sovSAgrMNM_Abs = new Stats();
	public Stats sovSAgrMNM_ErgAbs = new Stats();
	
	public Stats sovOAgrMF = new Stats();
	public Stats sovOAgrMF_Nom = new Stats();
	public Stats sovOAgrMF_Acc = new Stats();
	public Stats sovOAgrMF_NomAcc = new Stats();
	public Stats sovOAgrMF_Erg = new Stats();
	public Stats sovOAgrMF_Abs = new Stats();
	public Stats sovOAgrMF_ErgAbs = new Stats();
	
	public Stats sovOAgrMFN = new Stats();
	public Stats sovOAgrMFN_Nom = new Stats();
	public Stats sovOAgrMFN_Acc = new Stats();
	public Stats sovOAgrMFN_NomAcc = new Stats();
	public Stats sovOAgrMFN_Erg = new Stats();
	public Stats sovOAgrMFN_Abs = new Stats();
	public Stats sovOAgrMFN_ErgAbs = new Stats();
	
	public Stats sovOAgrCN = new Stats();
	public Stats sovOAgrCN_Nom = new Stats();
	public Stats sovOAgrCN_Acc = new Stats();
	public Stats sovOAgrCN_NomAcc = new Stats();
	public Stats sovOAgrCN_Erg = new Stats();
	public Stats sovOAgrCN_Abs = new Stats();
	public Stats sovOAgrCN_ErgAbs = new Stats();
	
	public Stats sovOAgrAI = new Stats();
	public Stats sovOAgrAI_Nom = new Stats();
	public Stats sovOAgrAI_Acc = new Stats();
	public Stats sovOAgrAI_NomAcc = new Stats();
	public Stats sovOAgrAI_Erg = new Stats();
	public Stats sovOAgrAI_Abs = new Stats();
	public Stats sovOAgrAI_ErgAbs = new Stats();
	
	public Stats sovOAgrHN = new Stats();
	public Stats sovOAgrHN_Nom = new Stats();
	public Stats sovOAgrHN_Acc = new Stats();
	public Stats sovOAgrHN_NomAcc = new Stats();
	public Stats sovOAgrHN_Erg = new Stats();
	public Stats sovOAgrHN_Abs = new Stats();
	public Stats sovOAgrHN_ErgAbs = new Stats();
	
	public Stats sovOAgrHAI = new Stats();
	public Stats sovOAgrHAI_Nom = new Stats();
	public Stats sovOAgrHAI_Acc = new Stats();
	public Stats sovOAgrHAI_NomAcc = new Stats();
	public Stats sovOAgrHAI_Erg = new Stats();
	public Stats sovOAgrHAI_Abs = new Stats();
	public Stats sovOAgrHAI_ErgAbs = new Stats();
	
	public Stats sovOAgrMNM = new Stats();
	public Stats sovOAgrMNM_Nom = new Stats();
	public Stats sovOAgrMNM_Acc = new Stats();
	public Stats sovOAgrMNM_NomAcc = new Stats();
	public Stats sovOAgrMNM_Erg = new Stats();
	public Stats sovOAgrMNM_Abs = new Stats();
	public Stats sovOAgrMNM_ErgAbs = new Stats();
		
	public Stats sovSOAgrMF = new Stats();
	public Stats sovSOAgrMF_Nom = new Stats();
	public Stats sovSOAgrMF_Acc = new Stats();
	public Stats sovSOAgrMF_NomAcc = new Stats();
	public Stats sovSOAgrMF_Erg = new Stats();
	public Stats sovSOAgrMF_Abs = new Stats();
	public Stats sovSOAgrMF_ErgAbs = new Stats();
	
	public Stats sovSOAgrMFN = new Stats();
	public Stats sovSOAgrMFN_Nom = new Stats();
	public Stats sovSOAgrMFN_Acc = new Stats();
	public Stats sovSOAgrMFN_NomAcc = new Stats();
	public Stats sovSOAgrMFN_Erg = new Stats();
	public Stats sovSOAgrMFN_Abs = new Stats();
	public Stats sovSOAgrMFN_ErgAbs = new Stats();
	
	public Stats sovSOAgrCN = new Stats();
	public Stats sovSOAgrCN_Nom = new Stats();
	public Stats sovSOAgrCN_Acc = new Stats();
	public Stats sovSOAgrCN_NomAcc = new Stats();
	public Stats sovSOAgrCN_Erg = new Stats();
	public Stats sovSOAgrCN_Abs = new Stats();
	public Stats sovSOAgrCN_ErgAbs = new Stats();
	
	public Stats sovSOAgrAI = new Stats();
	public Stats sovSOAgrAI_Nom = new Stats();
	public Stats sovSOAgrAI_Acc = new Stats();
	public Stats sovSOAgrAI_NomAcc = new Stats();
	public Stats sovSOAgrAI_Erg = new Stats();
	public Stats sovSOAgrAI_Abs = new Stats();
	public Stats sovSOAgrAI_ErgAbs = new Stats();
	
	public Stats sovSOAgrHN = new Stats();
	public Stats sovSOAgrHN_Nom = new Stats();
	public Stats sovSOAgrHN_Acc = new Stats();
	public Stats sovSOAgrHN_NomAcc = new Stats();
	public Stats sovSOAgrHN_Erg = new Stats();
	public Stats sovSOAgrHN_Abs = new Stats();
	public Stats sovSOAgrHN_ErgAbs = new Stats();
	
	public Stats sovSOAgrHAI = new Stats();
	public Stats sovSOAgrHAI_Nom = new Stats();
	public Stats sovSOAgrHAI_Acc = new Stats();
	public Stats sovSOAgrHAI_NomAcc = new Stats();
	public Stats sovSOAgrHAI_Erg = new Stats();
	public Stats sovSOAgrHAI_Abs = new Stats();
	public Stats sovSOAgrHAI_ErgAbs = new Stats();
	
	public Stats sovSOAgrMNM = new Stats();
	public Stats sovSOAgrMNM_Nom = new Stats();
	public Stats sovSOAgrMNM_Acc = new Stats();
	public Stats sovSOAgrMNM_NomAcc = new Stats();
	public Stats sovSOAgrMNM_Erg = new Stats();
	public Stats sovSOAgrMNM_Abs = new Stats();
	public Stats sovSOAgrMNM_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_MF = new Stats();
	public Stats sovSAgr123_SP_MF_Nom = new Stats();
	public Stats sovSAgr123_SP_MF_Acc = new Stats();
	public Stats sovSAgr123_SP_MF_NomAcc = new Stats();
	public Stats sovSAgr123_SP_MF_Erg = new Stats();
	public Stats sovSAgr123_SP_MF_Abs = new Stats();
	public Stats sovSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_MFN = new Stats();
	public Stats sovSAgr123_SP_MFN_Nom = new Stats();
	public Stats sovSAgr123_SP_MFN_Acc = new Stats();
	public Stats sovSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats sovSAgr123_SP_MFN_Erg = new Stats();
	public Stats sovSAgr123_SP_MFN_Abs = new Stats();
	public Stats sovSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_CN = new Stats();
	public Stats sovSAgr123_SP_CN_Nom = new Stats();
	public Stats sovSAgr123_SP_CN_Acc = new Stats();
	public Stats sovSAgr123_SP_CN_NomAcc = new Stats();
	public Stats sovSAgr123_SP_CN_Erg = new Stats();
	public Stats sovSAgr123_SP_CN_Abs = new Stats();
	public Stats sovSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_AI = new Stats();
	public Stats sovSAgr123_SP_AI_Nom = new Stats();
	public Stats sovSAgr123_SP_AI_Acc = new Stats();
	public Stats sovSAgr123_SP_AI_NomAcc = new Stats();
	public Stats sovSAgr123_SP_AI_Erg = new Stats();
	public Stats sovSAgr123_SP_AI_Abs = new Stats();
	public Stats sovSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_HN = new Stats();
	public Stats sovSAgr123_SP_HN_Nom = new Stats();
	public Stats sovSAgr123_SP_HN_Acc = new Stats();
	public Stats sovSAgr123_SP_HN_NomAcc = new Stats();
	public Stats sovSAgr123_SP_HN_Erg = new Stats();
	public Stats sovSAgr123_SP_HN_Abs = new Stats();
	public Stats sovSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_HAI = new Stats();
	public Stats sovSAgr123_SP_HAI_Nom = new Stats();
	public Stats sovSAgr123_SP_HAI_Acc = new Stats();
	public Stats sovSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats sovSAgr123_SP_HAI_Erg = new Stats();
	public Stats sovSAgr123_SP_HAI_Abs = new Stats();
	public Stats sovSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_MNM = new Stats();
	public Stats sovSAgr123_SP_MNM_Nom = new Stats();
	public Stats sovSAgr123_SP_MNM_Acc = new Stats();
	public Stats sovSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats sovSAgr123_SP_MNM_Erg = new Stats();
	public Stats sovSAgr123_SP_MNM_Abs = new Stats();
	public Stats sovSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_MF = new Stats();
	public Stats sovOAgr123_SP_MF_Nom = new Stats();
	public Stats sovOAgr123_SP_MF_Acc = new Stats();
	public Stats sovOAgr123_SP_MF_NomAcc = new Stats();
	public Stats sovOAgr123_SP_MF_Erg = new Stats();
	public Stats sovOAgr123_SP_MF_Abs = new Stats();
	public Stats sovOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_MFN = new Stats();
	public Stats sovOAgr123_SP_MFN_Nom = new Stats();
	public Stats sovOAgr123_SP_MFN_Acc = new Stats();
	public Stats sovOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats sovOAgr123_SP_MFN_Erg = new Stats();
	public Stats sovOAgr123_SP_MFN_Abs = new Stats();
	public Stats sovOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_CN = new Stats();
	public Stats sovOAgr123_SP_CN_Nom = new Stats();
	public Stats sovOAgr123_SP_CN_Acc = new Stats();
	public Stats sovOAgr123_SP_CN_NomAcc = new Stats();
	public Stats sovOAgr123_SP_CN_Erg = new Stats();
	public Stats sovOAgr123_SP_CN_Abs = new Stats();
	public Stats sovOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_AI = new Stats();
	public Stats sovOAgr123_SP_AI_Nom = new Stats();
	public Stats sovOAgr123_SP_AI_Acc = new Stats();
	public Stats sovOAgr123_SP_AI_NomAcc = new Stats();
	public Stats sovOAgr123_SP_AI_Erg = new Stats();
	public Stats sovOAgr123_SP_AI_Abs = new Stats();
	public Stats sovOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_HN = new Stats();
	public Stats sovOAgr123_SP_HN_Nom = new Stats();
	public Stats sovOAgr123_SP_HN_Acc = new Stats();
	public Stats sovOAgr123_SP_HN_NomAcc = new Stats();
	public Stats sovOAgr123_SP_HN_Erg = new Stats();
	public Stats sovOAgr123_SP_HN_Abs = new Stats();
	public Stats sovOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_HAI = new Stats();
	public Stats sovOAgr123_SP_HAI_Nom = new Stats();
	public Stats sovOAgr123_SP_HAI_Acc = new Stats();
	public Stats sovOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats sovOAgr123_SP_HAI_Erg = new Stats();
	public Stats sovOAgr123_SP_HAI_Abs = new Stats();
	public Stats sovOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_MNM = new Stats();
	public Stats sovOAgr123_SP_MNM_Nom = new Stats();
	public Stats sovOAgr123_SP_MNM_Acc = new Stats();
	public Stats sovOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats sovOAgr123_SP_MNM_Erg = new Stats();
	public Stats sovOAgr123_SP_MNM_Abs = new Stats();
	public Stats sovOAgr123_SP_MNM_ErgAbs = new Stats();
		
	public Stats sovSOAgr123_SP_MF = new Stats();
	public Stats sovSOAgr123_SP_MF_Nom = new Stats();
	public Stats sovSOAgr123_SP_MF_Acc = new Stats();
	public Stats sovSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_MF_Erg = new Stats();
	public Stats sovSOAgr123_SP_MF_Abs = new Stats();
	public Stats sovSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_MFN = new Stats();
	public Stats sovSOAgr123_SP_MFN_Nom = new Stats();
	public Stats sovSOAgr123_SP_MFN_Acc = new Stats();
	public Stats sovSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_MFN_Erg = new Stats();
	public Stats sovSOAgr123_SP_MFN_Abs = new Stats();
	public Stats sovSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_CN = new Stats();
	public Stats sovSOAgr123_SP_CN_Nom = new Stats();
	public Stats sovSOAgr123_SP_CN_Acc = new Stats();
	public Stats sovSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_CN_Erg = new Stats();
	public Stats sovSOAgr123_SP_CN_Abs = new Stats();
	public Stats sovSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_AI = new Stats();
	public Stats sovSOAgr123_SP_AI_Nom = new Stats();
	public Stats sovSOAgr123_SP_AI_Acc = new Stats();
	public Stats sovSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_AI_Erg = new Stats();
	public Stats sovSOAgr123_SP_AI_Abs = new Stats();
	public Stats sovSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_HN = new Stats();
	public Stats sovSOAgr123_SP_HN_Nom = new Stats();
	public Stats sovSOAgr123_SP_HN_Acc = new Stats();
	public Stats sovSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_HN_Erg = new Stats();
	public Stats sovSOAgr123_SP_HN_Abs = new Stats();
	public Stats sovSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_HAI = new Stats();
	public Stats sovSOAgr123_SP_HAI_Nom = new Stats();
	public Stats sovSOAgr123_SP_HAI_Acc = new Stats();
	public Stats sovSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_HAI_Erg = new Stats();
	public Stats sovSOAgr123_SP_HAI_Abs = new Stats();
	public Stats sovSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_MNM = new Stats();
	public Stats sovSOAgr123_SP_MNM_Nom = new Stats();
	public Stats sovSOAgr123_SP_MNM_Acc = new Stats();
	public Stats sovSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_MNM_Erg = new Stats();
	public Stats sovSOAgr123_SP_MNM_Abs = new Stats();
	public Stats sovSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public SOVTest() {
		all = new Stats[]{sov, /*sovNomOnly, sovAccOnly, sovNomAcc, sovErgOnly, sovAbsOnly, sovErgAbs,
				sovSAgr123, /*sovSAgrWe, sovOAgr123, /*sovOAgrWe, sovSOAgr123, /*sovSOAgrWe,
				sovSAgrSP, sovOAgrSP, sovSOAgrSP,
				sovSAgr123_SP, sovSAgr123_SP_Nom, sovSAgr123_SP_Acc, sovSAgr123_SP_NomAcc, sovSAgr123_SP_Erg, sovSAgr123_SP_Abs, sovSAgr123_SP_ErgAbs,
				sovOAgr123_SP, sovOAgr123_SP_Nom, sovOAgr123_SP_Acc, sovOAgr123_SP_NomAcc, sovOAgr123_SP_Erg, sovOAgr123_SP_Abs, sovOAgr123_SP_ErgAbs,
				sovSOAgr123_SP, sovSOAgr123_SP_Nom, sovSOAgr123_SP_Acc, sovSOAgr123_SP_NomAcc, sovSOAgr123_SP_Erg, sovSOAgr123_SP_Abs, sovSOAgr123_SP_ErgAbs,
				sovSAgrMF, sovSAgrMF_Nom, sovSAgrMF_Acc, sovSAgrMF_NomAcc, sovSAgrMF_Erg, sovSAgrMF_Abs, sovSAgrMF_ErgAbs,
				sovSAgrMFN, sovSAgrMFN_Nom, sovSAgrMFN_Acc, sovSAgrMFN_NomAcc, sovSAgrMFN_Erg, sovSAgrMFN_Abs, sovSAgrMFN_ErgAbs,
				sovSAgrCN, sovSAgrCN_Nom, sovSAgrCN_Acc, sovSAgrCN_NomAcc, sovSAgrCN_Erg, sovSAgrCN_Abs, sovSAgrCN_ErgAbs,
				sovSAgrAI, sovSAgrAI_Nom, sovSAgrAI_Acc, sovSAgrAI_NomAcc, sovSAgrAI_Erg, sovSAgrAI_Abs, sovSAgrAI_ErgAbs,
				sovSAgrHN, sovSAgrHN_Nom, sovSAgrHN_Acc, sovSAgrHN_NomAcc, sovSAgrHN_Erg, sovSAgrHN_Abs, sovSAgrHN_ErgAbs,
				sovSAgrHAI, sovSAgrHAI_Nom, sovSAgrHAI_Acc, sovSAgrHAI_NomAcc, sovSAgrHAI_Erg, sovSAgrHAI_Abs, sovSAgrHAI_ErgAbs,
				sovSAgrMNM, sovSAgrMNM_Nom, sovSAgrMNM_Acc, sovSAgrMNM_NomAcc, sovSAgrMNM_Erg, sovSAgrMNM_Abs, sovSAgrMNM_ErgAbs,
				sovOAgrMF, sovOAgrMF_Nom, sovOAgrMF_Acc, sovOAgrMF_NomAcc, sovOAgrMF_Erg, sovOAgrMF_Abs, sovOAgrMF_ErgAbs,
				sovOAgrMFN, sovOAgrMFN_Nom, sovOAgrMFN_Acc, sovOAgrMFN_NomAcc, sovOAgrMFN_Erg, sovOAgrMFN_Abs, sovOAgrMFN_ErgAbs,
				sovOAgrCN, sovOAgrCN_Nom, sovOAgrCN_Acc, sovOAgrCN_NomAcc, sovOAgrCN_Erg, sovOAgrCN_Abs, sovOAgrCN_ErgAbs,
				sovOAgrAI, sovOAgrAI_Nom, sovOAgrAI_Acc, sovOAgrAI_NomAcc, sovOAgrAI_Erg, sovOAgrAI_Abs, sovOAgrAI_ErgAbs,
				sovOAgrHN, sovOAgrHN_Nom, sovOAgrHN_Acc, sovOAgrHN_NomAcc, sovOAgrHN_Erg, sovOAgrHN_Abs, sovOAgrHN_ErgAbs, 
				sovOAgrHAI, sovOAgrHAI_Nom, sovOAgrHAI_Acc, sovOAgrHAI_NomAcc, sovOAgrHAI_Erg, sovOAgrHAI_Abs, sovOAgrHAI_ErgAbs,
				sovOAgrMNM, sovOAgrMNM_Nom, sovOAgrMNM_Acc, sovOAgrMNM_NomAcc, sovOAgrMNM_Erg, sovOAgrMNM_Abs, sovOAgrMNM_ErgAbs,
				sovSOAgrMF, sovSOAgrMF_Nom, sovSOAgrMF_Acc, sovSOAgrMF_NomAcc, sovSOAgrMF_Erg, sovSOAgrMF_Abs, sovSOAgrMF_ErgAbs,
				sovSOAgrMFN, sovSOAgrMFN_Nom, sovSOAgrMFN_Acc, sovSOAgrMFN_NomAcc, sovSOAgrMFN_Erg, sovSOAgrMFN_Abs, sovSOAgrMFN_ErgAbs,
				sovSOAgrCN, sovSOAgrCN_Nom, sovSOAgrCN_Acc, sovSOAgrCN_NomAcc, sovSOAgrCN_Erg, sovSOAgrCN_Abs, sovSOAgrCN_ErgAbs,
				sovSOAgrAI, sovSOAgrAI_Nom, sovSOAgrAI_Acc, sovSOAgrAI_NomAcc, sovSOAgrAI_Erg, sovSOAgrAI_Abs, sovSOAgrAI_ErgAbs,
				sovSOAgrHN, sovSOAgrHN_Nom, sovSOAgrHN_Acc, sovSOAgrHN_NomAcc, sovSOAgrHN_Erg, sovSOAgrHN_Abs, sovSOAgrHN_ErgAbs,
				sovSOAgrHAI, sovSOAgrHAI_Nom, sovSOAgrHAI_Acc, sovSOAgrHAI_NomAcc, sovSOAgrHAI_Erg, sovSOAgrHAI_Abs, sovSOAgrHAI_ErgAbs,
				sovSOAgrMNM, sovSOAgrMNM_Nom, sovSOAgrMNM_Acc, sovSOAgrMNM_NomAcc, sovSOAgrMNM_Erg, sovSOAgrMNM_Abs, sovSOAgrMNM_ErgAbs,
				sovSAgr123_SP_MF, sovSAgr123_SP_MF_Nom, sovSAgr123_SP_MF_Acc, sovSAgr123_SP_MF_NomAcc, sovSAgr123_SP_MF_Erg, sovSAgr123_SP_MF_Abs, sovSAgr123_SP_MF_ErgAbs,
				sovSAgr123_SP_MFN, sovSAgr123_SP_MFN_Nom, sovSAgr123_SP_MFN_Acc, sovSAgr123_SP_MFN_NomAcc, sovSAgr123_SP_MFN_Erg, sovSAgr123_SP_MFN_Abs, sovSAgr123_SP_MFN_ErgAbs,
				sovSAgr123_SP_CN, sovSAgr123_SP_CN_Nom, sovSAgr123_SP_CN_Acc, sovSAgr123_SP_CN_NomAcc, sovSAgr123_SP_CN_Erg, sovSAgr123_SP_CN_Abs, sovSAgr123_SP_CN_ErgAbs,
				sovSAgr123_SP_AI, sovSAgr123_SP_AI_Nom, sovSAgr123_SP_AI_Acc, sovSAgr123_SP_AI_NomAcc, sovSAgr123_SP_AI_Erg, sovSAgr123_SP_AI_Abs, sovSAgr123_SP_AI_ErgAbs,
				sovSAgr123_SP_HN, sovSAgr123_SP_HN_Nom, sovSAgr123_SP_HN_Acc, sovSAgr123_SP_HN_NomAcc, sovSAgr123_SP_HN_Erg, sovSAgr123_SP_HN_Abs, sovSAgr123_SP_HN_ErgAbs,
				sovSAgr123_SP_HAI, sovSAgr123_SP_HAI_Nom, sovSAgr123_SP_HAI_Acc, sovSAgr123_SP_HAI_NomAcc, sovSAgr123_SP_HAI_Erg, sovSAgr123_SP_HAI_Abs, sovSAgr123_SP_HAI_ErgAbs,
				sovSAgr123_SP_MNM, sovSAgr123_SP_MNM_Nom, sovSAgr123_SP_MNM_Acc, sovSAgr123_SP_MNM_NomAcc, sovSAgr123_SP_MNM_Erg, sovSAgr123_SP_MNM_Abs, sovSAgr123_SP_MNM_ErgAbs,
				sovOAgr123_SP_MF, sovOAgr123_SP_MF_Nom, sovOAgr123_SP_MF_Acc, sovOAgr123_SP_MF_NomAcc, sovOAgr123_SP_MF_Erg, sovOAgr123_SP_MF_Abs, sovOAgr123_SP_MF_ErgAbs,
				sovOAgr123_SP_MFN, sovOAgr123_SP_MFN_Nom, sovOAgr123_SP_MFN_Acc, sovOAgr123_SP_MFN_NomAcc, sovOAgr123_SP_MFN_Erg, sovOAgr123_SP_MFN_Abs, sovOAgr123_SP_MFN_ErgAbs,
				sovOAgr123_SP_CN, sovOAgr123_SP_CN_Nom, sovOAgr123_SP_CN_Acc, sovOAgr123_SP_CN_NomAcc, sovOAgr123_SP_CN_Erg, sovOAgr123_SP_CN_Abs, sovOAgr123_SP_CN_ErgAbs,
				sovOAgr123_SP_AI, sovOAgr123_SP_AI_Nom, sovOAgr123_SP_AI_Acc, sovOAgr123_SP_AI_NomAcc, sovOAgr123_SP_AI_Erg, sovOAgr123_SP_AI_Abs, sovOAgr123_SP_AI_ErgAbs,
				sovOAgr123_SP_HN, sovOAgr123_SP_HN_Nom, sovOAgr123_SP_HN_Acc, sovOAgr123_SP_HN_NomAcc, sovOAgr123_SP_HN_Erg, sovOAgr123_SP_HN_Abs, sovOAgr123_SP_HN_ErgAbs, 
				sovOAgr123_SP_HAI, sovOAgr123_SP_HAI_Nom, sovOAgr123_SP_HAI_Acc, sovOAgr123_SP_HAI_NomAcc, sovOAgr123_SP_HAI_Erg, sovOAgr123_SP_HAI_Abs, sovOAgr123_SP_HAI_ErgAbs,
				sovOAgr123_SP_MNM, sovOAgr123_SP_MNM_Nom, sovOAgr123_SP_MNM_Acc, sovOAgr123_SP_MNM_NomAcc, sovOAgr123_SP_MNM_Erg, sovOAgr123_SP_MNM_Abs, sovOAgr123_SP_MNM_ErgAbs,
				sovSOAgr123_SP_MF, sovSOAgr123_SP_MF_Nom, sovSOAgr123_SP_MF_Acc, sovSOAgr123_SP_MF_NomAcc, sovSOAgr123_SP_MF_Erg, sovSOAgr123_SP_MF_Abs, sovSOAgr123_SP_MF_ErgAbs,
				sovSOAgr123_SP_MFN, sovSOAgr123_SP_MFN_Nom, sovSOAgr123_SP_MFN_Acc, sovSOAgr123_SP_MFN_NomAcc, sovSOAgr123_SP_MFN_Erg, sovSOAgr123_SP_MFN_Abs, sovSOAgr123_SP_MFN_ErgAbs,
				sovSOAgr123_SP_CN, sovSOAgr123_SP_CN_Nom, sovSOAgr123_SP_CN_Acc, sovSOAgr123_SP_CN_NomAcc, sovSOAgr123_SP_CN_Erg, sovSOAgr123_SP_CN_Abs, sovSOAgr123_SP_CN_ErgAbs,
				sovSOAgr123_SP_AI, sovSOAgr123_SP_AI_Nom, sovSOAgr123_SP_AI_Acc, sovSOAgr123_SP_AI_NomAcc, sovSOAgr123_SP_AI_Erg, sovSOAgr123_SP_AI_Abs, sovSOAgr123_SP_AI_ErgAbs,
				sovSOAgr123_SP_HN, sovSOAgr123_SP_HN_Nom, sovSOAgr123_SP_HN_Acc, sovSOAgr123_SP_HN_NomAcc, sovSOAgr123_SP_HN_Erg, sovSOAgr123_SP_HN_Abs, sovSOAgr123_SP_HN_ErgAbs,
				sovSOAgr123_SP_HAI, sovSOAgr123_SP_HAI_Nom, sovSOAgr123_SP_HAI_Acc, sovSOAgr123_SP_HAI_NomAcc, sovSOAgr123_SP_HAI_Erg, sovSOAgr123_SP_HAI_Abs, sovSOAgr123_SP_HAI_ErgAbs,
				sovSOAgr123_SP_MNM, sovSOAgr123_SP_MNM_Nom, sovSOAgr123_SP_MNM_Acc, sovSOAgr123_SP_MNM_NomAcc, sovSOAgr123_SP_MNM_Erg, sovSOAgr123_SP_MNM_Abs, sovSOAgr123_SP_MNM_ErgAbs*/};
	}
	
	protected void entropyCalc(ArrayList<Event> events, Event ev, HashMap<String, HashMap<String, Word>> lexicons) {
		for(int i = 0; i < all.length; i++) {
			all[i].count++;
			ArrayList<Double> probs = new ArrayList<>();
			BigDecimal pSubj = new BigDecimal(0.0);
			
			// compute entropy for cond. probability of events, given we know the person who is doing them
			for(Event e:events) {
				if(e.person.equals(People.valueOf(first.get(conditionCode[i]).word.toUpperCase())) &&
						e.probability > 0.0) {
					probs.add(e.probability);
					pSubj = pSubj.add(BigDecimal.valueOf(e.probability));
				}
			}
			
			eta1 = calcEntropy(probs, pSubj);
			
			all[i].eta1.add(eta1);
			all[i].eventProbs.add(ev.probability);
			
			probs = new ArrayList<>();
			BigDecimal pSubjObj = new BigDecimal(0.0);
			
			// compute the entropy of probability of events, given we know who is doing
			// and what is being done to
			for(Event e:events) {
				// reduce the event space to just those events involving the subj
				if(e.person.equals(People.valueOf(first.get(conditionCode[i]).word.toUpperCase())) &&
						e.probability > 0.0) {
					if (e.obj.equals(Objects.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
						// how many possible events could involve both the subj and obj?
						probs.add(e.probability);
						pSubjObj = pSubjObj.add(BigDecimal.valueOf(e.probability));
					}
				}
			}

			eta2 = calcEntropy(probs, pSubjObj);
			all[i].eta2.add(eta2);
		}
		
//// ---------CASELESS---------------------------------------------------------------------------------------------------//
//		sov.count++;
//		ArrayList<Double> probs = new ArrayList<>();
//		// compute entropy for probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			// loop through events
//			if(e.person.equals(People.valueOf(first.get("caseless").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		BigDecimal pSubj = new BigDecimal((double)probs.size()/*1.0*/);
//		pSubj = pSubj.divide(new BigDecimal(/*5*/40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sov.eta1.add(eta1);
//		sov.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		double factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			// reduce the event space to just those events involving the subj
//			if(e.person.equals(People.valueOf(first.get("caseless").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				// count all the events with a non-0 prob of occuring for that person
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("caseless").word.toUpperCase()))) {
//					// how many possible events could involve both the subj and obj?
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		// divide the number of events that could involve both the subj & obj
//		// by the total number of events that could occur given the subj
//		BigDecimal pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sov.eta2.add(eta2);
//		
//// ---------NOM ONLY (eg. Oromo, acc is "bare form")-------------------------------------------------------------------//
//		sovNomOnly.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovNomOnly.eta1.add(eta1);
//		sovNomOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("nom").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovNomOnly.eta2.add(eta2);
//		
//// ---------ACC ONLY---------------------------------------------------------------------------------------------------//
//		sovAccOnly.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovAccOnly.eta1.add(eta1);
//		sovAccOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("acc").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovAccOnly.eta2.add(eta2);
//		
//// ---------NOM + ACC--------------------------------------------------------------------------------------------------//
//		sovNomAcc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovNomAcc.eta1.add(eta1);
//		sovNomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("nomacc").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovNomAcc.eta2.add(eta2);
//							
//// ---------ERG ONLY---------------------------------------------------------------------------------------------------//
//		sovErgOnly.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovErgOnly.eta1.add(eta1);
//		sovErgOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("erg").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovErgOnly.eta2.add(eta2);
//		
//// ---------ABS ONLY---------------------------------------------------------------------------------------------------//
//		sovAbsOnly.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovAbsOnly.eta1.add(eta1);
//		sovAbsOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("abs").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovAbsOnly.eta2.add(eta2);
//		
//// ---------ERG + ABS-------------------------------------------------------------------------------------------------//
//		sovErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovErgAbs.eta1.add(eta1);
//		sovErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("ergabs").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		sovSAgr123.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgr123.eta1.add(eta1);
//		sovSAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgr123.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		sovOAgr123.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgr123.eta1.add(eta1);
//		sovOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgr123.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgr123.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgr123.eta1.add(eta1);
//		sovSOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgr123.eta2.add(eta2);
//		
//// ---------SUBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrSP.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrSP.eta1.add(eta1);
//		sovSAgrSP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-sp").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrSP.eta2.add(eta2);
//		
//// ---------OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrSP.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrSP.eta1.add(eta1);
//		sovOAgrSP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-sp").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrSP.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrSP.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrSP.eta1.add(eta1);
//		sovSOAgrSP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-sp").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrSP.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		sovSAgr123_SP.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgr123_SP.eta1.add(eta1);
//		sovSAgr123_SP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgr123_SP.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		sovOAgr123_SP.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgr123_SP.eta1.add(eta1);
//		sovOAgr123_SP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgr123_SP.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgr123_SP.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgr123_SP.eta1.add(eta1);
//		sovSOAgr123_SP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgr123_SP.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrMF.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMF.eta1.add(eta1);
//		sovSAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMF.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM ONLY-------------------------------------------------------------------//
//		sovSAgrMF_Nom.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMF_Nom.eta1.add(eta1);
//		sovSAgrMF_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+nom").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mf+nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMF_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		sovSAgrMF_Acc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMF_Acc.eta1.add(eta1);
//		sovSAgrMF_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+acc").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mf+acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMF_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		sovSAgrMF_NomAcc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMF_NomAcc.eta1.add(eta1);
//		sovSAgrMF_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+nomacc").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mf+nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMF_NomAcc.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		sovSAgrMF_Erg.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMF_Erg.eta1.add(eta1);
//		sovSAgrMF_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+erg").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mf+erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMF_Erg.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		sovSAgrMF_Abs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMF_Abs.eta1.add(eta1);
//		sovSAgrMF_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+abs").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mf+abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMF_Abs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		sovSAgrMF_ErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMF_ErgAbs.eta1.add(eta1);
//		sovSAgrMF_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mf+ergabs").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mf+ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMF_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrMFN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMFN.eta1.add(eta1);
//		sovSAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMFN.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM ONLY-------------------------------------------------------------------//
//		sovSAgrMFN_Nom.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMFN_Nom.eta1.add(eta1);
//		sovSAgrMFN_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+nom").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mfn+nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMFN_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		sovSAgrMFN_Acc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMFN_Acc.eta1.add(eta1);
//		sovSAgrMFN_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+acc").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mfn+acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMFN_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		sovSAgrMFN_NomAcc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMFN_NomAcc.eta1.add(eta1);
//		sovSAgrMFN_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+nomacc").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mfn+nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMFN_NomAcc.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		sovSAgrMFN_Erg.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMFN_Erg.eta1.add(eta1);
//		sovSAgrMFN_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+erg").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mfn+erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMFN_Erg.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		sovSAgrMFN_Abs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMFN_Abs.eta1.add(eta1);
//		sovSAgrMFN_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+abs").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mfn+abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMFN_Abs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		sovSAgrMFN_ErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMFN_ErgAbs.eta1.add(eta1);
//		sovSAgrMFN_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mfn+ergabs").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mfn+ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMFN_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrCN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrCN.eta1.add(eta1);
//		sovSAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-cn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrCN.eta2.add(eta2);
//		
//// ---------SUBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrAI.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrAI.eta1.add(eta1);
//		sovSAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-ai").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrAI.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrHN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrHN.eta1.add(eta1);
//		sovSAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-hn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrHN.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrHAI.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrHAI.eta1.add(eta1);
//		sovSAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-hai").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrHAI.eta2.add(eta2);
//		
//// ---------SUBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		sovSAgrMNM.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSAgrMNM.eta1.add(eta1);
//		sovSAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-mnm").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("s-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSAgrMNM.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrMF.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrMF.eta1.add(eta1);
//		sovOAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-mf").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrMF.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrMFN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrMFN.eta1.add(eta1);
//		sovOAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-mfn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrMFN.eta2.add(eta2);
//		
//// ---------OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrCN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrCN.eta1.add(eta1);
//		sovOAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-cn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrCN.eta2.add(eta2);
//		
//// ---------OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrAI.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrAI.eta1.add(eta1);
//		sovOAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-ai").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrAI.eta2.add(eta2);
//		
//// ---------OBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrHN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrHN.eta1.add(eta1);
//		sovOAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-hn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrHN.eta2.add(eta2);
//		
//// ---------OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrHAI.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrHAI.eta1.add(eta1);
//		sovOAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-hai").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrHAI.eta2.add(eta2);
//		
//// ---------OBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		sovOAgrMNM.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovOAgrMNM.eta1.add(eta1);
//		sovOAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-mnm").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("o-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovOAgrMNM.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrMF.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrMF.eta1.add(eta1);
//		sovSOAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-mf").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrMF.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrMFN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrMFN.eta1.add(eta1);
//		sovSOAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-mfn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrMFN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrCN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrCN.eta1.add(eta1);
//		sovSOAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-cn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrCN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrAI.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-ai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrAI.eta1.add(eta1);
//		sovSOAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-ai").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrAI.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrHN.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrHN.eta1.add(eta1);
//		sovSOAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-hn").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrHN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrHAI.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrHAI.eta1.add(eta1);
//		sovSOAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-hai").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrHAI.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		sovSOAgrMNM.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		sovSOAgrMNM.eta1.add(eta1);
//		sovSOAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-mnm").word.toUpperCase()))  &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.obj.equals(Objects.valueOf(second.get("so-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pObj_givenSubj = new BigDecimal((double)probs.size());
//		pObj_givenSubj = pObj_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pSubj.multiply(pObj_givenSubj));
//		sovSOAgrMNM.eta2.add(eta2);
	}
}
