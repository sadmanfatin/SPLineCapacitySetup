package model.service.client;

import model.service.common.AppModule;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 05 16:23:24 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }

    public void setSessionValues(String orgId, String userId, String respId,
                                 String respApplId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSessionValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {orgId, userId, respId, respApplId});
        return;
    }
}
