package de.cau.cs.kieler.klassviz.synthesis;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;

import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KType;

/**
 * An interface describing features required for evaluating class descriptions
 * in meta model languages like Ecore or Xcore. By means of this interface
 * a very loose coupling can be achieved.<br>
 * <br>
 * The {@link ImplementedBy} annotation ensures that fields and parameters of
 * this type can be properly injected by {@link com.google.inject.Guice Google Guice}.
 *
 * @author chsch
 */
@ImplementedBy(IMetaModelExtensions.NullMetaModelExtensions.class)
public interface IMetaModelExtensions {

	boolean isMetaModelPackage(KPackage kPackage, KClassModel classModel);

	EObject getMetaModelPackage(KPackage kPackage, KClassModel classModel);

	boolean isMetaModelType(KType type);

	EObject getMetaModelType(KType type);

	boolean isMetaModelField(KField field);

	EObject getMetaModelField(KField field);

	boolean isMetaModelMethod(KMethod method);

	EObject getMetaModelMethod(KMethod method);

	/**
	 * Resolves implicit information in the provided {@code classModel} like
	 * types of fields and parameters and saves them in {@code classModel}.
	 *
	 * @param classModel
	 *            the {@link KClassModel} to be resolved and enriched
	 * @return the provided {@code classModel}
	 */
	KClassModel resolve(KClassModel classModel);

	/**
	 * An plain implementation of {@link IMetaModelExtensions} guaranteeing that required
	 * objects of type {@link IMetaModelExtensions} can be properly injected.
	 */
	public static class NullMetaModelExtensions implements IMetaModelExtensions {

		public boolean isMetaModelPackage(final KPackage kPackage, final KClassModel classModel) {
			return false;
		}

		public EObject getMetaModelPackage(final KPackage kPackage,
				final KClassModel classModel) {
			return null;
		}

		public boolean isMetaModelType(final KType type) {
			return false;
		}

		public EObject getMetaModelType(final KType type) {
			return null;
		}

		public boolean isMetaModelField(final KField field) {
			return false;
		}

		public EObject getMetaModelField(final KField field) {
			return null;
		}

		public boolean isMetaModelMethod(final KMethod method) {
			return false;
		}

		public EObject getMetaModelMethod(final KMethod method) {
			return null;
		}

		public KClassModel resolve(final KClassModel classModel) {
			return classModel;
		}
	}
}
