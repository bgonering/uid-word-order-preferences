package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class OVSTest extends Test {
	public Stats ovs = new Stats();
	
	public Stats ovsNomOnly = new Stats();
	public Stats ovsAccOnly = new Stats();
	public Stats ovsNomAcc = new Stats();
	public Stats ovsErgOnly = new Stats();
	public Stats ovsAbsOnly = new Stats();
	public Stats ovsErgAbs = new Stats();
	
	public Stats ovsSAgr123 = new Stats();
//	public Stats ovsSAgrWe = new Stats();
	
	public Stats ovsOAgr123 = new Stats();
//	public Stats ovsOAgrWe = new Stats();
	
	public Stats ovsSOAgr123 = new Stats();
//	public Stats ovsSOAgrWe = new Stats();
	
	public Stats ovsSAgrSP = new Stats();
	public Stats ovsOAgrSP = new Stats();
	public Stats ovsSOAgrSP = new Stats();
	
	public Stats ovsSAgr123_SP = new Stats();
	public Stats ovsSAgr123_SP_Nom = new Stats();
	public Stats ovsSAgr123_SP_Acc = new Stats();
	public Stats ovsSAgr123_SP_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_Erg = new Stats();
	public Stats ovsSAgr123_SP_Abs = new Stats();
	public Stats ovsSAgr123_SP_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP = new Stats();
	public Stats ovsOAgr123_SP_Nom = new Stats();
	public Stats ovsOAgr123_SP_Acc = new Stats();
	public Stats ovsOAgr123_SP_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_Erg = new Stats();
	public Stats ovsOAgr123_SP_Abs = new Stats();
	public Stats ovsOAgr123_SP_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP = new Stats();
	public Stats ovsSOAgr123_SP_Nom = new Stats();
	public Stats ovsSOAgr123_SP_Acc = new Stats();
	public Stats ovsSOAgr123_SP_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_Erg = new Stats();
	public Stats ovsSOAgr123_SP_Abs = new Stats();
	public Stats ovsSOAgr123_SP_ErgAbs = new Stats();
	
	public Stats ovsSAgrMF = new Stats();
	public Stats ovsSAgrMF_Nom = new Stats();
	public Stats ovsSAgrMF_Acc = new Stats();
	public Stats ovsSAgrMF_NomAcc = new Stats();
	public Stats ovsSAgrMF_Erg = new Stats();
	public Stats ovsSAgrMF_Abs = new Stats();
	public Stats ovsSAgrMF_ErgAbs = new Stats();
	
	public Stats ovsSAgrMFN = new Stats();
	public Stats ovsSAgrMFN_Nom = new Stats();
	public Stats ovsSAgrMFN_Acc = new Stats();
	public Stats ovsSAgrMFN_NomAcc = new Stats();
	public Stats ovsSAgrMFN_Erg = new Stats();
	public Stats ovsSAgrMFN_Abs = new Stats();
	public Stats ovsSAgrMFN_ErgAbs = new Stats();
	
	public Stats ovsSAgrCN = new Stats();
	public Stats ovsSAgrCN_Nom = new Stats();
	public Stats ovsSAgrCN_Acc = new Stats();
	public Stats ovsSAgrCN_NomAcc = new Stats();
	public Stats ovsSAgrCN_Erg = new Stats();
	public Stats ovsSAgrCN_Abs = new Stats();
	public Stats ovsSAgrCN_ErgAbs = new Stats();
	
	public Stats ovsSAgrAI = new Stats();
	public Stats ovsSAgrAI_Nom = new Stats();
	public Stats ovsSAgrAI_Acc = new Stats();
	public Stats ovsSAgrAI_NomAcc = new Stats();
	public Stats ovsSAgrAI_Erg = new Stats();
	public Stats ovsSAgrAI_Abs = new Stats();
	public Stats ovsSAgrAI_ErgAbs = new Stats();
	
	public Stats ovsSAgrHN = new Stats();
	public Stats ovsSAgrHN_Nom = new Stats();
	public Stats ovsSAgrHN_Acc = new Stats();
	public Stats ovsSAgrHN_NomAcc = new Stats();
	public Stats ovsSAgrHN_Erg = new Stats();
	public Stats ovsSAgrHN_Abs = new Stats();
	public Stats ovsSAgrHN_ErgAbs = new Stats();
	
	public Stats ovsSAgrHAI = new Stats();
	public Stats ovsSAgrHAI_Nom = new Stats();
	public Stats ovsSAgrHAI_Acc = new Stats();
	public Stats ovsSAgrHAI_NomAcc = new Stats();
	public Stats ovsSAgrHAI_Erg = new Stats();
	public Stats ovsSAgrHAI_Abs = new Stats();
	public Stats ovsSAgrHAI_ErgAbs = new Stats();
	
	public Stats ovsSAgrMNM = new Stats();
	public Stats ovsSAgrMNM_Nom = new Stats();
	public Stats ovsSAgrMNM_Acc = new Stats();
	public Stats ovsSAgrMNM_NomAcc = new Stats();
	public Stats ovsSAgrMNM_Erg = new Stats();
	public Stats ovsSAgrMNM_Abs = new Stats();
	public Stats ovsSAgrMNM_ErgAbs = new Stats();
	
	public Stats ovsOAgrMF = new Stats();
	public Stats ovsOAgrMF_Nom = new Stats();
	public Stats ovsOAgrMF_Acc = new Stats();
	public Stats ovsOAgrMF_NomAcc = new Stats();
	public Stats ovsOAgrMF_Erg = new Stats();
	public Stats ovsOAgrMF_Abs = new Stats();
	public Stats ovsOAgrMF_ErgAbs = new Stats();
	
	public Stats ovsOAgrMFN = new Stats();
	public Stats ovsOAgrMFN_Nom = new Stats();
	public Stats ovsOAgrMFN_Acc = new Stats();
	public Stats ovsOAgrMFN_NomAcc = new Stats();
	public Stats ovsOAgrMFN_Erg = new Stats();
	public Stats ovsOAgrMFN_Abs = new Stats();
	public Stats ovsOAgrMFN_ErgAbs = new Stats();
	
	public Stats ovsOAgrCN = new Stats();
	public Stats ovsOAgrCN_Nom = new Stats();
	public Stats ovsOAgrCN_Acc = new Stats();
	public Stats ovsOAgrCN_NomAcc = new Stats();
	public Stats ovsOAgrCN_Erg = new Stats();
	public Stats ovsOAgrCN_Abs = new Stats();
	public Stats ovsOAgrCN_ErgAbs = new Stats();
	
	public Stats ovsOAgrAI = new Stats();
	public Stats ovsOAgrAI_Nom = new Stats();
	public Stats ovsOAgrAI_Acc = new Stats();
	public Stats ovsOAgrAI_NomAcc = new Stats();
	public Stats ovsOAgrAI_Erg = new Stats();
	public Stats ovsOAgrAI_Abs = new Stats();
	public Stats ovsOAgrAI_ErgAbs = new Stats();
	
	public Stats ovsOAgrHN = new Stats();
	public Stats ovsOAgrHN_Nom = new Stats();
	public Stats ovsOAgrHN_Acc = new Stats();
	public Stats ovsOAgrHN_NomAcc = new Stats();
	public Stats ovsOAgrHN_Erg = new Stats();
	public Stats ovsOAgrHN_Abs = new Stats();
	public Stats ovsOAgrHN_ErgAbs = new Stats();
	
	public Stats ovsOAgrHAI = new Stats();
	public Stats ovsOAgrHAI_Nom = new Stats();
	public Stats ovsOAgrHAI_Acc = new Stats();
	public Stats ovsOAgrHAI_NomAcc = new Stats();
	public Stats ovsOAgrHAI_Erg = new Stats();
	public Stats ovsOAgrHAI_Abs = new Stats();
	public Stats ovsOAgrHAI_ErgAbs = new Stats();
	
	public Stats ovsOAgrMNM = new Stats();
	public Stats ovsOAgrMNM_Nom = new Stats();
	public Stats ovsOAgrMNM_Acc = new Stats();
	public Stats ovsOAgrMNM_NomAcc = new Stats();
	public Stats ovsOAgrMNM_Erg = new Stats();
	public Stats ovsOAgrMNM_Abs = new Stats();
	public Stats ovsOAgrMNM_ErgAbs = new Stats();
	
	public Stats ovsSOAgrMF = new Stats();
	public Stats ovsSOAgrMF_Nom = new Stats();
	public Stats ovsSOAgrMF_Acc = new Stats();
	public Stats ovsSOAgrMF_NomAcc = new Stats();
	public Stats ovsSOAgrMF_Erg = new Stats();
	public Stats ovsSOAgrMF_Abs = new Stats();
	public Stats ovsSOAgrMF_ErgAbs = new Stats();
	
	public Stats ovsSOAgrMFN = new Stats();
	public Stats ovsSOAgrMFN_Nom = new Stats();
	public Stats ovsSOAgrMFN_Acc = new Stats();
	public Stats ovsSOAgrMFN_NomAcc = new Stats();
	public Stats ovsSOAgrMFN_Erg = new Stats();
	public Stats ovsSOAgrMFN_Abs = new Stats();
	public Stats ovsSOAgrMFN_ErgAbs = new Stats();
	
	public Stats ovsSOAgrCN = new Stats();
	public Stats ovsSOAgrCN_Nom = new Stats();
	public Stats ovsSOAgrCN_Acc = new Stats();
	public Stats ovsSOAgrCN_NomAcc = new Stats();
	public Stats ovsSOAgrCN_Erg = new Stats();
	public Stats ovsSOAgrCN_Abs = new Stats();
	public Stats ovsSOAgrCN_ErgAbs = new Stats();
	
	public Stats ovsSOAgrAI = new Stats();
	public Stats ovsSOAgrAI_Nom = new Stats();
	public Stats ovsSOAgrAI_Acc = new Stats();
	public Stats ovsSOAgrAI_NomAcc = new Stats();
	public Stats ovsSOAgrAI_Erg = new Stats();
	public Stats ovsSOAgrAI_Abs = new Stats();
	public Stats ovsSOAgrAI_ErgAbs = new Stats();
	
	public Stats ovsSOAgrHN = new Stats();
	public Stats ovsSOAgrHN_Nom = new Stats();
	public Stats ovsSOAgrHN_Acc = new Stats();
	public Stats ovsSOAgrHN_NomAcc = new Stats();
	public Stats ovsSOAgrHN_Erg = new Stats();
	public Stats ovsSOAgrHN_Abs = new Stats();
	public Stats ovsSOAgrHN_ErgAbs = new Stats();
	
	public Stats ovsSOAgrHAI = new Stats();
	public Stats ovsSOAgrHAI_Nom = new Stats();
	public Stats ovsSOAgrHAI_Acc = new Stats();
	public Stats ovsSOAgrHAI_NomAcc = new Stats();
	public Stats ovsSOAgrHAI_Erg = new Stats();
	public Stats ovsSOAgrHAI_Abs = new Stats();
	public Stats ovsSOAgrHAI_ErgAbs = new Stats();
	
	public Stats ovsSOAgrMNM = new Stats();
	public Stats ovsSOAgrMNM_Nom = new Stats();
	public Stats ovsSOAgrMNM_Acc = new Stats();
	public Stats ovsSOAgrMNM_NomAcc = new Stats();
	public Stats ovsSOAgrMNM_Erg = new Stats();
	public Stats ovsSOAgrMNM_Abs = new Stats();
	public Stats ovsSOAgrMNM_ErgAbs = new Stats();
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Stats ovsSAgr123_SP_MF = new Stats();
	public Stats ovsSAgr123_SP_MF_Nom = new Stats();
	public Stats ovsSAgr123_SP_MF_Acc = new Stats();
	public Stats ovsSAgr123_SP_MF_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_MF_Erg = new Stats();
	public Stats ovsSAgr123_SP_MF_Abs = new Stats();
	public Stats ovsSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_MFN = new Stats();
	public Stats ovsSAgr123_SP_MFN_Nom = new Stats();
	public Stats ovsSAgr123_SP_MFN_Acc = new Stats();
	public Stats ovsSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_MFN_Erg = new Stats();
	public Stats ovsSAgr123_SP_MFN_Abs = new Stats();
	public Stats ovsSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_CN = new Stats();
	public Stats ovsSAgr123_SP_CN_Nom = new Stats();
	public Stats ovsSAgr123_SP_CN_Acc = new Stats();
	public Stats ovsSAgr123_SP_CN_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_CN_Erg = new Stats();
	public Stats ovsSAgr123_SP_CN_Abs = new Stats();
	public Stats ovsSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_AI = new Stats();
	public Stats ovsSAgr123_SP_AI_Nom = new Stats();
	public Stats ovsSAgr123_SP_AI_Acc = new Stats();
	public Stats ovsSAgr123_SP_AI_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_AI_Erg = new Stats();
	public Stats ovsSAgr123_SP_AI_Abs = new Stats();
	public Stats ovsSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_HN = new Stats();
	public Stats ovsSAgr123_SP_HN_Nom = new Stats();
	public Stats ovsSAgr123_SP_HN_Acc = new Stats();
	public Stats ovsSAgr123_SP_HN_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_HN_Erg = new Stats();
	public Stats ovsSAgr123_SP_HN_Abs = new Stats();
	public Stats ovsSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_HAI = new Stats();
	public Stats ovsSAgr123_SP_HAI_Nom = new Stats();
	public Stats ovsSAgr123_SP_HAI_Acc = new Stats();
	public Stats ovsSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_HAI_Erg = new Stats();
	public Stats ovsSAgr123_SP_HAI_Abs = new Stats();
	public Stats ovsSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_MNM = new Stats();
	public Stats ovsSAgr123_SP_MNM_Nom = new Stats();
	public Stats ovsSAgr123_SP_MNM_Acc = new Stats();
	public Stats ovsSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_MNM_Erg = new Stats();
	public Stats ovsSAgr123_SP_MNM_Abs = new Stats();
	public Stats ovsSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_MF = new Stats();
	public Stats ovsOAgr123_SP_MF_Nom = new Stats();
	public Stats ovsOAgr123_SP_MF_Acc = new Stats();
	public Stats ovsOAgr123_SP_MF_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_MF_Erg = new Stats();
	public Stats ovsOAgr123_SP_MF_Abs = new Stats();
	public Stats ovsOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_MFN = new Stats();
	public Stats ovsOAgr123_SP_MFN_Nom = new Stats();
	public Stats ovsOAgr123_SP_MFN_Acc = new Stats();
	public Stats ovsOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_MFN_Erg = new Stats();
	public Stats ovsOAgr123_SP_MFN_Abs = new Stats();
	public Stats ovsOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_CN = new Stats();
	public Stats ovsOAgr123_SP_CN_Nom = new Stats();
	public Stats ovsOAgr123_SP_CN_Acc = new Stats();
	public Stats ovsOAgr123_SP_CN_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_CN_Erg = new Stats();
	public Stats ovsOAgr123_SP_CN_Abs = new Stats();
	public Stats ovsOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_AI = new Stats();
	public Stats ovsOAgr123_SP_AI_Nom = new Stats();
	public Stats ovsOAgr123_SP_AI_Acc = new Stats();
	public Stats ovsOAgr123_SP_AI_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_AI_Erg = new Stats();
	public Stats ovsOAgr123_SP_AI_Abs = new Stats();
	public Stats ovsOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_HN = new Stats();
	public Stats ovsOAgr123_SP_HN_Nom = new Stats();
	public Stats ovsOAgr123_SP_HN_Acc = new Stats();
	public Stats ovsOAgr123_SP_HN_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_HN_Erg = new Stats();
	public Stats ovsOAgr123_SP_HN_Abs = new Stats();
	public Stats ovsOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_HAI = new Stats();
	public Stats ovsOAgr123_SP_HAI_Nom = new Stats();
	public Stats ovsOAgr123_SP_HAI_Acc = new Stats();
	public Stats ovsOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_HAI_Erg = new Stats();
	public Stats ovsOAgr123_SP_HAI_Abs = new Stats();
	public Stats ovsOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_MNM = new Stats();
	public Stats ovsOAgr123_SP_MNM_Nom = new Stats();
	public Stats ovsOAgr123_SP_MNM_Acc = new Stats();
	public Stats ovsOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_MNM_Erg = new Stats();
	public Stats ovsOAgr123_SP_MNM_Abs = new Stats();
	public Stats ovsOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_MF = new Stats();
	public Stats ovsSOAgr123_SP_MF_Nom = new Stats();
	public Stats ovsSOAgr123_SP_MF_Acc = new Stats();
	public Stats ovsSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_MF_Erg = new Stats();
	public Stats ovsSOAgr123_SP_MF_Abs = new Stats();
	public Stats ovsSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_MFN = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Nom = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Acc = new Stats();
	public Stats ovsSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Erg = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Abs = new Stats();
	public Stats ovsSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_CN = new Stats();
	public Stats ovsSOAgr123_SP_CN_Nom = new Stats();
	public Stats ovsSOAgr123_SP_CN_Acc = new Stats();
	public Stats ovsSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_CN_Erg = new Stats();
	public Stats ovsSOAgr123_SP_CN_Abs = new Stats();
	public Stats ovsSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_AI = new Stats();
	public Stats ovsSOAgr123_SP_AI_Nom = new Stats();
	public Stats ovsSOAgr123_SP_AI_Acc = new Stats();
	public Stats ovsSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_AI_Erg = new Stats();
	public Stats ovsSOAgr123_SP_AI_Abs = new Stats();
	public Stats ovsSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_HN = new Stats();
	public Stats ovsSOAgr123_SP_HN_Nom = new Stats();
	public Stats ovsSOAgr123_SP_HN_Acc = new Stats();
	public Stats ovsSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_HN_Erg = new Stats();
	public Stats ovsSOAgr123_SP_HN_Abs = new Stats();
	public Stats ovsSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_HAI = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Nom = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Acc = new Stats();
	public Stats ovsSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Erg = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Abs = new Stats();
	public Stats ovsSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_MNM = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Nom = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Acc = new Stats();
	public Stats ovsSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Erg = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Abs = new Stats();
	public Stats ovsSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public OVSTest() {
		all = new Stats[]{ovs, ovsNomOnly, ovsAccOnly, ovsNomAcc, ovsErgOnly, ovsAbsOnly, ovsErgAbs,
				ovsSAgr123, /*ovsSAgrWe,*/ ovsOAgr123, /*ovsOAgrWe,*/ ovsSOAgr123, /*ovsSOAgrWe,*/
				ovsSAgrSP, ovsOAgrSP, ovsSOAgrSP,
				ovsSAgr123_SP, ovsSAgr123_SP_Nom, ovsSAgr123_SP_Acc, ovsSAgr123_SP_NomAcc, ovsSAgr123_SP_Erg, ovsSAgr123_SP_Abs, ovsSAgr123_SP_ErgAbs,
				ovsOAgr123_SP, ovsOAgr123_SP_Nom, ovsOAgr123_SP_Acc, ovsOAgr123_SP_NomAcc, ovsOAgr123_SP_Erg, ovsOAgr123_SP_Abs, ovsOAgr123_SP_ErgAbs,
				ovsSOAgr123_SP, ovsSOAgr123_SP_Nom, ovsSOAgr123_SP_Acc, ovsSOAgr123_SP_NomAcc, ovsSOAgr123_SP_Erg, ovsSOAgr123_SP_Abs, ovsSOAgr123_SP_ErgAbs,
				ovsSAgrMF, ovsSAgrMF_Nom, ovsSAgrMF_Acc, ovsSAgrMF_NomAcc, ovsSAgrMF_Erg, ovsSAgrMF_Abs, ovsSAgrMF_ErgAbs,
				ovsSAgrMFN, ovsSAgrMFN_Nom, ovsSAgrMFN_Acc, ovsSAgrMFN_NomAcc, ovsSAgrMFN_Erg, ovsSAgrMFN_Abs, ovsSAgrMFN_ErgAbs,
				ovsSAgrCN, ovsSAgrCN_Nom, ovsSAgrCN_Acc, ovsSAgrCN_NomAcc, ovsSAgrCN_Erg, ovsSAgrCN_Abs, ovsSAgrCN_ErgAbs,
				ovsSAgrAI, ovsSAgrAI_Nom, ovsSAgrAI_Acc, ovsSAgrAI_NomAcc, ovsSAgrAI_Erg, ovsSAgrAI_Abs, ovsSAgrAI_ErgAbs,
				ovsSAgrHN, ovsSAgrHN_Nom, ovsSAgrHN_Acc, ovsSAgrHN_NomAcc, ovsSAgrHN_Erg, ovsSAgrHN_Abs, ovsSAgrHN_ErgAbs,
				ovsSAgrHAI, ovsSAgrHAI_Nom, ovsSAgrHAI_Acc, ovsSAgrHAI_NomAcc, ovsSAgrHAI_Erg, ovsSAgrHAI_Abs, ovsSAgrHAI_ErgAbs,
				ovsSAgrMNM, ovsSAgrMNM_Nom, ovsSAgrMNM_Acc, ovsSAgrMNM_NomAcc, ovsSAgrMNM_Erg, ovsSAgrMNM_Abs, ovsSAgrMNM_ErgAbs,
				ovsOAgrMF, ovsOAgrMF_Nom, ovsOAgrMF_Acc, ovsOAgrMF_NomAcc, ovsOAgrMF_Erg, ovsOAgrMF_Abs, ovsOAgrMF_ErgAbs,
				ovsOAgrMFN, ovsOAgrMFN_Nom, ovsOAgrMFN_Acc, ovsOAgrMFN_NomAcc, ovsOAgrMFN_Erg, ovsOAgrMFN_Abs, ovsOAgrMFN_ErgAbs,
				ovsOAgrCN, ovsOAgrCN_Nom, ovsOAgrCN_Acc, ovsOAgrCN_NomAcc, ovsOAgrCN_Erg, ovsOAgrCN_Abs, ovsOAgrCN_ErgAbs,
				ovsOAgrAI, ovsOAgrAI_Nom, ovsOAgrAI_Acc, ovsOAgrAI_NomAcc, ovsOAgrAI_Erg, ovsOAgrAI_Abs, ovsOAgrAI_ErgAbs,
				ovsOAgrHN, ovsOAgrHN_Nom, ovsOAgrHN_Acc, ovsOAgrHN_NomAcc, ovsOAgrHN_Erg, ovsOAgrHN_Abs, ovsOAgrHN_ErgAbs,
				ovsOAgrHAI, ovsOAgrHAI_Nom, ovsOAgrHAI_Acc, ovsOAgrHAI_NomAcc, ovsOAgrHAI_Erg, ovsOAgrHAI_Abs, ovsOAgrHAI_ErgAbs,
				ovsOAgrMNM, ovsOAgrMNM_Nom, ovsOAgrMNM_Acc, ovsOAgrMNM_NomAcc, ovsOAgrMNM_Erg, ovsOAgrMNM_Abs, ovsOAgrMNM_ErgAbs,
				ovsSOAgrMF, ovsSOAgrMF_Nom, ovsSOAgrMF_Acc, ovsSOAgrMF_NomAcc, ovsSOAgrMF_Erg, ovsSOAgrMF_Abs, ovsSOAgrMF_ErgAbs,
				ovsSOAgrMFN, ovsSOAgrMFN_Nom, ovsSOAgrMFN_Acc, ovsSOAgrMFN_NomAcc, ovsSOAgrMFN_Erg, ovsSOAgrMFN_Abs, ovsSOAgrMFN_ErgAbs,
				ovsSOAgrCN, ovsSOAgrCN_Nom, ovsSOAgrCN_Acc, ovsSOAgrCN_NomAcc, ovsSOAgrCN_Erg, ovsSOAgrCN_Abs, ovsSOAgrCN_ErgAbs,
				ovsSOAgrAI, ovsSOAgrAI_Nom, ovsSOAgrAI_Acc, ovsSOAgrAI_NomAcc, ovsSOAgrAI_Erg, ovsSOAgrAI_Abs, ovsSOAgrAI_ErgAbs,
				ovsSOAgrHN, ovsSOAgrHN_Nom, ovsSOAgrHN_Acc, ovsSOAgrHN_NomAcc, ovsSOAgrHN_Erg, ovsSOAgrHN_Abs, ovsSOAgrHN_ErgAbs,
				ovsSOAgrHAI, ovsSOAgrHAI_Nom, ovsSOAgrHAI_Acc, ovsSOAgrHAI_NomAcc, ovsSOAgrHAI_Erg, ovsSOAgrHAI_Abs, ovsSOAgrHAI_ErgAbs,
				ovsSOAgrMNM, ovsSOAgrMNM_Nom, ovsSOAgrMNM_Acc, ovsSOAgrMNM_NomAcc, ovsSOAgrMNM_Erg, ovsSOAgrMNM_Abs, ovsSOAgrMNM_ErgAbs,
				ovsSAgr123_SP_MF, ovsSAgr123_SP_MF_Nom, ovsSAgr123_SP_MF_Acc, ovsSAgr123_SP_MF_NomAcc, ovsSAgr123_SP_MF_Erg, ovsSAgr123_SP_MF_Abs, ovsSAgr123_SP_MF_ErgAbs,
				ovsSAgr123_SP_MFN, ovsSAgr123_SP_MFN_Nom, ovsSAgr123_SP_MFN_Acc, ovsSAgr123_SP_MFN_NomAcc, ovsSAgr123_SP_MFN_Erg, ovsSAgr123_SP_MFN_Abs, ovsSAgr123_SP_MFN_ErgAbs,
				ovsSAgr123_SP_CN, ovsSAgr123_SP_CN_Nom, ovsSAgr123_SP_CN_Acc, ovsSAgr123_SP_CN_NomAcc, ovsSAgr123_SP_CN_Erg, ovsSAgr123_SP_CN_Abs, ovsSAgr123_SP_CN_ErgAbs,
				ovsSAgr123_SP_AI, ovsSAgr123_SP_AI_Nom, ovsSAgr123_SP_AI_Acc, ovsSAgr123_SP_AI_NomAcc, ovsSAgr123_SP_AI_Erg, ovsSAgr123_SP_AI_Abs, ovsSAgr123_SP_AI_ErgAbs,
				ovsSAgr123_SP_HN, ovsSAgr123_SP_HN_Nom, ovsSAgr123_SP_HN_Acc, ovsSAgr123_SP_HN_NomAcc, ovsSAgr123_SP_HN_Erg, ovsSAgr123_SP_HN_Abs, ovsSAgr123_SP_HN_ErgAbs,
				ovsSAgr123_SP_HAI, ovsSAgr123_SP_HAI_Nom, ovsSAgr123_SP_HAI_Acc, ovsSAgr123_SP_HAI_NomAcc, ovsSAgr123_SP_HAI_Erg, ovsSAgr123_SP_HAI_Abs, ovsSAgr123_SP_HAI_ErgAbs,
				ovsSAgr123_SP_MNM, ovsSAgr123_SP_MNM_Nom, ovsSAgr123_SP_MNM_Acc, ovsSAgr123_SP_MNM_NomAcc, ovsSAgr123_SP_MNM_Erg, ovsSAgr123_SP_MNM_Abs, ovsSAgr123_SP_MNM_ErgAbs,
				ovsOAgr123_SP_MF, ovsOAgr123_SP_MF_Nom, ovsOAgr123_SP_MF_Acc, ovsOAgr123_SP_MF_NomAcc, ovsOAgr123_SP_MF_Erg, ovsOAgr123_SP_MF_Abs, ovsOAgr123_SP_MF_ErgAbs,
				ovsOAgr123_SP_MFN, ovsOAgr123_SP_MFN_Nom, ovsOAgr123_SP_MFN_Acc, ovsOAgr123_SP_MFN_NomAcc, ovsOAgr123_SP_MFN_Erg, ovsOAgr123_SP_MFN_Abs, ovsOAgr123_SP_MFN_ErgAbs,
				ovsOAgr123_SP_CN, ovsOAgr123_SP_CN_Nom, ovsOAgr123_SP_CN_Acc, ovsOAgr123_SP_CN_NomAcc, ovsOAgr123_SP_CN_Erg, ovsOAgr123_SP_CN_Abs, ovsOAgr123_SP_CN_ErgAbs,
				ovsOAgr123_SP_AI, ovsOAgr123_SP_AI_Nom, ovsOAgr123_SP_AI_Acc, ovsOAgr123_SP_AI_NomAcc, ovsOAgr123_SP_AI_Erg, ovsOAgr123_SP_AI_Abs, ovsOAgr123_SP_AI_ErgAbs,
				ovsOAgr123_SP_HN, ovsOAgr123_SP_HN_Nom, ovsOAgr123_SP_HN_Acc, ovsOAgr123_SP_HN_NomAcc, ovsOAgr123_SP_HN_Erg, ovsOAgr123_SP_HN_Abs, ovsOAgr123_SP_HN_ErgAbs,
				ovsOAgr123_SP_HAI, ovsOAgr123_SP_HAI_Nom, ovsOAgr123_SP_HAI_Acc, ovsOAgr123_SP_HAI_NomAcc, ovsOAgr123_SP_HAI_Erg, ovsOAgr123_SP_HAI_Abs, ovsOAgr123_SP_HAI_ErgAbs,
				ovsOAgr123_SP_MNM, ovsOAgr123_SP_MNM_Nom, ovsOAgr123_SP_MNM_Acc, ovsOAgr123_SP_MNM_NomAcc, ovsOAgr123_SP_MNM_Erg, ovsOAgr123_SP_MNM_Abs, ovsOAgr123_SP_MNM_ErgAbs,
				ovsSOAgr123_SP_MF, ovsSOAgr123_SP_MF_Nom, ovsSOAgr123_SP_MF_Acc, ovsSOAgr123_SP_MF_NomAcc, ovsSOAgr123_SP_MF_Erg, ovsSOAgr123_SP_MF_Abs, ovsSOAgr123_SP_MF_ErgAbs,
				ovsSOAgr123_SP_MFN, ovsSOAgr123_SP_MFN_Nom, ovsSOAgr123_SP_MFN_Acc, ovsSOAgr123_SP_MFN_NomAcc, ovsSOAgr123_SP_MFN_Erg, ovsSOAgr123_SP_MFN_Abs, ovsSOAgr123_SP_MFN_ErgAbs,
				ovsSOAgr123_SP_CN, ovsSOAgr123_SP_CN_Nom, ovsSOAgr123_SP_CN_Acc, ovsSOAgr123_SP_CN_NomAcc, ovsSOAgr123_SP_CN_Erg, ovsSOAgr123_SP_CN_Abs, ovsSOAgr123_SP_CN_ErgAbs,
				ovsSOAgr123_SP_AI, ovsSOAgr123_SP_AI_Nom, ovsSOAgr123_SP_AI_Acc, ovsSOAgr123_SP_AI_NomAcc, ovsSOAgr123_SP_AI_Erg, ovsSOAgr123_SP_AI_Abs, ovsSOAgr123_SP_AI_ErgAbs,
				ovsSOAgr123_SP_HN, ovsSOAgr123_SP_HN_Nom, ovsSOAgr123_SP_HN_Acc, ovsSOAgr123_SP_HN_NomAcc, ovsSOAgr123_SP_HN_Erg, ovsSOAgr123_SP_HN_Abs, ovsSOAgr123_SP_HN_ErgAbs,
				ovsSOAgr123_SP_HAI, ovsSOAgr123_SP_HAI_Nom, ovsSOAgr123_SP_HAI_Acc, ovsSOAgr123_SP_HAI_NomAcc, ovsSOAgr123_SP_HAI_Erg, ovsSOAgr123_SP_HAI_Abs, ovsSOAgr123_SP_HAI_ErgAbs,
				ovsSOAgr123_SP_MNM, ovsSOAgr123_SP_MNM_Nom, ovsSOAgr123_SP_MNM_Acc, ovsSOAgr123_SP_MNM_NomAcc, ovsSOAgr123_SP_MNM_Erg, ovsSOAgr123_SP_MNM_Abs, ovsSOAgr123_SP_MNM_ErgAbs};
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

			BigDecimal pObj = new BigDecimal((double)probs.size());
			pObj = pObj.divide(new BigDecimal(40.0D), MathContext.DECIMAL128);
			eta1 = calcEntropy(probs, pObj);

			all[i].eta1.add(eta1);
			all[i].eventProbs.add(ev.probability);

			probs = new ArrayList<>();
			double factor = 0.0;

			for(Event e:events) {
				if(e.obj.equals(Objects.valueOf(first.get(conditionCode[i]).word.toUpperCase())) &&
						e.probability > 0.0) {
					switch(i) {
						case 7: case 9:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.person.toString()).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0)) {
								factor++;
								if (e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// how many of those events could involve both the obj and verb?
									probs.add(e.probability);
								}
							}
							break;
						case 10: case 12:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.person.toString()).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0)) {
								factor++;
								if (e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// how many of those events could involve both the obj and verb?
									probs.add(e.probability);
								}
							}
							break;
						case 13: case 14: case 15: case 16: case 17: case 18: case 19:
						case 27: case 28: case 29: case 30: case 31: case 32: case 33:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.person.toString()).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.person.toString()).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(1)) {
								factor++;
								if (e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// how many of those events could involve both the obj and verb?
									probs.add(e.probability);
								}
							}
							break;
						case 34: case 35: case 36: case 37: case 38: case 39: case 40:
						case 41: case 42: case 43: case 44: case 45: case 46: case 47:
						case 48: case 49: case 50: case 51: case 52:
						case 60: case 61: case 62: case 63: case 64: case 65: case 66:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.person.toString()).inflection.get("class").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0)) {
								factor++;
								if (e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
									// how many of those events could involve both the obj and verb?
									probs.add(e.probability);
								}
							}
							break;					
						default:
							factor++;
							if (e.action.equals(Actions.valueOf(second.get(conditionCode[i]).word.toUpperCase()))) {
								// how many of those events could involve both the obj and verb?
								probs.add(e.probability);
							}
					}
				}
			}

			BigDecimal pVerb_givenObj = new BigDecimal((double)probs.size());
			pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);

			eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
			all[i].eta2.add(eta2);
		}
