package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class SVOTest extends Test {
	public Stats svo = new Stats();
	
	public Stats svoNomOnly = new Stats();
	public Stats svoAccOnly = new Stats();
	public Stats svoNomAcc = new Stats();
	public Stats svoErgOnly = new Stats();
	public Stats svoAbsOnly = new Stats();
	public Stats svoErgAbs = new Stats();
	
	public Stats svoSAgr123 = new Stats();
//	public Stats svoSAgrWe = new Stats();
	
	public Stats svoOAgr123 = new Stats();
//	public Stats svoOAgrWe = new Stats();
	
	public Stats svoSOAgr123 = new Stats();
//	public Stats svoSOAgrWe = new Stats();
	
	public Stats svoSAgrSP = new Stats();
	public Stats svoOAgrSP = new Stats();
	public Stats svoSOAgrSP = new Stats();
	
	public Stats svoSAgr123_SP = new Stats();
	public Stats svoSAgr123_SP_Nom = new Stats();
	public Stats svoSAgr123_SP_Acc = new Stats();
	public Stats svoSAgr123_SP_NomAcc = new Stats();
	public Stats svoSAgr123_SP_Erg = new Stats();
	public Stats svoSAgr123_SP_Abs = new Stats();
	public Stats svoSAgr123_SP_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP = new Stats();
	public Stats svoOAgr123_SP_Nom = new Stats();
	public Stats svoOAgr123_SP_Acc = new Stats();
	public Stats svoOAgr123_SP_NomAcc = new Stats();
	public Stats svoOAgr123_SP_Erg = new Stats();
	public Stats svoOAgr123_SP_Abs = new Stats();
	public Stats svoOAgr123_SP_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP = new Stats();
	public Stats svoSOAgr123_SP_Nom = new Stats();
	public Stats svoSOAgr123_SP_Acc = new Stats();
	public Stats svoSOAgr123_SP_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_Erg = new Stats();
	public Stats svoSOAgr123_SP_Abs = new Stats();
	public Stats svoSOAgr123_SP_ErgAbs = new Stats();
	
	public Stats svoSAgrMF = new Stats();
	public Stats svoSAgrMF_Nom = new Stats();
	public Stats svoSAgrMF_Acc = new Stats();
	public Stats svoSAgrMF_NomAcc = new Stats();
	public Stats svoSAgrMF_Erg = new Stats();
	public Stats svoSAgrMF_Abs = new Stats();
	public Stats svoSAgrMF_ErgAbs = new Stats();
	
	public Stats svoSAgrMFN = new Stats();
	public Stats svoSAgrMFN_Nom = new Stats();
	public Stats svoSAgrMFN_Acc = new Stats();
	public Stats svoSAgrMFN_NomAcc = new Stats();
	public Stats svoSAgrMFN_Erg = new Stats();
	public Stats svoSAgrMFN_Abs = new Stats();
	public Stats svoSAgrMFN_ErgAbs = new Stats();
	
	public Stats svoSAgrCN = new Stats();
	public Stats svoSAgrCN_Nom = new Stats();
	public Stats svoSAgrCN_Acc = new Stats();
	public Stats svoSAgrCN_NomAcc = new Stats();
	public Stats svoSAgrCN_Erg = new Stats();
	public Stats svoSAgrCN_Abs = new Stats();
	public Stats svoSAgrCN_ErgAbs = new Stats();
	
	public Stats svoSAgrAI = new Stats();
	public Stats svoSAgrAI_Nom = new Stats();
	public Stats svoSAgrAI_Acc = new Stats();
	public Stats svoSAgrAI_NomAcc = new Stats();
	public Stats svoSAgrAI_Erg = new Stats();
	public Stats svoSAgrAI_Abs = new Stats();
	public Stats svoSAgrAI_ErgAbs = new Stats();
	
	public Stats svoSAgrHN = new Stats();
	public Stats svoSAgrHN_Nom = new Stats();
	public Stats svoSAgrHN_Acc = new Stats();
	public Stats svoSAgrHN_NomAcc = new Stats();
	public Stats svoSAgrHN_Erg = new Stats();
	public Stats svoSAgrHN_Abs = new Stats();
	public Stats svoSAgrHN_ErgAbs = new Stats();
	
	public Stats svoSAgrHAI = new Stats();
	public Stats svoSAgrHAI_Nom = new Stats();
	public Stats svoSAgrHAI_Acc = new Stats();
	public Stats svoSAgrHAI_NomAcc = new Stats();
	public Stats svoSAgrHAI_Erg = new Stats();
	public Stats svoSAgrHAI_Abs = new Stats();
	public Stats svoSAgrHAI_ErgAbs = new Stats();
	
	public Stats svoSAgrMNM = new Stats();
	public Stats svoSAgrMNM_Nom = new Stats();
	public Stats svoSAgrMNM_Acc = new Stats();
	public Stats svoSAgrMNM_NomAcc = new Stats();
	public Stats svoSAgrMNM_Erg = new Stats();
	public Stats svoSAgrMNM_Abs = new Stats();
	public Stats svoSAgrMNM_ErgAbs = new Stats();
	
	public Stats svoOAgrMF = new Stats();
	public Stats svoOAgrMF_Nom = new Stats();
	public Stats svoOAgrMF_Acc = new Stats();
	public Stats svoOAgrMF_NomAcc = new Stats();
	public Stats svoOAgrMF_Erg = new Stats();
	public Stats svoOAgrMF_Abs = new Stats();
	public Stats svoOAgrMF_ErgAbs = new Stats();
	
	public Stats svoOAgrMFN = new Stats();
	public Stats svoOAgrMFN_Nom = new Stats();
	public Stats svoOAgrMFN_Acc = new Stats();
	public Stats svoOAgrMFN_NomAcc = new Stats();
	public Stats svoOAgrMFN_Erg = new Stats();
	public Stats svoOAgrMFN_Abs = new Stats();
	public Stats svoOAgrMFN_ErgAbs = new Stats();
	
	public Stats svoOAgrCN = new Stats();
	public Stats svoOAgrCN_Nom = new Stats();
	public Stats svoOAgrCN_Acc = new Stats();
	public Stats svoOAgrCN_NomAcc = new Stats();
	public Stats svoOAgrCN_Erg = new Stats();
	public Stats svoOAgrCN_Abs = new Stats();
	public Stats svoOAgrCN_ErgAbs = new Stats();
	
	public Stats svoOAgrAI = new Stats();
	public Stats svoOAgrAI_Nom = new Stats();
	public Stats svoOAgrAI_Acc = new Stats();
	public Stats svoOAgrAI_NomAcc = new Stats();
	public Stats svoOAgrAI_Erg = new Stats();
	public Stats svoOAgrAI_Abs = new Stats();
	public Stats svoOAgrAI_ErgAbs = new Stats();
	
	public Stats svoOAgrHN = new Stats();
	public Stats svoOAgrHN_Nom = new Stats();
	public Stats svoOAgrHN_Acc = new Stats();
	public Stats svoOAgrHN_NomAcc = new Stats();
	public Stats svoOAgrHN_Erg = new Stats();
	public Stats svoOAgrHN_Abs = new Stats();
	public Stats svoOAgrHN_ErgAbs = new Stats();
	
	public Stats svoOAgrHAI = new Stats();
	public Stats svoOAgrHAI_Nom = new Stats();
	public Stats svoOAgrHAI_Acc = new Stats();
	public Stats svoOAgrHAI_NomAcc = new Stats();
	public Stats svoOAgrHAI_Erg = new Stats();
	public Stats svoOAgrHAI_Abs = new Stats();
	public Stats svoOAgrHAI_ErgAbs = new Stats();
	
	public Stats svoOAgrMNM = new Stats();
	public Stats svoOAgrMNM_Nom = new Stats();
	public Stats svoOAgrMNM_Acc = new Stats();
	public Stats svoOAgrMNM_NomAcc = new Stats();
	public Stats svoOAgrMNM_Erg = new Stats();
	public Stats svoOAgrMNM_Abs = new Stats();
	public Stats svoOAgrMNM_ErgAbs = new Stats();
	
	public Stats svoSOAgrMF = new Stats();
	public Stats svoSOAgrMF_Nom = new Stats();
	public Stats svoSOAgrMF_Acc = new Stats();
	public Stats svoSOAgrMF_NomAcc = new Stats();
	public Stats svoSOAgrMF_Erg = new Stats();
	public Stats svoSOAgrMF_Abs = new Stats();
	public Stats svoSOAgrMF_ErgAbs = new Stats();
	
	public Stats svoSOAgrMFN = new Stats();
	public Stats svoSOAgrMFN_Nom = new Stats();
	public Stats svoSOAgrMFN_Acc = new Stats();
	public Stats svoSOAgrMFN_NomAcc = new Stats();
	public Stats svoSOAgrMFN_Erg = new Stats();
	public Stats svoSOAgrMFN_Abs = new Stats();
	public Stats svoSOAgrMFN_ErgAbs = new Stats();
	
	public Stats svoSOAgrCN = new Stats();
	public Stats svoSOAgrCN_Nom = new Stats();
	public Stats svoSOAgrCN_Acc = new Stats();
	public Stats svoSOAgrCN_NomAcc = new Stats();
	public Stats svoSOAgrCN_Erg = new Stats();
	public Stats svoSOAgrCN_Abs = new Stats();
	public Stats svoSOAgrCN_ErgAbs = new Stats();
	
	public Stats svoSOAgrAI = new Stats();
	public Stats svoSOAgrAI_Nom = new Stats();
	public Stats svoSOAgrAI_Acc = new Stats();
	public Stats svoSOAgrAI_NomAcc = new Stats();
	public Stats svoSOAgrAI_Erg = new Stats();
	public Stats svoSOAgrAI_Abs = new Stats();
	public Stats svoSOAgrAI_ErgAbs = new Stats();
	
	public Stats svoSOAgrHN = new Stats();
	public Stats svoSOAgrHN_Nom = new Stats();
	public Stats svoSOAgrHN_Acc = new Stats();
	public Stats svoSOAgrHN_NomAcc = new Stats();
	public Stats svoSOAgrHN_Erg = new Stats();
	public Stats svoSOAgrHN_Abs = new Stats();
	public Stats svoSOAgrHN_ErgAbs = new Stats();
	
	public Stats svoSOAgrHAI = new Stats();
	public Stats svoSOAgrHAI_Nom = new Stats();
	public Stats svoSOAgrHAI_Acc = new Stats();
	public Stats svoSOAgrHAI_NomAcc = new Stats();
	public Stats svoSOAgrHAI_Erg = new Stats();
	public Stats svoSOAgrHAI_Abs = new Stats();
	public Stats svoSOAgrHAI_ErgAbs = new Stats();
	
	public Stats svoSOAgrMNM = new Stats();
	public Stats svoSOAgrMNM_Nom = new Stats();
	public Stats svoSOAgrMNM_Acc = new Stats();
	public Stats svoSOAgrMNM_NomAcc = new Stats();
	public Stats svoSOAgrMNM_Erg = new Stats();
	public Stats svoSOAgrMNM_Abs = new Stats();
	public Stats svoSOAgrMNM_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_MF = new Stats();
	public Stats svoSAgr123_SP_MF_Nom = new Stats();
	public Stats svoSAgr123_SP_MF_Acc = new Stats();
	public Stats svoSAgr123_SP_MF_NomAcc = new Stats();
	public Stats svoSAgr123_SP_MF_Erg = new Stats();
	public Stats svoSAgr123_SP_MF_Abs = new Stats();
	public Stats svoSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_MFN = new Stats();
	public Stats svoSAgr123_SP_MFN_Nom = new Stats();
	public Stats svoSAgr123_SP_MFN_Acc = new Stats();
	public Stats svoSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats svoSAgr123_SP_MFN_Erg = new Stats();
	public Stats svoSAgr123_SP_MFN_Abs = new Stats();
	public Stats svoSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_CN = new Stats();
	public Stats svoSAgr123_SP_CN_Nom = new Stats();
	public Stats svoSAgr123_SP_CN_Acc = new Stats();
	public Stats svoSAgr123_SP_CN_NomAcc = new Stats();
	public Stats svoSAgr123_SP_CN_Erg = new Stats();
	public Stats svoSAgr123_SP_CN_Abs = new Stats();
	public Stats svoSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_AI = new Stats();
	public Stats svoSAgr123_SP_AI_Nom = new Stats();
	public Stats svoSAgr123_SP_AI_Acc = new Stats();
	public Stats svoSAgr123_SP_AI_NomAcc = new Stats();
	public Stats svoSAgr123_SP_AI_Erg = new Stats();
	public Stats svoSAgr123_SP_AI_Abs = new Stats();
	public Stats svoSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_HN = new Stats();
	public Stats svoSAgr123_SP_HN_Nom = new Stats();
	public Stats svoSAgr123_SP_HN_Acc = new Stats();
	public Stats svoSAgr123_SP_HN_NomAcc = new Stats();
	public Stats svoSAgr123_SP_HN_Erg = new Stats();
	public Stats svoSAgr123_SP_HN_Abs = new Stats();
	public Stats svoSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_HAI = new Stats();
	public Stats svoSAgr123_SP_HAI_Nom = new Stats();
	public Stats svoSAgr123_SP_HAI_Acc = new Stats();
	public Stats svoSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats svoSAgr123_SP_HAI_Erg = new Stats();
	public Stats svoSAgr123_SP_HAI_Abs = new Stats();
	public Stats svoSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_MNM = new Stats();
	public Stats svoSAgr123_SP_MNM_Nom = new Stats();
	public Stats svoSAgr123_SP_MNM_Acc = new Stats();
	public Stats svoSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats svoSAgr123_SP_MNM_Erg = new Stats();
	public Stats svoSAgr123_SP_MNM_Abs = new Stats();
	public Stats svoSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_MF = new Stats();
	public Stats svoOAgr123_SP_MF_Nom = new Stats();
	public Stats svoOAgr123_SP_MF_Acc = new Stats();
	public Stats svoOAgr123_SP_MF_NomAcc = new Stats();
	public Stats svoOAgr123_SP_MF_Erg = new Stats();
	public Stats svoOAgr123_SP_MF_Abs = new Stats();
	public Stats svoOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_MFN = new Stats();
	public Stats svoOAgr123_SP_MFN_Nom = new Stats();
	public Stats svoOAgr123_SP_MFN_Acc = new Stats();
	public Stats svoOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats svoOAgr123_SP_MFN_Erg = new Stats();
	public Stats svoOAgr123_SP_MFN_Abs = new Stats();
	public Stats svoOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_CN = new Stats();
	public Stats svoOAgr123_SP_CN_Nom = new Stats();
	public Stats svoOAgr123_SP_CN_Acc = new Stats();
	public Stats svoOAgr123_SP_CN_NomAcc = new Stats();
	public Stats svoOAgr123_SP_CN_Erg = new Stats();
	public Stats svoOAgr123_SP_CN_Abs = new Stats();
	public Stats svoOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_AI = new Stats();
	public Stats svoOAgr123_SP_AI_Nom = new Stats();
	public Stats svoOAgr123_SP_AI_Acc = new Stats();
	public Stats svoOAgr123_SP_AI_NomAcc = new Stats();
	public Stats svoOAgr123_SP_AI_Erg = new Stats();
	public Stats svoOAgr123_SP_AI_Abs = new Stats();
	public Stats svoOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_HN = new Stats();
	public Stats svoOAgr123_SP_HN_Nom = new Stats();
	public Stats svoOAgr123_SP_HN_Acc = new Stats();
	public Stats svoOAgr123_SP_HN_NomAcc = new Stats();
	public Stats svoOAgr123_SP_HN_Erg = new Stats();
	public Stats svoOAgr123_SP_HN_Abs = new Stats();
	public Stats svoOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_HAI = new Stats();
	public Stats svoOAgr123_SP_HAI_Nom = new Stats();
	public Stats svoOAgr123_SP_HAI_Acc = new Stats();
	public Stats svoOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats svoOAgr123_SP_HAI_Erg = new Stats();
	public Stats svoOAgr123_SP_HAI_Abs = new Stats();
	public Stats svoOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_MNM = new Stats();
	public Stats svoOAgr123_SP_MNM_Nom = new Stats();
	public Stats svoOAgr123_SP_MNM_Acc = new Stats();
	public Stats svoOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats svoOAgr123_SP_MNM_Erg = new Stats();
	public Stats svoOAgr123_SP_MNM_Abs = new Stats();
	public Stats svoOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_MF = new Stats();
	public Stats svoSOAgr123_SP_MF_Nom = new Stats();
	public Stats svoSOAgr123_SP_MF_Acc = new Stats();
	public Stats svoSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_MF_Erg = new Stats();
	public Stats svoSOAgr123_SP_MF_Abs = new Stats();
	public Stats svoSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_MFN = new Stats();
	public Stats svoSOAgr123_SP_MFN_Nom = new Stats();
	public Stats svoSOAgr123_SP_MFN_Acc = new Stats();
	public Stats svoSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_MFN_Erg = new Stats();
	public Stats svoSOAgr123_SP_MFN_Abs = new Stats();
	public Stats svoSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_CN = new Stats();
	public Stats svoSOAgr123_SP_CN_Nom = new Stats();
	public Stats svoSOAgr123_SP_CN_Acc = new Stats();
	public Stats svoSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_CN_Erg = new Stats();
	public Stats svoSOAgr123_SP_CN_Abs = new Stats();
	public Stats svoSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_AI = new Stats();
	public Stats svoSOAgr123_SP_AI_Nom = new Stats();
	public Stats svoSOAgr123_SP_AI_Acc = new Stats();
	public Stats svoSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_AI_Erg = new Stats();
	public Stats svoSOAgr123_SP_AI_Abs = new Stats();
	public Stats svoSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_HN = new Stats();
	public Stats svoSOAgr123_SP_HN_Nom = new Stats();
	public Stats svoSOAgr123_SP_HN_Acc = new Stats();
	public Stats svoSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_HN_Erg = new Stats();
	public Stats svoSOAgr123_SP_HN_Abs = new Stats();
	public Stats svoSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_HAI = new Stats();
	public Stats svoSOAgr123_SP_HAI_Nom = new Stats();
	public Stats svoSOAgr123_SP_HAI_Acc = new Stats();
	public Stats svoSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_HAI_Erg = new Stats();
	public Stats svoSOAgr123_SP_HAI_Abs = new Stats();
	public Stats svoSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_MNM = new Stats();
	public Stats svoSOAgr123_SP_MNM_Nom = new Stats();
	public Stats svoSOAgr123_SP_MNM_Acc = new Stats();
	public Stats svoSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_MNM_Erg = new Stats();
	public Stats svoSOAgr123_SP_MNM_Abs = new Stats();
	public Stats svoSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public SVOTest() {
		all = new Stats[]{svo, svoNomOnly, svoAccOnly, svoNomAcc, svoErgOnly, svoAbsOnly, svoErgAbs,
				svoSAgr123, /*svoSAgrWe,*/ svoOAgr123, /*svoOAgrWe,*/ svoSOAgr123, /*svoSAgrMF,*/ 
				svoSAgrSP, svoOAgrSP, svoSOAgrSP,	
				svoSAgr123_SP, svoSAgr123_SP_Nom, svoSAgr123_SP_Acc, svoSAgr123_SP_NomAcc, svoSAgr123_SP_Erg, svoSAgr123_SP_Abs, svoSAgr123_SP_ErgAbs,
				svoOAgr123_SP, svoOAgr123_SP_Nom, svoOAgr123_SP_Acc, svoOAgr123_SP_NomAcc, svoOAgr123_SP_Erg, svoOAgr123_SP_Abs, svoOAgr123_SP_ErgAbs,
				svoSOAgr123_SP, svoSOAgr123_SP_Nom, svoSOAgr123_SP_Acc, svoSOAgr123_SP_NomAcc, svoSOAgr123_SP_Erg, svoSOAgr123_SP_Abs, svoSOAgr123_SP_ErgAbs,
				svoSAgrMF, svoSAgrMF_Nom, svoSAgrMF_Acc, svoSAgrMF_NomAcc, svoSAgrMF_Erg, svoSAgrMF_Abs, svoSAgrMF_ErgAbs,
				svoSAgrMFN, svoSAgrMFN_Nom, svoSAgrMFN_Acc, svoSAgrMFN_NomAcc, svoSAgrMFN_Erg, svoSAgrMFN_Abs, svoSAgrMFN_ErgAbs,
				svoSAgrCN, svoSAgrCN_Nom, svoSAgrCN_Acc, svoSAgrCN_NomAcc, svoSAgrCN_Erg, svoSAgrCN_Abs, svoSAgrCN_ErgAbs,
				svoSAgrAI, svoSAgrAI_Nom, svoSAgrAI_Acc, svoSAgrAI_NomAcc, svoSAgrAI_Erg, svoSAgrAI_Abs, svoSAgrAI_ErgAbs,
				svoSAgrHN, svoSAgrHN_Nom, svoSAgrHN_Acc, svoSAgrHN_NomAcc, svoSAgrHN_Erg, svoSAgrHN_Abs, svoSAgrHN_ErgAbs,
				svoSAgrHAI, svoSAgrHAI_Nom, svoSAgrHAI_Acc, svoSAgrHAI_NomAcc, svoSAgrHAI_Erg, svoSAgrHAI_Abs, svoSAgrHAI_ErgAbs,
				svoSAgrMNM, svoSAgrMNM_Nom, svoSAgrMNM_Acc, svoSAgrMNM_NomAcc, svoSAgrMNM_Erg, svoSAgrMNM_Abs, svoSAgrMNM_ErgAbs,
				svoOAgrMF, svoOAgrMF_Nom, svoOAgrMF_Acc, svoOAgrMF_NomAcc, svoOAgrMF_Erg, svoOAgrMF_Abs, svoOAgrMF_ErgAbs,
				svoOAgrMFN, svoOAgrMFN_Nom, svoOAgrMFN_Acc, svoOAgrMFN_NomAcc, svoOAgrMFN_Erg, svoOAgrMFN_Abs, svoOAgrMFN_ErgAbs,
				svoOAgrCN, svoOAgrCN_Nom, svoOAgrCN_Acc, svoOAgrCN_NomAcc, svoOAgrCN_Erg, svoOAgrCN_Abs, svoOAgrCN_ErgAbs,
				svoOAgrAI, svoOAgrAI_Nom, svoOAgrAI_Acc, svoOAgrAI_NomAcc, svoOAgrAI_Erg, svoOAgrAI_Abs, svoOAgrAI_ErgAbs,
				svoOAgrHN, svoOAgrHN_Nom, svoOAgrHN_Acc, svoOAgrHN_NomAcc, svoOAgrHN_Erg, svoOAgrHN_Abs, svoOAgrHN_ErgAbs,
				svoOAgrHAI, svoOAgrHAI_Nom, svoOAgrHAI_Acc, svoOAgrHAI_NomAcc, svoOAgrHAI_Erg, svoOAgrHAI_Abs, svoOAgrHAI_ErgAbs,
				svoOAgrMNM, svoOAgrMNM_Nom, svoOAgrMNM_Acc, svoOAgrMNM_NomAcc, svoOAgrMNM_Erg, svoOAgrMNM_Abs, svoOAgrMNM_ErgAbs,
				svoSOAgrMF, svoSOAgrMF_Nom, svoSOAgrMF_Acc, svoSOAgrMF_NomAcc, svoSOAgrMF_Erg, svoSOAgrMF_Abs, svoSOAgrMF_ErgAbs,
				svoSOAgrMFN, svoSOAgrMFN_Nom, svoSOAgrMFN_Acc, svoSOAgrMFN_NomAcc, svoSOAgrMFN_Erg, svoSOAgrMFN_Abs, svoSOAgrMFN_ErgAbs,
				svoSOAgrCN, svoSOAgrCN_Nom, svoSOAgrCN_Acc, svoSOAgrCN_NomAcc, svoSOAgrCN_Erg, svoSOAgrCN_Abs, svoSOAgrCN_ErgAbs,
				svoSOAgrAI, svoSOAgrAI_Nom, svoSOAgrAI_Acc, svoSOAgrAI_NomAcc, svoSOAgrAI_Erg, svoSOAgrAI_Abs, svoSOAgrAI_ErgAbs,
				svoSOAgrHN, svoSOAgrHN_Nom, svoSOAgrHN_Acc, svoSOAgrHN_NomAcc, svoSOAgrHN_Erg, svoSOAgrHN_Abs, svoSOAgrHN_ErgAbs,
				svoSOAgrHAI, svoSOAgrHAI_Nom, svoSOAgrHAI_Acc, svoSOAgrHAI_NomAcc, svoSOAgrHAI_Erg, svoSOAgrHAI_Abs, svoSOAgrHAI_ErgAbs,
				svoSOAgrMNM, svoSOAgrMNM_Nom, svoSOAgrMNM_Acc, svoSOAgrMNM_NomAcc, svoSOAgrMNM_Erg, svoSOAgrMNM_Abs, svoSOAgrMNM_ErgAbs, 
				svoSAgr123_SP_MF, svoSAgr123_SP_MF_Nom, svoSAgr123_SP_MF_Acc, svoSAgr123_SP_MF_NomAcc, svoSAgr123_SP_MF_Erg, svoSAgr123_SP_MF_Abs, svoSAgr123_SP_MF_ErgAbs,
				svoSAgr123_SP_MFN, svoSAgr123_SP_MFN_Nom, svoSAgr123_SP_MFN_Acc, svoSAgr123_SP_MFN_NomAcc, svoSAgr123_SP_MFN_Erg, svoSAgr123_SP_MFN_Abs, svoSAgr123_SP_MFN_ErgAbs,
				svoSAgr123_SP_CN, svoSAgr123_SP_CN_Nom, svoSAgr123_SP_CN_Acc, svoSAgr123_SP_CN_NomAcc, svoSAgr123_SP_CN_Erg, svoSAgr123_SP_CN_Abs, svoSAgr123_SP_CN_ErgAbs,
				svoSAgr123_SP_AI, svoSAgr123_SP_AI_Nom, svoSAgr123_SP_AI_Acc, svoSAgr123_SP_AI_NomAcc, svoSAgr123_SP_AI_Erg, svoSAgr123_SP_AI_Abs, svoSAgr123_SP_AI_ErgAbs,
				svoSAgr123_SP_HN, svoSAgr123_SP_HN_Nom, svoSAgr123_SP_HN_Acc, svoSAgr123_SP_HN_NomAcc, svoSAgr123_SP_HN_Erg, svoSAgr123_SP_HN_Abs, svoSAgr123_SP_HN_ErgAbs,
				svoSAgr123_SP_HAI, svoSAgr123_SP_HAI_Nom, svoSAgr123_SP_HAI_Acc, svoSAgr123_SP_HAI_NomAcc, svoSAgr123_SP_HAI_Erg, svoSAgr123_SP_HAI_Abs, svoSAgr123_SP_HAI_ErgAbs,
				svoSAgr123_SP_MNM, svoSAgr123_SP_MNM_Nom, svoSAgr123_SP_MNM_Acc, svoSAgr123_SP_MNM_NomAcc, svoSAgr123_SP_MNM_Erg, svoSAgr123_SP_MNM_Abs, svoSAgr123_SP_MNM_ErgAbs,
				svoOAgr123_SP_MF, svoOAgr123_SP_MF_Nom, svoOAgr123_SP_MF_Acc, svoOAgr123_SP_MF_NomAcc, svoOAgr123_SP_MF_Erg, svoOAgr123_SP_MF_Abs, svoOAgr123_SP_MF_ErgAbs,
				svoOAgr123_SP_MFN, svoOAgr123_SP_MFN_Nom, svoOAgr123_SP_MFN_Acc, svoOAgr123_SP_MFN_NomAcc, svoOAgr123_SP_MFN_Erg, svoOAgr123_SP_MFN_Abs, svoOAgr123_SP_MFN_ErgAbs,
				svoOAgr123_SP_CN, svoOAgr123_SP_CN_Nom, svoOAgr123_SP_CN_Acc, svoOAgr123_SP_CN_NomAcc, svoOAgr123_SP_CN_Erg, svoOAgr123_SP_CN_Abs, svoOAgr123_SP_CN_ErgAbs,
				svoOAgr123_SP_AI, svoOAgr123_SP_AI_Nom, svoOAgr123_SP_AI_Acc, svoOAgr123_SP_AI_NomAcc, svoOAgr123_SP_AI_Erg, svoOAgr123_SP_AI_Abs, svoOAgr123_SP_AI_ErgAbs,
				svoOAgr123_SP_HN, svoOAgr123_SP_HN_Nom, svoOAgr123_SP_HN_Acc, svoOAgr123_SP_HN_NomAcc, svoOAgr123_SP_HN_Erg, svoOAgr123_SP_HN_Abs, svoOAgr123_SP_HN_ErgAbs,
				svoOAgr123_SP_HAI, svoOAgr123_SP_HAI_Nom, svoOAgr123_SP_HAI_Acc, svoOAgr123_SP_HAI_NomAcc, svoOAgr123_SP_HAI_Erg, svoOAgr123_SP_HAI_Abs, svoOAgr123_SP_HAI_ErgAbs,
				svoOAgr123_SP_MNM, svoOAgr123_SP_MNM_Nom, svoOAgr123_SP_MNM_Acc, svoOAgr123_SP_MNM_NomAcc, svoOAgr123_SP_MNM_Erg, svoOAgr123_SP_MNM_Abs, svoOAgr123_SP_MNM_ErgAbs,
				svoSOAgr123_SP_MF, svoSOAgr123_SP_MF_Nom, svoSOAgr123_SP_MF_Acc, svoSOAgr123_SP_MF_NomAcc, svoSOAgr123_SP_MF_Erg, svoSOAgr123_SP_MF_Abs, svoSOAgr123_SP_MF_ErgAbs,
				svoSOAgr123_SP_MFN, svoSOAgr123_SP_MFN_Nom, svoSOAgr123_SP_MFN_Acc, svoSOAgr123_SP_MFN_NomAcc, svoSOAgr123_SP_MFN_Erg, svoSOAgr123_SP_MFN_Abs, svoSOAgr123_SP_MFN_ErgAbs,
				svoSOAgr123_SP_CN, svoSOAgr123_SP_CN_Nom, svoSOAgr123_SP_CN_Acc, svoSOAgr123_SP_CN_NomAcc, svoSOAgr123_SP_CN_Erg, svoSOAgr123_SP_CN_Abs, svoSOAgr123_SP_CN_ErgAbs,
				svoSOAgr123_SP_AI, svoSOAgr123_SP_AI_Nom, svoSOAgr123_SP_AI_Acc, svoSOAgr123_SP_AI_NomAcc, svoSOAgr123_SP_AI_Erg, svoSOAgr123_SP_AI_Abs, svoSOAgr123_SP_AI_ErgAbs,
				svoSOAgr123_SP_HN, svoSOAgr123_SP_HN_Nom, svoSOAgr123_SP_HN_Acc, svoSOAgr123_SP_HN_NomAcc, svoSOAgr123_SP_HN_Erg, svoSOAgr123_SP_HN_Abs, svoSOAgr123_SP_HN_ErgAbs,
				svoSOAgr123_SP_HAI, svoSOAgr123_SP_HAI_Nom, svoSOAgr123_SP_HAI_Acc, svoSOAgr123_SP_HAI_NomAcc, svoSOAgr123_SP_HAI_Erg, svoSOAgr123_SP_HAI_Abs, svoSOAgr123_SP_HAI_ErgAbs,
				svoSOAgr123_SP_MNM, svoSOAgr123_SP_MNM_Nom, svoSOAgr123_SP_MNM_Acc, svoSOAgr123_SP_MNM_NomAcc, svoSOAgr123_SP_MNM_Erg, svoSOAgr123_SP_MNM_Abs, svoSOAgr123_SP_MNM_ErgAbs};
	}
	
	protected void entropyCalc(ArrayList<Event> events, Event ev, HashMap<String, HashMap<String, Word>> lexicons) {
		for(int i = 0; i < all.length; i++) {
			all[i].count++;
			ArrayList<Double> probs = new ArrayList<>();
			// compute entropy for cond. probability of events, given we know the person who is doing them
			for(Event e:events) {
				if(e.person.equals(People.valueOf(first.get(conditionCode[i]).word.toUpperCase())) &&
						e.probability > 0.0) {
					probs.add(e.probability);
				}
			}
						
			BigDecimal pSubj = new BigDecimal((double)probs.size());
			pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
			eta1 = calcEntropy(probs, pSubj);
			
			all[i].eta1.add(eta1);
			all[i].eventProbs.add(ev.probability);
			
			probs = new ArrayList<>();
			double factor = 0.0;
			
			for(Event e:events) {
				if(e.person.equals(People.valueOf(first.get(conditionCode[i]).word.toUpperCase())) &&
						e.probability > 0.0) {
					switch(i) {
						// verb agrees with obj/subj&obj in person
						case 8: case 9:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0)) {
								factor++;
								if(e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
									probs.add(e.probability);
								}
							}
							break;
						// verb agrees with obj/subj&obj in number
						case 11: case 12:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0)) {
								factor++;
								if(e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
									probs.add(e.probability);
								}
							}
							break;
						// verb agrees with obj/subj&obj in person and number
						case 20: case 21: case 22: case 23: case 24: case 25: case 26:
						case 27: case 28: case 29: case 30: case 31: case 32: case 33:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0) &&
							lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(1)) {
								factor++;
								if(e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
									probs.add(e.probability);
								}
							}
							break;
						// verb agrees with obj/subj&obj in noun class
						case 83: case 84: case 85: case 86: case 87: case 88: case 89:
						case 90: case 91: case 92: case 93: case 94: case 95: case 96:
						case 97: case 98: case 99: case 100: case 101: case 102: case 103:
						case 104: case 105: case 106: case 107: case 108: case 109: case 110:
						case 111: case 112: case 113: case 114: case 115: case 116: case 117:
						case 118: case 119: case 120: case 121: case 122: case 123: case 124:
						case 125: case 126: case 127: case 128: case 129: case 130: case 131:
						case 132: case 133: case 134: case 135: case 136: case 137: case 138:
						case 139: case 140: case 141: case 142: case 143: case 144: case 145:
						case 146: case 147: case 148: case 149: case 150: case 151: case 152:
						case 153: case 154: case 155: case 156: case 157: case 158: case 159:
						case 160: case 161: case 162: case 163: case 164: case 165: case 166:
						case 167: case 168: case 169: case 170: case 171: case 172: case 173:
						case 174: case 175: case 176: case 177: case 178: case 179: case 180:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("class").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0)) {
								factor++;
								if(e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
									probs.add(e.probability);
								}
							}
							break;
						// verb agrees with obj/subj&obj in person, number, and noun class
						case 230: case 231: case 232: case 233: case 234: case 235: case 236:
						case 237: case 238: case 239: case 240: case 241: case 242: case 243:
						case 244: case 245: case 246: case 247: case 248: case 249: case 250:
						case 251: case 252: case 253: case 254: case 255: case 256: case 257:
						case 258: case 259: case 260: case 261: case 262: case 263: case 264:
						case 265: case 266: case 267: case 268: case 269: case 270: case 271:
						case 272: case 273: case 274: case 275: case 276: case 277: case 278:
						case 279: case 280: case 281: case 282: case 283: case 284: case 285:
						case 286: case 287: case 288: case 289: case 290: case 291: case 292:
						case 293: case 294: case 295: case 296: case 297: case 298: case 299:
						case 300: case 301: case 302: case 303: case 304: case 305: case 306:
						case 307: case 308: case 309: case 310: case 311: case 312: case 313:
						case 314: case 315: case 316: case 317: case 318: case 319: case 320:
						case 321: case 322: case 323: case 324: case 325: case 326: case 327:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0) &&
							lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(1) &&
							lexicons.get(lexiconCode.get(conditionCode[i])).get(e.obj.toString()).inflection.get("class").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(2)) {
								factor++;
								if(e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
									probs.add(e.probability);
								}
							}
							break;
						default:
							factor++;
							if(e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
								// if the subj corresponds to the person in the event
								// and if the verb corresponds to the action
								probs.add(e.probability);
							}
						}
				}
			}
			
			BigDecimal pVerb_givenSubj = new BigDecimal((double)probs.size());
			pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
			
			eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
			all[i].eta2.add(eta2);
		}
