
package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Subject_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Subject");
    private final static QName _Branches_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Branches");
    private final static QName _AddemptionOfTrader_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "AddemptionOfTrader");
    private final static QName _ForeignAuthority_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "ForeignAuthority");
    private final static QName _Person_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Person");
    private final static QName _License108_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "License108");
    private final static QName _ClosureBranchOfForeignTrader_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "ClosureBranchOfForeignTrader");
    private final static QName _Contacts_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Contacts");
    private final static QName _RefusalOfLicense_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "RefusalOfLicense");
    private final static QName _Price_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Price");
    private final static QName _License102_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "License102");
    private final static QName _ForeignCompanyBaseData_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "ForeignCompanyBaseData");
    private final static QName _BuyBackDecision_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "BuyBackDecision");
    private final static QName _HiddenNonMonetaryDeposit_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "HiddenNonMonetaryDeposit");
    private final static QName _InvitationForAppointingOfManager_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "InvitationForAppointingOfManager");
    private final static QName _Address_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Address");
    private final static QName _AddemptionOfEUIE_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "AddemptionOfEUIE");
    private final static QName _Description_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Description");
    private final static QName _Petitioner_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Petitioner");
    private final static QName _RestoringManagementRight_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "RestoringManagementRight");
    private final static QName _ActData_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "ActData");
    private final static QName _ResumeOfLiquidation_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "ResumeOfLiquidation");
    private final static QName _EraseDistraint_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "EraseDistraint");
    private final static QName _Passport_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "Passport");
    private final static QName _CessationOfTrade_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "CessationOfTrade");
    private final static QName _Deed_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2", "Deed");
    private final static QName _ActDataTypeMeritFieldID_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "FieldID");
    private final static QName _ShareTransfersShareTransferOldOwnerCountryID_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "OldOwnerCountryID");
    private final static QName _ShareTransfersShareTransferNewOwnerCountryID_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "NewOwnerCountryID");
    private final static QName _ActDataTypeExecutionEffectiveDate_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "EffectiveDate");
    private final static QName _ActDataTypeComplaintTerm_QNAME = new QName("http://www.registryagency.bg/schemas/deedv2/Fields", "ComplaintTerm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Trustees }
     * 
     */
    public Trustees createTrustees() {
        return new Trustees();
    }

    /**
     * Create an instance of {@link ControllingBoard }
     * 
     */
    public ControllingBoard createControllingBoard() {
        return new ControllingBoard();
    }

    /**
     * Create an instance of {@link SupervisionBodyFullSecIns }
     * 
     */
    public SupervisionBodyFullSecIns createSupervisionBodyFullSecIns() {
        return new SupervisionBodyFullSecIns();
    }

    /**
     * Create an instance of {@link Procurators }
     * 
     */
    public Procurators createProcurators() {
        return new Procurators();
    }

    /**
     * Create an instance of {@link Branches704 }
     * 
     */
    public Branches704 createBranches704() {
        return new Branches704();
    }

    /**
     * Create an instance of {@link InsolvenciesOfForeignTrader }
     * 
     */
    public InsolvenciesOfForeignTrader createInsolvenciesOfForeignTrader() {
        return new InsolvenciesOfForeignTrader();
    }

    /**
     * Create an instance of {@link StatementsX }
     * 
     */
    public StatementsX createStatementsX() {
        return new StatementsX();
    }

    /**
     * Create an instance of {@link StatementsY }
     * 
     */
    public StatementsY createStatementsY() {
        return new StatementsY();
    }

    /**
     * Create an instance of {@link StatementsZ }
     * 
     */
    public StatementsZ createStatementsZ() {
        return new StatementsZ();
    }

    /**
     * Create an instance of {@link StatementsT }
     * 
     */
    public StatementsT createStatementsT() {
        return new StatementsT();
    }

    /**
     * Create an instance of {@link StatementsU }
     * 
     */
    public StatementsU createStatementsU() {
        return new StatementsU();
    }

    /**
     * Create an instance of {@link StatementsV }
     * 
     */
    public StatementsV createStatementsV() {
        return new StatementsV();
    }

    /**
     * Create an instance of {@link UIC }
     * 
     */
    public UIC createUIC() {
        return new UIC();
    }

    /**
     * Create an instance of {@link StatementsW }
     * 
     */
    public StatementsW createStatementsW() {
        return new StatementsW();
    }

    /**
     * Create an instance of {@link StatementsP }
     * 
     */
    public StatementsP createStatementsP() {
        return new StatementsP();
    }

    /**
     * Create an instance of {@link StatementsQ }
     * 
     */
    public StatementsQ createStatementsQ() {
        return new StatementsQ();
    }

    /**
     * Create an instance of {@link StatementsR }
     * 
     */
    public StatementsR createStatementsR() {
        return new StatementsR();
    }

    /**
     * Create an instance of {@link StatementsS }
     * 
     */
    public StatementsS createStatementsS() {
        return new StatementsS();
    }

    /**
     * Create an instance of {@link StatementsL }
     * 
     */
    public StatementsL createStatementsL() {
        return new StatementsL();
    }

    /**
     * Create an instance of {@link StatementsM }
     * 
     */
    public StatementsM createStatementsM() {
        return new StatementsM();
    }

    /**
     * Create an instance of {@link StatementsN }
     * 
     */
    public StatementsN createStatementsN() {
        return new StatementsN();
    }

    /**
     * Create an instance of {@link BoardOfManagers }
     * 
     */
    public BoardOfManagers createBoardOfManagers() {
        return new BoardOfManagers();
    }

    /**
     * Create an instance of {@link StatementsO }
     * 
     */
    public StatementsO createStatementsO() {
        return new StatementsO();
    }

    /**
     * Create an instance of {@link StatementsH }
     * 
     */
    public StatementsH createStatementsH() {
        return new StatementsH();
    }

    /**
     * Create an instance of {@link StatementsI }
     * 
     */
    public StatementsI createStatementsI() {
        return new StatementsI();
    }

    /**
     * Create an instance of {@link StatementsJ }
     * 
     */
    public StatementsJ createStatementsJ() {
        return new StatementsJ();
    }

    /**
     * Create an instance of {@link StatementsK }
     * 
     */
    public StatementsK createStatementsK() {
        return new StatementsK();
    }

    /**
     * Create an instance of {@link StatementsD }
     * 
     */
    public StatementsD createStatementsD() {
        return new StatementsD();
    }

    /**
     * Create an instance of {@link StatementsE }
     * 
     */
    public StatementsE createStatementsE() {
        return new StatementsE();
    }

    /**
     * Create an instance of {@link StatementsF }
     * 
     */
    public StatementsF createStatementsF() {
        return new StatementsF();
    }

    /**
     * Create an instance of {@link StatementsG }
     * 
     */
    public StatementsG createStatementsG() {
        return new StatementsG();
    }

    /**
     * Create an instance of {@link BoardOfManagers3 }
     * 
     */
    public BoardOfManagers3 createBoardOfManagers3() {
        return new BoardOfManagers3();
    }

    /**
     * Create an instance of {@link StatementsA }
     * 
     */
    public StatementsA createStatementsA() {
        return new StatementsA();
    }

    /**
     * Create an instance of {@link StatementsB }
     * 
     */
    public StatementsB createStatementsB() {
        return new StatementsB();
    }

    /**
     * Create an instance of {@link StatementsC }
     * 
     */
    public StatementsC createStatementsC() {
        return new StatementsC();
    }

    /**
     * Create an instance of {@link Distraints }
     * 
     */
    public Distraints createDistraints() {
        return new Distraints();
    }

    /**
     * Create an instance of {@link UnlimitedLiabilityPartners }
     * 
     */
    public UnlimitedLiabilityPartners createUnlimitedLiabilityPartners() {
        return new UnlimitedLiabilityPartners();
    }

    /**
     * Create an instance of {@link LimitedLiabilityPartners }
     * 
     */
    public LimitedLiabilityPartners createLimitedLiabilityPartners() {
        return new LimitedLiabilityPartners();
    }

    /**
     * Create an instance of {@link BoardOfManagers2 }
     * 
     */
    public BoardOfManagers2 createBoardOfManagers2() {
        return new BoardOfManagers2();
    }

    /**
     * Create an instance of {@link AdministrativeBoard }
     * 
     */
    public AdministrativeBoard createAdministrativeBoard() {
        return new AdministrativeBoard();
    }

    /**
     * Create an instance of {@link PutUnderParticularSupervision }
     * 
     */
    public PutUnderParticularSupervision createPutUnderParticularSupervision() {
        return new PutUnderParticularSupervision();
    }

    /**
     * Create an instance of {@link ReinstatementsThirdIns }
     * 
     */
    public ReinstatementsThirdIns createReinstatementsThirdIns() {
        return new ReinstatementsThirdIns();
    }

    /**
     * Create an instance of {@link TransformingCompanys2 }
     * 
     */
    public TransformingCompanys2 createTransformingCompanys2() {
        return new TransformingCompanys2();
    }

    /**
     * Create an instance of {@link SupervisionBodyFullThirdIns }
     * 
     */
    public SupervisionBodyFullThirdIns createSupervisionBodyFullThirdIns() {
        return new SupervisionBodyFullThirdIns();
    }

    /**
     * Create an instance of {@link ReinstatementsSecIns }
     * 
     */
    public ReinstatementsSecIns createReinstatementsSecIns() {
        return new ReinstatementsSecIns();
    }

    /**
     * Create an instance of {@link Partners }
     * 
     */
    public Partners createPartners() {
        return new Partners();
    }

    /**
     * Create an instance of {@link EuropeanEconomicInterestGrouping }
     * 
     */
    public EuropeanEconomicInterestGrouping createEuropeanEconomicInterestGrouping() {
        return new EuropeanEconomicInterestGrouping();
    }

    /**
     * Create an instance of {@link ReOpenProceedings }
     * 
     */
    public ReOpenProceedings createReOpenProceedings() {
        return new ReOpenProceedings();
    }

    /**
     * Create an instance of {@link DivisionsOfEuropeanUnification }
     * 
     */
    public DivisionsOfEuropeanUnification createDivisionsOfEuropeanUnification() {
        return new DivisionsOfEuropeanUnification();
    }

    /**
     * Create an instance of {@link TrusteesThirdIns }
     * 
     */
    public TrusteesThirdIns createTrusteesThirdIns() {
        return new TrusteesThirdIns();
    }

    /**
     * Create an instance of {@link TransformingCompanys }
     * 
     */
    public TransformingCompanys createTransformingCompanys() {
        return new TransformingCompanys();
    }

    /**
     * Create an instance of {@link OffshoreRepresentatives }
     * 
     */
    public OffshoreRepresentatives createOffshoreRepresentatives() {
        return new OffshoreRepresentatives();
    }

    /**
     * Create an instance of {@link ReinstatementsDisallowPetitionSecIns }
     * 
     */
    public ReinstatementsDisallowPetitionSecIns createReinstatementsDisallowPetitionSecIns() {
        return new ReinstatementsDisallowPetitionSecIns();
    }

    /**
     * Create an instance of {@link Partners218 }
     * 
     */
    public Partners218 createPartners218() {
        return new Partners218();
    }

    /**
     * Create an instance of {@link PledgeCreditors }
     * 
     */
    public PledgeCreditors createPledgeCreditors() {
        return new PledgeCreditors();
    }

    /**
     * Create an instance of {@link Depozitar }
     * 
     */
    public Depozitar createDepozitar() {
        return new Depozitar();
    }

    /**
     * Create an instance of {@link ReorganizeCoOperatives }
     * 
     */
    public ReorganizeCoOperatives createReorganizeCoOperatives() {
        return new ReorganizeCoOperatives();
    }

    /**
     * Create an instance of {@link TrusteesSecIns }
     * 
     */
    public TrusteesSecIns createTrusteesSecIns() {
        return new TrusteesSecIns();
    }

    /**
     * Create an instance of {@link SuspendProceedingsSecIns }
     * 
     */
    public SuspendProceedingsSecIns createSuspendProceedingsSecIns() {
        return new SuspendProceedingsSecIns();
    }

    /**
     * Create an instance of {@link AdministrativeBoardSupporters }
     * 
     */
    public AdministrativeBoardSupporters createAdministrativeBoardSupporters() {
        return new AdministrativeBoardSupporters();
    }

    /**
     * Create an instance of {@link SuspendProceedings }
     * 
     */
    public SuspendProceedings createSuspendProceedings() {
        return new SuspendProceedings();
    }

    /**
     * Create an instance of {@link Liquidators }
     * 
     */
    public Liquidators createLiquidators() {
        return new Liquidators();
    }

    /**
     * Create an instance of {@link LeadingBoard }
     * 
     */
    public LeadingBoard createLeadingBoard() {
        return new LeadingBoard();
    }

    /**
     * Create an instance of {@link Representatives }
     * 
     */
    public Representatives createRepresentatives() {
        return new Representatives();
    }

    /**
     * Create an instance of {@link EuropeanHoldingCompanysAsShareholders }
     * 
     */
    public EuropeanHoldingCompanysAsShareholders createEuropeanHoldingCompanysAsShareholders() {
        return new EuropeanHoldingCompanysAsShareholders();
    }

    /**
     * Create an instance of {@link Successors703 }
     * 
     */
    public Successors703 createSuccessors703() {
        return new Successors703();
    }

    /**
     * Create an instance of {@link Branches804 }
     * 
     */
    public Branches804 createBranches804() {
        return new Branches804();
    }

    /**
     * Create an instance of {@link Pledgors }
     * 
     */
    public Pledgors createPledgors() {
        return new Pledgors();
    }

    /**
     * Create an instance of {@link ReinstatementsDisallowPetitionThirdIns }
     * 
     */
    public ReinstatementsDisallowPetitionThirdIns createReinstatementsDisallowPetitionThirdIns() {
        return new ReinstatementsDisallowPetitionThirdIns();
    }

    /**
     * Create an instance of {@link LimitSubjectOfActivity106 }
     * 
     */
    public LimitSubjectOfActivity106 createLimitSubjectOfActivity106() {
        return new LimitSubjectOfActivity106();
    }

    /**
     * Create an instance of {@link ReinstatementsDisallowPetition }
     * 
     */
    public ReinstatementsDisallowPetition createReinstatementsDisallowPetition() {
        return new ReinstatementsDisallowPetition();
    }

    /**
     * Create an instance of {@link ControllingBoardSupporters }
     * 
     */
    public ControllingBoardSupporters createControllingBoardSupporters() {
        return new ControllingBoardSupporters();
    }

    /**
     * Create an instance of {@link DebtorOverSecureClaims }
     * 
     */
    public DebtorOverSecureClaims createDebtorOverSecureClaims() {
        return new DebtorOverSecureClaims();
    }

    /**
     * Create an instance of {@link ReorganizeCoOperatives2 }
     * 
     */
    public ReorganizeCoOperatives2 createReorganizeCoOperatives2() {
        return new ReorganizeCoOperatives2();
    }

    /**
     * Create an instance of {@link Successors803 }
     * 
     */
    public Successors803 createSuccessors803() {
        return new Successors803();
    }

    /**
     * Create an instance of {@link Representatives102 }
     * 
     */
    public Representatives102 createRepresentatives102() {
        return new Representatives102();
    }

    /**
     * Create an instance of {@link Representatives101 }
     * 
     */
    public Representatives101 createRepresentatives101() {
        return new Representatives101();
    }

    /**
     * Create an instance of {@link LimitSubjectOfActivity111 }
     * 
     */
    public LimitSubjectOfActivity111 createLimitSubjectOfActivity111() {
        return new LimitSubjectOfActivity111();
    }

    /**
     * Create an instance of {@link Shares }
     * 
     */
    public Shares createShares() {
        return new Shares();
    }

    /**
     * Create an instance of {@link NonMonetaryDeposits }
     * 
     */
    public NonMonetaryDeposits createNonMonetaryDeposits() {
        return new NonMonetaryDeposits();
    }

    /**
     * Create an instance of {@link BoardOfManagersSupporters }
     * 
     */
    public BoardOfManagersSupporters createBoardOfManagersSupporters() {
        return new BoardOfManagersSupporters();
    }

    /**
     * Create an instance of {@link SuspendProceedingsThirdIns }
     * 
     */
    public SuspendProceedingsThirdIns createSuspendProceedingsThirdIns() {
        return new SuspendProceedingsThirdIns();
    }

    /**
     * Create an instance of {@link Descriptions }
     * 
     */
    public Descriptions createDescriptions() {
        return new Descriptions();
    }

    /**
     * Create an instance of {@link UnlimitedLiabilityPartnersEUIE }
     * 
     */
    public UnlimitedLiabilityPartnersEUIE createUnlimitedLiabilityPartnersEUIE() {
        return new UnlimitedLiabilityPartnersEUIE();
    }

    /**
     * Create an instance of {@link SepcialPowers }
     * 
     */
    public SepcialPowers createSepcialPowers() {
        return new SepcialPowers();
    }

    /**
     * Create an instance of {@link ActualOwners }
     * 
     */
    public ActualOwners createActualOwners() {
        return new ActualOwners();
    }

    /**
     * Create an instance of {@link SupervisingBoardSupporters }
     * 
     */
    public SupervisingBoardSupporters createSupervisingBoardSupporters() {
        return new SupervisingBoardSupporters();
    }

    /**
     * Create an instance of {@link BoardOfManagersSupporters2 }
     * 
     */
    public BoardOfManagersSupporters2 createBoardOfManagersSupporters2() {
        return new BoardOfManagersSupporters2();
    }

    /**
     * Create an instance of {@link SecuredClaimDebtors }
     * 
     */
    public SecuredClaimDebtors createSecuredClaimDebtors() {
        return new SecuredClaimDebtors();
    }

    /**
     * Create an instance of {@link AcquisitionEnterprises }
     * 
     */
    public AcquisitionEnterprises createAcquisitionEnterprises() {
        return new AcquisitionEnterprises();
    }

    /**
     * Create an instance of {@link Reinstatements }
     * 
     */
    public Reinstatements createReinstatements() {
        return new Reinstatements();
    }

    /**
     * Create an instance of {@link SupervisingBoard }
     * 
     */
    public SupervisingBoard createSupervisingBoard() {
        return new SupervisingBoard();
    }

    /**
     * Create an instance of {@link ShareTransfers }
     * 
     */
    public ShareTransfers createShareTransfers() {
        return new ShareTransfers();
    }

    /**
     * Create an instance of {@link ForeignTraders }
     * 
     */
    public ForeignTraders createForeignTraders() {
        return new ForeignTraders();
    }

    /**
     * Create an instance of {@link SupervisionBody }
     * 
     */
    public SupervisionBody createSupervisionBody() {
        return new SupervisionBody();
    }

    /**
     * Create an instance of {@link Suquestrators113 }
     * 
     */
    public Suquestrators113 createSuquestrators113() {
        return new Suquestrators113();
    }

    /**
     * Create an instance of {@link StatementsAH }
     * 
     */
    public StatementsAH createStatementsAH() {
        return new StatementsAH();
    }

    /**
     * Create an instance of {@link StatementsAG }
     * 
     */
    public StatementsAG createStatementsAG() {
        return new StatementsAG();
    }

    /**
     * Create an instance of {@link StatementsAF }
     * 
     */
    public StatementsAF createStatementsAF() {
        return new StatementsAF();
    }

    /**
     * Create an instance of {@link StatementsAE }
     * 
     */
    public StatementsAE createStatementsAE() {
        return new StatementsAE();
    }

    /**
     * Create an instance of {@link StatementsAL }
     * 
     */
    public StatementsAL createStatementsAL() {
        return new StatementsAL();
    }

    /**
     * Create an instance of {@link StatementsAK }
     * 
     */
    public StatementsAK createStatementsAK() {
        return new StatementsAK();
    }

    /**
     * Create an instance of {@link StatementsAJ }
     * 
     */
    public StatementsAJ createStatementsAJ() {
        return new StatementsAJ();
    }

    /**
     * Create an instance of {@link StatementsAI }
     * 
     */
    public StatementsAI createStatementsAI() {
        return new StatementsAI();
    }

    /**
     * Create an instance of {@link StatementsAD }
     * 
     */
    public StatementsAD createStatementsAD() {
        return new StatementsAD();
    }

    /**
     * Create an instance of {@link StatementsAC }
     * 
     */
    public StatementsAC createStatementsAC() {
        return new StatementsAC();
    }

    /**
     * Create an instance of {@link StatementsAB }
     * 
     */
    public StatementsAB createStatementsAB() {
        return new StatementsAB();
    }

    /**
     * Create an instance of {@link StatementsAA }
     * 
     */
    public StatementsAA createStatementsAA() {
        return new StatementsAA();
    }

    /**
     * Create an instance of {@link InsolvenciesOfEUIE }
     * 
     */
    public InsolvenciesOfEUIE createInsolvenciesOfEUIE() {
        return new InsolvenciesOfEUIE();
    }

    /**
     * Create an instance of {@link Managers }
     * 
     */
    public Managers createManagers() {
        return new Managers();
    }

    /**
     * Create an instance of {@link Suquestrators109 }
     * 
     */
    public Suquestrators109 createSuquestrators109() {
        return new Suquestrators109();
    }

    /**
     * Create an instance of {@link StatementsAM }
     * 
     */
    public StatementsAM createStatementsAM() {
        return new StatementsAM();
    }

    /**
     * Create an instance of {@link Suquestrators104 }
     * 
     */
    public Suquestrators104 createSuquestrators104() {
        return new Suquestrators104();
    }

    /**
     * Create an instance of {@link BoardOfDirectors }
     * 
     */
    public BoardOfDirectors createBoardOfDirectors() {
        return new BoardOfDirectors();
    }

    /**
     * Create an instance of {@link BranchManagers }
     * 
     */
    public BranchManagers createBranchManagers() {
        return new BranchManagers();
    }

    /**
     * Create an instance of {@link SupervisionBodyFull }
     * 
     */
    public SupervisionBodyFull createSupervisionBodyFull() {
        return new SupervisionBodyFull();
    }

    /**
     * Create an instance of {@link AtPawnCreditors }
     * 
     */
    public AtPawnCreditors createAtPawnCreditors() {
        return new AtPawnCreditors();
    }

    /**
     * Create an instance of {@link SupervisingBoard2 }
     * 
     */
    public SupervisingBoard2 createSupervisingBoard2() {
        return new SupervisingBoard2();
    }

    /**
     * Create an instance of {@link AssignedManagers }
     * 
     */
    public AssignedManagers createAssignedManagers() {
        return new AssignedManagers();
    }

    /**
     * Create an instance of {@link ReOpenProceedingsThirdIns }
     * 
     */
    public ReOpenProceedingsThirdIns createReOpenProceedingsThirdIns() {
        return new ReOpenProceedingsThirdIns();
    }

    /**
     * Create an instance of {@link ReOpenProceedingsSecIns }
     * 
     */
    public ReOpenProceedingsSecIns createReOpenProceedingsSecIns() {
        return new ReOpenProceedingsSecIns();
    }

    /**
     * Create an instance of {@link TrusteesSecIns.TrusteeSecIns }
     * 
     */
    public TrusteesSecIns.TrusteeSecIns createTrusteesSecInsTrusteeSecIns() {
        return new TrusteesSecIns.TrusteeSecIns();
    }

    /**
     * Create an instance of {@link TrusteesThirdIns.TrusteeThirdIns }
     * 
     */
    public TrusteesThirdIns.TrusteeThirdIns createTrusteesThirdInsTrusteeThirdIns() {
        return new TrusteesThirdIns.TrusteeThirdIns();
    }

    /**
     * Create an instance of {@link ActDataType }
     * 
     */
    public ActDataType createActDataType() {
        return new ActDataType();
    }

    /**
     * Create an instance of {@link Trustees.Trustee }
     * 
     */
    public Trustees.Trustee createTrusteesTrustee() {
        return new Trustees.Trustee();
    }

    /**
     * Create an instance of {@link IncomingPackageInfoType }
     * 
     */
    public IncomingPackageInfoType createIncomingPackageInfoType() {
        return new IncomingPackageInfoType();
    }

    /**
     * Create an instance of {@link DeedType }
     * 
     */
    public DeedType createDeedType() {
        return new DeedType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link SubDeedType }
     * 
     */
    public SubDeedType createSubDeedType() {
        return new SubDeedType();
    }

    /**
     * Create an instance of {@link OtherCircumstances105 }
     * 
     */
    public OtherCircumstances105 createOtherCircumstances105() {
        return new OtherCircumstances105();
    }

    /**
     * Create an instance of {@link Owner }
     * 
     */
    public Owner createOwner() {
        return new Owner();
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ContactsType }
     * 
     */
    public ContactsType createContactsType() {
        return new ContactsType();
    }

    /**
     * Create an instance of {@link AddemptionOfEUIE }
     * 
     */
    public AddemptionOfEUIE createAddemptionOfEUIE() {
        return new AddemptionOfEUIE();
    }

    /**
     * Create an instance of {@link AddemptionOfTraderSeatChange }
     * 
     */
    public AddemptionOfTraderSeatChange createAddemptionOfTraderSeatChange() {
        return new AddemptionOfTraderSeatChange();
    }

    /**
     * Create an instance of {@link ForeignAuthority }
     * 
     */
    public ForeignAuthority createForeignAuthority() {
        return new ForeignAuthority();
    }

    /**
     * Create an instance of {@link ControllingBoard.ControllingBoardMandate }
     * 
     */
    public ControllingBoard.ControllingBoardMandate createControllingBoardControllingBoardMandate() {
        return new ControllingBoard.ControllingBoardMandate();
    }

    /**
     * Create an instance of {@link ControllingBoard.ControllingBoardPerson }
     * 
     */
    public ControllingBoard.ControllingBoardPerson createControllingBoardControllingBoardPerson() {
        return new ControllingBoard.ControllingBoardPerson();
    }

    /**
     * Create an instance of {@link SupervisionBodyFullSecIns.SupervisionBodyMemberFullSecIns }
     * 
     */
    public SupervisionBodyFullSecIns.SupervisionBodyMemberFullSecIns createSupervisionBodyFullSecInsSupervisionBodyMemberFullSecIns() {
        return new SupervisionBodyFullSecIns.SupervisionBodyMemberFullSecIns();
    }

    /**
     * Create an instance of {@link ModalityDate }
     * 
     */
    public ModalityDate createModalityDate() {
        return new ModalityDate();
    }

    /**
     * Create an instance of {@link Procurators.Procurator }
     * 
     */
    public Procurators.Procurator createProcuratorsProcurator() {
        return new Procurators.Procurator();
    }

    /**
     * Create an instance of {@link Branches704 .Branch704Subject }
     * 
     */
    public Branches704 .Branch704Subject createBranches704Branch704Subject() {
        return new Branches704 .Branch704Subject();
    }

    /**
     * Create an instance of {@link HoldProceedingsSecIns }
     * 
     */
    public HoldProceedingsSecIns createHoldProceedingsSecIns() {
        return new HoldProceedingsSecIns();
    }

    /**
     * Create an instance of {@link BranchSubjectOfActivity }
     * 
     */
    public BranchSubjectOfActivity createBranchSubjectOfActivity() {
        return new BranchSubjectOfActivity();
    }

    /**
     * Create an instance of {@link TermOfExisting }
     * 
     */
    public TermOfExisting createTermOfExisting() {
        return new TermOfExisting();
    }

    /**
     * Create an instance of {@link InsolvenciesOfForeignTrader.InsolvencyOfForeignTrader }
     * 
     */
    public InsolvenciesOfForeignTrader.InsolvencyOfForeignTrader createInsolvenciesOfForeignTraderInsolvencyOfForeignTrader() {
        return new InsolvenciesOfForeignTrader.InsolvencyOfForeignTrader();
    }

    /**
     * Create an instance of {@link FormOfTransforming801A }
     * 
     */
    public FormOfTransforming801A createFormOfTransforming801A() {
        return new FormOfTransforming801A();
    }

    /**
     * Create an instance of {@link PledgeDDIdentifier }
     * 
     */
    public PledgeDDIdentifier createPledgeDDIdentifier() {
        return new PledgeDDIdentifier();
    }

    /**
     * Create an instance of {@link PartOfClaimwhatIsSeek }
     * 
     */
    public PartOfClaimwhatIsSeek createPartOfClaimwhatIsSeek() {
        return new PartOfClaimwhatIsSeek();
    }

    /**
     * Create an instance of {@link OtherCircumstances117 }
     * 
     */
    public OtherCircumstances117 createOtherCircumstances117() {
        return new OtherCircumstances117();
    }

    /**
     * Create an instance of {@link OtherCircumstances114 }
     * 
     */
    public OtherCircumstances114 createOtherCircumstances114() {
        return new OtherCircumstances114();
    }

    /**
     * Create an instance of {@link StatementsX.StatementX }
     * 
     */
    public StatementsX.StatementX createStatementsXStatementX() {
        return new StatementsX.StatementX();
    }

    /**
     * Create an instance of {@link PartialEraseDistraint }
     * 
     */
    public PartialEraseDistraint createPartialEraseDistraint() {
        return new PartialEraseDistraint();
    }

    /**
     * Create an instance of {@link StatementsY.StatementY }
     * 
     */
    public StatementsY.StatementY createStatementsYStatementY() {
        return new StatementsY.StatementY();
    }

    /**
     * Create an instance of {@link ForfeitCompanyIdentifier }
     * 
     */
    public ForfeitCompanyIdentifier createForfeitCompanyIdentifier() {
        return new ForfeitCompanyIdentifier();
    }

    /**
     * Create an instance of {@link StatementsZ.StatementZ }
     * 
     */
    public StatementsZ.StatementZ createStatementsZStatementZ() {
        return new StatementsZ.StatementZ();
    }

    /**
     * Create an instance of {@link StatementsT.StatementT }
     * 
     */
    public StatementsT.StatementT createStatementsTStatementT() {
        return new StatementsT.StatementT();
    }

    /**
     * Create an instance of {@link NumberNationalRegister1B }
     * 
     */
    public NumberNationalRegister1B createNumberNationalRegister1B() {
        return new NumberNationalRegister1B();
    }

    /**
     * Create an instance of {@link StatementsU.StatementU }
     * 
     */
    public StatementsU.StatementU createStatementsUStatementU() {
        return new StatementsU.StatementU();
    }

    /**
     * Create an instance of {@link TermOfExistingEUIE }
     * 
     */
    public TermOfExistingEUIE createTermOfExistingEUIE() {
        return new TermOfExistingEUIE();
    }

    /**
     * Create an instance of {@link StatementsV.StatementV }
     * 
     */
    public StatementsV.StatementV createStatementsVStatementV() {
        return new StatementsV.StatementV();
    }

    /**
     * Create an instance of {@link UIC.BulstatDeed }
     * 
     */
    public UIC.BulstatDeed createUICBulstatDeed() {
        return new UIC.BulstatDeed();
    }

    /**
     * Create an instance of {@link OpenProccedingsSecIns }
     * 
     */
    public OpenProccedingsSecIns createOpenProccedingsSecIns() {
        return new OpenProccedingsSecIns();
    }

    /**
     * Create an instance of {@link StatementsW.StatementW }
     * 
     */
    public StatementsW.StatementW createStatementsWStatementW() {
        return new StatementsW.StatementW();
    }

    /**
     * Create an instance of {@link StatementsP.StatementP }
     * 
     */
    public StatementsP.StatementP createStatementsPStatementP() {
        return new StatementsP.StatementP();
    }

    /**
     * Create an instance of {@link StatementsQ.StatementQ }
     * 
     */
    public StatementsQ.StatementQ createStatementsQStatementQ() {
        return new StatementsQ.StatementQ();
    }

    /**
     * Create an instance of {@link StatementsR.StatementR }
     * 
     */
    public StatementsR.StatementR createStatementsRStatementR() {
        return new StatementsR.StatementR();
    }

    /**
     * Create an instance of {@link StatementsS.StatementS }
     * 
     */
    public StatementsS.StatementS createStatementsSStatementS() {
        return new StatementsS.StatementS();
    }

    /**
     * Create an instance of {@link InsolvencyDataSecIns }
     * 
     */
    public InsolvencyDataSecIns createInsolvencyDataSecIns() {
        return new InsolvencyDataSecIns();
    }

    /**
     * Create an instance of {@link StatementsL.StatementL }
     * 
     */
    public StatementsL.StatementL createStatementsLStatementL() {
        return new StatementsL.StatementL();
    }

    /**
     * Create an instance of {@link StatementsM.StatementM }
     * 
     */
    public StatementsM.StatementM createStatementsMStatementM() {
        return new StatementsM.StatementM();
    }

    /**
     * Create an instance of {@link StatementsN.StatementN }
     * 
     */
    public StatementsN.StatementN createStatementsNStatementN() {
        return new StatementsN.StatementN();
    }

    /**
     * Create an instance of {@link BoardOfManagers.ManagerMandate }
     * 
     */
    public BoardOfManagers.ManagerMandate createBoardOfManagersManagerMandate() {
        return new BoardOfManagers.ManagerMandate();
    }

    /**
     * Create an instance of {@link BoardOfManagers.BoardManager }
     * 
     */
    public BoardOfManagers.BoardManager createBoardOfManagersBoardManager() {
        return new BoardOfManagers.BoardManager();
    }

    /**
     * Create an instance of {@link StatementsO.StatementO }
     * 
     */
    public StatementsO.StatementO createStatementsOStatementO() {
        return new StatementsO.StatementO();
    }

    /**
     * Create an instance of {@link StatementsH.StatementH }
     * 
     */
    public StatementsH.StatementH createStatementsHStatementH() {
        return new StatementsH.StatementH();
    }

    /**
     * Create an instance of {@link CashIn }
     * 
     */
    public CashIn createCashIn() {
        return new CashIn();
    }

    /**
     * Create an instance of {@link StatementsI.StatementI }
     * 
     */
    public StatementsI.StatementI createStatementsIStatementI() {
        return new StatementsI.StatementI();
    }

    /**
     * Create an instance of {@link StatementsJ.StatementJ }
     * 
     */
    public StatementsJ.StatementJ createStatementsJStatementJ() {
        return new StatementsJ.StatementJ();
    }

    /**
     * Create an instance of {@link DistraintData }
     * 
     */
    public DistraintData createDistraintData() {
        return new DistraintData();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link MinimumAmount }
     * 
     */
    public MinimumAmount createMinimumAmount() {
        return new MinimumAmount();
    }

    /**
     * Create an instance of {@link StatementsK.StatementK }
     * 
     */
    public StatementsK.StatementK createStatementsKStatementK() {
        return new StatementsK.StatementK();
    }

    /**
     * Create an instance of {@link StatementsD.StatementD }
     * 
     */
    public StatementsD.StatementD createStatementsDStatementD() {
        return new StatementsD.StatementD();
    }

    /**
     * Create an instance of {@link StatementsE.StatementE }
     * 
     */
    public StatementsE.StatementE createStatementsEStatementE() {
        return new StatementsE.StatementE();
    }

    /**
     * Create an instance of {@link OtherCircumstances110 }
     * 
     */
    public OtherCircumstances110 createOtherCircumstances110() {
        return new OtherCircumstances110();
    }

    /**
     * Create an instance of {@link StatementsF.StatementF }
     * 
     */
    public StatementsF.StatementF createStatementsFStatementF() {
        return new StatementsF.StatementF();
    }

    /**
     * Create an instance of {@link Funds }
     * 
     */
    public Funds createFunds() {
        return new Funds();
    }

    /**
     * Create an instance of {@link StatementsG.StatementG }
     * 
     */
    public StatementsG.StatementG createStatementsGStatementG() {
        return new StatementsG.StatementG();
    }

    /**
     * Create an instance of {@link OffshoreSpecialConditions }
     * 
     */
    public OffshoreSpecialConditions createOffshoreSpecialConditions() {
        return new OffshoreSpecialConditions();
    }

    /**
     * Create an instance of {@link BoardOfManagers3 .ManagerMandate3 }
     * 
     */
    public BoardOfManagers3 .ManagerMandate3 createBoardOfManagers3ManagerMandate3() {
        return new BoardOfManagers3 .ManagerMandate3();
    }

    /**
     * Create an instance of {@link BoardOfManagers3 .BoardManager3 }
     * 
     */
    public BoardOfManagers3 .BoardManager3 createBoardOfManagers3BoardManager3() {
        return new BoardOfManagers3 .BoardManager3();
    }

    /**
     * Create an instance of {@link StatementsA.StatementA }
     * 
     */
    public StatementsA.StatementA createStatementsAStatementA() {
        return new StatementsA.StatementA();
    }

    /**
     * Create an instance of {@link StatementsB.StatementB }
     * 
     */
    public StatementsB.StatementB createStatementsBStatementB() {
        return new StatementsB.StatementB();
    }

    /**
     * Create an instance of {@link StatementsC.StatementC }
     * 
     */
    public StatementsC.StatementC createStatementsCStatementC() {
        return new StatementsC.StatementC();
    }

    /**
     * Create an instance of {@link SubjectOfActivityNKID }
     * 
     */
    public SubjectOfActivityNKID createSubjectOfActivityNKID() {
        return new SubjectOfActivityNKID();
    }

    /**
     * Create an instance of {@link InvitationForAppointingOfManager }
     * 
     */
    public InvitationForAppointingOfManager createInvitationForAppointingOfManager() {
        return new InvitationForAppointingOfManager();
    }

    /**
     * Create an instance of {@link Distraints.Distraint }
     * 
     */
    public Distraints.Distraint createDistraintsDistraint() {
        return new Distraints.Distraint();
    }

    /**
     * Create an instance of {@link Depositor }
     * 
     */
    public Depositor createDepositor() {
        return new Depositor();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link DepozitarDistraintRemove }
     * 
     */
    public DepozitarDistraintRemove createDepozitarDistraintRemove() {
        return new DepozitarDistraintRemove();
    }

    /**
     * Create an instance of {@link PassportType }
     * 
     */
    public PassportType createPassportType() {
        return new PassportType();
    }

    /**
     * Create an instance of {@link InsolvencyData }
     * 
     */
    public InsolvencyData createInsolvencyData() {
        return new InsolvencyData();
    }

    /**
     * Create an instance of {@link BranchFirm }
     * 
     */
    public BranchFirm createBranchFirm() {
        return new BranchFirm();
    }

    /**
     * Create an instance of {@link UnlimitedLiabilityPartners.UnlimitedLiabilityPartner }
     * 
     */
    public UnlimitedLiabilityPartners.UnlimitedLiabilityPartner createUnlimitedLiabilityPartnersUnlimitedLiabilityPartner() {
        return new UnlimitedLiabilityPartners.UnlimitedLiabilityPartner();
    }

    /**
     * Create an instance of {@link DebtorBodiesSecIns }
     * 
     */
    public DebtorBodiesSecIns createDebtorBodiesSecIns() {
        return new DebtorBodiesSecIns();
    }

    /**
     * Create an instance of {@link PersonConcerned }
     * 
     */
    public PersonConcerned createPersonConcerned() {
        return new PersonConcerned();
    }

    /**
     * Create an instance of {@link LimitedLiabilityPartners.LimitedLiabilityPartner }
     * 
     */
    public LimitedLiabilityPartners.LimitedLiabilityPartner createLimitedLiabilityPartnersLimitedLiabilityPartner() {
        return new LimitedLiabilityPartners.LimitedLiabilityPartner();
    }

    /**
     * Create an instance of {@link InsolvencyDate }
     * 
     */
    public InsolvencyDate createInsolvencyDate() {
        return new InsolvencyDate();
    }

    /**
     * Create an instance of {@link BoardOfManagers2 .ManagerMandate2 }
     * 
     */
    public BoardOfManagers2 .ManagerMandate2 createBoardOfManagers2ManagerMandate2() {
        return new BoardOfManagers2 .ManagerMandate2();
    }

    /**
     * Create an instance of {@link BoardOfManagers2 .BoardManager2 }
     * 
     */
    public BoardOfManagers2 .BoardManager2 createBoardOfManagers2BoardManager2() {
        return new BoardOfManagers2 .BoardManager2();
    }

    /**
     * Create an instance of {@link AdministrativeBoard.AdministrativeBoardMandate }
     * 
     */
    public AdministrativeBoard.AdministrativeBoardMandate createAdministrativeBoardAdministrativeBoardMandate() {
        return new AdministrativeBoard.AdministrativeBoardMandate();
    }

    /**
     * Create an instance of {@link AdministrativeBoard.AdministrativeBody }
     * 
     */
    public AdministrativeBoard.AdministrativeBody createAdministrativeBoardAdministrativeBody() {
        return new AdministrativeBoard.AdministrativeBody();
    }

    /**
     * Create an instance of {@link PutUnderParticularSupervision.Date }
     * 
     */
    public PutUnderParticularSupervision.Date createPutUnderParticularSupervisionDate() {
        return new PutUnderParticularSupervision.Date();
    }

    /**
     * Create an instance of {@link PutUnderParticularSupervision.Conditions }
     * 
     */
    public PutUnderParticularSupervision.Conditions createPutUnderParticularSupervisionConditions() {
        return new PutUnderParticularSupervision.Conditions();
    }

    /**
     * Create an instance of {@link StopOfExecutionProperty }
     * 
     */
    public StopOfExecutionProperty createStopOfExecutionProperty() {
        return new StopOfExecutionProperty();
    }

    /**
     * Create an instance of {@link TermsOfLiquidation }
     * 
     */
    public TermsOfLiquidation createTermsOfLiquidation() {
        return new TermsOfLiquidation();
    }

    /**
     * Create an instance of {@link DateOfRenewingDistraint }
     * 
     */
    public DateOfRenewingDistraint createDateOfRenewingDistraint() {
        return new DateOfRenewingDistraint();
    }

    /**
     * Create an instance of {@link TraverseOfRecoverPlanSecIns }
     * 
     */
    public TraverseOfRecoverPlanSecIns createTraverseOfRecoverPlanSecIns() {
        return new TraverseOfRecoverPlanSecIns();
    }

    /**
     * Create an instance of {@link ReinstatementsThirdIns.ReinstatementThirdIns }
     * 
     */
    public ReinstatementsThirdIns.ReinstatementThirdIns createReinstatementsThirdInsReinstatementThirdIns() {
        return new ReinstatementsThirdIns.ReinstatementThirdIns();
    }

    /**
     * Create an instance of {@link TransformingCompanys2 .TransformingCompany2 }
     * 
     */
    public TransformingCompanys2 .TransformingCompany2 createTransformingCompanys2TransformingCompany2() {
        return new TransformingCompanys2 .TransformingCompany2();
    }

    /**
     * Create an instance of {@link SupervisionBodyFullThirdIns.SupervisionBodyMemberFullThirdIns }
     * 
     */
    public SupervisionBodyFullThirdIns.SupervisionBodyMemberFullThirdIns createSupervisionBodyFullThirdInsSupervisionBodyMemberFullThirdIns() {
        return new SupervisionBodyFullThirdIns.SupervisionBodyMemberFullThirdIns();
    }

    /**
     * Create an instance of {@link ReinstatementsSecIns.ReinstatementSecIns }
     * 
     */
    public ReinstatementsSecIns.ReinstatementSecIns createReinstatementsSecInsReinstatementSecIns() {
        return new ReinstatementsSecIns.ReinstatementSecIns();
    }

    /**
     * Create an instance of {@link Partners.Partner }
     * 
     */
    public Partners.Partner createPartnersPartner() {
        return new Partners.Partner();
    }

    /**
     * Create an instance of {@link Price312 }
     * 
     */
    public Price312 createPrice312() {
        return new Price312();
    }

    /**
     * Create an instance of {@link HoldProceedings }
     * 
     */
    public HoldProceedings createHoldProceedings() {
        return new HoldProceedings();
    }

    /**
     * Create an instance of {@link NumberNationalRegister }
     * 
     */
    public NumberNationalRegister createNumberNationalRegister() {
        return new NumberNationalRegister();
    }

    /**
     * Create an instance of {@link StoppingEntry }
     * 
     */
    public StoppingEntry createStoppingEntry() {
        return new StoppingEntry();
    }

    /**
     * Create an instance of {@link EuropeanEconomicInterestGrouping.ForeignCompanyData }
     * 
     */
    public EuropeanEconomicInterestGrouping.ForeignCompanyData createEuropeanEconomicInterestGroupingForeignCompanyData() {
        return new EuropeanEconomicInterestGrouping.ForeignCompanyData();
    }

    /**
     * Create an instance of {@link EuropeanEconomicInterestGrouping.EUIEAddempted }
     * 
     */
    public EuropeanEconomicInterestGrouping.EUIEAddempted createEuropeanEconomicInterestGroupingEUIEAddempted() {
        return new EuropeanEconomicInterestGrouping.EUIEAddempted();
    }

    /**
     * Create an instance of {@link EuropeanEconomicInterestGrouping.RepresentersWayOfManagement }
     * 
     */
    public EuropeanEconomicInterestGrouping.RepresentersWayOfManagement createEuropeanEconomicInterestGroupingRepresentersWayOfManagement() {
        return new EuropeanEconomicInterestGrouping.RepresentersWayOfManagement();
    }

    /**
     * Create an instance of {@link EuropeanEconomicInterestGrouping.PowerOfLiquidators }
     * 
     */
    public EuropeanEconomicInterestGrouping.PowerOfLiquidators createEuropeanEconomicInterestGroupingPowerOfLiquidators() {
        return new EuropeanEconomicInterestGrouping.PowerOfLiquidators();
    }

    /**
     * Create an instance of {@link EuropeanEconomicInterestGrouping.PowerOfTrustees }
     * 
     */
    public EuropeanEconomicInterestGrouping.PowerOfTrustees createEuropeanEconomicInterestGroupingPowerOfTrustees() {
        return new EuropeanEconomicInterestGrouping.PowerOfTrustees();
    }

    /**
     * Create an instance of {@link EuropeanEconomicInterestGrouping.EuropeanEconomicInterestRepresenter }
     * 
     */
    public EuropeanEconomicInterestGrouping.EuropeanEconomicInterestRepresenter createEuropeanEconomicInterestGroupingEuropeanEconomicInterestRepresenter() {
        return new EuropeanEconomicInterestGrouping.EuropeanEconomicInterestRepresenter();
    }

    /**
     * Create an instance of {@link ManagerOfTradeEnterprise }
     * 
     */
    public ManagerOfTradeEnterprise createManagerOfTradeEnterprise() {
        return new ManagerOfTradeEnterprise();
    }

    /**
     * Create an instance of {@link TermsOfProtection }
     * 
     */
    public TermsOfProtection createTermsOfProtection() {
        return new TermsOfProtection();
    }

    /**
     * Create an instance of {@link ReOpenProceedings.ReopeningReson }
     * 
     */
    public ReOpenProceedings.ReopeningReson createReOpenProceedingsReopeningReson() {
        return new ReOpenProceedings.ReopeningReson();
    }

    /**
     * Create an instance of {@link DivisionsOfEuropeanUnification.DivisionOfEuropeanUnification }
     * 
     */
    public DivisionsOfEuropeanUnification.DivisionOfEuropeanUnification createDivisionsOfEuropeanUnificationDivisionOfEuropeanUnification() {
        return new DivisionsOfEuropeanUnification.DivisionOfEuropeanUnification();
    }

    /**
     * Create an instance of {@link HiddenNonMonetaryDeposit }
     * 
     */
    public HiddenNonMonetaryDeposit createHiddenNonMonetaryDeposit() {
        return new HiddenNonMonetaryDeposit();
    }

    /**
     * Create an instance of {@link ForeignCompanyBaseData }
     * 
     */
    public ForeignCompanyBaseData createForeignCompanyBaseData() {
        return new ForeignCompanyBaseData();
    }

    /**
     * Create an instance of {@link ChairMan }
     * 
     */
    public ChairMan createChairMan() {
        return new ChairMan();
    }

    /**
     * Create an instance of {@link BuyBackDecision }
     * 
     */
    public BuyBackDecision createBuyBackDecision() {
        return new BuyBackDecision();
    }

    /**
     * Create an instance of {@link CircumstanceArticle4 }
     * 
     */
    public CircumstanceArticle4 createCircumstanceArticle4() {
        return new CircumstanceArticle4();
    }

    /**
     * Create an instance of {@link PledgeExecutionClaim }
     * 
     */
    public PledgeExecutionClaim createPledgeExecutionClaim() {
        return new PledgeExecutionClaim();
    }

    /**
     * Create an instance of {@link RaiseDistraint }
     * 
     */
    public RaiseDistraint createRaiseDistraint() {
        return new RaiseDistraint();
    }

    /**
     * Create an instance of {@link Interest }
     * 
     */
    public Interest createInterest() {
        return new Interest();
    }

    /**
     * Create an instance of {@link WayOfEstablishingEuropeanCooperativeSociety }
     * 
     */
    public WayOfEstablishingEuropeanCooperativeSociety createWayOfEstablishingEuropeanCooperativeSociety() {
        return new WayOfEstablishingEuropeanCooperativeSociety();
    }

    /**
     * Create an instance of {@link ResumeOfLiquidation }
     * 
     */
    public ResumeOfLiquidation createResumeOfLiquidation() {
        return new ResumeOfLiquidation();
    }

    /**
     * Create an instance of {@link SubjectOfActivity }
     * 
     */
    public SubjectOfActivity createSubjectOfActivity() {
        return new SubjectOfActivity();
    }

    /**
     * Create an instance of {@link TransformingCompanys.TransformingCompany }
     * 
     */
    public TransformingCompanys.TransformingCompany createTransformingCompanysTransformingCompany() {
        return new TransformingCompanys.TransformingCompany();
    }

    /**
     * Create an instance of {@link OffshoreRepresentatives.OffshoreRepresentative }
     * 
     */
    public OffshoreRepresentatives.OffshoreRepresentative createOffshoreRepresentativesOffshoreRepresentative() {
        return new OffshoreRepresentatives.OffshoreRepresentative();
    }

    /**
     * Create an instance of {@link ReinstatementsDisallowPetitionSecIns.ReinstatementDisallowPetitionSecIns }
     * 
     */
    public ReinstatementsDisallowPetitionSecIns.ReinstatementDisallowPetitionSecIns createReinstatementsDisallowPetitionSecInsReinstatementDisallowPetitionSecIns() {
        return new ReinstatementsDisallowPetitionSecIns.ReinstatementDisallowPetitionSecIns();
    }

    /**
     * Create an instance of {@link LegalForm }
     * 
     */
    public LegalForm createLegalForm() {
        return new LegalForm();
    }

    /**
     * Create an instance of {@link OpenProccedingsThirdIns }
     * 
     */
    public OpenProccedingsThirdIns createOpenProccedingsThirdIns() {
        return new OpenProccedingsThirdIns();
    }

    /**
     * Create an instance of {@link Partners218 .Partner218Part }
     * 
     */
    public Partners218 .Partner218Part createPartners218Partner218Part() {
        return new Partners218 .Partner218Part();
    }

    /**
     * Create an instance of {@link Partners218 .Partner218 }
     * 
     */
    public Partners218 .Partner218 createPartners218Partner218() {
        return new Partners218 .Partner218();
    }

    /**
     * Create an instance of {@link PledgeCreditors.PledgeCreditor }
     * 
     */
    public PledgeCreditors.PledgeCreditor createPledgeCreditorsPledgeCreditor() {
        return new PledgeCreditors.PledgeCreditor();
    }

    /**
     * Create an instance of {@link PledgePropertyDescription }
     * 
     */
    public PledgePropertyDescription createPledgePropertyDescription() {
        return new PledgePropertyDescription();
    }

    /**
     * Create an instance of {@link Depozitar.DepozitarDistraintDetails }
     * 
     */
    public Depozitar.DepozitarDistraintDetails createDepozitarDepozitarDistraintDetails() {
        return new Depozitar.DepozitarDistraintDetails();
    }

    /**
     * Create an instance of {@link Depozitar.DepozitarDistraint }
     * 
     */
    public Depozitar.DepozitarDistraint createDepozitarDepozitarDistraint() {
        return new Depozitar.DepozitarDistraint();
    }

    /**
     * Create an instance of {@link Depozitar.DepozitarReminderDistraint }
     * 
     */
    public Depozitar.DepozitarReminderDistraint createDepozitarDepozitarReminderDistraint() {
        return new Depozitar.DepozitarReminderDistraint();
    }

    /**
     * Create an instance of {@link OffshoreSeatForCorrespondence }
     * 
     */
    public OffshoreSeatForCorrespondence createOffshoreSeatForCorrespondence() {
        return new OffshoreSeatForCorrespondence();
    }

    /**
     * Create an instance of {@link WayOfRepresentation43 }
     * 
     */
    public WayOfRepresentation43 createWayOfRepresentation43() {
        return new WayOfRepresentation43();
    }

    /**
     * Create an instance of {@link Term }
     * 
     */
    public Term createTerm() {
        return new Term();
    }

    /**
     * Create an instance of {@link ReorganizeCoOperatives.CoOperative }
     * 
     */
    public ReorganizeCoOperatives.CoOperative createReorganizeCoOperativesCoOperative() {
        return new ReorganizeCoOperatives.CoOperative();
    }

    /**
     * Create an instance of {@link DepositedFunds }
     * 
     */
    public DepositedFunds createDepositedFunds() {
        return new DepositedFunds();
    }

    /**
     * Create an instance of {@link TransferringEnterprise }
     * 
     */
    public TransferringEnterprise createTransferringEnterprise() {
        return new TransferringEnterprise();
    }

    /**
     * Create an instance of {@link SecuredClaimSubject }
     * 
     */
    public SecuredClaimSubject createSecuredClaimSubject() {
        return new SecuredClaimSubject();
    }

    /**
     * Create an instance of {@link SuspendProceedingsSecIns.SuspendReson }
     * 
     */
    public SuspendProceedingsSecIns.SuspendReson createSuspendProceedingsSecInsSuspendReson() {
        return new SuspendProceedingsSecIns.SuspendReson();
    }

    /**
     * Create an instance of {@link PledgeMoney }
     * 
     */
    public PledgeMoney createPledgeMoney() {
        return new PledgeMoney();
    }

    /**
     * Create an instance of {@link AdministrativeBoardSupporters.AdministrativeBoardSupporter }
     * 
     */
    public AdministrativeBoardSupporters.AdministrativeBoardSupporter createAdministrativeBoardSupportersAdministrativeBoardSupporter() {
        return new AdministrativeBoardSupporters.AdministrativeBoardSupporter();
    }

    /**
     * Create an instance of {@link ModalityCondition }
     * 
     */
    public ModalityCondition createModalityCondition() {
        return new ModalityCondition();
    }

    /**
     * Create an instance of {@link SuspendProceedings.SuspendReson }
     * 
     */
    public SuspendProceedings.SuspendReson createSuspendProceedingsSuspendReson() {
        return new SuspendProceedings.SuspendReson();
    }

    /**
     * Create an instance of {@link AddemptionOfTraderEraseForeignTrader }
     * 
     */
    public AddemptionOfTraderEraseForeignTrader createAddemptionOfTraderEraseForeignTrader() {
        return new AddemptionOfTraderEraseForeignTrader();
    }

    /**
     * Create an instance of {@link Liquidators.Liquidator }
     * 
     */
    public Liquidators.Liquidator createLiquidatorsLiquidator() {
        return new Liquidators.Liquidator();
    }

    /**
     * Create an instance of {@link LeadingBoard.LeadingBoardMandate }
     * 
     */
    public LeadingBoard.LeadingBoardMandate createLeadingBoardLeadingBoardMandate() {
        return new LeadingBoard.LeadingBoardMandate();
    }

    /**
     * Create an instance of {@link LeadingBoard.Leader }
     * 
     */
    public LeadingBoard.Leader createLeadingBoardLeader() {
        return new LeadingBoard.Leader();
    }

    /**
     * Create an instance of {@link Representatives.Representative }
     * 
     */
    public Representatives.Representative createRepresentativesRepresentative() {
        return new Representatives.Representative();
    }

    /**
     * Create an instance of {@link EuropeanHoldingCompanysAsShareholders.EuropeanHoldingCompanyAsShareholder }
     * 
     */
    public EuropeanHoldingCompanysAsShareholders.EuropeanHoldingCompanyAsShareholder createEuropeanHoldingCompanysAsShareholdersEuropeanHoldingCompanyAsShareholder() {
        return new EuropeanHoldingCompanysAsShareholders.EuropeanHoldingCompanyAsShareholder();
    }

    /**
     * Create an instance of {@link Successors703 .Successor703 }
     * 
     */
    public Successors703 .Successor703 createSuccessors703Successor703() {
        return new Successors703 .Successor703();
    }

    /**
     * Create an instance of {@link CessationOfTrade }
     * 
     */
    public CessationOfTrade createCessationOfTrade() {
        return new CessationOfTrade();
    }

    /**
     * Create an instance of {@link InterestAndDefaultForDelay }
     * 
     */
    public InterestAndDefaultForDelay createInterestAndDefaultForDelay() {
        return new InterestAndDefaultForDelay();
    }

    /**
     * Create an instance of {@link Branches804 .Branch804Subject }
     * 
     */
    public Branches804 .Branch804Subject createBranches804Branch804Subject() {
        return new Branches804 .Branch804Subject();
    }

    /**
     * Create an instance of {@link DeclareBankruptSecIns }
     * 
     */
    public DeclareBankruptSecIns createDeclareBankruptSecIns() {
        return new DeclareBankruptSecIns();
    }

    /**
     * Create an instance of {@link WayOfEstablishingEuropeanCompany }
     * 
     */
    public WayOfEstablishingEuropeanCompany createWayOfEstablishingEuropeanCompany() {
        return new WayOfEstablishingEuropeanCompany();
    }

    /**
     * Create an instance of {@link HoldProceedingsThirdIns }
     * 
     */
    public HoldProceedingsThirdIns createHoldProceedingsThirdIns() {
        return new HoldProceedingsThirdIns();
    }

    /**
     * Create an instance of {@link WayOfManagement }
     * 
     */
    public WayOfManagement createWayOfManagement() {
        return new WayOfManagement();
    }

    /**
     * Create an instance of {@link Pledgors.Pledgor }
     * 
     */
    public Pledgors.Pledgor createPledgorsPledgor() {
        return new Pledgors.Pledgor();
    }

    /**
     * Create an instance of {@link ContestationAct }
     * 
     */
    public ContestationAct createContestationAct() {
        return new ContestationAct();
    }

    /**
     * Create an instance of {@link ReinstatementsDisallowPetitionThirdIns.ReinstatementDisallowPetitionThirdIns }
     * 
     */
    public ReinstatementsDisallowPetitionThirdIns.ReinstatementDisallowPetitionThirdIns createReinstatementsDisallowPetitionThirdInsReinstatementDisallowPetitionThirdIns() {
        return new ReinstatementsDisallowPetitionThirdIns.ReinstatementDisallowPetitionThirdIns();
    }

    /**
     * Create an instance of {@link TraverseOfRecoverPlanThirdIns }
     * 
     */
    public TraverseOfRecoverPlanThirdIns createTraverseOfRecoverPlanThirdIns() {
        return new TraverseOfRecoverPlanThirdIns();
    }

    /**
     * Create an instance of {@link RestrictDebtorOrderPowerSecIns }
     * 
     */
    public RestrictDebtorOrderPowerSecIns createRestrictDebtorOrderPowerSecIns() {
        return new RestrictDebtorOrderPowerSecIns();
    }

    /**
     * Create an instance of {@link DeclareBankrupt }
     * 
     */
    public DeclareBankrupt createDeclareBankrupt() {
        return new DeclareBankrupt();
    }

    /**
     * Create an instance of {@link GeneralSeizure }
     * 
     */
    public GeneralSeizure createGeneralSeizure() {
        return new GeneralSeizure();
    }

    /**
     * Create an instance of {@link RestrictDebtorOrderPower }
     * 
     */
    public RestrictDebtorOrderPower createRestrictDebtorOrderPower() {
        return new RestrictDebtorOrderPower();
    }

    /**
     * Create an instance of {@link LimitSubjectOfActivity106 .LimitInsuaranceActivity106 }
     * 
     */
    public LimitSubjectOfActivity106 .LimitInsuaranceActivity106 createLimitSubjectOfActivity106LimitInsuaranceActivity106() {
        return new LimitSubjectOfActivity106 .LimitInsuaranceActivity106();
    }

    /**
     * Create an instance of {@link Transliteration }
     * 
     */
    public Transliteration createTransliteration() {
        return new Transliteration();
    }

    /**
     * Create an instance of {@link SpecialManager }
     * 
     */
    public SpecialManager createSpecialManager() {
        return new SpecialManager();
    }

    /**
     * Create an instance of {@link ReinstatementsDisallowPetition.ReinstatementDisallowPetition }
     * 
     */
    public ReinstatementsDisallowPetition.ReinstatementDisallowPetition createReinstatementsDisallowPetitionReinstatementDisallowPetition() {
        return new ReinstatementsDisallowPetition.ReinstatementDisallowPetition();
    }

    /**
     * Create an instance of {@link ControllingBoardSupporters.ControllingBoardSupportersPerson }
     * 
     */
    public ControllingBoardSupporters.ControllingBoardSupportersPerson createControllingBoardSupportersControllingBoardSupportersPerson() {
        return new ControllingBoardSupporters.ControllingBoardSupportersPerson();
    }

    /**
     * Create an instance of {@link DebtorOverSecureClaims.DebtorOverSecureClaim }
     * 
     */
    public DebtorOverSecureClaims.DebtorOverSecureClaim createDebtorOverSecureClaimsDebtorOverSecureClaim() {
        return new DebtorOverSecureClaims.DebtorOverSecureClaim();
    }

    /**
     * Create an instance of {@link ContinuingTradeActivity }
     * 
     */
    public ContinuingTradeActivity createContinuingTradeActivity() {
        return new ContinuingTradeActivity();
    }

    /**
     * Create an instance of {@link ReorganizeCoOperatives2 .CoOperative2 }
     * 
     */
    public ReorganizeCoOperatives2 .CoOperative2 createReorganizeCoOperatives2CoOperative2() {
        return new ReorganizeCoOperatives2 .CoOperative2();
    }

    /**
     * Create an instance of {@link Size307 }
     * 
     */
    public Size307 createSize307() {
        return new Size307();
    }

    /**
     * Create an instance of {@link Interests }
     * 
     */
    public Interests createInterests() {
        return new Interests();
    }

    /**
     * Create an instance of {@link EraseProcura }
     * 
     */
    public EraseProcura createEraseProcura() {
        return new EraseProcura();
    }

    /**
     * Create an instance of {@link ManageOrganizationAssets112 }
     * 
     */
    public ManageOrganizationAssets112 createManageOrganizationAssets112() {
        return new ManageOrganizationAssets112();
    }

    /**
     * Create an instance of {@link Successors803 .Successor803 }
     * 
     */
    public Successors803 .Successor803 createSuccessors803Successor803() {
        return new Successors803 .Successor803();
    }

    /**
     * Create an instance of {@link Object306 }
     * 
     */
    public Object306 createObject306() {
        return new Object306();
    }

    /**
     * Create an instance of {@link InsolvencyDataThirdIns }
     * 
     */
    public InsolvencyDataThirdIns createInsolvencyDataThirdIns() {
        return new InsolvencyDataThirdIns();
    }

    /**
     * Create an instance of {@link Representatives102 .Representative102 }
     * 
     */
    public Representatives102 .Representative102 createRepresentatives102Representative102() {
        return new Representatives102 .Representative102();
    }

    /**
     * Create an instance of {@link EraseDistraint }
     * 
     */
    public EraseDistraint createEraseDistraint() {
        return new EraseDistraint();
    }

    /**
     * Create an instance of {@link Representatives101 .Representative101 }
     * 
     */
    public Representatives101 .Representative101 createRepresentatives101Representative101() {
        return new Representatives101 .Representative101();
    }

    /**
     * Create an instance of {@link OffshoreCompany }
     * 
     */
    public OffshoreCompany createOffshoreCompany() {
        return new OffshoreCompany();
    }

    /**
     * Create an instance of {@link LimitSubjectOfActivity111 .ZPPCKOrganizationLimit }
     * 
     */
    public LimitSubjectOfActivity111 .ZPPCKOrganizationLimit createLimitSubjectOfActivity111ZPPCKOrganizationLimit() {
        return new LimitSubjectOfActivity111 .ZPPCKOrganizationLimit();
    }

    /**
     * Create an instance of {@link MoratoryRate }
     * 
     */
    public MoratoryRate createMoratoryRate() {
        return new MoratoryRate();
    }

    /**
     * Create an instance of {@link Shares.CredentialsForDifferentTypes }
     * 
     */
    public Shares.CredentialsForDifferentTypes createSharesCredentialsForDifferentTypes() {
        return new Shares.CredentialsForDifferentTypes();
    }

    /**
     * Create an instance of {@link Shares.SpecialConditionsForTransfer }
     * 
     */
    public Shares.SpecialConditionsForTransfer createSharesSpecialConditionsForTransfer() {
        return new Shares.SpecialConditionsForTransfer();
    }

    /**
     * Create an instance of {@link Shares.Share }
     * 
     */
    public Shares.Share createSharesShare() {
        return new Shares.Share();
    }

    /**
     * Create an instance of {@link SecuredClaimReason }
     * 
     */
    public SecuredClaimReason createSecuredClaimReason() {
        return new SecuredClaimReason();
    }

    /**
     * Create an instance of {@link EraseActualOwner }
     * 
     */
    public EraseActualOwner createEraseActualOwner() {
        return new EraseActualOwner();
    }

    /**
     * Create an instance of {@link Circumstances }
     * 
     */
    public Circumstances createCircumstances() {
        return new Circumstances();
    }

    /**
     * Create an instance of {@link SpecialConditions }
     * 
     */
    public SpecialConditions createSpecialConditions() {
        return new SpecialConditions();
    }

    /**
     * Create an instance of {@link TermsOfPartnership }
     * 
     */
    public TermsOfPartnership createTermsOfPartnership() {
        return new TermsOfPartnership();
    }

    /**
     * Create an instance of {@link StopExecutionOverProperty410 }
     * 
     */
    public StopExecutionOverProperty410 createStopExecutionOverProperty410() {
        return new StopExecutionOverProperty410();
    }

    /**
     * Create an instance of {@link CashInThirdIns }
     * 
     */
    public CashInThirdIns createCashInThirdIns() {
        return new CashInThirdIns();
    }

    /**
     * Create an instance of {@link License102 }
     * 
     */
    public License102 createLicense102() {
        return new License102();
    }

    /**
     * Create an instance of {@link License108 }
     * 
     */
    public License108 createLicense108() {
        return new License108();
    }

    /**
     * Create an instance of {@link ManageOrganizationAssets107 }
     * 
     */
    public ManageOrganizationAssets107 createManageOrganizationAssets107() {
        return new ManageOrganizationAssets107();
    }

    /**
     * Create an instance of {@link OffshoreIdentifier }
     * 
     */
    public OffshoreIdentifier createOffshoreIdentifier() {
        return new OffshoreIdentifier();
    }

    /**
     * Create an instance of {@link LimitSubjectOfActivity101 }
     * 
     */
    public LimitSubjectOfActivity101 createLimitSubjectOfActivity101() {
        return new LimitSubjectOfActivity101();
    }

    /**
     * Create an instance of {@link SharePaymentResponsibility }
     * 
     */
    public SharePaymentResponsibility createSharePaymentResponsibility() {
        return new SharePaymentResponsibility();
    }

    /**
     * Create an instance of {@link NonMonetaryDeposits.NonMonetaryDeposit }
     * 
     */
    public NonMonetaryDeposits.NonMonetaryDeposit createNonMonetaryDepositsNonMonetaryDeposit() {
        return new NonMonetaryDeposits.NonMonetaryDeposit();
    }

    /**
     * Create an instance of {@link BoardOfManagersSupporters.BoardOfManagersSupportersPerson }
     * 
     */
    public BoardOfManagersSupporters.BoardOfManagersSupportersPerson createBoardOfManagersSupportersBoardOfManagersSupportersPerson() {
        return new BoardOfManagersSupporters.BoardOfManagersSupportersPerson();
    }

    /**
     * Create an instance of {@link GeneralSeizureSecIns }
     * 
     */
    public GeneralSeizureSecIns createGeneralSeizureSecIns() {
        return new GeneralSeizureSecIns();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Size323 }
     * 
     */
    public Size323 createSize323() {
        return new Size323();
    }

    /**
     * Create an instance of {@link DiscontinuanceOfTheEUIE }
     * 
     */
    public DiscontinuanceOfTheEUIE createDiscontinuanceOfTheEUIE() {
        return new DiscontinuanceOfTheEUIE();
    }

    /**
     * Create an instance of {@link RestrictDebtorOrderPowerThirdIns }
     * 
     */
    public RestrictDebtorOrderPowerThirdIns createRestrictDebtorOrderPowerThirdIns() {
        return new RestrictDebtorOrderPowerThirdIns();
    }

    /**
     * Create an instance of {@link SuspendProceedingsThirdIns.SuspendReson }
     * 
     */
    public SuspendProceedingsThirdIns.SuspendReson createSuspendProceedingsThirdInsSuspendReson() {
        return new SuspendProceedingsThirdIns.SuspendReson();
    }

    /**
     * Create an instance of {@link PhysicalPersonTrader }
     * 
     */
    public PhysicalPersonTrader createPhysicalPersonTrader() {
        return new PhysicalPersonTrader();
    }

    /**
     * Create an instance of {@link SecuredClaimDelayInterests }
     * 
     */
    public SecuredClaimDelayInterests createSecuredClaimDelayInterests() {
        return new SecuredClaimDelayInterests();
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link Descriptions.DescriptionCount }
     * 
     */
    public Descriptions.DescriptionCount createDescriptionsDescriptionCount() {
        return new Descriptions.DescriptionCount();
    }

    /**
     * Create an instance of {@link Descriptions.Description406 }
     * 
     */
    public Descriptions.Description406 createDescriptionsDescription406() {
        return new Descriptions.Description406();
    }

    /**
     * Create an instance of {@link StopOfExecutionSize }
     * 
     */
    public StopOfExecutionSize createStopOfExecutionSize() {
        return new StopOfExecutionSize();
    }

    /**
     * Create an instance of {@link OffshoreTransliteration }
     * 
     */
    public OffshoreTransliteration createOffshoreTransliteration() {
        return new OffshoreTransliteration();
    }

    /**
     * Create an instance of {@link StopExecutionOverProperty }
     * 
     */
    public StopExecutionOverProperty createStopExecutionOverProperty() {
        return new StopExecutionOverProperty();
    }

    /**
     * Create an instance of {@link RestoringManagementRight }
     * 
     */
    public RestoringManagementRight createRestoringManagementRight() {
        return new RestoringManagementRight();
    }

    /**
     * Create an instance of {@link WayOfRepresentation }
     * 
     */
    public WayOfRepresentation createWayOfRepresentation() {
        return new WayOfRepresentation();
    }

    /**
     * Create an instance of {@link UnlimitedLiabilityPartnersEUIE.UnlimitedLiabilityPartnerEUIE }
     * 
     */
    public UnlimitedLiabilityPartnersEUIE.UnlimitedLiabilityPartnerEUIE createUnlimitedLiabilityPartnersEUIEUnlimitedLiabilityPartnerEUIE() {
        return new UnlimitedLiabilityPartnersEUIE.UnlimitedLiabilityPartnerEUIE();
    }

    /**
     * Create an instance of {@link SepcialPowers.SpecialPower }
     * 
     */
    public SepcialPowers.SpecialPower createSepcialPowersSpecialPower() {
        return new SepcialPowers.SpecialPower();
    }

    /**
     * Create an instance of {@link Size310 }
     * 
     */
    public Size310 createSize310() {
        return new Size310();
    }

    /**
     * Create an instance of {@link SenderType }
     * 
     */
    public SenderType createSenderType() {
        return new SenderType();
    }

    /**
     * Create an instance of {@link TraverseOfRecoverPlan }
     * 
     */
    public TraverseOfRecoverPlan createTraverseOfRecoverPlan() {
        return new TraverseOfRecoverPlan();
    }

    /**
     * Create an instance of {@link LiftingDistraint }
     * 
     */
    public LiftingDistraint createLiftingDistraint() {
        return new LiftingDistraint();
    }

    /**
     * Create an instance of {@link ActualOwners.ActualOwner }
     * 
     */
    public ActualOwners.ActualOwner createActualOwnersActualOwner() {
        return new ActualOwners.ActualOwner();
    }

    /**
     * Create an instance of {@link VolumeOfRepresentationPower }
     * 
     */
    public VolumeOfRepresentationPower createVolumeOfRepresentationPower() {
        return new VolumeOfRepresentationPower();
    }

    /**
     * Create an instance of {@link SupervisingBoardSupporters.SupervisingBoardSupporter }
     * 
     */
    public SupervisingBoardSupporters.SupervisingBoardSupporter createSupervisingBoardSupportersSupervisingBoardSupporter() {
        return new SupervisingBoardSupporters.SupervisingBoardSupporter();
    }

    /**
     * Create an instance of {@link RefusalOfLicense }
     * 
     */
    public RefusalOfLicense createRefusalOfLicense() {
        return new RefusalOfLicense();
    }

    /**
     * Create an instance of {@link BoardOfManagersSupporters2 .BoardManagersSupporter2 }
     * 
     */
    public BoardOfManagersSupporters2 .BoardManagersSupporter2 createBoardOfManagersSupporters2BoardManagersSupporter2() {
        return new BoardOfManagersSupporters2 .BoardManagersSupporter2();
    }

    /**
     * Create an instance of {@link PledgePropertyPrice }
     * 
     */
    public PledgePropertyPrice createPledgePropertyPrice() {
        return new PledgePropertyPrice();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link SeatChange }
     * 
     */
    public SeatChange createSeatChange() {
        return new SeatChange();
    }

    /**
     * Create an instance of {@link MainActivityNKID }
     * 
     */
    public MainActivityNKID createMainActivityNKID() {
        return new MainActivityNKID();
    }

    /**
     * Create an instance of {@link SecuredClaimDebtors.SecuredClaimDebtor }
     * 
     */
    public SecuredClaimDebtors.SecuredClaimDebtor createSecuredClaimDebtorsSecuredClaimDebtor() {
        return new SecuredClaimDebtors.SecuredClaimDebtor();
    }

    /**
     * Create an instance of {@link FormOfTransforming801 }
     * 
     */
    public FormOfTransforming801 createFormOfTransforming801() {
        return new FormOfTransforming801();
    }

    /**
     * Create an instance of {@link AcquisitionEnterprises.AcquisitionEnterprise }
     * 
     */
    public AcquisitionEnterprises.AcquisitionEnterprise createAcquisitionEnterprisesAcquisitionEnterprise() {
        return new AcquisitionEnterprises.AcquisitionEnterprise();
    }

    /**
     * Create an instance of {@link BranchIdentifier }
     * 
     */
    public BranchIdentifier createBranchIdentifier() {
        return new BranchIdentifier();
    }

    /**
     * Create an instance of {@link Reinstatements.Reinstatement }
     * 
     */
    public Reinstatements.Reinstatement createReinstatementsReinstatement() {
        return new Reinstatements.Reinstatement();
    }

    /**
     * Create an instance of {@link SupervisingBoard.SupervisingBoardMandate }
     * 
     */
    public SupervisingBoard.SupervisingBoardMandate createSupervisingBoardSupervisingBoardMandate() {
        return new SupervisingBoard.SupervisingBoardMandate();
    }

    /**
     * Create an instance of {@link SupervisingBoard.Supervisor }
     * 
     */
    public SupervisingBoard.Supervisor createSupervisingBoardSupervisor() {
        return new SupervisingBoard.Supervisor();
    }

    /**
     * Create an instance of {@link Representative503 }
     * 
     */
    public Representative503 createRepresentative503() {
        return new Representative503();
    }

    /**
     * Create an instance of {@link ShareTransfers.ShareTransfer }
     * 
     */
    public ShareTransfers.ShareTransfer createShareTransfersShareTransfer() {
        return new ShareTransfers.ShareTransfer();
    }

    /**
     * Create an instance of {@link ForeignTraders.ForeignTraderRegistration }
     * 
     */
    public ForeignTraders.ForeignTraderRegistration createForeignTradersForeignTraderRegistration() {
        return new ForeignTraders.ForeignTraderRegistration();
    }

    /**
     * Create an instance of {@link ForeignTraders.ForeignTraderCountry }
     * 
     */
    public ForeignTraders.ForeignTraderCountry createForeignTradersForeignTraderCountry() {
        return new ForeignTraders.ForeignTraderCountry();
    }

    /**
     * Create an instance of {@link ForeignTraders.ForeignTrader }
     * 
     */
    public ForeignTraders.ForeignTrader createForeignTradersForeignTrader() {
        return new ForeignTraders.ForeignTrader();
    }

    /**
     * Create an instance of {@link ForeignTraders.ForeignTraderWayOfRepresentation }
     * 
     */
    public ForeignTraders.ForeignTraderWayOfRepresentation createForeignTradersForeignTraderWayOfRepresentation() {
        return new ForeignTraders.ForeignTraderWayOfRepresentation();
    }

    /**
     * Create an instance of {@link ForeignTraders.AddemptionOfForeignTrader }
     * 
     */
    public ForeignTraders.AddemptionOfForeignTrader createForeignTradersAddemptionOfForeignTrader() {
        return new ForeignTraders.AddemptionOfForeignTrader();
    }

    /**
     * Create an instance of {@link ForeignTraders.ForeignTradeStaticMambers }
     * 
     */
    public ForeignTraders.ForeignTradeStaticMambers createForeignTradersForeignTradeStaticMambers() {
        return new ForeignTraders.ForeignTradeStaticMambers();
    }

    /**
     * Create an instance of {@link SupervisionBody.SupervisionBodyMember }
     * 
     */
    public SupervisionBody.SupervisionBodyMember createSupervisionBodySupervisionBodyMember() {
        return new SupervisionBody.SupervisionBodyMember();
    }

    /**
     * Create an instance of {@link Suquestrators113 .Suquestrator113 }
     * 
     */
    public Suquestrators113 .Suquestrator113 createSuquestrators113Suquestrator113() {
        return new Suquestrators113 .Suquestrator113();
    }

    /**
     * Create an instance of {@link BranchSeat }
     * 
     */
    public BranchSeat createBranchSeat() {
        return new BranchSeat();
    }

    /**
     * Create an instance of {@link StatementsAH.StatementAH }
     * 
     */
    public StatementsAH.StatementAH createStatementsAHStatementAH() {
        return new StatementsAH.StatementAH();
    }

    /**
     * Create an instance of {@link StatementsAG.StatementAG }
     * 
     */
    public StatementsAG.StatementAG createStatementsAGStatementAG() {
        return new StatementsAG.StatementAG();
    }

    /**
     * Create an instance of {@link StatementsAF.StatementAF }
     * 
     */
    public StatementsAF.StatementAF createStatementsAFStatementAF() {
        return new StatementsAF.StatementAF();
    }

    /**
     * Create an instance of {@link StatementsAE.StatementAE }
     * 
     */
    public StatementsAE.StatementAE createStatementsAEStatementAE() {
        return new StatementsAE.StatementAE();
    }

    /**
     * Create an instance of {@link GeneralSeizureThirdIns }
     * 
     */
    public GeneralSeizureThirdIns createGeneralSeizureThirdIns() {
        return new GeneralSeizureThirdIns();
    }

    /**
     * Create an instance of {@link StatementsAL.StatementAL }
     * 
     */
    public StatementsAL.StatementAL createStatementsALStatementAL() {
        return new StatementsAL.StatementAL();
    }

    /**
     * Create an instance of {@link StatementsAK.StatementAK }
     * 
     */
    public StatementsAK.StatementAK createStatementsAKStatementAK() {
        return new StatementsAK.StatementAK();
    }

    /**
     * Create an instance of {@link BranchesType }
     * 
     */
    public BranchesType createBranchesType() {
        return new BranchesType();
    }

    /**
     * Create an instance of {@link CashInSecIns }
     * 
     */
    public CashInSecIns createCashInSecIns() {
        return new CashInSecIns();
    }

    /**
     * Create an instance of {@link StatementsAJ.StatementAJ }
     * 
     */
    public StatementsAJ.StatementAJ createStatementsAJStatementAJ() {
        return new StatementsAJ.StatementAJ();
    }

    /**
     * Create an instance of {@link StatementsAI.StatementAI }
     * 
     */
    public StatementsAI.StatementAI createStatementsAIStatementAI() {
        return new StatementsAI.StatementAI();
    }

    /**
     * Create an instance of {@link DebtorBodies }
     * 
     */
    public DebtorBodies createDebtorBodies() {
        return new DebtorBodies();
    }

    /**
     * Create an instance of {@link PledgeExecutionDepozitar }
     * 
     */
    public PledgeExecutionDepozitar createPledgeExecutionDepozitar() {
        return new PledgeExecutionDepozitar();
    }

    /**
     * Create an instance of {@link StatementsAD.StatementAD }
     * 
     */
    public StatementsAD.StatementAD createStatementsADStatementAD() {
        return new StatementsAD.StatementAD();
    }

    /**
     * Create an instance of {@link StatementsAC.StatementAC }
     * 
     */
    public StatementsAC.StatementAC createStatementsACStatementAC() {
        return new StatementsAC.StatementAC();
    }

    /**
     * Create an instance of {@link StatementsAB.StatementAB }
     * 
     */
    public StatementsAB.StatementAB createStatementsABStatementAB() {
        return new StatementsAB.StatementAB();
    }

    /**
     * Create an instance of {@link StatementsAA.StatementAA }
     * 
     */
    public StatementsAA.StatementAA createStatementsAAStatementAA() {
        return new StatementsAA.StatementAA();
    }

    /**
     * Create an instance of {@link StopOfLiquidation }
     * 
     */
    public StopOfLiquidation createStopOfLiquidation() {
        return new StopOfLiquidation();
    }

    /**
     * Create an instance of {@link VolumeOfRepresentationPower541 }
     * 
     */
    public VolumeOfRepresentationPower541 createVolumeOfRepresentationPower541() {
        return new VolumeOfRepresentationPower541();
    }

    /**
     * Create an instance of {@link InsolvenciesOfEUIE.InsolvencyOfEUIE }
     * 
     */
    public InsolvenciesOfEUIE.InsolvencyOfEUIE createInsolvenciesOfEUIEInsolvencyOfEUIE() {
        return new InsolvenciesOfEUIE.InsolvencyOfEUIE();
    }

    /**
     * Create an instance of {@link DebtorBodiesThirdIns }
     * 
     */
    public DebtorBodiesThirdIns createDebtorBodiesThirdIns() {
        return new DebtorBodiesThirdIns();
    }

    /**
     * Create an instance of {@link Managers.Manager }
     * 
     */
    public Managers.Manager createManagersManager() {
        return new Managers.Manager();
    }

    /**
     * Create an instance of {@link ClosureBranchOfForeignTrader }
     * 
     */
    public ClosureBranchOfForeignTrader createClosureBranchOfForeignTrader() {
        return new ClosureBranchOfForeignTrader();
    }

    /**
     * Create an instance of {@link Suquestrators109 .Suquestrator109 }
     * 
     */
    public Suquestrators109 .Suquestrator109 createSuquestrators109Suquestrator109() {
        return new Suquestrators109 .Suquestrator109();
    }

    /**
     * Create an instance of {@link StatementsAM.StatementAM }
     * 
     */
    public StatementsAM.StatementAM createStatementsAMStatementAM() {
        return new StatementsAM.StatementAM();
    }

    /**
     * Create an instance of {@link NumberApplication }
     * 
     */
    public NumberApplication createNumberApplication() {
        return new NumberApplication();
    }

    /**
     * Create an instance of {@link Suquestrators104 .Suquestrator104 }
     * 
     */
    public Suquestrators104 .Suquestrator104 createSuquestrators104Suquestrator104() {
        return new Suquestrators104 .Suquestrator104();
    }

    /**
     * Create an instance of {@link SecuredClaimInterests }
     * 
     */
    public SecuredClaimInterests createSecuredClaimInterests() {
        return new SecuredClaimInterests();
    }

    /**
     * Create an instance of {@link Size404 }
     * 
     */
    public Size404 createSize404() {
        return new Size404();
    }

    /**
     * Create an instance of {@link FormOfTransforming701 }
     * 
     */
    public FormOfTransforming701 createFormOfTransforming701() {
        return new FormOfTransforming701();
    }

    /**
     * Create an instance of {@link PledgeAddemption }
     * 
     */
    public PledgeAddemption createPledgeAddemption() {
        return new PledgeAddemption();
    }

    /**
     * Create an instance of {@link BoardOfDirectors.BoardOfDirectorsMandate }
     * 
     */
    public BoardOfDirectors.BoardOfDirectorsMandate createBoardOfDirectorsBoardOfDirectorsMandate() {
        return new BoardOfDirectors.BoardOfDirectorsMandate();
    }

    /**
     * Create an instance of {@link BoardOfDirectors.Director }
     * 
     */
    public BoardOfDirectors.Director createBoardOfDirectorsDirector() {
        return new BoardOfDirectors.Director();
    }

    /**
     * Create an instance of {@link TransferringTypeOfTradeEnterprise }
     * 
     */
    public TransferringTypeOfTradeEnterprise createTransferringTypeOfTradeEnterprise() {
        return new TransferringTypeOfTradeEnterprise();
    }

    /**
     * Create an instance of {@link BranchManagers.BranchManager }
     * 
     */
    public BranchManagers.BranchManager createBranchManagersBranchManager() {
        return new BranchManagers.BranchManager();
    }

    /**
     * Create an instance of {@link Size409 }
     * 
     */
    public Size409 createSize409() {
        return new Size409();
    }

    /**
     * Create an instance of {@link Reason }
     * 
     */
    public Reason createReason() {
        return new Reason();
    }

    /**
     * Create an instance of {@link ConcededEstateValue }
     * 
     */
    public ConcededEstateValue createConcededEstateValue() {
        return new ConcededEstateValue();
    }

    /**
     * Create an instance of {@link DeclareBankruptThirdIns }
     * 
     */
    public DeclareBankruptThirdIns createDeclareBankruptThirdIns() {
        return new DeclareBankruptThirdIns();
    }

    /**
     * Create an instance of {@link SupervisionBodyFull.SupervisionBodyMemberFull }
     * 
     */
    public SupervisionBodyFull.SupervisionBodyMemberFull createSupervisionBodyFullSupervisionBodyMemberFull() {
        return new SupervisionBodyFull.SupervisionBodyMemberFull();
    }

    /**
     * Create an instance of {@link Reason403 }
     * 
     */
    public Reason403 createReason403() {
        return new Reason403();
    }

    /**
     * Create an instance of {@link PropertyOverExecution }
     * 
     */
    public PropertyOverExecution createPropertyOverExecution() {
        return new PropertyOverExecution();
    }

    /**
     * Create an instance of {@link SeatForCorrespondence }
     * 
     */
    public SeatForCorrespondence createSeatForCorrespondence() {
        return new SeatForCorrespondence();
    }

    /**
     * Create an instance of {@link OffshoreSeat }
     * 
     */
    public OffshoreSeat createOffshoreSeat() {
        return new OffshoreSeat();
    }

    /**
     * Create an instance of {@link OffshoreWayOfRepresentation }
     * 
     */
    public OffshoreWayOfRepresentation createOffshoreWayOfRepresentation() {
        return new OffshoreWayOfRepresentation();
    }

    /**
     * Create an instance of {@link AddemptionOfTrader }
     * 
     */
    public AddemptionOfTrader createAddemptionOfTrader() {
        return new AddemptionOfTrader();
    }

    /**
     * Create an instance of {@link DiscontinuanceOfForeignTrader }
     * 
     */
    public DiscontinuanceOfForeignTrader createDiscontinuanceOfForeignTrader() {
        return new DiscontinuanceOfForeignTrader();
    }

    /**
     * Create an instance of {@link SecuredClaimAmount }
     * 
     */
    public SecuredClaimAmount createSecuredClaimAmount() {
        return new SecuredClaimAmount();
    }

    /**
     * Create an instance of {@link AtPawnCreditors.AtPawnCreditor }
     * 
     */
    public AtPawnCreditors.AtPawnCreditor createAtPawnCreditorsAtPawnCreditor() {
        return new AtPawnCreditors.AtPawnCreditor();
    }

    /**
     * Create an instance of {@link DistraintIdentifier }
     * 
     */
    public DistraintIdentifier createDistraintIdentifier() {
        return new DistraintIdentifier();
    }

    /**
     * Create an instance of {@link SupervisingBoard2 .SupervisingBoardMandate2 }
     * 
     */
    public SupervisingBoard2 .SupervisingBoardMandate2 createSupervisingBoard2SupervisingBoardMandate2() {
        return new SupervisingBoard2 .SupervisingBoardMandate2();
    }

    /**
     * Create an instance of {@link SupervisingBoard2 .Supervisor2 }
     * 
     */
    public SupervisingBoard2 .Supervisor2 createSupervisingBoard2Supervisor2() {
        return new SupervisingBoard2 .Supervisor2();
    }

    /**
     * Create an instance of {@link SoleCapitalOwner }
     * 
     */
    public SoleCapitalOwner createSoleCapitalOwner() {
        return new SoleCapitalOwner();
    }

    /**
     * Create an instance of {@link AssignedManagers.AssignedManager }
     * 
     */
    public AssignedManagers.AssignedManager createAssignedManagersAssignedManager() {
        return new AssignedManagers.AssignedManager();
    }

    /**
     * Create an instance of {@link PledgeRenewDate }
     * 
     */
    public PledgeRenewDate createPledgeRenewDate() {
        return new PledgeRenewDate();
    }

    /**
     * Create an instance of {@link ReOpenProceedingsThirdIns.ReopeningReson }
     * 
     */
    public ReOpenProceedingsThirdIns.ReopeningReson createReOpenProceedingsThirdInsReopeningReson() {
        return new ReOpenProceedingsThirdIns.ReopeningReson();
    }

    /**
     * Create an instance of {@link BranchClosure }
     * 
     */
    public BranchClosure createBranchClosure() {
        return new BranchClosure();
    }

    /**
     * Create an instance of {@link ReOpenProceedingsSecIns.ReopeningReson }
     * 
     */
    public ReOpenProceedingsSecIns.ReopeningReson createReOpenProceedingsSecInsReopeningReson() {
        return new ReOpenProceedingsSecIns.ReopeningReson();
    }

    /**
     * Create an instance of {@link OpenProccedings }
     * 
     */
    public OpenProccedings createOpenProccedings() {
        return new OpenProccedings();
    }

    /**
     * Create an instance of {@link EntryDate }
     * 
     */
    public EntryDate createEntryDate() {
        return new EntryDate();
    }

    /**
     * Create an instance of {@link MandateType }
     * 
     */
    public MandateType createMandateType() {
        return new MandateType();
    }

    /**
     * Create an instance of {@link BranchType }
     * 
     */
    public BranchType createBranchType() {
        return new BranchType();
    }

    /**
     * Create an instance of {@link OutgoingNumberType }
     * 
     */
    public OutgoingNumberType createOutgoingNumberType() {
        return new OutgoingNumberType();
    }

    /**
     * Create an instance of {@link StatementType }
     * 
     */
    public StatementType createStatementType() {
        return new StatementType();
    }

    /**
     * Create an instance of {@link TrusteesSecIns.TrusteeSecIns.Status }
     * 
     */
    public TrusteesSecIns.TrusteeSecIns.Status createTrusteesSecInsTrusteeSecInsStatus() {
        return new TrusteesSecIns.TrusteeSecIns.Status();
    }

    /**
     * Create an instance of {@link TrusteesThirdIns.TrusteeThirdIns.Status }
     * 
     */
    public TrusteesThirdIns.TrusteeThirdIns.Status createTrusteesThirdInsTrusteeThirdInsStatus() {
        return new TrusteesThirdIns.TrusteeThirdIns.Status();
    }

    /**
     * Create an instance of {@link ActDataType.Type }
     * 
     */
    public ActDataType.Type createActDataTypeType() {
        return new ActDataType.Type();
    }

    /**
     * Create an instance of {@link ActDataType.BankruptcyCourt }
     * 
     */
    public ActDataType.BankruptcyCourt createActDataTypeBankruptcyCourt() {
        return new ActDataType.BankruptcyCourt();
    }

    /**
     * Create an instance of {@link ActDataType.Merit }
     * 
     */
    public ActDataType.Merit createActDataTypeMerit() {
        return new ActDataType.Merit();
    }

    /**
     * Create an instance of {@link ActDataType.Execution }
     * 
     */
    public ActDataType.Execution createActDataTypeExecution() {
        return new ActDataType.Execution();
    }

    /**
     * Create an instance of {@link ActDataType.ProclaimMetod }
     * 
     */
    public ActDataType.ProclaimMetod createActDataTypeProclaimMetod() {
        return new ActDataType.ProclaimMetod();
    }

    /**
     * Create an instance of {@link Trustees.Trustee.Status }
     * 
     */
    public Trustees.Trustee.Status createTrusteesTrusteeStatus() {
        return new Trustees.Trustee.Status();
    }

    /**
     * Create an instance of {@link IncomingPackageInfoType.Documents }
     * 
     */
    public IncomingPackageInfoType.Documents createIncomingPackageInfoTypeDocuments() {
        return new IncomingPackageInfoType.Documents();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Subject")
    public JAXBElement<SubjectType> createSubject(SubjectType value) {
        return new JAXBElement<SubjectType>(_Subject_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Branches")
    public JAXBElement<BranchesType> createBranches(BranchesType value) {
        return new JAXBElement<BranchesType>(_Branches_QNAME, BranchesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddemptionOfTrader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "AddemptionOfTrader")
    public JAXBElement<AddemptionOfTrader> createAddemptionOfTrader(AddemptionOfTrader value) {
        return new JAXBElement<AddemptionOfTrader>(_AddemptionOfTrader_QNAME, AddemptionOfTrader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignAuthority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "ForeignAuthority")
    public JAXBElement<ForeignAuthority> createForeignAuthority(ForeignAuthority value) {
        return new JAXBElement<ForeignAuthority>(_ForeignAuthority_QNAME, ForeignAuthority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link License108 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "License108")
    public JAXBElement<License108> createLicense108(License108 value) {
        return new JAXBElement<License108>(_License108_QNAME, License108 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosureBranchOfForeignTrader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "ClosureBranchOfForeignTrader")
    public JAXBElement<ClosureBranchOfForeignTrader> createClosureBranchOfForeignTrader(ClosureBranchOfForeignTrader value) {
        return new JAXBElement<ClosureBranchOfForeignTrader>(_ClosureBranchOfForeignTrader_QNAME, ClosureBranchOfForeignTrader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Contacts")
    public JAXBElement<ContactsType> createContacts(ContactsType value) {
        return new JAXBElement<ContactsType>(_Contacts_QNAME, ContactsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefusalOfLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "RefusalOfLicense")
    public JAXBElement<RefusalOfLicense> createRefusalOfLicense(RefusalOfLicense value) {
        return new JAXBElement<RefusalOfLicense>(_RefusalOfLicense_QNAME, RefusalOfLicense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Price")
    public JAXBElement<PriceType> createPrice(PriceType value) {
        return new JAXBElement<PriceType>(_Price_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link License102 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "License102")
    public JAXBElement<License102> createLicense102(License102 value) {
        return new JAXBElement<License102>(_License102_QNAME, License102 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignCompanyBaseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "ForeignCompanyBaseData")
    public JAXBElement<ForeignCompanyBaseData> createForeignCompanyBaseData(ForeignCompanyBaseData value) {
        return new JAXBElement<ForeignCompanyBaseData>(_ForeignCompanyBaseData_QNAME, ForeignCompanyBaseData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyBackDecision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "BuyBackDecision")
    public JAXBElement<BuyBackDecision> createBuyBackDecision(BuyBackDecision value) {
        return new JAXBElement<BuyBackDecision>(_BuyBackDecision_QNAME, BuyBackDecision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HiddenNonMonetaryDeposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "HiddenNonMonetaryDeposit")
    public JAXBElement<HiddenNonMonetaryDeposit> createHiddenNonMonetaryDeposit(HiddenNonMonetaryDeposit value) {
        return new JAXBElement<HiddenNonMonetaryDeposit>(_HiddenNonMonetaryDeposit_QNAME, HiddenNonMonetaryDeposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvitationForAppointingOfManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "InvitationForAppointingOfManager")
    public JAXBElement<InvitationForAppointingOfManager> createInvitationForAppointingOfManager(InvitationForAppointingOfManager value) {
        return new JAXBElement<InvitationForAppointingOfManager>(_InvitationForAppointingOfManager_QNAME, InvitationForAppointingOfManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddemptionOfEUIE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "AddemptionOfEUIE")
    public JAXBElement<AddemptionOfEUIE> createAddemptionOfEUIE(AddemptionOfEUIE value) {
        return new JAXBElement<AddemptionOfEUIE>(_AddemptionOfEUIE_QNAME, AddemptionOfEUIE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Description }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Description")
    public JAXBElement<Description> createDescription(Description value) {
        return new JAXBElement<Description>(_Description_QNAME, Description.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Petitioner")
    public JAXBElement<PersonType> createPetitioner(PersonType value) {
        return new JAXBElement<PersonType>(_Petitioner_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoringManagementRight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "RestoringManagementRight")
    public JAXBElement<RestoringManagementRight> createRestoringManagementRight(RestoringManagementRight value) {
        return new JAXBElement<RestoringManagementRight>(_RestoringManagementRight_QNAME, RestoringManagementRight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "ActData")
    public JAXBElement<ActDataType> createActData(ActDataType value) {
        return new JAXBElement<ActDataType>(_ActData_QNAME, ActDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeOfLiquidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "ResumeOfLiquidation")
    public JAXBElement<ResumeOfLiquidation> createResumeOfLiquidation(ResumeOfLiquidation value) {
        return new JAXBElement<ResumeOfLiquidation>(_ResumeOfLiquidation_QNAME, ResumeOfLiquidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EraseDistraint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "EraseDistraint")
    public JAXBElement<EraseDistraint> createEraseDistraint(EraseDistraint value) {
        return new JAXBElement<EraseDistraint>(_EraseDistraint_QNAME, EraseDistraint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "Passport")
    public JAXBElement<PassportType> createPassport(PassportType value) {
        return new JAXBElement<PassportType>(_Passport_QNAME, PassportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CessationOfTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "CessationOfTrade")
    public JAXBElement<CessationOfTrade> createCessationOfTrade(CessationOfTrade value) {
        return new JAXBElement<CessationOfTrade>(_CessationOfTrade_QNAME, CessationOfTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2", name = "Deed")
    public JAXBElement<DeedType> createDeed(DeedType value) {
        return new JAXBElement<DeedType>(_Deed_QNAME, DeedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "FieldID", scope = ActDataType.Merit.class)
    public JAXBElement<String> createActDataTypeMeritFieldID(String value) {
        return new JAXBElement<String>(_ActDataTypeMeritFieldID_QNAME, String.class, ActDataType.Merit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "OldOwnerCountryID", scope = ShareTransfers.ShareTransfer.class)
    public JAXBElement<Long> createShareTransfersShareTransferOldOwnerCountryID(Long value) {
        return new JAXBElement<Long>(_ShareTransfersShareTransferOldOwnerCountryID_QNAME, Long.class, ShareTransfers.ShareTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "NewOwnerCountryID", scope = ShareTransfers.ShareTransfer.class)
    public JAXBElement<Long> createShareTransfersShareTransferNewOwnerCountryID(Long value) {
        return new JAXBElement<Long>(_ShareTransfersShareTransferNewOwnerCountryID_QNAME, Long.class, ShareTransfers.ShareTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "EffectiveDate", scope = ActDataType.Execution.class)
    public JAXBElement<String> createActDataTypeExecutionEffectiveDate(String value) {
        return new JAXBElement<String>(_ActDataTypeExecutionEffectiveDate_QNAME, String.class, ActDataType.Execution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", name = "ComplaintTerm", scope = ActDataType.class)
    public JAXBElement<Object> createActDataTypeComplaintTerm(Object value) {
        return new JAXBElement<Object>(_ActDataTypeComplaintTerm_QNAME, Object.class, ActDataType.class, value);
    }

}