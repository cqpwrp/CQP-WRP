package com.honda.am.cqp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblWRFEA1_CQ database table.
 * 
 */
@Embeddable
@Table(name="tblWRFEA1_CQ")
@NamedQuery(name="TblWRFEA1_CQ.findAll", query="SELECT t FROM TblWRFEA1_CQ t")
public class TblWRFEA1_CQ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="[ABS]")
	private String abs;

	@Column(name="AC")
	private String ac;

	@Column(name="[ALL]")
	private String all;

	@Column(name="BRAKES_RR_DISC")
	private String brakesRrDisc;

	@Column(name="CASSETTE_PLAYER")
	private String cassettePlayer;

	@Column(name="CD_CHANGER")
	private String cdChanger;

	@Column(name="CD_PLAYER")
	private String cdPlayer;

	@Column(name="CMBS")
	private String cmbs;

	@Column(name="CRUISE_CONTROL")
	private String cruiseControl;

	@Column(name="CVT")
	private String cvt;

	@Column(name="DOORS")
	private String doors;

	@Column(name="ENGINE_CYL")
	private String engineCyl;

	@Column(name="ENGINE_HP")
	private String engineHp;

	@Column(name="ENGINE_PREFIX")
	private String enginePrefix;

	@Column(name="ENGINE_TORQUE")
	private String engineTorque;

	@Column(name="FACTORY")
	private String factory;

	@Column(name="FOG_LIGHTS")
	private String fogLights;

	@Column(name="FOUR_WHEEL_DRIV")
	private String fourWheelDriv;

	@Column(name="GRADE_LONG")
	private String gradeLong;

	@Column(name="GRADE_SHORT")
	private String gradeShort;

	@Column(name="HANDSFREELINK")
	private String handsfreelink;

	@Column(name="HOMELINK")
	private String homelink;

	@Column(name="HVAC_FRONT_AUTO")
	private String hvacFrontAuto;

	@Column(name="MIRRORS_HEATED")
	private String mirrorsHeated;

	@Column(name="MOD_GENERATION")
	private String modGeneration;

	@Column(name="MOD_NAME")
	private String modName;

	@Column(name="MOD_YEAR")
	private String modYear;

	@Column(name="MODEL_YEAR")
	private String modelYear;

	@Column(name="MTC_MODEL")
	private String mtcModel;

	@Column(name="MTC_OPTION")
	private String mtcOption;

	@Column(name="MTC_SK")
	private int mtcSk;

	@Column(name="MTC_TYPE")
	private String mtcType;

	@Column(name="NAMEPLATE")
	private String nameplate;

	@Column(name="NAVIGATION")
	private String navigation;

	@Column(name="POWER_DOOR_LOCK")
	private String powerDoorLock;

	@Column(name="POWER_TAILGATE")
	private String powerTailgate;

	@Column(name="POWER_WINDOWS")
	private String powerWindows;

	@Column(name="PWR_SLIDE_DOOR")
	private String pwrSlideDoor;

	@Column(name="REAR_CAMERA")
	private String rearCamera;

	@Column(name="REAR_SPOILER")
	private String rearSpoiler;

	@Column(name="REMOTE_ENTRY")
	private String remoteEntry;

	@Column(name="RES")
	private String res;

	@Column(name="ROOF_RACK")
	private String roofRack;

	@Column(name="RUN_FLAT_TIRE")
	private String runFlatTire;

	@Column(name="SATELLITE_RADIO")
	private String satelliteRadio;

	@Column(name="SEAT_DRIVER_HEIGHT")
	private String seatDriverHeight;

	@Column(name="SEAT_MEMORY")
	private String seatMemory;

	@Column(name="SEAT_TYPE_DRIV")
	private String seatTypeDriv;

	@Column(name="SEAT_TYPE_PASS")
	private String seatTypePass;

	@Column(name="SEATS_HEATED")
	private String seatsHeated;

	@Column(name="SEATS_LEATHER")
	private String seatsLeather;

	@Column(name="SECURITY_SYSTEM")
	private String securitySystem;

	@Column(name="SH_AWD")
	private String shAwd;

	@Column(name="SRS_CURTAIN")
	private String srsCurtain;

	@Column(name="SRS_FRONT_SIDE")
	private String srsFrontSide;

	@Column(name="STABILITY_CTRL")
	private String stabilityCtrl;

	@Column(name="SUNROOF")
	private String sunroof;

	@Column(name="TIRE_SIZE")
	private String tireSize;

	@Column(name="TPMS")
	private String tpms;

	@Column(name="TRANS_GEARS")
	private String transGears;

	@Column(name="TRANSMISSION")
	private String transmission;

	@Column(name="TSA")
	private String tsa;

	@Column(name="VCM_ENGINE")
	private String vcmEngine;

	@Column(name="VEH_DESTN_CODE")
	private String vehDestnCode;

	@Column(name="VINSTRUCTURE")
	private String vinstructure;

	@Column(name="WHEELS_ALLOY")
	private String wheelsAlloy;

	public TblWRFEA1_CQ() {
	}

	public String getAbs() {
		return this.abs;
	}

	public void setAbs(String abs) {
		this.abs = abs;
	}

	public String getAc() {
		return this.ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getAll() {
		return this.all;
	}

	public void setAll(String all) {
		this.all = all;
	}

	public String getBrakesRrDisc() {
		return this.brakesRrDisc;
	}

	public void setBrakesRrDisc(String brakesRrDisc) {
		this.brakesRrDisc = brakesRrDisc;
	}

	public String getCassettePlayer() {
		return this.cassettePlayer;
	}

	public void setCassettePlayer(String cassettePlayer) {
		this.cassettePlayer = cassettePlayer;
	}

	public String getCdChanger() {
		return this.cdChanger;
	}

	public void setCdChanger(String cdChanger) {
		this.cdChanger = cdChanger;
	}

	public String getCdPlayer() {
		return this.cdPlayer;
	}

	public void setCdPlayer(String cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public String getCmbs() {
		return this.cmbs;
	}

	public void setCmbs(String cmbs) {
		this.cmbs = cmbs;
	}

	public String getCruiseControl() {
		return this.cruiseControl;
	}

	public void setCruiseControl(String cruiseControl) {
		this.cruiseControl = cruiseControl;
	}

	public String getCvt() {
		return this.cvt;
	}

	public void setCvt(String cvt) {
		this.cvt = cvt;
	}

	public String getDoors() {
		return this.doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngineCyl() {
		return this.engineCyl;
	}

	public void setEngineCyl(String engineCyl) {
		this.engineCyl = engineCyl;
	}

	public String getEngineHp() {
		return this.engineHp;
	}

	public void setEngineHp(String engineHp) {
		this.engineHp = engineHp;
	}

	public String getEnginePrefix() {
		return this.enginePrefix;
	}

	public void setEnginePrefix(String enginePrefix) {
		this.enginePrefix = enginePrefix;
	}

	public String getEngineTorque() {
		return this.engineTorque;
	}

	public void setEngineTorque(String engineTorque) {
		this.engineTorque = engineTorque;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getFogLights() {
		return this.fogLights;
	}

	public void setFogLights(String fogLights) {
		this.fogLights = fogLights;
	}

	public String getFourWheelDriv() {
		return this.fourWheelDriv;
	}

	public void setFourWheelDriv(String fourWheelDriv) {
		this.fourWheelDriv = fourWheelDriv;
	}

	public String getGradeLong() {
		return this.gradeLong;
	}

	public void setGradeLong(String gradeLong) {
		this.gradeLong = gradeLong;
	}

	public String getGradeShort() {
		return this.gradeShort;
	}

	public void setGradeShort(String gradeShort) {
		this.gradeShort = gradeShort;
	}

	public String getHandsfreelink() {
		return this.handsfreelink;
	}

	public void setHandsfreelink(String handsfreelink) {
		this.handsfreelink = handsfreelink;
	}

	public String getHomelink() {
		return this.homelink;
	}

	public void setHomelink(String homelink) {
		this.homelink = homelink;
	}

	public String getHvacFrontAuto() {
		return this.hvacFrontAuto;
	}

	public void setHvacFrontAuto(String hvacFrontAuto) {
		this.hvacFrontAuto = hvacFrontAuto;
	}

	public String getMirrorsHeated() {
		return this.mirrorsHeated;
	}

	public void setMirrorsHeated(String mirrorsHeated) {
		this.mirrorsHeated = mirrorsHeated;
	}

	public String getModGeneration() {
		return this.modGeneration;
	}

	public void setModGeneration(String modGeneration) {
		this.modGeneration = modGeneration;
	}

	public String getModName() {
		return this.modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public String getModYear() {
		return this.modYear;
	}

	public void setModYear(String modYear) {
		this.modYear = modYear;
	}

	public String getModelYear() {
		return this.modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getMtcModel() {
		return this.mtcModel;
	}

	public void setMtcModel(String mtcModel) {
		this.mtcModel = mtcModel;
	}

	public String getMtcOption() {
		return this.mtcOption;
	}

	public void setMtcOption(String mtcOption) {
		this.mtcOption = mtcOption;
	}

	public int getMtcSk() {
		return this.mtcSk;
	}

	public void setMtcSk(int mtcSk) {
		this.mtcSk = mtcSk;
	}

	public String getMtcType() {
		return this.mtcType;
	}

	public void setMtcType(String mtcType) {
		this.mtcType = mtcType;
	}

	public String getNameplate() {
		return this.nameplate;
	}

	public void setNameplate(String nameplate) {
		this.nameplate = nameplate;
	}

	public String getNavigation() {
		return this.navigation;
	}

	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}

	public String getPowerDoorLock() {
		return this.powerDoorLock;
	}

	public void setPowerDoorLock(String powerDoorLock) {
		this.powerDoorLock = powerDoorLock;
	}

	public String getPowerTailgate() {
		return this.powerTailgate;
	}

	public void setPowerTailgate(String powerTailgate) {
		this.powerTailgate = powerTailgate;
	}

	public String getPowerWindows() {
		return this.powerWindows;
	}

	public void setPowerWindows(String powerWindows) {
		this.powerWindows = powerWindows;
	}

	public String getPwrSlideDoor() {
		return this.pwrSlideDoor;
	}

	public void setPwrSlideDoor(String pwrSlideDoor) {
		this.pwrSlideDoor = pwrSlideDoor;
	}

	public String getRearCamera() {
		return this.rearCamera;
	}

	public void setRearCamera(String rearCamera) {
		this.rearCamera = rearCamera;
	}

	public String getRearSpoiler() {
		return this.rearSpoiler;
	}

	public void setRearSpoiler(String rearSpoiler) {
		this.rearSpoiler = rearSpoiler;
	}

	public String getRemoteEntry() {
		return this.remoteEntry;
	}

	public void setRemoteEntry(String remoteEntry) {
		this.remoteEntry = remoteEntry;
	}

	public String getRes() {
		return this.res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public String getRoofRack() {
		return this.roofRack;
	}

	public void setRoofRack(String roofRack) {
		this.roofRack = roofRack;
	}

	public String getRunFlatTire() {
		return this.runFlatTire;
	}

	public void setRunFlatTire(String runFlatTire) {
		this.runFlatTire = runFlatTire;
	}

	public String getSatelliteRadio() {
		return this.satelliteRadio;
	}

	public void setSatelliteRadio(String satelliteRadio) {
		this.satelliteRadio = satelliteRadio;
	}

	public String getSeatDriverHeight() {
		return this.seatDriverHeight;
	}

	public void setSeatDriverHeight(String seatDriverHeight) {
		this.seatDriverHeight = seatDriverHeight;
	}

	public String getSeatMemory() {
		return this.seatMemory;
	}

	public void setSeatMemory(String seatMemory) {
		this.seatMemory = seatMemory;
	}

	public String getSeatTypeDriv() {
		return this.seatTypeDriv;
	}

	public void setSeatTypeDriv(String seatTypeDriv) {
		this.seatTypeDriv = seatTypeDriv;
	}

	public String getSeatTypePass() {
		return this.seatTypePass;
	}

	public void setSeatTypePass(String seatTypePass) {
		this.seatTypePass = seatTypePass;
	}

	public String getSeatsHeated() {
		return this.seatsHeated;
	}

	public void setSeatsHeated(String seatsHeated) {
		this.seatsHeated = seatsHeated;
	}

	public String getSeatsLeather() {
		return this.seatsLeather;
	}

	public void setSeatsLeather(String seatsLeather) {
		this.seatsLeather = seatsLeather;
	}

	public String getSecuritySystem() {
		return this.securitySystem;
	}

	public void setSecuritySystem(String securitySystem) {
		this.securitySystem = securitySystem;
	}

	public String getShAwd() {
		return this.shAwd;
	}

	public void setShAwd(String shAwd) {
		this.shAwd = shAwd;
	}

	public String getSrsCurtain() {
		return this.srsCurtain;
	}

	public void setSrsCurtain(String srsCurtain) {
		this.srsCurtain = srsCurtain;
	}

	public String getSrsFrontSide() {
		return this.srsFrontSide;
	}

	public void setSrsFrontSide(String srsFrontSide) {
		this.srsFrontSide = srsFrontSide;
	}

	public String getStabilityCtrl() {
		return this.stabilityCtrl;
	}

	public void setStabilityCtrl(String stabilityCtrl) {
		this.stabilityCtrl = stabilityCtrl;
	}

	public String getSunroof() {
		return this.sunroof;
	}

	public void setSunroof(String sunroof) {
		this.sunroof = sunroof;
	}

	public String getTireSize() {
		return this.tireSize;
	}

	public void setTireSize(String tireSize) {
		this.tireSize = tireSize;
	}

	public String getTpms() {
		return this.tpms;
	}

	public void setTpms(String tpms) {
		this.tpms = tpms;
	}

	public String getTransGears() {
		return this.transGears;
	}

	public void setTransGears(String transGears) {
		this.transGears = transGears;
	}

	public String getTransmission() {
		return this.transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getTsa() {
		return this.tsa;
	}

	public void setTsa(String tsa) {
		this.tsa = tsa;
	}

	public String getVcmEngine() {
		return this.vcmEngine;
	}

	public void setVcmEngine(String vcmEngine) {
		this.vcmEngine = vcmEngine;
	}

	public String getVehDestnCode() {
		return this.vehDestnCode;
	}

	public void setVehDestnCode(String vehDestnCode) {
		this.vehDestnCode = vehDestnCode;
	}

	public String getVinstructure() {
		return this.vinstructure;
	}

	public void setVinstructure(String vinstructure) {
		this.vinstructure = vinstructure;
	}

	public String getWheelsAlloy() {
		return this.wheelsAlloy;
	}

	public void setWheelsAlloy(String wheelsAlloy) {
		this.wheelsAlloy = wheelsAlloy;
	}

}