//// ---------CASELESS---------------------------------------------------------------------------------------------------//
//		ovs.count++;
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
//		ovs.eta1.add(eta1);
//		ovs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		double factor = 0.0;
//		
//		for(Event e:events) {
//			// reduce the event space to just those events involving the obj
//			if(e.obj.equals(Objects.valueOf(first.get("caseless").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if (e.action.equals(Actions.valueOf(second.get("caseless").word.toUpperCase()))) {
//					// how many of those events could involve both the obj and verb?
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		// divide the number of events that could involve both the obj and verb
//		// by the total number of events that could occur given the obj
//		BigDecimal pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovs.eta2.add(eta2);
//		
//// ---------NOM ONLY (eg. Oromo, acc is "bare form")-------------------------------------------------------------------//
//		ovsNomOnly.count++;
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
//		ovsNomOnly.eta1.add(eta1);
//		ovsNomOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("nom").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsNomOnly.eta2.add(eta2);
//		
//// ---------ACC ONLY---------------------------------------------------------------------------------------------------//
//		ovsAccOnly.count++;
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
//		ovsAccOnly.eta1.add(eta1);
//		ovsAccOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("acc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsAccOnly.eta2.add(eta2);
//		
//// ---------NOM + ACC--------------------------------------------------------------------------------------------------//
//		ovsNomAcc.count++;
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
//		ovsNomAcc.eta1.add(eta1);
//		ovsNomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("nomacc").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsNomAcc.eta2.add(eta2);
//							
//// ---------ERG ONLY---------------------------------------------------------------------------------------------------//
//		ovsErgOnly.count++;
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
//		ovsErgOnly.eta1.add(eta1);
//		ovsErgOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("erg").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsErgOnly.eta2.add(eta2);
//							
//// ---------ABS ONLY---------------------------------------------------------------------------------------------------//
//		ovsAbsOnly.count++;
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
//		ovsAbsOnly.eta1.add(eta1);
//		ovsAbsOnly.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("abs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsAbsOnly.eta2.add(eta2);
//							
//// ---------ERG + ABS-------------------------------------------------------------------------------------------------//
//		ovsErgAbs.count++;
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
//		ovsErgAbs.eta1.add(eta1);
//		ovsErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("ergabs").word.toUpperCase())) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgr123.count++;
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
//		ovsSAgr123.eta1.add(eta1);
//		ovsSAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-123").word.toUpperCase())) &&
//					lexicons.get("s-123").get(e.person.toString()).inflection.get("person").get(0) == second.get("s-123").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgr123.eta2.add(eta2);
//		
//// ---------SUBJ:inclusive/exclusive we INFL-------------------------------------------------------------------------------------------------//
//// NEEDS TO INCLUDE NUMBER DISTINCTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
////		ovsSAgrWe.count++;
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
////		ovsSAgrWe.eta1.add(eta1);
////		ovsSAgrWe.eventProbs.add(ev.probability);
////		
////		probs = new ArrayList<>();
////		factor = 0.0;
////		
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("s-we").word.toUpperCase())) &&
////					lexicons.get("s-we").get(e.person.toString()).inflection.get("person").get(0) == second.get("s-we").inflection.get("subj").get(0) &&
////					e.probability > 0.0) {
////				factor++;
////				if(e.action.equals(Actions.valueOf(second.get("s-we").word.toUpperCase()))) {
////					probs.add(e.probability);
////				}
////			}
////		}
////
////		pVerb_givenObj = new BigDecimal((double)probs.size());
////		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
////		
////		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
////		ovsSAgrWe.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgr123.count++;
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
//		ovsOAgr123.eta1.add(eta1);
//		ovsOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-123").word.toUpperCase())) &&
//					lexicons.get("o-123").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgr123.eta2.add(eta2);
//		
//// ---------OBJ:inclusive/exclusive we INFL-------------------------------------------------------------------------------------------------//
//// NEEDS TO INCLUDE NUMBER DISTINCTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
////		ovsOAgrWe.count++;
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
////		ovsOAgrWe.eta1.add(eta1);
////		ovsOAgrWe.eventProbs.add(ev.probability);
////		
////		probs = new ArrayList<>();
////		factor = 0.0;
////		
////		for(Event e:events) {
////			if(e.obj.equals(Objects.valueOf(first.get("o-we").word.toUpperCase())) &&
////					lexicons.get("o-we").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-we").inflection.get("obj").get(0) &&
////					e.probability > 0.0) {
////				factor++;
////				if(e.action.equals(Actions.valueOf(second.get("o-we").word.toUpperCase()))) {
////					probs.add(e.probability);
////				}
////			}
////		}
////
////		pVerb_givenObj = new BigDecimal((double)probs.size());
////		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
////		
////		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
////		ovsOAgrWe.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgr123.count++;
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
//		ovsSOAgr123.eta1.add(eta1);
//		ovsSOAgr123.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-123").word.toUpperCase())) &&
//					lexicons.get("so-123").get(e.person.toString()).inflection.get("person").get(0) == second.get("so-123").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgr123.eta2.add(eta2);
//		
//// ---------SUBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrSP.count++;
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
//		ovsSAgrSP.eta1.add(eta1);
//		ovsSAgrSP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-sp").word.toUpperCase())) &&
//					lexicons.get("s-sp").get(e.person.toString()).inflection.get("number").get(0) == second.get("s-sp").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrSP.eta2.add(eta2);
//		
//// ---------OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrSP.count++;
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
//		ovsOAgrSP.eta1.add(eta1);
//		ovsOAgrSP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-sp").word.toUpperCase())) &&
//					lexicons.get("o-sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-sp").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrSP.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrSP.count++;
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
//		ovsSOAgrSP.eta1.add(eta1);
//		ovsSOAgrSP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-sp").word.toUpperCase())) &&
//					lexicons.get("so-sp").get(e.person.toString()).inflection.get("number").get(0) == second.get("so-sp").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrSP.eta2.add(eta2);
//
//// ---------SUBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgr123_SP.count++;
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
//		ovsSAgr123_SP.eta1.add(eta1);
//		ovsSAgr123_SP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-123+sp").word.toUpperCase())) &&
//					lexicons.get("s-123+sp").get(e.person.toString()).inflection.get("person").get(0) == second.get("s-123+sp").inflection.get("subj").get(0) &&
//					lexicons.get("s-123+sp").get(e.person.toString()).inflection.get("number").get(0) == second.get("s-123+sp").inflection.get("subj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgr123_SP.eta2.add(eta2);
//		
//// ---------OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgr123_SP.count++;
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
//		ovsOAgr123_SP.eta1.add(eta1);
//		ovsOAgr123_SP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-123+sp").word.toUpperCase())) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("person").get(0) == second.get("o-123+sp").inflection.get("obj").get(0) &&
//					lexicons.get("o-123+sp").get(e.obj.toString()).inflection.get("number").get(0) == second.get("o-123+sp").inflection.get("obj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgr123_SP.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:1st/2nd/3rd per + singular/plural_two INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgr123_SP.count++;
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
//		ovsSOAgr123_SP.eta1.add(eta1);
//		ovsSOAgr123_SP.eventProbs.add(ev.probability);
//
//		probs = new ArrayList<>();
//		factor = 0.0;
//
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-123+sp").word.toUpperCase())) &&
//					lexicons.get("so-123+sp").get(e.person.toString()).inflection.get("person").get(0) == second.get("so-123+sp").inflection.get("subj").get(0) &&
//					lexicons.get("so-123+sp").get(e.person.toString()).inflection.get("number").get(0) == second.get("so-123+sp").inflection.get("subj").get(1) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-123+sp").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgr123_SP.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrMF.count++;
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
//		ovsSAgrMF.eta1.add(eta1);
//		ovsSAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf").word.toUpperCase())) &&
//					lexicons.get("s-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mf").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMF.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM ONLY-------------------------------------------------------------------//
//		ovsSAgrMF_Nom.count++;
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
//		ovsSAgrMF_Nom.eta1.add(eta1);
//		ovsSAgrMF_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+nom").word.toUpperCase())) &&
//					lexicons.get("s-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mf+nom").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMF_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		ovsSAgrMF_Acc.count++;
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
//		ovsSAgrMF_Acc.eta1.add(eta1);
//		ovsSAgrMF_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+acc").word.toUpperCase())) &&
//					lexicons.get("s-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mf+acc").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMF_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		ovsSAgrMF_NomAcc.count++;
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
//		ovsSAgrMF_NomAcc.eta1.add(eta1);
//		ovsSAgrMF_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+nomacc").word.toUpperCase())) &&
//					lexicons.get("s-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mf+nomacc").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMF_NomAcc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		ovsSAgrMF_Erg.count++;
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
//		ovsSAgrMF_Erg.eta1.add(eta1);
//		ovsSAgrMF_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+erg").word.toUpperCase())) &&
//					lexicons.get("s-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mf+erg").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMF_Erg.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		ovsSAgrMF_Abs.count++;
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
//		ovsSAgrMF_Abs.eta1.add(eta1);
//		ovsSAgrMF_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+abs").word.toUpperCase())) &&
//					lexicons.get("s-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mf+abs").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMF_Abs.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		ovsSAgrMF_ErgAbs.count++;
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
//		ovsSAgrMF_ErgAbs.eta1.add(eta1);
//		ovsSAgrMF_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mf+ergabs").word.toUpperCase())) &&
//					lexicons.get("s-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mf+ergabs").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mf+ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMF_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrMFN.count++;
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
//		ovsSAgrMFN.eta1.add(eta1);
//		ovsSAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn").word.toUpperCase())) &&
//					lexicons.get("s-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mfn").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMFN.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM ONLY-------------------------------------------------------------------//
//		ovsSAgrMFN_Nom.count++;
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
//		ovsSAgrMFN_Nom.eta1.add(eta1);
//		ovsSAgrMFN_Nom.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+nom").word.toUpperCase())) &&
//					lexicons.get("s-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mfn+nom").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+nom").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMFN_Nom.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + ACC ONLY---------------------------------------------------------------------------------------------------//
//		ovsSAgrMFN_Acc.count++;
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
//		ovsSAgrMFN_Acc.eta1.add(eta1);
//		ovsSAgrMFN_Acc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+acc").word.toUpperCase())) &&
//					lexicons.get("s-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mfn+acc").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+acc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMFN_Acc.eta2.add(eta2);
//		
//// ---------SUBJ:MASC/FEM/NEUT INFL + NOM + ACC--------------------------------------------------------------------------------------------------//
//		ovsSAgrMFN_NomAcc.count++;
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
//		ovsSAgrMFN_NomAcc.eta1.add(eta1);
//		ovsSAgrMFN_NomAcc.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+nomacc").word.toUpperCase())) &&
//					lexicons.get("s-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mfn+nomacc").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+nomacc").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMFN_NomAcc.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG ONLY---------------------------------------------------------------------------------------------------//
//		ovsSAgrMFN_Erg.count++;
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
//		ovsSAgrMFN_Erg.eta1.add(eta1);
//		ovsSAgrMFN_Erg.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+erg").word.toUpperCase())) &&
//					lexicons.get("s-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mfn+erg").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+erg").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMFN_Erg.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM/NEUT INFL + ABS ONLY---------------------------------------------------------------------------------------------------//
//		ovsSAgrMFN_Abs.count++;
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
//		ovsSAgrMFN_Abs.eta1.add(eta1);
//		ovsSAgrMFN_Abs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+abs").word.toUpperCase())) &&
//					lexicons.get("s-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mfn+abs").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+abs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMFN_Abs.eta2.add(eta2);
//							
//// ---------SUBJ:MASC/FEM/NEUT INFL + ERG + ABS-------------------------------------------------------------------------------------------------//
//		ovsSAgrMFN_ErgAbs.count++;
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
//		ovsSAgrMFN_ErgAbs.eta1.add(eta1);
//		ovsSAgrMFN_ErgAbs.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(first.get("s-mfn+ergabs").word.toUpperCase())) &&
//					lexicons.get("s-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mfn+ergabs").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mfn+ergabs").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//		
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMFN_ErgAbs.eta2.add(eta2);
//		
//// ---------SUBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrCN.count++;
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
//		ovsSAgrCN.eta1.add(eta1);
//		ovsSAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-cn").word.toUpperCase())) &&
//					lexicons.get("s-cn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-cn").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrCN.eta2.add(eta2);
//		
//// ---------SUBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrAI.count++;
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
//		ovsSAgrAI.eta1.add(eta1);
//		ovsSAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-ai").word.toUpperCase())) &&
//					lexicons.get("s-ai").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-ai").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrAI.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrHN.count++;
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
//		ovsSAgrHN.eta1.add(eta1);
//		ovsSAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-hn").word.toUpperCase())) &&
//					lexicons.get("s-hn").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-hn").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrHN.eta2.add(eta2);
//		
//// ---------SUBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrHAI.count++;
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
//		ovsSAgrHAI.eta1.add(eta1);
//		ovsSAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-hai").word.toUpperCase())) &&
//					lexicons.get("s-hai").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-hai").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrHAI.eta2.add(eta2);
//		
//// ---------SUBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		ovsSAgrMNM.count++;
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
//		ovsSAgrMNM.eta1.add(eta1);
//		ovsSAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("s-mnm").word.toUpperCase())) &&
//					lexicons.get("s-mnm").get(e.person.toString()).inflection.get("class").get(0) == second.get("s-mnm").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("s-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSAgrMNM.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrMF.count++;
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
//		ovsOAgrMF.eta1.add(eta1);
//		ovsOAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mf").word.toUpperCase())) &&
//					lexicons.get("o-mf").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-mf").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrMF.eta2.add(eta2);
//		
//// ---------OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrMFN.count++;
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
//		ovsOAgrMFN.eta1.add(eta1);
//		ovsOAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mfn").word.toUpperCase())) &&
//					lexicons.get("o-mfn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-mfn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrMFN.eta2.add(eta2);
//		
//// ---------OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrCN.count++;
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
//		ovsOAgrCN.eta1.add(eta1);
//		ovsOAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-cn").word.toUpperCase())) &&
//					lexicons.get("o-cn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-cn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrCN.eta2.add(eta2);
//		
//// ---------OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrAI.count++;
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
//		ovsOAgrAI.eta1.add(eta1);
//		ovsOAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-ai").word.toUpperCase())) &&
//					lexicons.get("o-ai").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-ai").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrAI.eta2.add(eta2);
//		
//// ---------OBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrHN.count++;
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
//		ovsOAgrHN.eta1.add(eta1);
//		ovsOAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-hn").word.toUpperCase())) &&
//					lexicons.get("o-hn").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-hn").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrHN.eta2.add(eta2);
//		
//// ---------OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrHAI.count++;
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
//		ovsOAgrHAI.eta1.add(eta1);
//		ovsOAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-hai").word.toUpperCase())) &&
//					lexicons.get("o-hai").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-hai").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrHAI.eta2.add(eta2);
//		
//// ---------OBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		ovsOAgrMNM.count++;
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
//		ovsOAgrMNM.eta1.add(eta1);
//		ovsOAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("o-mnm").word.toUpperCase())) &&
//					lexicons.get("o-mnm").get(e.obj.toString()).inflection.get("class").get(0) == second.get("o-mnm").inflection.get("obj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("o-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsOAgrMNM.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MASC/FEM INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrMF.count++;
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
//		ovsSOAgrMF.eta1.add(eta1);
//		ovsSOAgrMF.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mf").word.toUpperCase())) &&
//					lexicons.get("so-mf").get(e.person.toString()).inflection.get("class").get(0) == second.get("so-mf").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-mf").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrMF.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:MASC/FEM/NEUT INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrMFN.count++;
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
//		ovsSOAgrMFN.eta1.add(eta1);
//		ovsSOAgrMFN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mfn").word.toUpperCase())) &&
//					lexicons.get("so-mfn").get(e.person.toString()).inflection.get("class").get(0) == second.get("so-mfn").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-mfn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrMFN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:COMMON/NEUT INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrCN.count++;
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
//		ovsSOAgrCN.eta1.add(eta1);
//		ovsSOAgrCN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-cn").word.toUpperCase())) &&
//					lexicons.get("so-cn").get(e.person.toString()).inflection.get("class").get(0) == second.get("so-cn").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-cn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrCN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:AN/INAN INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrAI.count++;
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
//		ovsSOAgrAI.eta1.add(eta1);
//		ovsSOAgrAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-ai").word.toUpperCase())) &&
//					lexicons.get("so-ai").get(e.person.toString()).inflection.get("class").get(0) == second.get("so-ai").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-ai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrAI.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:HUM/NONHUM INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrHN.count++;
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
//		ovsSOAgrHN.eta1.add(eta1);
//		ovsSOAgrHN.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-hn").word.toUpperCase())) &&
//					lexicons.get("so-hn").get(e.person.toString()).inflection.get("class").get(0) == second.get("so-hn").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-hn").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrHN.eta2.add(eta2);
//		
//// ---------SUBJ&OBJ:HUM/ANI/INAN INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrHAI.count++;
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
//		ovsSOAgrHAI.eta1.add(eta1);
//		ovsSOAgrHAI.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-hai").word.toUpperCase())) &&
//					lexicons.get("so-hai").get(e.person.toString()).inflection.get("class").get(0) == second.get("so-hai").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-hai").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrHAI.eta2.add(eta2);
//		
//// ---------SUBJ:MALE/NONMALE INFL-------------------------------------------------------------------------------------------------//
//		ovsSOAgrMNM.count++;
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
//		ovsSOAgrMNM.eta1.add(eta1);
//		ovsSOAgrMNM.eventProbs.add(ev.probability);
//		
//		probs = new ArrayList<>();
//		factor = 0.0;
//		
//		// loop through events, get probs of only the events where the object matches the first word in the utt
//		// and the person in the EVENT has the same gender as the verb infl
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(first.get("so-mnm").word.toUpperCase())) &&
//					lexicons.get("so-mnm").get(e.person.toString()).inflection.get("class").get(0) == second.get("so-mnm").inflection.get("subj").get(0) &&
//					e.probability > 0.0) {
//				factor++;
//				if(e.action.equals(Actions.valueOf(second.get("so-mnm").word.toUpperCase()))) {
//					probs.add(e.probability);
//				}
//			}
//		}
//
//		pVerb_givenObj = new BigDecimal((double)probs.size());
//		pVerb_givenObj = pVerb_givenObj.divide(new BigDecimal(factor), MathContext.DECIMAL128);
//		
//		eta2 = calcEntropy(probs, pObj.multiply(pVerb_givenObj));
//		ovsSOAgrMNM.eta2.add(eta2);
	}
}
