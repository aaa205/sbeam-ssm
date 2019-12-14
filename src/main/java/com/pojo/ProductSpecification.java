package com.pojo;

import java.io.Serializable;

public class ProductSpecification implements Serializable {
    private Integer productId;

    private Integer osId;

    private String os;

    private String cpu;

    private String gpu;

    private String ram;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOsId() {
        return osId;
    }

    public void setOsId(Integer osId) {
        this.osId = osId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu == null ? null : cpu.trim();
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu == null ? null : gpu.trim();
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram == null ? null : ram.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", osId=").append(osId);
        sb.append(", os=").append(os);
        sb.append(", cpu=").append(cpu);
        sb.append(", gpu=").append(gpu);
        sb.append(", ram=").append(ram);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}