package cn.cstqb.exam.testmaker.actions.projects.current;

import cn.cstqb.exam.testmaker.actions.AbstractPaginationAction;
import cn.cstqb.exam.testmaker.configuration.Constants;
import cn.cstqb.exam.testmaker.entities.ExamPaper;
import cn.cstqb.exam.testmaker.entities.Project;
import cn.cstqb.exam.testmaker.entities.User;
import cn.cstqb.exam.testmaker.services.IPaperService;

import javax.inject.Inject;

public abstract class BaseCurrentExamPaperAction extends AbstractPaginationAction {
    @Inject
    protected IPaperService paperService;

    protected User sessionUser;
    protected ExamPaper sessionExamPaper;
    public BaseCurrentExamPaperAction(){
        super();
        injector.injectMembers(this);
    }

    @Override
    protected void initEntityCount() {
    }

    @Override
    protected abstract String doExecuteImpl();
    @Override
    public void validateInput() {
        sessionUser = getLoggedInUser();
        sessionExamPaper = (ExamPaper) session.get(Constants.ATTR_EXAMPAPER);
        if (sessionUser==null|| sessionExamPaper == null) {
            addActionError(getText("error.user.auth.notLoggedIn"));
            return;
        }
        validateExamPaper(sessionExamPaper);
    }
    protected boolean validateExamPaper(ExamPaper examPaper){
        return true;
    }
}
