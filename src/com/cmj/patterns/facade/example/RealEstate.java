package com.cmj.patterns.facade.example;

/**
 * @Author :  chenmj
 * @Created :  2019/6/19
 * @Since :  0.1.0
 * @Description 中介
 */
public class RealEstate {
    private RegisterWindow registerWindow = new RegisterWindow();
    private EvaluateWindow evaluateWindow = new EvaluateWindow();
    private NotarizeWindow notarizeWindow = new NotarizeWindow();
    private DealWindow dealWindow = new DealWindow();
    private TaxWindow taxWindow = new TaxWindow();
    private CertificateWindow certificateWindow = new CertificateWindow();

    /**
     * 过户
     */
    public void transfer() {
        System.out.print("开始过户");
        registerWindow.registerCheck();
        System.out.print("接着去");
        evaluateWindow.evaluate();
        System.out.print("接着去");
        notarizeWindow.notarize();
        System.out.print("接着去");
        dealWindow.deal();
        System.out.print("接着去");
        taxWindow.tax();
        System.out.print("最后去");
        certificateWindow.certificate();

    }

}
