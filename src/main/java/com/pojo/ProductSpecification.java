package com.pojo;

import java.io.Serializable;

public class ProductSpecification implements Serializable {
    private Integer product_id;

    private Integer os_id;

    private String os;

    private String cpu;

    private String gpu;

    private String ram;

    private static final long serialVersionUID = 1L;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getOs_id() {
        return os_id;
    }

    public void setOs_id(Integer os_id) {
        this.os_id = os_id;
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
        sb.append(", product_id=").append(product_id);
        sb.append(", os_id=").append(os_id);
        sb.append(", os=").append(os);
        sb.append(", cpu=").append(cpu);
        sb.append(", gpu=").append(gpu);
        sb.append(", ram=").append(ram);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}