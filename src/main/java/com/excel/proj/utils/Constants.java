package com.excel.proj.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {

	// INIZIO
	// inseriamo nei valori delle constanti il simbolo - per evitare che k8 li
	// filtri essendo valori nell'header
	public final static String LOG_ID = "log-id";
	public final static String TRACE_ID = "TRACE_ID";
	public final static String VERSION = "version";
	public final static String OS = "operation-system";
	public final static String LASTNAME = "last-name";
	public final static String FIRSTNAME = "first-name";
	public final static String STEP = "step";
	public final static String CACHE_KEY = "cache-key";
	public final static String NOT_KEY = "not-key";
	public final static String ENVIRONMENT = "environment";
	public final static String ROLES = "x-roles";

	public static final String X_USERNAME = "x-username";
	public static final String X_USERNAME_ACT_US = "x-username-act-us";
	public static final String X_NOME_FILE = "x-nome-file";
	public static final String X_PATH_MENU = "x-path-menu";
	public static final String X_TOKEN = "x-token";
	public static final String Y_HOSTNAME = "y-hostname";
	public static final String Y_TRANS_ID = "y-trans-id";
	// FINE
	public static final String DATE_FORMAT = "dd/MM/yyyy";
	public final static String OK = "OK";
	public final static String KO = "KO";

	public final static String TARGET_PGU = "4";
	public final static String TARGET_DBU = "5";

	public static final String FLAG_Y = "Y";
	public static final String FLAG_N = "N";
	public static final String FLAG_SI = "SI";

	public static final String LOG_SEPARATOR = "|";
	public static final String DATA_ddSMMSyyyy = "dd/MM/yyyy";

	// tipologie richieste
	public static final int TR_RICHIESTE_DA_APPROVARE = 1;
	public static final int TR_RICHIESTE_PERSONALI = 2;
	public static final int TR_RICHIESTE_STORICO = 3;
	public static final int TR_RICHIESTE_STORICO_PARENT = 4;
	public static final int TR_RICHIESTE_STORICO_UF = 5;
	public static final int TR_RICHIESTE_STATO_RICHIESTA = 6;
	public static final int TR_RICHIESTE_PENDING_ERAS = 7;
	public static final int TR_RICHIESTE_PENDING_DA_ERAS = 8;
	public static final int TR_RICHIESTE_DA_APPROVARE_GGUEXT = 9;
	public static final int TR_RICHIESTE_STATO_RICHIESTA_GGUEXT = 10;
	public static final int TR_RICHIESTE_STORICO_RICHIESTA_GGUEXT = 11;
	public static final int TR_RICHIESTE_DETTAGLIO_RICHIESTA_GGUEXT = 12;

	//chiavi errori richieste
	public static final String KEY_MSG_DISABLED_APPROVE = "error.home.responsabile.dettaglio.richiesta.msg.blocco.schemi.profili";
	// tipologie account
	public static final int TA_ACCOUNT_DA_APPROVARE = 1;
	public static final int TA_ACCOUNT_PERSONALI = 2;
	public static final int TA_ACCOUNT_PERSONALI_PWD = 3;
	public static final int TA_ACCOUNT_PERSONALI_HOME_UF = 4;
	public static final int TA_ACCOUNT_ESISTE_ACCOUNT = 5;
	public static final int TA_ACCOUNT_DEALER = 6;
	public static final int TIPOLOGIA_ACCOUNT_LE_MIE_VPN = 5;

	/**
	 * CA_PWD_UNICA_CENTRALIZZATA = 2 --> CAT A: Reset Password - Cambio Password
	 * rimanda a link esterno verso PCS CA_PWD_UNICA_PROPAGATA = 1 --> CAT B: Reset
	 * Password [tutti gli account stessa password] - Cambio Password [tutti gli
	 * account stessa password] CA_PWD_SINGOLA_PROPAGATA = 3 --> CAT C: Reset
	 * Password [singolo password per account] - Cambio Password [singolo password
	 * per account] CA_PWD_SINGOLA_DA_RICHIEDERE = 4 --> CAT D: Reset Password
	 * [singolo password per account] CA_PWD_NON_DISPONIBILE = 5 --> CAT E: Nessuna
	 * operazione di reset/cambio password permessa
	 * CA_PWD_RIATTIVAZIONE_ACCESSI_ERRATI = 8 --> CAT E: Nessuna operazione di
	 * reset/cambio password permessa
	 * 
	 */
	public static final int CA_PWD_UNICA_PROPAGATA = 1;
	public static final int CA_PWD_UNICA_CENTRALIZZATA = 2;
	public static final int CA_PWD_SINGOLA_PROPAGATA = 3;
	public static final int CA_PWD_SINGOLA_DA_RICHIEDERE = 4;
	public static final int CA_PWD_NON_DISPONIBILE = 5;
	public static final int CA_PWD_RIATTIVAZIONE_ACCESSI_ERRATI = 8;

	public static final String UF = "UF";
	public static final String RG = "RG";
	public static final String GGUEXT = "GGUEXT";
	public static final String RPC = "RPC";
	public static final String RPA = "RPA";

	// elaborazione massiva richiesta
	public static final int RETURN_OK_CODE = 0;
	public static final int RETURN_WARNING_CODE = 1;
	public static final int RETURN_KO_CODE = 2;

	public static final String AMBITO_DBU_ANAGRAFICA = "DATI ANAGRAFICI";
	public static final String AMBITO_ANAGRAFICA = "ANAGRAFICA";

	public static final String TIPOLOGIA_SISTEMA_0 = "Interfaccia Applicativa";
	public static final String TIPOLOGIA_SISTEMA_1 = "Database";
	public static final String TIPOLOGIA_SISTEMA_2 = "Sistema Operativo";
	public static final String TIPOLOGIA_SISTEMA_3 = "Dati Anagrafici";

	public static final String OPERAZIONE_CANCELLAZIONE_ACCOUNT = "Cancellazione";
	public static final String OPERAZIONE_MODIFICA_PARAMETRI = "MODIFICA_PARAMETRI";
	public static final String OPERAZIONE_MODIFICA_GRUPPI = "MODIFICA_GRUPPI";
	public static final String OPERAZIONE_MODIFICA_TIPOLOGIA_LOGIN = "Modifica Tipologia Login";
	public static final String OPERAZIONE_VARIAZIONE_ANAGRAFICA = "VARIAZIONE_ANAGRAFICA";
	public static final String OPERAZIONE_VARIAZIONE_ANAGRAFICA_ACCOUNT = "VARIAZIONE_ANAGRAFICA_ACCOUNT";
	public static final String OPERAZIONE_VARIAZIONE_ANAGRAFICA_CAMBIO_INTESTATARIO = "VARIAZIONE_ANAGRAFICA_CAMBIO_INTESTATARIO";
	public static final String OPERAZIONE_VARIAZIONE_ANAGRAFICA_MONITORAGGIO = "VARIAZIONE_ANAGRAFICA_MONITORAGGIO";
	public static final String OPERAZIONE_PARAMETRI_VISUALIZZAZIONE = "VISUALIZZAZIONE";
	public static final String OPERAZIONE_PROFILI_CREAZIONE = "CREAZIONE";
	public static final String OPERAZIONE_PROFILI_VISUALIZZAZIONE = "VISUALIZZA";
	public static final String OPERAZIONE_PROFILI_COMPATIBILI = "OP_PROFILI_COMPATIBILI";
	public static final String OPERAZIONE_PROFILI_SELEZIONATI = "PROFILI_SELEZ";
	public static final String OPERAZIONE_RINNOVO = "RINNOVO";
	public static final String OPERAZIONE_RIATTIVAZIONE = "RIATTIVAZIONE";
	public static final String OPERAZIONE_RIATTIVAZIONE_SCADUTO = "RIATTIVAZIONE_SCADUTO";
	public static final String OPERAZIONE_MODIFICA_GRUPPI_DBU = "MODIFICA_GRUPPI";
	public static final String OPERAZIONE_TIPO_RINNOVO_ACC_SOSPESO = "SOSPESO";

	public static final String TRUE_STRING = "TRUE";

	public static final Integer VALUE_AMBITO_IA = 0;
	public static final Integer VALUE_AMBITO_DB = 1;
	public static final Integer VALUE_AMBITO_SISTEMAOPERATIVO = 2;
	public static final Integer VALUE_AMBITO_ANAGRAFICA = 3;
	public static final Integer VALUE_AMBITO_VPN = -1;

	public static final int TIPOLOGIA_CHIAMATA_MAST = 1;
	public static final int TIPOLOGIA_CHIAMATA_SERVER_IAM = 0;

	public static final String AMBITO_DBU_IA = "INTERFACCIA_APPLICATIVA";
	public static final String AMBITO_DBU_SO = "SISTEMA_OPERATIVO";
	public static final String AMBITO_DBU_DB = "DATABASE";

	public static final String PREFISSO_APPL_SO = "SO_";
	public static final String PREFISSO_APPL_DB = "DB_";

	// nomi file per Download
	public static final String REQUEST_LIST_UF_FILE_NAME = "RichiestePersonaliUf";
	public static final String REQUEST_LIST_HISTORY_UF_FILE_NAME = "StoricoRichiesteUf";
	public static final String REQUEST_LIST_STATUS_UF_FILE_NAME = "StatoRichiesteUf";
	public static final String APPLICATIONS_LIST_FILE_NAME = "ElencoApplicazioni";
	public static final String SERVER_IAM_LIST_FILE_NAME = "ElencoSistemaServer";
	public static final String SERVER_MAST_LIST_FILE_NAME = "ElencoSistemaServerMast";
	public static final String ACCOUNT_IA_FILE_NAME = "LoginInterfacciaApplicativa";
	public static final String ACCOUNT_DB_FILE_NAME = "LoginDatabase";
	public static final String ACCOUNT_SO_FILE_NAME = "LoginSistemaOperativo";
	public static final String ACCOUNT_VPN_FILE_NAME = "LoginVpn";
	public static final String ELENCO_SERVER_DBU_NR = "ElencoServer";
	public static final String GRUPPI_SO_FILE_NAME = "ElencoGruppi";
	public static final String RUBRICA = "Rubrica";
	public static final String SIDE_OPERATION_LIST_FILE_NAME = "ElencoOperazioniSecondarie";
	public static final String PROFILE_LIST_FILE_NAME = "ElencoProfiliRisorse";
	public static final String DELEGABLES_LIST_FILE_NAME = "Delegabili";
	public static final String DELEGABLES_STRUCT__LIST_FILE_NAME = "DelegabiliStruttura";
	public static final String DELEGATES_LIST_FILE_NAME = "Delegati";
	public static final String REQUEST_LIST_TO_BE_APPROVED_FILE_NAME = "RichiesteDaApprovare";
	public static final String USER_LIST_FILE_NAME = "Persona";

	// mapping Richiesta
	public static final String TIPO_TASK_PENDING_RG = "PENDING RG";
	public static final String TIPO_TASK_PENDING_RPA = "PENDING RPA";
	public static final String TIPO_TASK_PENDING_RPC = "PENDING RPC";
	public static final String TIPO_TASK_PENDING_GGU = "PENDING GGU";
	public static final String TIPO_TASK_PENDING_COVALIDATORE = "PENDING COV";
	public static final String TIPO_TASK_PERSONALE = "PERSONALE";
	public static final String TIPOLOGIA_VARIAZIONE_ANAGRAFICA_MONITORAGGIO = "Variazione Anagrafica Login per Monitoraggio";
	public static final String TIPOLOGIA_VARIAZIONE_ANAGRAFICA_MONITORAGGIO_CODE = "VARIAZIONE_ANAGRAFICA_MONITORAGGIO";
	// stato operazione pgu
	public static final String STATO_OP_CHIUSA = "Chiusa";
	public static final String STATO_OP_ANNULLATA = "Annullata";

	public static final int TF_APPLICAZIONE_NUOVA_RICHIESTA = 1;
	public static final String CREAZIONE_ACCOUNT = "CREAZIONE_ACCOUNT";
	public static final String FALSE_STRING = "FALSE";
	public static final String TIPO_ACCOUNT_STANDARD = "STANDARD";
	public static final String TIPO_ACCOUNT_STANDARD_OPS$ = "STANDARD_OPS$";
	public static final String TIPO_ACCOUNT_M2M = "M2M";
	public static final String TIPO_ACCOUNT_SISTEMA = "SISTEMA";

	// LANGUAGE
	public static final String LANGUAGE_IT = "IT";
	public static final String LANGUAGE_EN = "EN";

	// RUBRICA_AZIENDALE
	public static final String CONTO_TERZI = "CONTO_TERZI";
	public static final String PERSONA_IN_AZIENDA = "PERSONA_IN_AZIENDA";

	public static final String OPERAZIONE_CREAZIONE = "CREAZIONE";
	public static final String OPERAZIONE_VISUALIZZAZIONE = "VISUALIZZAZIONE";
	public static final String OPERAZIONE_TIPO_PROFILI_SELEZ = "PROFILI_SELEZ";
	public static final String PERSONIFICATOR_USER = "PERSONIFICATOR_USER";
	public static final String OPERAZIONE_CREAZIONE_UTENZA = "CREAZIONE UTENZA";
	public static final String STATO_ANNULLATO = "ANNULLATO";

	public static final String MSG_TYPE_ERROR = "error";
	public static final String MSG_TYPE_WARNING = "warn";
	public static final String MSG_TYPE_INFO = "info";
	public static final String MSG_TYPE_SUCCESS = "success";

	public static final String SISTEM_TYPE_UNIX = "UNIX";
	public static final String SISTEM_TYPE_WINDOWS = "WINDOWS";

	// attributi parametri
	public static final String GRUPPI = "GRUPPI";
	public static final String GRUPPO_PRIMARIO ="GRUPPO PRIMARIO";
	public static final String GRUPPI_RPA = "GRUPPI_RPA";
	public static final String DESCRIZIONE_GRUPPI = "DESCRIZIONE_GRUPPI";
	public static final String DATA_SCADENZA = "DATA_SCADENZA";
	public static final String EVASA = "EVASA";

	// tipo di messaggio ALERT o BLOCK
	public static final String MSG_TYPE_ALERT = "MSG_TYPE_ALERT";
	public static final String MSG_TYPE_BLOCK = "MSG_TYPE_BLOCK";
	public static final String MSG_TYPE_BLOCK_SAMS = "MSG_TYPE_BLOCK_SAMS";
	public static final String SAMS_ERROR_31 = "error.msg.block.richiesta.sams.31";

	// inoltro richiesta
	public static final String DATA_NON_SCADENZA_ACCOUNT = "01/01/2038";
	public static final String TIPOLOGIA_OPERAZIONE_CREAZIONE = "Creazione Login";
	public static final String OPERAZIONE_INOLTRA = "INOLTRA";

	// origine chiamata end point profiliDbu
	public static final String NUOVA_RICHIESTA = "NUOVA_RICHIESTA";
	public static final String RICHIESTE_IN_APPROVAZIONE = "RICHIESTE_IN_APPROVAZIONE";

	// Chiavi per gestire operazioni secondarie
	public static final String KEY_OP_SEC_RICH_IN_CORSO = "KEY_OP_SEC_RICH_IN_CORSO";
	public static final String KEY_OP_SEC_BLOCCO_STRONG_AUTH = "KEY_OP_SEC_BLOCCO_STRONG_AUTH";
	public static final String KEY_OP_SEC_BLOCCO_SCHEMI_PROFILI = "KEY_OP_SEC_BLOCCO_SCHEMI_PROFILI";
	public static final String KEY_OP_SEC_VERIFICA_VALIDITA = "KEY_OP_SEC_VERIFICA_VALIDITA";

	// Operazioni Elementari
	public static final String OPERAZIONE_ELEMENTARE_CREAZIONE = "Creazione_User_ID";
	public static final String OPERAZIONE_ELEMENTARE_AGGIUNTA = "Aggiunta_Profilo";
	public static final String OPERAZIONE_ELEMENTARE_SOSTITUZIONE = "Sostituzione_Profilo";
	public static final String OPERAZIONE_ELEMENTARE_CANCELLAZIONE = "Cancellazione_User_ID";
	public static final String OPERAZIONE_ELEMENTARE_DISSOCIA = "Dissocia_Profilo";

	// SAMS
	public static final String TIPO_ACCOUNT_SAMS_TOKEN = "SAMS_TOKEN";
	public static final String TIPO_ACCOUNT_SAMS_SMARTCARD = "SAMS_SMARTCARD";
	public static final String TIPO_ACCOUNT_SAMS_GESTORE = "SAMS_GESTORE";
	public static final String SAMS_ADMIN_ALERT = "samsAdmin";
	public static final String SAMS_ALERT = "sams";

	public static final String OPERAZIONE_PROFILO_SAMS = "OPERAZIONE_PROFILO_SAMS";
	public static final String OPERAZIONE_PROFILI_AMMESSI_SAMS = "OPERAZIONE_PROFILI_AMMESSI_SAMS";

	// Tipologia profilo SO
	public static final String TIPOLOGIA_PROFILO_SP = "SP";
	public static final String TIPOLOGIA_PROFILO_NON_SP = "NSP";
	public static final String TIPOLOGIA_PROFILO_ALL = "ALL";
	public static final String EM_RICHIESTA_TRUE = "0";
	public static final String EM_RICHIESTA_FALSE = "1";
	public static final String EM_RICHIESTA_UF_TRUE = "2";
	public static final String EM_RICHIESTA_UF_FALSE = "3";

	// SECRET
	public static final String TIPOLOGIA_OPERAZIONE_RESET_PASSWORD_UTENTE = "Reset password";
	public static final String TIPOLOGIA_OPERAZIONE_CAMBIO_PASSWORD_UTENTE = "Cambio password";
	public static final String TIPOLOGIA_OPERAZIONE_PROPAGAZIONE_PASSWORD = "Propagazione password";
	// Link info e supporto richiesta per accesso alle reti
	public static final String OLD_REF_INFO_SUPPORTO = "NavigationAction.action?azione=infoSupporto";
	public static final String NEW_REF_INFO_SUPPORTO = "/#/informazioneESupporto/supporto";

	public static final String STATO_UTENTE_ATTIVO = "Attivo";

	public static final String LISTA_UTENTI_CF_AND_CELLULARE_UNIVOCO = "Lista utenti cf e cellulare univoco";
	public static final String LISTA_UTENTI_CF_OR_CELLULARE_DUPLICATO = "Lista utenti cf e cellulare duplicato";
	public static final String TIPOLOGIA_OPERAZIONE_CREAZIONE_IDV_MATRICOLA = "_MATRICOLA";
	// CATEGORIE
	public static final String CATEGORIA_B = "B";

	// Creazione/Modifica utente
	public static final String TIPO_DOCUMENTO_PROCURA = "Procura";
	public static final int CREAZIONE_CF_PRESENTE = 1;
	public static final int CODE_CF_PRESENTE = 9999;
	public static final String MSG_CF_PRESENTE_1 = "Il campo Codice Fiscale ";
	public static final String MSG_CF_PRESENTE_2 = " corrisponde ad una Persona già presente.";

	// Tipologia Utenti
	public static final String TIPOLOGIA_UTENTE_COLLABORATORE_ESTERNO = "Collaboratore Esterno";
	public static final String TIPOLOGIA_UTENTE_OUTSOURCER = "Outsourcer";
	public static final String TIPOLOGIA_UTENTE_DIPENDENTE = "Dipendente";
	public static final String TIPOLOGIA_UTENTE_RESPONSABILE = "Responsabile";
	public static final String TIPOLOGIA_UTENTE_RESPONSABILE_OUTSOURCER = "Responsabile Outsourcer";

	public static final String TIPOLOGIA_CANCELLAZIONE_MONITORAGGIO = "Cancellazione per Monitoraggio";
	public static final String TIPO_MONITORAGGIO = "Monitoraggio";

	// invoke-manager msg
	public static final String GENERIC_INVOKE_MSG_ERROR = "common.invoke_dbu_error";
	public static final String GENERIC_INVOKE_SUCCESS_MSG = "common.operation_success";
	public static final String GENERIC_INVOKE_MSG_WARNING = "common.invoke_dbu_warning";
	public static final String GENERIC_INVOKE_MSG_KO = "common.operation_ko";
	public static final String PROFILE_INVOKE_ERROR_MSG = "common.profile_scheme_not_found";
	public static final String USER_INVOKE_ERROR_MSG = "common.user_not_found";
	public static final String LOCATION_INVOKE_ERROR_MSG = "common.location_not_found";
	public static final String PREFIX_INVOKE_ERROR_MSG = "common.prefix_not_found";
	public static final String VPN_INVOKE_ERROR_MSG = "common.vpn_config_not_found";
	public static final String VPN_ACCOUNT_INVOKE_ERROR_MSG = "common.vpn_account_not_found";
	public static final String REQUEST_INVOKE_ERROR_MSG = "common.request_not_found";
	public static final String PROFILES_INVOKE_ERROR_MSG = "common.profiles_not_found";
	public static final String BIRTHPLACE_INVOKE_ERROR_MSG = "common.birthplace_not_found";
	public static final String CLASS_INVOKE_ERROR_MSG = "common.class_account_technique_not_found";
	public static final String GROUPS_RELATED_INCOMP_INVOKE_ERROR_MSG = "common.groups_related_incompatible_not_found";
	public static final String GROUPS_RELATED_INVOKE_ERROR_MSG = "common.groups_related_not_found";
	public static final String RPA_GROUPS_INVOKE_ERROR_MSG = "common.rpaGroups_not_found";
	public static final String UPDATE_PROFILE_DATA_ERROR_MSG = "error.msg.modifica.anagrafica.fallita";
	public static final String LOGIN_INVOKE_ERROR_MSG = "common.class_login_shell_not_found";
	public static final String UPLOAD_INVOKE_ERROR_MSG = "common.upload_fail";
	public static final String MASSIVE_CREATION_INVOKE_ERROR_MSG = "common.request_massive_creation_warning";
	public static final String GENERIC_INVOKE_REQUEST_GEN_ERROR_MSG = "common-error.error_generating_request";
	public static final String WS_DOWN_MSG_ERROR = "Connection refused: check WS status";
	public static final String MAPPING_INVOKE_MSG_ERROR = "Error Mapping Result";
	public static final String GENERIC_PGU_INVOKE_MSG_ERROR = "common.invoke_pgu_error";
	public static final String GENERIC_PGU_INVOKE_MSG_WARNING = "common.invoke_pgu_warning";
	public static final String MSG_BLOCK_APPROVE_REQUEST = "common.block.approve.profile.scheme";

	// Template creazione massiva persone
	public static final String TEMPLATE_CREAZIONE_PERSONA_MASSIVA = "TEMPLATE_CREAZIONE_PERSONA_MASSIVA";
	public static final String TEMPLATE_CREAZIONE_PERSONA_MASSIVA_RO = "TEMPLATE_CREAZIONE_PERSONA_MASSIVA_RO";
	public static final String OPERAZIONE_CREAZIONE_UTENZA_DOWNLOAD_TEMPLATE = "CREAZIONE_UTENZA";

	public static final String SEPARATOR_COLUMN = "###separator_column###";
	public static final String SEPARATOR_ROW = "###separator_row###";

	// costanti errore reset e cambio password
	public static final String DBUNICO_UNEXPECTED_GENERIC_ERROR = "500006";
	public static final String OLD_CREDENTIAL_ERROR = "500049";
	public static final String GENERIC_RESET_MSG_ERROR = "error.generic_reset_msg_error";
	public static final String GENERIC_CHANGE_MSG_ERROR = "error.generic_change_msg_error";
	public static final String OLD_CREDENTIAL_ERROR_KEY = "error.msg.credenziali.old.pwd.errata";
	public static final String CREDENTIAL_POLICY_ERROR_KEY = "error.msg.credenziali.pwd.policy.errata";
	public static final String DEFAULT_PROPAGATION_GENERIC_ERROR_KEY = "error.msg.credenziali.propagazione.non.effettuata";
	public static final String CHANGE_IDV_REQ_ERROR_KEY ="messaggio.richiesta.idv.modifica.negata";
	public static final String PROPAGATION_IN_PROGRESS_ERROR_KEY = "error.propagation.in.progress";

	public static final String TIPOLOGIA_ANAGRAFICA = "loadAnagrafica";
	public static final String TIPOLOGIA_UTENTE_DEALER = "DEALER";
	public static final String TIPOLOGIA_UTENTE_DEALER_FISSO = "DEALER FISSO";
	public static final String TIPOLOGIA_UTENTE_PDV_DEALER = "PDV DEALER";
	public static final String ELENCO_CODICI_INSEGNA = "ELENCO_CODICI_INSEGNA";
	public static final String OPERAZIONE_MODIFICA = "MODIFICA";
	public static final String PGU_SUPPORT_USER = "Supporto Utente";
	public static final String PGU_EXPORT_INFO_USER = "Export info Utente";

	// DELEGA
	public static final String LISTA_STRUTTURE_DELEGA = "LISTA_STRUTTURE_DELEGA";

	// Operazioni con controllo sulla data di conferma dei profili
	public static final String TIPOLOGIA_OPERAZIONE_AGGIUNTA_PROFILO = "Aggiunta Profilo";
	public static final String TIPOLOGIA_OPERAZIONE_SOSTITUZIONE_PROFILO = "Cambio Profilo";
	public static final String TIPOLOGIA_OPERAZIONE_MODIFICA_GRUPPI = "Modifica Gruppi";
	public static final List<String> OPERAZIONI_CHECK_CONFERMA_SCHEMI_PROFILI = new ArrayList<>();
	public static final String KEY_CONF_PERIODO_CONTRATTO = "KEY_ERAS_GRACE_PERIOD";
	
	//operazioni verifica persona
	public static final String OPERAZIONE_DISABILITA = "DISABILITA";
	public static final String OPERAZIONE_ABILITA ="ABILITA";
	public static final String OPERAZIONE_VALIDITA ="VALIDITA";
	public static final String OPERAZIONE_CESSIONE ="CESSIONE";
	public static final String OPERAZIONE_ACQUISIZIONE ="ACQUISIZIONE";
	public static final String OPERAZIONE_MODIFICA_MASSIVA_CONTRATTO ="MODIFICA_MASSIVA_CONTRATTO";
	static {
		OPERAZIONI_CHECK_CONFERMA_SCHEMI_PROFILI.add(TIPOLOGIA_OPERAZIONE_CREAZIONE);
		OPERAZIONI_CHECK_CONFERMA_SCHEMI_PROFILI.add(TIPOLOGIA_OPERAZIONE_AGGIUNTA_PROFILO);
		OPERAZIONI_CHECK_CONFERMA_SCHEMI_PROFILI.add(TIPOLOGIA_OPERAZIONE_SOSTITUZIONE_PROFILO);
		OPERAZIONI_CHECK_CONFERMA_SCHEMI_PROFILI.add(TIPOLOGIA_OPERAZIONE_MODIFICA_GRUPPI);
		OPERAZIONI_CHECK_CONFERMA_SCHEMI_PROFILI.add(OPERAZIONE_PROFILI_CREAZIONE);
		OPERAZIONI_CHECK_CONFERMA_SCHEMI_PROFILI.add(OPERAZIONE_MODIFICA);
	}
	
	//Costanti gestione richieste da approvare RG	
	public static final String OPERAZIONE_NEGA = "NEGA";
	public static final String MSG_RICHIESTA_ANNULLATA_DA ="Richiesta annullata da ";
	public static final String NUOVO_PROPRIETARIO = "NUOVO_PROPRIETARIO";
	public static final String OPERAZIONE_APPROVA = "APPROVA";
}
