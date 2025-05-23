public class PatientDetails {
	private String patientName;
	private int pid;
	private long phone;
	private String padd;
	private String phistory;
	public PatientDetails(String patientName, int pid, long phone, String padd) {
		this.patientName = patientName;
		this.pid = pid;
		this.phone = phone;
		this.padd = padd;
	}
	public String getPatientName() {
		return patientName;
	}
	public int getPid() {
		return pid;
	}
	public long getPhone() {
		return phone;
	}
	public String getPadd() {
		return padd;
	}
	public String getPhistory() {
		return phistory;
	}
	public String getHistory()
	{
		return phistory;
	}
	public void setHistory(String history)
	{
		if(!(pid==0))
		{
			phistory = history;
			System.out.println("Patient history added successfully!");
		}
		else
		{
			System.out.println("Patient Not Found");
		}
	}

}