//// ---------CASELESS---------------------------------------------------------------------------------------------------//					
//		svo.count++;
//		ArrayList<Double> probs = new ArrayList<>();
//		// compute entropy for probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			// loop through events
//			if(e.person.equals(People.valueOf(first.get("caseless").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//		BigDecimal pSubj = new /*BigDecimal(1.0);*/ BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(/*5.0*/40.0D), MathContext.DECIMAL128);
//		
//		eta1 = calcEntropy(probs, pSubj);
//		svo.eta1.add(eta1);
//		
//		svo.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		double factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("caseless").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.action.equals(Actions.valueOf(second.get("caseless").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		BigDecimal pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svo.eta2.add(eta2);
//		
//// ---------NOM ONLY (eg. Oromo, acc is "bare form")-------------------------------------------------------------------//
//		svoNomOnly.count++;
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
//		svoNomOnly.eta1.add(eta1);
//		svoNomOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("nom").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoNomOnly.eta2.add(eta2);
//		
//// ---------ACC ONLY---------------------------------------------------------------------------------------------------//
//		svoAccOnly.count++;
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
//		svoAccOnly.eta1.add(eta1);
//		svoAccOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("acc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoAccOnly.eta2.add(eta2);
//		
//// ---------NOM + ACC--------------------------------------------------------------------------------------------------//
//		svoNomAcc.count++;
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
//		svoNomAcc.eta1.add(eta1);
//		svoNomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("nomacc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoNomAcc.eta2.add(eta2);
//		
//// ---------ERG ONLY---------------------------------------------------------------------------------------------------//
//		svoErgOnly.count++;
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
//		svoErgOnly.eta1.add(eta1);
//		svoErgOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("erg").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoErgOnly.eta2.add(eta2);
//		
//// ---------ABS ONLY---------------------------------------------------------------------------------------------------//
//		svoAbsOnly.count++;
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
//		svoAbsOnly.eta1.add(eta1);
//		svoAbsOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("abs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoAbsOnly.eta2.add(eta2);
//		
//// ---------ERG + ABS-------------------------------------------------------------------------------------------------//
//		svoErgAbs.count++;
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
//		svoErgAbs.eta1.add(eta1);
//		svoErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("ergabs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		svoSAgr123.count++;
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
//		svoSAgr123.eta1.add(eta1);
//		svoSAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		svoOAgr123.count++;
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
//		svoOAgr123.eta1.add(eta1);
//		svoOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123").word.toUpperCase())) &&
//					lexicons.get("o-123").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgr123.count++;
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
//		svoSOAgr123.eta1.add(eta1);
//		svoSOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123").word.toUpperCase())) &&
//					lexicons.get("so-123").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123.eta2.add(eta2);
//		
//// ---------SUBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrSP.count++;
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
//		svoSAgrSP.eta1.add(eta1);
//		svoSAgrSP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-sp").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrSP.eta2.add(eta2);
//		
//// ---------OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrSP.count++;
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
//		svoOAgrSP.eta1.add(eta1);
//		svoOAgrSP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-sp").word.toUpperCase())) &&
//					lexicons.get("o-sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-sp").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-sp").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrSP.eta2.add(eta2);
//
//// ---------SUBJ&OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrSP.count++;
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
//		svoSOAgrSP.eta1.add(eta1);
//		svoSOAgrSP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-sp").word.toUpperCase())) &&
//					lexicons.get("so-sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-sp").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-sp").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrSP.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		svoSAgr123_SP.count++;
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
//		svoSAgr123_SP.eta1.add(eta1);
//		svoSAgr123_SP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123+sp").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123_SP.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL + NOM-------------------------------------------------------------------------------------------------//
//		svoSAgr123_SP_Nom.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSAgr123_SP_Nom.eta1.add(eta1);
//		svoSAgr123_SP_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp+nom").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123_SP_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL + ACC-------------------------------------------------------------------------------------------------//
//		svoSAgr123_SP_Acc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSAgr123_SP_Acc.eta1.add(eta1);
//		svoSAgr123_SP_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp+acc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123_SP_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL + NOM + ACC-------------------------------------------------------------------------------------------------//
//		svoSAgr123_SP_NomAcc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSAgr123_SP_NomAcc.eta1.add(eta1);
//		svoSAgr123_SP_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp+nomacc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123_SP_NomAcc.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL + ERG-------------------------------------------------------------------------------------------------//
//		svoSAgr123_SP_Erg.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSAgr123_SP_Erg.eta1.add(eta1);
//		svoSAgr123_SP_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp+erg").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123_SP_Erg.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL + ABS-------------------------------------------------------------------------------------------------//
//		svoSAgr123_SP_Abs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSAgr123_SP_Abs.eta1.add(eta1);
//		svoSAgr123_SP_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp+abs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123_SP_Abs.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		svoSAgr123_SP_ErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSAgr123_SP_ErgAbs.eta1.add(eta1);
//		svoSAgr123_SP_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-123+sp+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp+ergabs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgr123_SP_ErgAbs.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		svoOAgr123_SP.count++;
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
//		svoOAgr123_SP.eta1.add(eta1);
//		svoOAgr123_SP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123+sp").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123_SP.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL + NOM-------------------------------------------------------------------------------------------------//
//		svoOAgr123_SP_Nom.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoOAgr123_SP_Nom.eta1.add(eta1);
//		svoOAgr123_SP_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+nom").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp+nom").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp+nom").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp+nom").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123_SP_Nom.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL + ACC-------------------------------------------------------------------------------------------------//
//		svoOAgr123_SP_Acc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoOAgr123_SP_Acc.eta1.add(eta1);
//		svoOAgr123_SP_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+acc").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp+acc").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp+acc").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp+acc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123_SP_Acc.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL + NOM + ACC-------------------------------------------------------------------------------------------------//
//		svoOAgr123_SP_NomAcc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoOAgr123_SP_NomAcc.eta1.add(eta1);
//		svoOAgr123_SP_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+nomacc").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp+nomacc").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp+nomacc").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp+nomacc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123_SP_NomAcc.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL + ERG-------------------------------------------------------------------------------------------------//
//		svoOAgr123_SP_Erg.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoOAgr123_SP_Erg.eta1.add(eta1);
//		svoOAgr123_SP_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+erg").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp+erg").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp+erg").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp+erg").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123_SP_Erg.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL + ABS-------------------------------------------------------------------------------------------------//
//		svoOAgr123_SP_Abs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoOAgr123_SP_Abs.eta1.add(eta1);
//		svoOAgr123_SP_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+abs").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp+abs").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp+abs").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp+abs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123_SP_Abs.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		svoOAgr123_SP_ErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoOAgr123_SP_ErgAbs.eta1.add(eta1);
//		svoOAgr123_SP_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-123+sp+ergabs").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp+ergabs").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp+ergabs").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp+ergabs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgr123_SP_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgr123_SP.count++;
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
//		svoSOAgr123_SP.eta1.add(eta1);
//		svoSOAgr123_SP.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123+sp").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123+sp").inflection.get("obj").get(0) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-123+sp").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123_SP.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL + NOM-------------------------------------------------------------------------------------------------//
//		svoSOAgr123_SP_Nom.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSOAgr123_SP_Nom.eta1.add(eta1);
//		svoSOAgr123_SP_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+nom").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123+sp+nom").inflection.get("obj").get(0) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-123+sp+nom").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp+nom").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123_SP_Nom.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL + ACC-------------------------------------------------------------------------------------------------//
//		svoSOAgr123_SP_Acc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSOAgr123_SP_Acc.eta1.add(eta1);
//		svoSOAgr123_SP_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+acc").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123+sp+acc").inflection.get("obj").get(0) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-123+sp+acc").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp+acc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123_SP_Acc.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL + NOM + ACC-------------------------------------------------------------------------------------------------//
//		svoSOAgr123_SP_NomAcc.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSOAgr123_SP_NomAcc.eta1.add(eta1);
//		svoSOAgr123_SP_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+nomacc").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123+sp+nomacc").inflection.get("obj").get(0) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-123+sp+nomacc").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp+nomacc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123_SP_NomAcc.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL + ERG-------------------------------------------------------------------------------------------------//
//		svoSOAgr123_SP_Erg.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSOAgr123_SP_Erg.eta1.add(eta1);
//		svoSOAgr123_SP_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+erg").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123+sp+erg").inflection.get("obj").get(0) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-123+sp+erg").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp+erg").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123_SP_Erg.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL + ABS-------------------------------------------------------------------------------------------------//
//		svoSOAgr123_SP_Abs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSOAgr123_SP_Abs.eta1.add(eta1);
//		svoSOAgr123_SP_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+abs").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123+sp+abs").inflection.get("obj").get(0) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-123+sp+abs").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp+abs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123_SP_Abs.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		svoSOAgr123_SP_ErgAbs.count++;
//		probs = new ArrayList<>();
//		// compute entropy for cond. probability of events, given we know the person who is doing them
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				probs.add(e.probability);
//			}
//		}
//					
//		pSubj = new BigDecimal((double)probs.size());
//		pSubj = pSubj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
//		eta1 = calcEntropy(probs, pSubj);
//		
//		svoSOAgr123_SP_ErgAbs.eta1.add(eta1);
//		svoSOAgr123_SP_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-123+sp+ergabs").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("so-123+sp+ergabs").inflection.get("obj").get(0) &&
//					lexicons.get("so-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("so-123+sp+ergabs").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp+ergabs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgr123_SP_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrMF.count++;
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
//		svoSAgrMF.eta1.add(eta1);
//		svoSAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mf").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMF.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM ONLY-------------------------------------------------------------------//
//		svoSAgrMF_Nom.count++;
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
//		svoSAgrMF_Nom.eta1.add(eta1);
//		svoSAgrMF_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mf+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+nom").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMF_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		svoSAgrMF_Acc.count++;
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
//		svoSAgrMF_Acc.eta1.add(eta1);
//		svoSAgrMF_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mf+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+acc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMF_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		svoSAgrMF_NomAcc.count++;
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
//		svoSAgrMF_NomAcc.eta1.add(eta1);
//		svoSAgrMF_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mf+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+nomacc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMF_NomAcc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		svoSAgrMF_Erg.count++;
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
//		svoSAgrMF_Erg.eta1.add(eta1);
//		svoSAgrMF_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mf+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+erg").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMF_Erg.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		svoSAgrMF_Abs.count++;
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
//		svoSAgrMF_Abs.eta1.add(eta1);
//		svoSAgrMF_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mf+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+abs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMF_Abs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		svoSAgrMF_ErgAbs.count++;
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
//		svoSAgrMF_ErgAbs.eta1.add(eta1);
//		svoSAgrMF_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mf+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+ergabs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMF_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrMFN.count++;
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
//		svoSAgrMFN.eta1.add(eta1);
//		svoSAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mfn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMFN.eta2.add(eta2);
//
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM ONLY-------------------------------------------------------------------//
//		svoSAgrMFN_Nom.count++;
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
//		svoSAgrMFN_Nom.eta1.add(eta1);
//		svoSAgrMFN_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mfn+nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+nom").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMFN_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		svoSAgrMFN_Acc.count++;
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
//		svoSAgrMFN_Acc.eta1.add(eta1);
//		svoSAgrMFN_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mfn+acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+acc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMFN_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		svoSAgrMFN_NomAcc.count++;
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
//		svoSAgrMFN_NomAcc.eta1.add(eta1);
//		svoSAgrMFN_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mfn+nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+nomacc").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMFN_NomAcc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		svoSAgrMFN_Erg.count++;
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
//		svoSAgrMFN_Erg.eta1.add(eta1);
//		svoSAgrMFN_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mfn+erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+erg").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMFN_Erg.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		svoSAgrMFN_Abs.count++;
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
//		svoSAgrMFN_Abs.eta1.add(eta1);
//		svoSAgrMFN_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mfn+abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+abs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMFN_Abs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		svoSAgrMFN_ErgAbs.count++;
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
//		svoSAgrMFN_ErgAbs.eta1.add(eta1);
//		svoSAgrMFN_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mfn+ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+ergabs").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMFN_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrCN.count++;
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
//		svoSAgrCN.eta1.add(eta1);
//		svoSAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-cn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrCN.eta2.add(eta2);
//		
//// ---------SUBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrAI.count++;
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
//		svoSAgrAI.eta1.add(eta1);
//		svoSAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-cn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-cn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrAI.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrHN.count++;
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
//		svoSAgrHN.eta1.add(eta1);
//		svoSAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-hn").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-hn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrHN.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrHAI.count++;
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
//		svoSAgrHAI.eta1.add(eta1);
//		svoSAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-hai").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-hai").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrHAI.eta2.add(eta2);
//		
//// ---------SUBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		svoSAgrMNM.count++;
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
//		svoSAgrMNM.eta1.add(eta1);
//		svoSAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what
//			if(e.person.equals(People.valueOf(first.get("s-mnm").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mnm").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSAgrMNM.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrMF.count++;
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
//		svoOAgrMF.eta1.add(eta1);
//		svoOAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-mf").word.toUpperCase())) &&
//					lexicons.get("o-mf").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-mf").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-mf").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrMF.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrMFN.count++;
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
//		svoOAgrMFN.eta1.add(eta1);
//		svoOAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-mfn").word.toUpperCase())) &&
//					lexicons.get("o-mfn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-mfn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-mfn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrMFN.eta2.add(eta2);
//		
//// ---------OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrCN.count++;
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
//		svoOAgrCN.eta1.add(eta1);
//		svoOAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-cn").word.toUpperCase())) &&
//					lexicons.get("o-cn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-cn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-cn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrCN.eta2.add(eta2);
//		
//// ---------OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrAI.count++;
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
//		svoOAgrAI.eta1.add(eta1);
//		svoOAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-ai").word.toUpperCase())) &&
//					lexicons.get("o-ai").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-ai").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-ai").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrAI.eta2.add(eta2);
//		
//// ---------OBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrHN.count++;
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
//		svoOAgrHN.eta1.add(eta1);
//		svoOAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-hn").word.toUpperCase())) &&
//					lexicons.get("o-hn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-hn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-hn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrHN.eta2.add(eta2);
//		
//// ---------OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrHAI.count++;
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
//		svoOAgrHAI.eta1.add(eta1);
//		svoOAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-hai").word.toUpperCase())) &&
//					lexicons.get("o-hai").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-hai").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-hai").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrHAI.eta2.add(eta2);
//		
//// ---------OBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		svoOAgrMNM.count++;
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
//		svoOAgrMNM.eta1.add(eta1);
//		svoOAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("o-mnm").word.toUpperCase())) &&
//					lexicons.get("o-mnm").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-mnm").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-mnm").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoOAgrMNM.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrMF.count++;
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
//		svoSOAgrMF.eta1.add(eta1);
//		svoSOAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-mf").word.toUpperCase())) &&
//					lexicons.get("so-mf").get(e.obj.toString()).inflection.get("class").get(0) == second.get("so-mf").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-mf").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrMF.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrMFN.count++;
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
//		svoSOAgrMFN.eta1.add(eta1);
//		svoSOAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-mfn").word.toUpperCase())) &&
//					lexicons.get("so-mfn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("so-mfn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-mfn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrMFN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrCN.count++;
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
//		svoSOAgrCN.eta1.add(eta1);
//		svoSOAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-cn").word.toUpperCase())) &&
//					lexicons.get("so-cn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("so-cn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-cn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrCN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrAI.count++;
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
//		svoSOAgrAI.eta1.add(eta1);
//		svoSOAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-ai").word.toUpperCase())) &&
//					lexicons.get("so-ai").get(e.obj.toString()).inflection.get("class").get(0) == second.get("so-ai").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-ai").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrAI.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrHN.count++;
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
//		svoSOAgrHN.eta1.add(eta1);
//		svoSOAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-hn").word.toUpperCase())) &&
//					lexicons.get("so-hn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("so-hn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-hn").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrHN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrHAI.count++;
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
//		svoSOAgrHAI.eta1.add(eta1);
//		svoSOAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-hai").word.toUpperCase())) &&
//					lexicons.get("so-hai").get(e.obj.toString()).inflection.get("class").get(0) == second.get("so-hai").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-hai").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrHAI.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		svoSOAgrMNM.count++;
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
//		svoSOAgrMNM.eta1.add(eta1);
//		svoSOAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know who is doing what and the noun class of the obj
//			if(e.person.equals(People.valueOf(first.get("so-mnm").word.toUpperCase())) &&
//					lexicons.get("so-mnm").get(e.obj.toString()).inflection.get("class").get(0) == second.get("so-mnm").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-mnm").word.toUpperCase()))) {
//				// if the subj corresponds to the person in the event
//				// and if the verb corresponds to the action
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenSubj = new BigDecimal((double)probs.size());
//		pVerb_givenSubj = pVerb_givenSubj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pSubj.multiply(pVerb_givenSubj));
//		svoSOAgrMNM.eta2.add(eta2);
	}
	
}
