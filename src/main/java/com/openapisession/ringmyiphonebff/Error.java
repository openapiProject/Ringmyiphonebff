package com.openapisession.ringmyiphonebff;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-04-05T04:17:14.143551-05:00[America/Chicago]")

public class Error  implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("code")
    private String code;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("localizedMessage")
    private String localizedMessage;

    @JsonProperty("paths")
    @Valid
    private List<String> paths = null;

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("supportInformation")
    private String supportInformation;

    public Error code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Error locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     * @return locale
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Error localizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    /**
     * Get localizedMessage
     * @return localizedMessage
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public Error paths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    public Error addPathsItem(String pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    /**
     * Get paths
     * @return paths
     */
    @ApiModelProperty(value = "")


    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public Error severity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Error supportInformation(String supportInformation) {
        this.supportInformation = supportInformation;
        return this;
    }

    /**
     * Get supportInformation
     * @return supportInformation
     */
    @ApiModelProperty(value = "")


    public String getSupportInformation() {
        return supportInformation;
    }

    public void setSupportInformation(String supportInformation) {
        this.supportInformation = supportInformation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code) &&
                Objects.equals(this.locale, error.locale) &&
                Objects.equals(this.localizedMessage, error.localizedMessage) &&
                Objects.equals(this.paths, error.paths) &&
                Objects.equals(this.severity, error.severity) &&
                Objects.equals(this.supportInformation, error.supportInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, locale, localizedMessage, paths, severity, supportInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    supportInformation: ").append(toIndentedString(supportInformation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

